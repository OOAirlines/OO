package model;

/**
 * Classe que representa uma pessoa jur�dica.
 * Herda os atributos e m�todos da classe Pessoa.
 * 
 * @author Patrick Anderson e Artur
 * @since 2023-07-02
 */
public class PessoaJuridica extends Pessoa {
    private String CNPJ;
    private String razaoSocial;    
    
    /**
     * Construtor da classe PessoaJuridica.
     * 
     * @param razaoSocial a raz�o social da pessoa jur�dica
     * @param CNPJ o CNPJ da pessoa jur�dica
     * @param endereco o endere�o da pessoa jur�dica
     * @param tel1 o primeiro telefone da pessoa jur�dica
     * @param tel2 o segundo telefone da pessoa jur�dica
     */
    public PessoaJuridica(String razaoSocial, String CNPJ, String endereco, String tel1, String tel2){
        this.razaoSocial = razaoSocial;
        this.CNPJ = CNPJ;
        this.endereco = endereco;
        this.tel1 = tel1;
    }
    
    /**
     * Construtor da classe PessoaJuridica.
     * 
     * @param razaoSocial a raz�o social da pessoa jur�dica
     * @param CNPJ o CNPJ da pessoa jur�dica
     * @param endereco o endere�o da pessoa jur�dica
     * @param tel1 o telefone da pessoa jur�dica
     */
    public PessoaJuridica(String razaoSocial, String CNPJ, String endereco, String tel1){
        this.razaoSocial = razaoSocial;
        this.CNPJ = CNPJ;
        this.endereco = endereco;
        this.tel1 = tel1;
    }
    
    /**
     * Construtor da classe PessoaJuridica.
     * 
     * @param razaoSocial a raz�o social da pessoa jur�dica
     * @param CNPJ o CNPJ da pessoa jur�dica
     * @param endereco o endere�o da pessoa jur�dica
     */
    public PessoaJuridica(String razaoSocial, String CNPJ, String endereco){
        this.razaoSocial = razaoSocial;
        this.CNPJ = CNPJ;
        this.endereco = endereco;
    }
    
    /**
     * Construtor da classe PessoaJuridica.
     */
    public PessoaJuridica() {}

    /**
     * Obt�m o CNPJ da pessoa jur�dica.
     * 
     * @return o CNPJ da pessoa jur�dica
     */
    public String getCNPJ() {
        return CNPJ;
    }

    /**
     * Define o CNPJ da pessoa jur�dica.
     * 
     * @param CNPJ o CNPJ a ser definido
     */
    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    /**
     * Obt�m a raz�o social da pessoa jur�dica.
     * 
     * @return a raz�o social da pessoa jur�dica
     */
    public String getRazaoSocial() {
        return razaoSocial;
    }

    /**
     * Define a raz�o social da pessoa jur�dica.
     * 
     * @param razaoSocial a raz�o social a ser definida
     */
    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

}
