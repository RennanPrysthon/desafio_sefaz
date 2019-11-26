const api = "http://localhost:8080/login"; //Fazer endpoint de login

$(document).ready(()=>{
    localStorage.removeItem("token");
})

$("#btnEntrar").click(() => {
    const email = $("#email").val();
    const pass = $("#pass").val();
    user = {
        email: email, 
        senha: pass
    };
    $.ajax({
        type: "POST",
        url: api,
        data: JSON.stringify(user),
        contentType: "text/json; charset=utf-8",
        dataType: "text",
        error: (xhr, status, error) => {
            alert("dados invalidos")
          },
        success: (msg, status, jqXHR) => {
            localStorage.setItem("token", jqXHR.getResponseHeader('Authorization'));
            $.ajax({
                url: `http://localhost:8080/usuario?email=${email}` ,
                type: 'GET',
                // Fetch the stored token from localStorage and set in the header
                headers: {"Authorization": localStorage.getItem('token')},
                success: (msg, status, jqXHR) => {
                    const id = jqXHR.responseJSON[0].id;
                    localStorage.setItem("id", id);
                    window.location.href = `home`
                }
            });
        } 
    });
});

