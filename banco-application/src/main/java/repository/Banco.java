/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

//import database.Conexao;
import database.ConexaoLocal;
import java.util.List;
import models.testeContainer;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author asusn
 */
public class Banco {

    public static void main(String[] args) {

        ConexaoLocal conexaoLocal = new ConexaoLocal();
        //Conexao conexao = new Conexao();

        JdbcTemplate conLocal = conexaoLocal.getConexaoBanco();
        //JdbcTemplate con = conexao.getConexaoDoBanco();

        /*
        // ESTE PASSO NÃO É NECEESARIO QUANDO AS TABELAS JA ESTÃO CRIADAS
        con.execute("CREATE TABLE testeContainer  (\n"
                + "    id INT PRIMARY KEY IDENTITY(1,1),\n"
                + "  nome VARCHAR(45) ,\n"
                + "  inteiro INT\n"
                + ");");*/
 /* SQL  */
      /*  System.out.println("EXECUTANDO INSERTS EM AZURE");
        
        
        con.update("INSERT INTO testeContainer (nome,inteiro) VALUES( 'TESTE', 2021);");
        con.update("INSERT INTO testeContainer (nome,inteiro) VALUES( 'TESTE', 2022);");

        System.out.println("INSERT REALIZADO");

        /* MYSQL */
        System.out.println("EXECUTANDO INSERTS EM LOCAL");

        conLocal.update("INSERT INTO testeContainer (nome, inteiro) VALUES( 'TESTE1', 2021);");
        conLocal.update("INSERT INTO testeContainer (nome, inteiro) VALUES( 'TESTE2', 2022);");
        
        System.out.println("INSERT REALIZADO");
    }

}
