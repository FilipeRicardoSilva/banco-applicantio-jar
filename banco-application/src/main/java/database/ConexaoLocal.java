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

public class ConexaoLocal {

    private JdbcTemplate conexaoDoBanco;

    public ConexaoLocal() {

 

        /* MYSLQ WORKBENCH = LOCAL */
        BasicDataSource dataSource = new BasicDataSource();
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        // PROCURAR CLASS NAME DO MYSQL WORKBENTH OU MYSQL
        dataSource.setUrl("//0.0.0.0:3306/renderWatch?autoReconnect=true&useSSL=false");
        //COLOCAR URL DA AZURE OU BANCO LOCAL / para conectar em banco local, utilizar localhost e porta
        dataSource.setUsername("ubuntu");
        dataSource.setPassword("#Gfgrupo6");

        this.conexaoDoBanco = new JdbcTemplate(dataSource);

      
    }

    public JdbcTemplate getConexaoDoBanco() {
        return conexaoDoBanco;
    }
     

}
