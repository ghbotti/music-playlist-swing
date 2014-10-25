package br.com.dbs.java.mps.model;

/**
 *
 * @author Gustavo Botti
 */
public class Musica {
    private String nome;
    private Integer duracao;
    private Cantor cantor;
    
    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the duracao
     */
    public Integer getDuracao() {
        return duracao;
    }

    /**
     * @param duracao the duracao to set
     */
    public void setDuracao(Integer duracao) {
        this.duracao = duracao;
    }

    public Cantor getCantor() {
        return cantor;
    }

    public void setCantor(Cantor cantor) {
        this.cantor = cantor;
    }
    
    
    
}
