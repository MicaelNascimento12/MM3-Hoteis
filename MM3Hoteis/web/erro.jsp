<head>
    <meta charset="UTF-8">
    <title>Mensagem do Sistema</title>
    <link rel="stylesheet" href="style.css">
</head>

<body>

<div class="container">

    <h1>Ocorreu um erro</h1>

    <h2>

        <%= request.getAttribute("message") %>

    </h2>

    <a class="voltar"href="index.html">Voltar ao Menu</a>

</div>

</body>