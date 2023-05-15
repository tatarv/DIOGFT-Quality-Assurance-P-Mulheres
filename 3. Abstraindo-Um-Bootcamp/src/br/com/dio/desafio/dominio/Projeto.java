package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Projeto  {
    private String nome;
    private String descricao;
    private final LocalDate dataInicial = LocalDate.now();
    private final LocalDate dataFinal = dataInicial.plusDays(45);
    private Dev nomeDev;
    private Bootcamp bootcamp;
    private String repositorio;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getDataInicial() {
        return dataInicial;
    }

    public LocalDate getDataFinal() {
        return dataFinal;
    }

    public Dev getNomeDev() {
        return nomeDev;
    }

    public void setNomeDev(Dev nomeDev) {
        this.nomeDev = nomeDev;
    }

    public Bootcamp getBootcamp() {
        return bootcamp;
    }

    public void setBootcamp(Bootcamp bootcamp) {
        this.bootcamp = bootcamp;
    }
    public String getRepositorio() {
        return repositorio;
    }

    public void setRepositorio(String repositorio) {
        this.repositorio = repositorio;
    }

    @Override
    public String toString() {
        return "Projeto{" +
                "titulo='" + getNome() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", data=" + getDataInicial()+ '\''+
                ",data final"+ getDataFinal()+'\''+
                ", dev"+getNomeDev()+'\'' +
                ", bootcamp"+getBootcamp()+'\'' +
                ", repositório" + getRepositorio() +
                '}';
    }
}
