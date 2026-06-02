# 🏨 MM3 Hotéis

Sistema web de gerenciamento de acomodações desenvolvido em Java utilizando JSP, Servlets, padrão DAO e banco de dados MySQL.

## 📋 Sobre o Projeto

O MM3 Hotéis é um sistema CRUD (Create, Read, Update, Delete) que permite o gerenciamento de acomodações de hospedagem, simulando funcionalidades presentes em plataformas de reservas de hospedagem.

O projeto foi desenvolvido com foco na aplicação dos conceitos de Programação Orientada a Objetos, arquitetura MVC, padrão DAO e integração entre Java Web e banco de dados MySQL.

---

## 🚀 Funcionalidades

### ✅ Cadastro de acomodações

Permite registrar uma nova acomodação informando:

* Nome da propriedade
* Tipo de acomodação
* Capacidade de hóspedes
* Quantidade de quartos
* Preço da diária
* Aceita pets
* Possui Wi-Fi
* Endereço completo
* Média de avaliação

### ✅ Consulta de todas as acomodações

Exibe todos os registros cadastrados em formato de tabela.

### ✅ Consulta por ID

Permite pesquisar uma acomodação específica através do seu identificador.

### ✅ Atualização de registros

Permite alterar os dados de uma acomodação já cadastrada.

### ✅ Exclusão de registros

Permite remover acomodações do banco de dados.

### ✅ Tratamento de erros

O sistema apresenta mensagens amigáveis para operações inválidas ou registros não encontrados.

---

## 🛠 Tecnologias Utilizadas

* Java
* JSP
* Servlets
* Apache Tomcat
* MySQL
* JDBC
* HTML5
* CSS3
* JavaScript
* NetBeans IDE

---

## 📂 Estrutura do Projeto

```text
src/
├── CONTROLLER
│   └── controle_acomodacao.java
│
├── DAO
│   ├── AcomodacaoDAO.java
│   └── ConexaoBD.java
│
└── MODEL
    └── Acomodacao.java

Web Pages/
├── index.html
├── resultado.jsp
├── erro.jsp
├── consultarbyid.jsp
├── resultadoconsultarbyid.jsp
├── consultaratualizar.jsp
├── resultadoconsultaratualizar.jsp
├── deletar.jsp
└── style.css
```

---

## 🗄 Banco de Dados

Tabela principal:

```sql
CREATE TABLE acomodacao (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome_propriedade VARCHAR(100),
    tipo_acomodacao VARCHAR(50),
    capacidade_hospedes INT,
    quantidade_quartos INT,
    preco_diaria DOUBLE,
    aceita_pets BOOLEAN,
    possui_wifi BOOLEAN,
    endereco_completo VARCHAR(200),
    media_avaliacao DOUBLE
);
```

---

## 🎯 Conceitos Aplicados

* Programação Orientada a Objetos
* Encapsulamento
* MVC (Model-View-Controller)
* DAO (Data Access Object)
* JDBC
* CRUD Completo
* Tratamento de Exceções
* Boas práticas de desenvolvimento web

---

## 📸 Demonstração

* Tela inicial
  <img width="641" height="828" alt="image" src="https://github.com/user-attachments/assets/01f594a7-52f2-48dc-9463-c514ae8af2d2" />

* Consulta de acomodações
  <img width="1170" height="312" alt="image" src="https://github.com/user-attachments/assets/ac92938d-3b85-4d67-8d2f-8e22db0dbec1" />

* Atualização de registros
<img width="1178" height="253" alt="image" src="https://github.com/user-attachments/assets/4faee5ed-aab6-4dfd-afbf-f1967fd78d40" />
<img width="573" height="853" alt="image" src="https://github.com/user-attachments/assets/ba61925f-3352-4428-92e2-f51a879a5a5a" />

* Exclusão de registros
<img width="403" height="271" alt="image" src="https://github.com/user-attachments/assets/92bbd300-1131-4ff2-a2a7-db4044310f32" />

---

## 👨‍💻 Autor

**Micael Nascimento**
