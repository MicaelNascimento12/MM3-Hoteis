/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testes;



import UTIL.ConexaoBD;
import java.sql.Connection;
/**
 *
 * @author alunocmc
 */
public class TesteConexao {
    
    public static void main(String[] args) {
        
        try {
            Connection con = ConexaoBD.getConexao();
            
            System.out.println("Conectado com sucesso");
        } catch (Exception e) {
            System.out.println("Erro ao conectar!");
            
        }
        
    }
    
}
