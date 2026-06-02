<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="MODEL.Acomodacao"%>

<%
Acomodacao a = (Acomodacao) request.getAttribute("a");
%>

<html>

<head>

    <meta charset="UTF-8">
    <link rel="stylesheet" href="style.css">
    <title>Atualizar Acomodação</title>

</head>

<body>
    
    <div class="container">

        <h1>Atualizar Acomodação</h1>

        <form action="controle_acomodacao" method="post">

            <input type="hidden"name="txtid"value="<%=a.getId()%>">

            <label>Nome Propriedade:</label>
            <input type="text" name="txtnome"value="<%=a.getNomePropriedade()%>">

            <br><br>

            <label>Tipo de Acomodação:</label>
            <input type="text"name="txttipo"value="<%=a.getTipoAcomodacao()%>">

            <br><br>

            <label>Capacidade de Hóspedes:</label>
            <input type="number"name="txtcapacidade"value="<%=a.getCapacidadeHospedes()%>">

            <br><br>

            <label>Quantidade de Quartos:</label>
            <input type="number"name="txtquartos"value="<%=a.getQuantidadeQuartos()%>">

            <br><br>

            <label>Preço da Diária:</label>
            <input type="text"name="txtpreco"value="<%=a.getPrecoDiaria()%>">

            <br><br>

            <label>Aceita Pets:</label>

                <select name="txtpets">
                    <option value="true">Sim</option>
                    <option value="false">Não</option>
                </select>

            <br><br>

            <label>Possui Wifi:</label>

                <select name="txtwifi">
                    <option value="true">Sim</option>
                    <option value="false">Não</option>
                </select>

            <br><br>

            <label>Endereço Completo:</label>
            <input type="text"name="txtendereco"value="<%=a.getEnderecoCompleto()%>">

            <br><br>

            <label>Média de Avaliação:</label>
            <input type="text"name="txtavaliacao"value="<%=a.getMediaAvaliacao()%>">

            <br><br>

            <input type="submit"
                   name="op"
                   value="EFETIVAR ATUALIZACAO">

        </form>

        <br>

        <a class="voltar"href="index.html">Voltar ao Menu</a>
    </div>
</body>

</html>