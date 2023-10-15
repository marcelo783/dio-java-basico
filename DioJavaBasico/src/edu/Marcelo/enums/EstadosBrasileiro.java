
package edu.Marcelo.enums;

//criando o enum EstadoBrasileiro para ser usado em toda a aplicação.
public enum EstadosBrasileiro {
    SAO_PAULO ("São Paulo", "SP", 11),
    RIO_JANEIRO ("Rio de Janeiro", "RJ", 12),
    PIAUI ("PIAUÍ", "Maranhão",13);
    
    private String nome;
    private  String sigla;
    private int ibge;

    private EstadosBrasileiro(String nome, String sigla, int ibge) {
        this.nome = nome;
        this.sigla = sigla;
        this.ibge = ibge;
    }

    public  int getIbge(){
        return ibge;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }
    
    public String getNomeMaiusculo(){
        return nome.toUpperCase();
    }
    
    
    
}
