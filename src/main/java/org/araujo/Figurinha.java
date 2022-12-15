package org.araujo;

import java.util.Objects;

public class Figurinha {

    private int num;
    private String nome;
    private String clube;
    private boolean premium;

    public Figurinha(int num, String nome, String clube, boolean premium) {
        this.num = num;
        this.nome = nome;
        this.clube = clube;
        this.premium = premium;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getClube() {
        return clube;
    }

    public void setClube(String clube) {
        this.clube = clube;
    }

    public boolean isPremium() {
        return premium;
    }

    public void setPremium(boolean premium) {
        this.premium = premium;
    }
}
