/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import database.ConexaoLocal;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author asusn
 */
public class testeContainer {
    
    private Integer id;
    private String nome;
    private Integer inteiro;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getInteiro() {
        return inteiro;
    }

    public void setInteiro(Integer inteiro) {
        this.inteiro = inteiro;
    }

    @Override
    public String toString() {
        return "testeContainer{" + "id=" + id + ", nome=" + nome + ", inteiro=" + inteiro + '}';
    }
    
    
  




    
}
