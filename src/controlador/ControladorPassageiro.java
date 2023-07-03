package controlador;

import dados.Banco;
import model.PessoaFisica;
import model.Voo;
import java.util.ArrayList;

/**
 * Classe controladora respons�vel por gerenciar os passageiros.
 */
public class ControladorPassageiro {

    private Banco banco;

    /**
     * Construtor da classe ControladorPassageiro.
     * Inicializa o banco de dados.
     */
    public ControladorPassageiro() {
        this.banco = Banco.getInstance();
    }

    /**
     * Cadastra um novo passageiro f�sico no banco de dados.
     *
     * @param nome      Nome do passageiro f�sico
     * @param CPF       CPF do passageiro f�sico
     * @param endereco  Endere�o do passageiro f�sico
     * @param sexo      Sexo do passageiro f�sico (0 = Masculino, 1 = Feminino)
     * @param nascimento Data de nascimento do passageiro f�sico
     * @param tel1      Telefone de contato do passageiro f�sico
     */
    public void cadastrarPassageiroFisico(String nome, String CPF, String endereco, byte sexo, String nascimento, String tel1) {
        PessoaFisica passageiro = new PessoaFisica(nome, CPF, endereco, sexo, nascimento, tel1);
        banco.addPessoaFisica(passageiro);
    }

    /**
     * Adiciona uma passagem de voo para um passageiro f�sico.
     *
     * @param passageiro Passageiro f�sico
     * @param passagem   Passagem de voo
     */
    public void addPassagemPessoaFisica(PessoaFisica passageiro, Voo passagem) {
        passageiro.addReserva(passagem);
    }

    /**
     * Obt�m as passagens de voo de um passageiro f�sico.
     *
     * @param passageiro Passageiro f�sico
     * @return Uma lista de passagens de voo do passageiro f�sico
     */
    public ArrayList<Voo> getPassagensPessoaFisica(PessoaFisica passageiro) {
        return passageiro.getReservas();
    }
}
