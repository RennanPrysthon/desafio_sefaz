const api = "http://localhost:8080/usuario";

$(document).ready( () => {
    var idUser =  $("#idUser");
    var id = idUser.val();
    $.get(`${api}/${id}`, (data) => {
        $("#usuario").append(`
            <ul>
                <li>Nome: ${data.nome}</li>
                <li>Email: ${data.email}</li>
            </ul>
        `)
    })
});

$("#btnRemoverUsuario").click(() => {
    var idUser =  $("#idUser");
    var id = idUser.val();
    $.ajax({ 
        type: 'DELETE',
        url: `${api}/${id}`,
        contentType: 'application/json',
        success: window.location.href = "/home"
    })
});