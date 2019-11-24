const api = "http://localhost:8080/telefone"; //Fazer endpoint de login
const user = "http://localhost:8080/usuario"; //Fazer endpoint de login

$(document).ready(()=> {
    var idUser =  $("#idUser");
    var id = idUser.val();
    $.get(`${api}/${id}`, (data) => {
        data.map(x => {
            $("#lista-usuarios").append(`
                <tr>
                    <td>${x.ddd}</td>
                    <td>${x.numero}</td>
                    <td>${x.tipo}</td>
                </tr>
            `);
        })
    })
    $.get(`${user}/${id}`, (data) => {
        $("#usuario").append(`
            <div>
                <h2>${data.nome}</h2>
            </div>
        `)
    })
})

$("#btnAddTelefone").click(() => {
    var idUser =  $("#idUser");
    var id = idUser.val();
    window.location.href = `/adicionarTelefone?id=${id}`;
})