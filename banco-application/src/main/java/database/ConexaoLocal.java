/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;

/**
 *
 * @author Filipe
 */
import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.jdbc.core.JdbcTemplate;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
    
public class ConexaoLocal {

    private JdbcTemplate conexaoDoBanco;

    public ConexaoLocal() {

      



        /* MYSLQ WORKBENCH = LOCAL */
        
        BasicDataSource dataSource = new BasicDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        // PROCURAR CLASS NAME DO MYSQL WORKBENTH OU MYSQL
        dataSource.setUrl("jdbc:mysql://172.17.0.2:3307/renderWatch");
        //COLOCAR URL DA AZURE OU BANCO LOCAL / para conectar em banco local, utilizar localhost e porta
        dataSource.setUsername("root");
        dataSource.setPassword("#Gfgrupo6");

        this.conexaoDoBanco = new JdbcTemplate(dataSource);
       

      
    }

    public JdbcTemplate getConexaoDoBanco() {
        return conexaoDoBanco;
    }
     

}

/*
String url = "jdbc:mysql://172.17.0.2:3306/renderWatch";
import java.sql.;

public class JdbcExample {
    public static void main(String[] args) {
        try {
            // Carrega o driver JDBC para o banco de dados
            Class.forName("com.mysql.jdbc.Driver");

            // Conecta ao banco de dados
            String url = "jdbc:mysql://localhost:3306/banco_de_dados";
            String user = "usuario";
            String password = "senha";
            Connection conn = DriverManager.getConnection(url, user, password);

            // Executa uma consulta SQL
            String sql = "SELECT FROM tabela";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            // Processa os resultados da consulta
            while (rs.next()) {
                String coluna1 = rs.getString("coluna1");
                int coluna2 = rs.getInt("coluna2");
                System.out.println(coluna1 + ", " + coluna2);
            }

            // Fecha os recursos
            rs.close();
            stmt.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
*/