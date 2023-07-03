package model;

import java.util.ArrayList;

/**
 * Classe abstrata que representa uma pessoa.
 * 
 * @author Patrick Anderson e Artur
 * @since 2023-07-02
 */
public abstract class Pessoa {    
    protected String endereco;
    protected String tel1;
    protected ArrayList<Voo> reservas = new ArrayList<>();

    /**
     * Obt�m o endere�o da pessoa.
     * 
     * @return o endere�o da pessoa
     */
    public String getEndereco() {
        return endereco;
    }

    /**
     * Define o endere�o da pessoa.
     * 
     * @param endereco o endere�o a ser definido
     */
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    /**
     * Obt�m o telefone da pessoa.
     * 
     * @return o telefone da pessoa
     */
    public String getTel1() {
        return tel1;
    }

    /**
     * Define o telefone da pessoa.
     * 
     * @param tel1 o telefone a ser definido
     */
    public void setTel1(String tel1) {
        this.tel1 = tel1;
    }

    /**
     * Obt�m as reservas da pessoa.
     * 
     * @return as reservas da pessoa
     */
    public ArrayList<Voo> getReservas() {
        return reservas;
    }

    /**
     * Adiciona uma reserva � pessoa.
     * 
     * @param voo a reserva a ser adicionada
     */
    public void addReserva(Voo voo) {
        this.reservas.add(voo);
    }
}
