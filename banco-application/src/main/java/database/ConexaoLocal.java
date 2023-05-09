/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;

/**
 *
 * @author Filipe
 */
//import org.apache.commons.dbcp2.BasicDataSource;
//import org.springframework.jdbc.core.JdbcTemplate;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.SQLException;
//import java.sql.ResultSet;
//import java.sql.Statement;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import javax.sql.DataSource;
import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.jdbc.core.JdbcTemplate;
 public class ConexaoLocal {

    private JdbcTemplate conexaoDoBanco;

    public ConexaoLocal() {

        BasicDataSource dataSource = new BasicDataSource();
        this.conexaoDoBanco = new JdbcTemplate(dataSource);

        /* SLQ SERVER NUVEM = AZURE */
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/banco01?useTimezone=true&serverTimezone=UTC");
        dataSource.setUsername("root");
        dataSource.setPassword("urubu100");
        
        this.conexaoDoBanco = new JdbcTemplate(dataSource);

    }

    public JdbcTemplate getConexaoBanco() {
        return conexaoDoBanco;
    }

}



/*

    public static void main(String[] args) {
        try {
            // Carrega o driver JDBC para o banco de dados
            Class.forName("com.mysql.jdbc.Driver");

            // Conecta ao banco de dados
            String url = "jdbc:mysql://172.17.0.2:3307/renderWatch";
            String user = "root";
            String password = "#Gfgrupo6";
            Connection conn = DriverManager.getConnection(url, user, password);

            // Executa uma consulta SQL
            String sql = "SELECT FROM tabela";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
/*
            // Processa os resultados da consulta
            while (rs.next()) {
                String coluna1 = rs.getString("coluna1");
                int coluna2 = rs.getInt("coluna2");
                System.out.println(coluna1 + ", " + coluna2);
            }
*/
            // Fecha os recursos
    /*
            rs.close();
            stmt.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
*/