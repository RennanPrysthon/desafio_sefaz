const api = "http://localhost:8080/usuario";

$(document).ready( () => {
    var idUser =  $("#idUser");
    var id = idUser.val();
    $.get(`${api}/${id}`, (data) => {
        console.log(data);
        $("#nome").val(data.nome);
        $("#email").val(data.email);
    })
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
        contentType: 'application/json',
        data: JSON.stringify(user),
        dataType: 'json',
        success: window.location.href = "/home"
    })
});