package model;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Classe que representa um voo.
 * Armazena informa��es sobre a data, n�mero de poltronas, hor�rio de partida, hor�rio de chegada,
 * aeroporto de origem, aeroporto de chegada e descri��o do avi�o.
 * Cada voo possui um ID �nico gerado automaticamente.
 * 
 * @author Patrick Anderson e Artur
 * @since 2023-07-02
 */
public class Voo {
    private String data;
    private int numPoltronas;
    private static final AtomicInteger count = new AtomicInteger(0);
    private final int id;
    private String horarioPartida;
    private String horarioChegada;
    private String aeroportoOrigem;
    private String aeroportoChegada;
    private String descricaoAviao;

    /**
     * Construtor da classe Voo.
     * 
     * @param data a data do voo
     * @param numPoltronas o n�mero de poltronas do voo
     * @param horarioPartida o hor�rio de partida do voo
     * @param horarioChegada o hor�rio de chegada do voo
     * @param aeroportoOrigem o aeroporto de origem do voo
     * @param aeroportoChegada o aeroporto de chegada do voo
     * @param descricaoAviao a descri��o do avi�o do voo
     */
    public Voo(String data, int numPoltronas, String horarioPartida, String horarioChegada, String aeroportoOrigem, String aeroportoChegada, String descricaoAviao) {
        id = count.incrementAndGet();
        this.data = data;
        this.numPoltronas = numPoltronas;
        this.horarioPartida = horarioPartida;
        this.horarioChegada = horarioChegada;
        this.aeroportoOrigem = aeroportoOrigem;
        this.aeroportoChegada = aeroportoChegada;
        this.descricaoAviao = descricaoAviao;
    }

    /**
     * Obt�m a data do voo.
     * 
     * @return a data do voo
     */
    public String getData() {
        return data;
    }

    /**
     * Define a data do voo.
     * 
     * @param data a data a ser definida
     */
    public void setData(String data) {
        this.data = data;
    }

    /**
     * Obt�m o n�mero de poltronas do voo.
     * 
     * @return o n�mero de poltronas do voo
     */
    public int getNumPoltronas() {
        return numPoltronas;
    }

    /**
     * Define o n�mero de poltronas do voo.
     * 
     * @param numPoltronas o n�mero de poltronas a ser definido
     */
    public void setNumPoltronas(int numPoltronas) {
        this.numPoltronas = numPoltronas;
    }

    /**
     * Obt�m o ID do voo.
     * 
     * @return o ID do voo
     */
    public int getId() {
        return id;
    }

    /**
     * Obt�m o hor�rio de partida do voo.
     * 
     * @return o hor�rio de partida do voo
     */
    public String getHorarioPartida() {
        return horarioPartida;
    }

    /**
     * Define o hor�rio de partida do voo.
     * 
     * @param horarioPartida o hor�rio de partida a ser definido
     */
    public void setHorarioPartida(String horarioPartida) {
        this.horarioPartida = horarioPartida;
    }

    /**
     * Obt�m o hor�rio de chegada do voo.
     * 
     * @return o hor�rio de chegada do voo
     */
    public String getHorarioChegada() {
        return horarioChegada;
    }

    /**
     * Define o hor�rio de chegada do voo.
     * 
     * @param horarioChegada o hor�rio de chegada a ser definido
     */
    public void setHorarioChegada(String horarioChegada) {
        this.horarioChegada = horarioChegada;
    }

    /**
     * Obt�m o aeroporto de origem do voo.
     * 
     * @return o aeroporto de origem do voo
     */
    public String getAeroportoOrigem() {
        return aeroportoOrigem;
    }

    /**
     * Define o aeroporto de origem do voo.
     * 
     * @param aeroportoOrigem o aeroporto de origem a ser definido
     */
    public void setAeroportoOrigem(String aeroportoOrigem) {
        this.aeroportoOrigem = aeroportoOrigem;
    }

    /**
     * Obt�m o aeroporto de chegada do voo.
     * 
     * @return o aeroporto de chegada do voo
     */
    public String getAeroportoChegada() {
        return aeroportoChegada;
    }

    /**
     * Define o aeroporto de chegada do voo.
     * 
     * @param aeroportoChegada o aeroporto de chegada a ser definido
     */
    public void setAeroportoChegada(String aeroportoChegada) {
        this.aeroportoChegada = aeroportoChegada;
    }

    /**
     * Obt�m a descri��o do avi�o do voo.
     * 
     * @return a descri��o do avi�o do voo
     */
    public String getDescricaoAviao() {
        return descricaoAviao;
    }

    /**
     * Define a descri��o do avi�o do voo.
     * 
     * @param descricaoAviao a descri��o do avi�o a ser definida
     */
    public void setDescricaoAviao(String descricaoAviao) {
        this.descricaoAviao = descricaoAviao;
    }
    
    
    /**
     * Retorna uma representa��o em forma de String do voo.
     * 
     * @return a representa��o em forma de String do voo
     */
    @Override
    public String toString() {
        String retorno = this.aeroportoOrigem +
                " -> " + this.aeroportoChegada +
                " (" + data + ")";
        return retorno;
    }

}
