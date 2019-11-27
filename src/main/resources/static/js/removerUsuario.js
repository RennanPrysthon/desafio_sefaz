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
            $("#usuario").append(`
            <ul>
                <li>Nome: ${user.nome}</li>
                <li>Email: ${user.email}</li>
            </ul>
        `)
        }
    });
});

$("#btnRemoverUsuario").click(() => {
    var idUser =  $("#idUser");
    var id = idUser.val();
    $.ajax({ 
        type: 'DELETE',
        url: `${api}/${id}`,
        headers: {"Authorization": localStorage.getItem('token')},
        contentType: 'application/json',
        success: window.location.href = "/home"
    })
});

$("#btnSair").click(() => {
    localStorage.removeItem("token");
    localStorage.removeItem("id");
    window.location.href = "/logar";
})