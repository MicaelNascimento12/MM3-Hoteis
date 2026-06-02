<head>
    <meta charset="UTF-8">
    <title>Consultar Acomodação</title>
    <link rel="stylesheet" href="style.css">
</head>

<body>

    <div class="container">

        <h1> Consultar Acomodação</h1>

        <form action="controle_acomodacao" method="post">

            <label>ID da acomodação:</label>
            <input type="number"name="txtid"required>

            <div class="botoes">
                <input type="submit"
                    name="op"
                    value="BUSCAR">
            </div>

        </form>

        <a class="voltar" href="index.html">Voltar</a>

    </div>

</body>