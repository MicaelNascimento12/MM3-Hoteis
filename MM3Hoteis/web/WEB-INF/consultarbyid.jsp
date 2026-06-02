<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>

<html>

<head>

    <meta charset="UTF-8">

    <title>Consultar Acomodação</title>

</head>

<body>

    <h1>Consultar Acomodação por ID</h1>

    <form action="controle_acomodacao" method="post">

        ID:

        <input type="number" name="txtid" required>

        <br><br>

        <input type="submit"
               name="op"
               value="BUSCAR ID">

    </form>

    <br>

    <a href="index.html">

        Voltar

    </a>

</body>

</html>