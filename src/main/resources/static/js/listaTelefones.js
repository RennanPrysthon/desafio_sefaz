const api = "http://localhost:8080/telefone"; //Fazer endpoint de login
const user = "http://localhost:8080/usuario"; //Fazer endpoint de login
const token = localStorage.getItem("token");

$(document).ready(()=> {
    if(token == null) {
        window.location.href ="/logar";
    }
    var idUser =  $("#idUser");
    var id = idUser.val();
    $.ajax({
        url: `${api}/${id}` ,
        type: 'GET',
        // Fetch the stored token from localStorage and set in the header
        headers: {"Authorization": localStorage.getItem('token')},
        success: (msg, status, jqXHR) => {
            const user = jqXHR.responseJSON;
            user.map(x => {
                $("#lista-usuarios").append(`
                    <tr>
                        <td>${x.ddd}</td>
                        <td>${x.numero}</td>
                        <td>${x.tipo}</td>
                    </tr>
                `);
            });
        }
    });
    $.ajax({
        url: `${user}/${id}`,
        type: 'GET',
        // Fetch the stored token from localStorage and set in the header
        headers: {"Authorization": localStorage.getItem('token')},
        success: (msg, status, jqXHR) => {
            const user = jqXHR.responseJSON;
            $("#usuario").append(`
                <div>
                    <h2>${user.nome}</h2>
                </div>
            `)
        }
    });
})

$("#btnAddTelefone").click(() => {
    var idUser =  $("#idUser");
    var id = idUser.val();
    window.location.href = `/adicionarTelefone?id=${id}`;
})


$("#btnSair").click(() => {
    localStorage.removeItem("token");
    window.location.href = "/logar";
})