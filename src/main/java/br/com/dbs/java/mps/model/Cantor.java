package br.com.dbs.java.mps.model;

import java.util.List;

/**
 *
 * @author Gustavo Botti
 */
public class Cantor {
    
    private String nome;
    private String sobreNome;
    private Byte[] foto;
    private List<Musica> musicas;

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
     * @return the sobreNome
     */
    public String getSobreNome() {
        return sobreNome;
    }

    /**
     * @param sobreNome the sobreNome to set
     */
    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }

    /**
     * @return the foto
     */
    public Byte[] getFoto() {
        return foto;
    }

    /**
     * @param foto the foto to set
     */
    public void setFoto(Byte[] foto) {
        this.foto = foto;
    }

    public List<Musica> getMusicas() {
        return musicas;
    }
}
