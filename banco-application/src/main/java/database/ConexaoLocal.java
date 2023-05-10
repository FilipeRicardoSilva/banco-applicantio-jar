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
//import org.springframework.jdbc.datasource.DriverManagerDataSource;
//import javax.sql.DataSource;
import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.jdbc.core.JdbcTemplate;
public class ConexaoLocal {

    private JdbcTemplate conexaoDoBanco;

    public ConexaoLocal() {

        BasicDataSource dataSource = new BasicDataSource();
        this.conexaoDoBanco = new JdbcTemplate(dataSource);

        /* SLQ SERVER NUVEM = AZURE */
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql:/localhost/renderwatch");
        dataSource.setUsername("root");
        dataSource.setPassword("urubu100");
        
        this.conexaoDoBanco = new JdbcTemplate(dataSource);

    }

    public JdbcTemplate getConexaoBanco() {
        return conexaoDoBanco;
    }

}


