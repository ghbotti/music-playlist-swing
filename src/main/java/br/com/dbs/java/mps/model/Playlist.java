package br.com.dbs.java.mps.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Gustavo Botti
 */
public class Playlist {
    
    private String nome;
    private Integer qtExecucoes;
    private Date dtUltimaExecucao;
    private Date dataCriacao;
    private Integer duracaoTotal;
    private final List<Musica> musicas = new ArrayList<>();

    public void adicionaMusica(Musica musica){
        musicas.add(musica);
    }
    
    /**
     * @return the musicas
     */
    public List<Musica> getMusicas() {
        return musicas;
    }

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
     * @return the qtExecucoes
     */
    public Integer getQtExecucoes() {
        return qtExecucoes;
    }

    /**
     * @return the dtUltimaExecucao
     */
    public Date getDtUltimaExecucao() {
        return dtUltimaExecucao;
    }

    /**
     * @return the dataCriacao
     */
    public Date getDataCriacao() {
        return dataCriacao;
    }

    /**
     * @return the duracaoTotal
     */
    public Integer getDuracaoTotal() {
        return duracaoTotal;
    }
}
