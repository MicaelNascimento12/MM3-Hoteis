package controller;

import DAO.AcomodacaoDAO;
import MODEL.Acomodacao;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "controle_acomodacao", urlPatterns = {"/controle_acomodacao"})

public class controle_acomodacao extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");

        try (PrintWriter out = response.getWriter()) {

            String op = request.getParameter("op");
            System.out.println("OP RECEBIDA = [" + op + "]");

            AcomodacaoDAO adao = new AcomodacaoDAO();
            Acomodacao a = new Acomodacao();

            if (op.equals("CADASTRAR")) {

                a.setNomePropriedade(request.getParameter("txtnome"));
                a.setTipoAcomodacao(request.getParameter("txttipo"));
                a.setCapacidadeHospedes(Integer.parseInt(request.getParameter("txtcapacidade")));
                a.setQuantidadeQuartos(Integer.parseInt(request.getParameter("txtquartos")));
                a.setPrecoDiaria(Double.parseDouble(request.getParameter("txtpreco")));
                a.setAceitaPets(Boolean.parseBoolean(request.getParameter("txtpets")));
                a.setPossuiWifi(Boolean.parseBoolean(request.getParameter("txtwifi")));
                a.setEnderecoCompleto(request.getParameter("txtendereco"));
                a.setMediaAvaliacao(Double.parseDouble(request.getParameter("txtavaliacao")));

                String msg = "Cadastrar";
                
                if(a.getMediaAvaliacao() < 0 || a.getMediaAvaliacao() > 10){

                     request.setAttribute("message","Avaliação deve estar entre 0 e 10");

                     request.getRequestDispatcher("erro.jsp").forward(request,response);
                 }

                try {

                    adao.cadastrar(a);

                    System.out.println("Cadastrado com sucesso!!");

                    request.setAttribute("message", msg);

                    request.getRequestDispatcher("resultado.jsp").forward(request, response);

                } catch (ClassNotFoundException | SQLException ex) {

                    System.out.println("Erro: " + ex.getMessage());

                    request.setAttribute("message", msg);

                    request.getRequestDispatcher("erro.jsp").forward(request, response);
                }

            } 
            else if (op.equals("CONSULTAR TODOS")) {

                try {

                    List<Acomodacao> lista = adao.consultarTodos();

                    request.setAttribute("lista", lista);

                    request.getRequestDispatcher("resultadoconsultartodos.jsp").forward(request, response);

                } catch (ClassNotFoundException | SQLException ex) {

                    System.out.println("Erro: " + ex.getMessage());
                }

            } 
            else if(op.equals("CONSULTAR BY ID")) {

            request.getRequestDispatcher("consultarbyid.jsp").forward(request, response);

            } 
            else if(op.equals("BUSCAR")) {

            int id = Integer.parseInt(request.getParameter("txtid"));

            a.setId(id);

            try {

                a = adao.consultarById(a);

                if(a.getId() == 0){

                    request.setAttribute(
                            "message",
                            "Acomodação não encontrada!"
                    );

                    request.getRequestDispatcher("erro.jsp")
                            .forward(request, response);

                } else {

                    request.setAttribute("a", a);

                    request.getRequestDispatcher(
                            "resultadoconsultarbyid.jsp"
                    ).forward(request, response);

                }

            } catch(ClassNotFoundException | SQLException ex){

                request.setAttribute(
                        "message",
                        "Erro ao consultar acomodação!"
                );

                request.getRequestDispatcher("erro.jsp")
                        .forward(request, response);

            }

            }else if (op.equals("DELETAR")) {

            request.getRequestDispatcher("deletar.jsp").forward(request, response);

            }else if (op.equals("CONFIRMAR DELETAR")) {

                int id = Integer.parseInt(
                        request.getParameter("txtid")
                );

                a.setId(id);

                try {

                    a = adao.consultarById(a);

                    if (a.getId() == 0) {

                        request.setAttribute(
                                "message",
                                "Acomodação não encontrada!"
                        );

                        request.getRequestDispatcher("erro.jsp")
                               .forward(request, response);

                    } else {

                        adao.deletar(a);

                        request.setAttribute(
                                "message",
                                "Acomodação deletada!"
                        );

                        request.getRequestDispatcher("resultado.jsp")
                               .forward(request, response);

                    }

                } catch (ClassNotFoundException | SQLException ex) {

                    request.setAttribute(
                            "message",
                            "Erro ao deletar acomodação!"
                    );

                    request.getRequestDispatcher("erro.jsp")
                           .forward(request, response);
                }
            } else if(op.equals("ATUALIZAR")){

                request.getRequestDispatcher("consultaratualizar.jsp").forward(request, response);

            } else if(op.equals("BUSCAR PROPRIEDADES")){

                int id = Integer.parseInt(
                        request.getParameter("txtid")
                );

                a.setId(id);

                try{

                    a = adao.consultarById(a);

                    if(a.getId() == 0){

                        request.setAttribute(
                                "message",
                                "Acomodação não encontrada!"
                        );

                        request.getRequestDispatcher("erro.jsp")
                                .forward(request, response);

                    }else{

                        request.setAttribute("a", a);
                        request.getRequestDispatcher("resultadoconsultaratualizar.jsp").forward(request, response);

                    }

                }catch(ClassNotFoundException | SQLException ex){

                    request.setAttribute(
                            "message",
                            "Erro ao consultar acomodação!"
                    );

                    request.getRequestDispatcher("erro.jsp").forward(request, response);

                }

            }else if (op.equals("EFETIVAR ATUALIZACAO")) {

                try {


                    int id = Integer.parseInt(request.getParameter("txtid"));

                    a.setId(id);
                    a.setNomePropriedade(request.getParameter("txtnome"));
                    a.setTipoAcomodacao(request.getParameter("txttipo"));
                    a.setCapacidadeHospedes(Integer.parseInt(request.getParameter("txtcapacidade")));
                    a.setQuantidadeQuartos(Integer.parseInt(request.getParameter("txtquartos")));
                    a.setPrecoDiaria(Double.parseDouble(request.getParameter("txtpreco")));
                    a.setAceitaPets(Boolean.parseBoolean(request.getParameter("txtpets")));
                    a.setPossuiWifi(Boolean.parseBoolean(request.getParameter("txtwifi")));
                    a.setEnderecoCompleto(request.getParameter("txtendereco"));
                    a.setMediaAvaliacao(Double.parseDouble(request.getParameter("txtavaliacao")));


                    adao.atualizar(a);



                    request.setAttribute(
                            "message",
                            "Propriedade atualizada com sucesso!"
                    );

                    request.getRequestDispatcher("resultado.jsp")
                            .forward(request, response);

                } catch (Exception ex) {

                    ex.printStackTrace();

                    request.setAttribute(
                            "message",
                            ex.getMessage()
                    );

                    request.getRequestDispatcher("erro.jsp")
                            .forward(request, response);
                }
            }
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {

        return "Short description";
    }// </editor-fold>

}