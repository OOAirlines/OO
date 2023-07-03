package model;

/**
 * Classe que representa uma pessoa f�sica.
 * Herda os atributos e m�todos da classe Pessoa.
 * 
 * @author Patrick Anderson
 * @since 2023-07-02
 */
public class PessoaFisica extends Pessoa {
    private static final byte M = 0;
    private static final byte F = 1;
    
    private String nome;
    private String CPF;
    private byte sexo;
    private String nascimento;
    
    /**
     * Construtor da classe PessoaFisica.
     * 
     * @param nome o nome da pessoa f�sica
     * @param CPF o CPF da pessoa f�sica
     * @param endereco o endere�o da pessoa f�sica
     * @param sexo o sexo da pessoa f�sica
     * @param nascimento a data de nascimento da pessoa f�sica
     * @param tel1 o telefone da pessoa f�sica
     */
    public PessoaFisica(String nome, String CPF, String endereco, byte sexo, String nascimento, String tel1) {
        this.nome = nome;
        this.CPF = CPF;
        this.endereco = endereco;
        this.sexo = sexo;
        this.nascimento = nascimento;
        this.tel1 = tel1;
    }
    
    /**
     * Construtor da classe PessoaFisica.
     * 
     * @param nome o nome da pessoa f�sica
     * @param CPF o CPF da pessoa f�sica
     * @param endereco o endere�o da pessoa f�sica
     * @param sexo o sexo da pessoa f�sica
     * @param nascimento a data de nascimento da pessoa f�sica
     */
    public PessoaFisica(String nome, String CPF, String endereco, byte sexo, String nascimento) {
        this.nome = nome;
        this.CPF = CPF;
        this.endereco = endereco;
        this.sexo = sexo;
        this.nascimento = nascimento;
    }
    
    /**
     * Construtor da classe PessoaFisica.
     * 
     * @param nome o nome da pessoa f�sica
     * @param CPF o CPF da pessoa f�sica
     * @param endereco o endere�o da pessoa f�sica
     * @param sexo o sexo da pessoa f�sica
     */
    public PessoaFisica(String nome, String CPF, String endereco, byte sexo) {
        this.nome = nome;
        this.CPF = CPF;
        this.endereco = endereco;
        this.sexo = sexo;
    }
    
    /**
     * Construtor da classe PessoaFisica.
     * 
     * @param nome o nome da pessoa f�sica
     * @param CPF o CPF da pessoa f�sica
     * @param endereco o endere�o da pessoa f�sica
     */
    public PessoaFisica(String nome, String CPF, String endereco) {
        this.nome = nome;
        this.CPF = CPF;
        this.endereco = endereco;
    }
    
    /**
     * Construtor da classe PessoaFisica.
     */
    public PessoaFisica() {
    }
    
    /**
     * Obt�m o nome da pessoa f�sica.
     * 
     * @return o nome da pessoa f�sica
     */
    public String getNome() {
        return nome;
    }

    /**
     * Define o nome da pessoa f�sica.
     * 
     * @param nome o nome a ser definido
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Obt�m o CPF da pessoa f�sica.
     * 
     * @return o CPF da pessoa f�sica
     */
    public String getCPF() {
        return CPF;
    }

    /**
     * Define o CPF da pessoa f�sica.
     * 
     * @param CPF o CPF a ser definido
     */
    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    /**
     * Obt�m o sexo da pessoa f�sica.
     * 
     * @return o sexo da pessoa f�sica
     */
    public byte getSexo() {
        return sexo;
    }

    /**
     * Define o sexo da pessoa f�sica.
     * 
     * @param sexo o sexo a ser definido
     */
    public void setSexo(byte sexo) {
        this.sexo = sexo;
    }

    /**
     * Obt�m a data de nascimento da pessoa f�sica.
     * 
     * @return a data de nascimento da pessoa f�sica
     */
    public String getNascimento() {
        return nascimento;
    }

    /**
     * Define a data de nascimento da pessoa f�sica.
     * 
     * @param nascimento a data de nascimento a ser definida
     */
    public void setNascimento(String nascimento) {
        this.nascimento = nascimento;
    }  
}
