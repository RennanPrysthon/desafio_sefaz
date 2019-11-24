<!DOCTYPE html>
<html lang="en">
<head>
    <title>Adicionar usuario</title>
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
    <div class="main">
        <form class="formulario">
            <input type="hidden" id="idUser" value="<%= request.getParameter("id") %>" >
            <div class="form-group">
                <label for="exampleInputEmail1">DDD</label>
                <input type="number" class="form-control" id="ddd" >
            </div>
            <div class="form-group">
                <label for="exampleInputEmail1">Numero</label>
                <input type="text" class="form-control" id="numero" >
            </div>
            <div class="form-group">
                <label for="exampleInputPassword1">Tipo</label>
                <input type="text" class="form-control" id="tipo" >
            </div>
            <a id="btnAddTelefone" class="btn btn-primary">Adicionar telefone</a>
            <a id="btnVoltar" class="btn btn-primary">Voltar</a>
        </form>
    </div>
    <script src="js/jquery.js"></script> 
    <script src="js/telefone.js"></script>
</body>
</html>