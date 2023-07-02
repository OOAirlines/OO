/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dados.Banco;

import model.Aeroporto;
import model.DescricaoAviao;
import model.DescricaoVoo;
import model.Voo;
import java.util.Hashtable;
import javax.swing.JOptionPane;
import java.util.ArrayList;
/**
 *
 * @author Artur Pereira e Patrick Anderson
 */
public class ControladorItinerario extends view.TelaVoos {
    
  
    private Banco banco;
    
    private final Hashtable<String, DescricaoAviao> hashDescricaoAviao = new Hashtable<>();
    private final Hashtable<String, Aeroporto> hashAeroporto = new Hashtable<>();
    private Voo voo;
    private DescricaoVoo descricaoVoo;
    private Aeroporto aeroporto;

    public ControladorItinerario(byte opt) {
        super(opt);
        verificaOperacao();
        initOperations();
    }
    
    /**
     * Coloca as descrições de todos os aviões em uma HashTable e
     * adiciona ao cbAviao.
     */
    protected void initOperations() {
        
        this.banco = Banco.getInstance();
        ArrayList<Voo> voo = this.banco.getReservavoo();
        ArrayList<DescricaoAviao> descricaoaviao = this.banco.getDescricaoAviao();
        for(int i = 0; i < descricaoaviao.size(); i++) {
            DescricaoAviao tmp = descricaoaviao.get(i);
            hashDescricaoAviao.put(tmp.toString(), tmp);
            getCbAviao().addItem(tmp.toString());
        }
        
        /**for (int i = 0; i < Aerobus.arrayAeroporto.size(); i++) {
            boolean isInIndexDestino = false;
            boolean isInIndexOrigem = false;
            
            Aeroporto tmp = Aerobus.arrayAeroporto.get(i);
            String cidade = tmp.getCidade();
            String codigo = tmp.getCodigo();
            hashAeroporto.put(tmp.getCodigo(), tmp);
            
            for (int j = 0; j < getCbCidadeDestino().getItemCount(); j++) { 
                if (getCbCidadeDestino().getItemAt(j).equals(cidade)) isInIndexDestino = true;
            }
            for (int j = 0; j < getCbCidadeOrigem().getItemCount(); j++) {
                if (getCbCidadeOrigem().getItemAt(j).equals(cidade)) isInIndexOrigem = true;
            }
            if (!isInIndexDestino) getCbCidadeDestino().addItem(cidade);
            if (!isInIndexOrigem) getCbCidadeOrigem().addItem(cidade);
           
        }
        */
        if (opt == EDITAR || opt == REMOVER) {
            for (int i = 0; i < voo.size(); i++) {
                Voo tmp = voo.get(i);
                getCbVoo().addItem(tmp.toString());
            }
        } 
    }
    
    /**
     * Verifica a operação que foi passada para a nova tela
     * de vôos e faz as devidas alterações.
     */
    private void verificaOperacao() {
         switch(opt) {
            case NOVO: caseNovo(); break;
            case EDITAR: caseEditar(); break;
            case REMOVER: caseRemover(); break;
        }
    }
    
    /**
     * Se a operação é NOVO, altera o texto e desabilita o ComboBox.
     */
    private void caseNovo() {
        getLabelTitulo().setText("Novo vôo");
        getCbVoo().setEnabled(false);
    }
    
    /**
     * Se a operação é EDITAR, altera o texto e chama desabilitaItems().
     */
    private void caseEditar() {
        getLabelTitulo().setText("Editar vôo");
        desabilitaItems();
    }
    
    /**
     * Se a operação é REMOVER, altera o texto e chama desabilitaItems().
     */
    private void caseRemover() {
        getLabelTitulo().setText("Remover vôo");
        desabilitaItems();
    }
    
    /**
     * Habilita os campos:
     * - campoDataPartida
     * - campoVagas
     * - cbAeroportoDestino
     * - cbAeroportoOrigem
     * - cbCidadeDestino
     * - cbCidadeOrigem
     * - cbAviao.
     */
    private void habilitaItems() {
        getCampoDataPartida().setEnabled(true);
        getCampoVagas().setEnabled(true);
        getCbAeroportoDestino().setEnabled(true);
        getCbAeroportoOrigem().setEnabled(true);
        getCbCidadeDestino().setEnabled(true);
        getCbCidadeOrigem().setEnabled(true);
        getCbAviao().setEnabled(true);

                
    }
    
    /**
     * Desabilita os campos:
     * - campoDataPartida
     * - campoVagas
     * - cbAeroportoDestino
     * - cbAeroportoOrigem
     * - cbCidadeDestino
     * - cbCidadeOrigem
     * - cbAviao.
     */
    private void desabilitaItems() {
        getCampoDataPartida().setEnabled(false);
        getCampoVagas().setEnabled(false);
        getCbAeroportoDestino().setEnabled(false);
        getCbAeroportoOrigem().setEnabled(false);
        getCbCidadeDestino().setEnabled(false);
        getCbCidadeOrigem().setEnabled(false);
        getCbAviao().setEnabled(false);
    }

