<!DOCTYPE html>
<html lang="en">
<head>
    <title>Remover</title>
    <link href="css/home.css" rel="stylesheet">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
</head>
<body>
    <input type="hidden" id="idUser" value="<%= request.getParameter("id") %>" >
    <nav class="navbar navbar-expand-lg navbar-light bg-light">
        <a class="navbar-brand" href="/home">Home</a>
        <div class="collapse navbar-collapse" id="navbarSupportedContent">
            <ul class="navbar-nav mr-auto">
                <li class="nav-item">
                    <a class="nav-link" href="/cadastrar">Adicionar usuario</a>
                </li>
            </ul>
        </div>
        <span class="navbar-text">
            <a class="nav-link" id="btnSair">Sair</a>
        </span>
    </nav>
    <div class="main">
        <div id="usuario" class="usuario">

        </div>
        <a id="btnRemoverUsuario" class="btn btn-primary">Remover usuario</a>
    </div>
    <script src="js/jquery.js"></script> 
    <script src="js/removerUsuario.js"></script>
</body>
</html>