
const api = "http://localhost:8080/telefone"; //Fazer endpoint de login

$("#btnAddTelefone").click(() => {
    var idUser =  $("#idUser");
    var id = idUser.val();
    telefone = {
        ddd: $("#ddd").val(),
        numero: $("#numero").val(),
        tipo: $("#tipo").val()
    }
    $("#ddd").val("");
    $("#numero").val("");
    $("#tipo").val("");
    $.ajax({ 
        type: 'POST',
        url: `${api}/${id}`,
        contentType: 'application/json',
        data: JSON.stringify(telefone),
        dataType: 'json',
        success: window.location.href = `/verTelefones?id=${id}`
    });
});

$("#btnVoltar").click(() => {
    console.log("voltar");
    var idUser =  $("#idUser");
    var id = idUser.val();
    window.location.href = `/verTelefones?id=${id}`
})