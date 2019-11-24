<!DOCTYPE html>
<html lang="en">
<head>
    <title>Editar</title>
    <link href="css/cadastro.css" rel="stylesheet">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
</head>
<body>
    <nav class="navbar navbar-expand-lg navbar-light bg-light">
        <a class="navbar-brand" href="/home">Home</a>
        <div class="collapse navbar-collapse" id="navbarSupportedContent">
            <ul class="navbar-nav mr-auto">
                <li class="nav-item">
                    <a class="nav-link" href="/cadastrar">Adicionar usuario</a>
                </li>
            </ul>
        </div>
    </nav>
    <input type="hidden" id="idUser" value="<%= request.getParameter("id") %>" >
    <div class="main">
        <form class="formulario">
            <div class="form-group">
                <label for="nome">Nome</label>
                <input type="text" class="form-control" id="nome" >
            </div>
            <div class="form-group">
                <label for="email">Email</label>
                <input type="email" class="form-control" id="email">
            </div>
            <a id="btnAtualizar" class="btn btn-primary">Atualizar</a>
            <a href="/home" class="btn btn-primary">Voltar</a>
        </form>
    </div>
    <script src="js/jquery.js"></script> 
    <script src="js/editar.js"></script>
</body>
</html>