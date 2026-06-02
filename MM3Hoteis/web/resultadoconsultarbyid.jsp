<%@page import="MODEL.Acomodacao"%>

<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" href="style.css">
    <title>? Dados da Acomodação</title>
</head>


<body>

<div class="container">


    <%

        Acomodacao a = (Acomodacao) request.getAttribute("a");

    %>

    <table border="1">

        <tr>
            <th>Campo</th>
            <th>Valor</th>
        </tr>

        <tr>
            <td>ID</td>
            <td><%= a.getId() %></td>
        </tr>

        <tr>
            <td>Nome</td>
            <td><%= a.getNomePropriedade() %></td>
        </tr>

        <tr>
            <td>Tipo</td>
            <td><%= a.getTipoAcomodacao() %></td>
        </tr>

        <tr>
            <td>Capacidade</td>
            <td><%= a.getCapacidadeHospedes() %></td>
        </tr>

        <tr>
            <td>Quartos</td>
            <td><%= a.getQuantidadeQuartos() %></td>
        </tr>

        <tr>
            <td>Preço</td>
            <td>R$ <%= a.getPrecoDiaria() %></td>
        </tr>

        <tr>
            <td>Aceita Pets</td>
            <td><%= a.isAceitaPets() ? "Sim" : "Não" %></td>
        </tr>

        <tr>
            <td>Possui WiFi</td>
            <td><%= a.isPossuiWifi() ? "Sim" : "Não" %></td>
        </tr>

        <tr>
            <td>Endereço</td>
            <td><%= a.getEnderecoCompleto() %></td>
        </tr>

        <tr>
            <td>Avaliação</td>
            <td><%= a.getMediaAvaliacao() %></td>
        </tr>

    </table>

    <a class="voltar"href="index.html">Voltar ao Menu</a>

</div>

</body>