    /**
     * Verifica a intenção do usuário (NOVO, EDITAR, REMOVER)
     * e faz as devidas alterações.
     */
    @Override
    protected void confirmarAcao() {
        
        this.banco = Banco.getInstance();
        ArrayList<Voo> arrayVoos = this.banco.getReservavoo();
        
       String data = getCampoDataPartida().getText();
       int numPoltronas = Integer.parseInt(getCampoVagas().getText());
       String horarioPartida = getCampoHorarioPartida().getText();
       String horarioChegada = getCampoHorarioChegada().getText();
       DescricaoAviao descricaoAviao = hashDescricaoAviao.get(getCbAviao().getItemAt(getCbAviao().getSelectedIndex()));
       Aeroporto aeroportoOrigem = hashAeroporto.get(getCbAeroportoOrigem().getItemAt(getCbAeroportoOrigem().getSelectedIndex()));
       Aeroporto aeroportoDestino = hashAeroporto.get(getCbAeroportoDestino().getItemAt(getCbAeroportoDestino().getSelectedIndex()));
       
       if ((opt == NOVO || opt == EDITAR) && (data.equals("") || numPoltronas == 0 || horarioPartida.equals("")
                                              || horarioChegada.equals("") || descricaoAviao == null 
                                              || aeroportoOrigem == null || aeroportoDestino == null )) {
           JOptionPane.showMessageDialog(null, "Erro! Todos os campos são obrigatórios.\n");
           dispose();
       }
       
       switch(opt) {
           case NOVO:
               descricaoVoo = new DescricaoVoo(horarioPartida, horarioChegada, aeroportoOrigem, aeroportoDestino, descricaoAviao);
               voo = new Voo(data, numPoltronas, descricaoVoo);
               arrayVoos.add(voo);
               break;
           case EDITAR:
               voo = arrayVoos.get(getCbVoo().getSelectedIndex()-1);
               descricaoVoo = voo.getDescricaoVoo();
               descricaoVoo.setAeroportoChegada(aeroportoDestino);
               descricaoVoo.setAeroportoOrigem(aeroportoOrigem);
               descricaoVoo.setDescricaoAviao(descricaoAviao);
               descricaoVoo.setHorarioChegada(horarioChegada);
               descricaoVoo.setHorarioPartida(horarioPartida);
               voo.setData(data);
               voo.setDescricaoVoo(descricaoVoo);
               voo.setNumPoltronas(numPoltronas);
               break;
           case REMOVER:
               voo = arrayVoos.remove(getCbVoo().getSelectedIndex()-1);
               break;
       }
       dispose();
    }

    /**
     * Carrega as informações de determinado vôo nos campos da tela.
     */
    @Override
    protected void vooAcao() {
        
        this.banco = Banco.getInstance();
        ArrayList<Voo> arrayVoos = this.banco.getReservavoo();
        
        int option = getCbVoo().getSelectedIndex();
        if (option != -1) {
            voo = arrayVoos.get(option-1);
            descricaoVoo = voo.getDescricaoVoo();
            Aeroporto aeroportoOrigem = descricaoVoo.getAeroportoOrigem();
            Aeroporto aeroportoDestino = descricaoVoo.getAeroportoChegada();
            getCbCidadeDestino().setSelectedItem(aeroportoDestino.getCidade());
            getCbCidadeOrigem().setSelectedItem(aeroportoOrigem.getCidade());
            getCbAeroportoOrigem().setSelectedItem(aeroportoOrigem.getCodigo());
            getCbAeroportoDestino().setSelectedItem(aeroportoDestino.getCodigo());
            getCampoDataPartida().setText(voo.getData());
            getCbAviao().setSelectedItem(descricaoVoo.getDescricaoAviao().toString());
            getCampoVagas().setText(String.valueOf(voo.getNumPoltronas()));
            getCampoHorarioChegada().setText(descricaoVoo.getHorarioChegada());
            getCampoHorarioPartida().setText(descricaoVoo.getHorarioPartida());
            habilitaItems();
        }
        if (option == -1 || opt == REMOVER) desabilitaItems();
    }
    
    /**
     * Carrega todos os aerportos que partem da cidade selecionada.
     */
    @Override
    protected void cidadeOrigemAcao() {
        
         this.banco = Banco.getInstance();
            ArrayList<Aeroporto> arrayAeroporto = this.banco.getAeroportos();
        int option = getCbCidadeOrigem().getSelectedIndex();
        if (option != -1) {
            String cidade = getCbCidadeOrigem().getItemAt(option);
            getCbAeroportoOrigem().removeAllItems();
            for (int i = 0; i < arrayAeroporto.size(); i++) {
                Aeroporto tmp = arrayAeroporto.get(i);
                if (cidade.equals(tmp.getCidade())) {
                    getCbAeroportoOrigem().addItem(tmp.getCodigo());
                }
            }
        }
    }

    /**
     * Carrega todos os aeroportos que partem da cidade selecionada.
     */
    @Override
    protected void cidadeDestinoAcao() {
        this.banco = Banco.getInstance();
            ArrayList<Aeroporto> arrayAeroporto = this.banco.getAeroportos();
        int option = getCbCidadeDestino().getSelectedIndex();
        if (option != -1) {
            String cidade = getCbCidadeDestino().getItemAt(option);
            getCbAeroportoDestino().removeAllItems();
            for (int i = 0; i < arrayAeroporto.size(); i++) {
                Aeroporto tmp = arrayAeroporto.get(i);
                if(cidade.equals(tmp.getCidade())) {
                    getCbAeroportoDestino().addItem(tmp.getCodigo());
                }
            }
        }
    }

    /**
     * Carrega a quantidade de vagas em um avião.
     */
    
    @Override
    protected void aviaoAcao() {
        int option = getCbAviao().getSelectedIndex();
        if (option != -1) {
            
            getCampoVagas().setText("Zimbabwe");
        }
    }
    
}

