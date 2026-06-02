<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.List"%>
<%@page import="MODEL.Acomodacao"%>

<!DOCTYPE html>

<html>

<head>

    <meta charset="UTF-8">

    <title>Consultar Todos</title>

    <link rel="stylesheet" href="style.css">

</head>

<body>

<div class="container">

    <h1>📋 Lista de Acomodações</h1>

    <table>

        <tr>

            <th>ID</th>
            <th>Nome</th>
            <th>Tipo</th>
            <th>Capacidade</th>
            <th>Quartos</th>
            <th>Preço</th>
            <th>Pets</th>
            <th>WiFi</th>
            <th>Endereço</th>
            <th>Avaliação</th>

        </tr>

        <%

            List<Acomodacao> lista =
            (List<Acomodacao>) request.getAttribute("lista");

            for(Acomodacao a : lista){

        %>

        <tr>

            <td><%= a.getId() %></td>
            <td><%= a.getNomePropriedade() %></td>
            <td><%= a.getTipoAcomodacao() %></td>
            <td><%= a.getCapacidadeHospedes() %></td>
            <td><%= a.getQuantidadeQuartos() %></td>
            <td>R$ <%= String.format("%.2f", a.getPrecoDiaria()) %></td>
            <td><%= a.isAceitaPets() ? "Sim" : "Não" %></td>
            <td><%= a.isPossuiWifi() ? "Sim" : "Não" %></td>
            <td><%= a.getEnderecoCompleto() %></td>
            <td><%= a.getMediaAvaliacao() %></td>

        </tr>

        <%

            }

        %>

    </table>

    <br>

    <a class="voltar" href="index.html">Voltar ao Menu</a>

</div>

</body>

</html>