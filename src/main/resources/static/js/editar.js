const api = "https://rennan-desafio-sefaz.herokuapp.com/usuario";
const token = localStorage.getItem("token");

$(document).ready( () => {
    if(token == null) {
        window.location.href ="/logar";
    }
    var idUser =  $("#idUser");
    var id = idUser.val();
    $.ajax({
        url: `${api}/${id}`,
        type: 'GET',
        // Fetch the stored token from localStorage and set in the header
        headers: {"Authorization": localStorage.getItem('token')},
        success: (msg, status, jqXHR) => {
            const user = jqXHR.responseJSON;
            $("#nome").val(user.nome);
            $("#email").val(user.email);
        }
    });
});

$("#btnAtualizar").click(() => {
    var idUser =  $("#idUser");
    var id = idUser.val();
    user = {
        nome: $("#nome").val(), 
        email: $("#email").val(),
    };
    $.ajax({ 
        type: 'PUT',
        url: `${api}/${id}`,
        headers: {"Authorization": localStorage.getItem('token')},
        contentType: 'application/json',
        data: JSON.stringify(user),
        dataType: 'json',
        success: window.location.href = "/home"
    })
});


$("#btnSair").click(() => {
    localStorage.removeItem("token");
    localStorage.removeItem("id");
    window.location.href = "/logar";
})