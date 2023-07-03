package view;

import java.awt.event.*;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;

/**
 * Classe ViewCrudItinerario que representa a interface gr�fica para as opera��es de CRUD de Itiner�rios.
 * 
 * Autor: Artur Pereira e Patrick Anderson
 * Desde: vers�o 1
 */

public class ViewCrudItinerario {
    private JFrame frame;
    private JButton btnCriar;
    private JButton btnEditar;
    private JButton btnLista;
    private JButton btnSair;
    private JLabel background;
    private JLabel lblOOAirlines;
    
    /**
     * Construtor da classe ViewCrudItinerario, onde � criada a interface gr�fica.
     */
    public ViewCrudItinerario() {
        frame = new JFrame();
        frame.setBounds(150, 150, 408, 487);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);
        frame.setLocationRelativeTo(null);

        /**
         * Bot�o Criar
         */
        btnCriar = new JButton("Criar");
        btnCriar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ViewCriaItinerario itinerarioWindow = new ViewCriaItinerario();
                itinerarioWindow.getOriginFrame().setVisible(true);
                frame.dispose(); // Fecha a tela atual
            }
        });
        btnCriar.setFont(new Font("Segoe UI Semibold", Font.BOLD, 18));
        btnCriar.setBounds(91, 129, 210, 45);
        frame.getContentPane().add(btnCriar);

        /**
         * Bot�o Editar
         */
        btnEditar = new JButton("Editar");
        btnEditar.setFont(new Font("Segoe UI Semibold", Font.BOLD, 18));
        btnEditar.setBounds(91, 185, 210, 45);
        frame.getContentPane().add(btnEditar);
        
        /**
         * Label OOAirlines
         */
        lblOOAirlines = new JLabel("Itiner�rio");
        lblOOAirlines.setFont(new Font("Segoe UI Semibold", Font.BOLD, 32));
        lblOOAirlines.setBounds(123, 31, 155, 61);
        frame.getContentPane().add(lblOOAirlines);
        
        /**
         * Bot�o Lista
         */
        btnLista = new JButton("Lista");
        btnLista.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ViewItinerarioList itinerarioListWindow = new ViewItinerarioList();
                itinerarioListWindow.getOriginFrame().setVisible(true);
                frame.dispose(); // Fecha a tela atual
            }
        });
        btnLista.setFont(new Font("Segoe UI Semibold", Font.BOLD, 18));
        btnLista.setBounds(91, 241, 210, 45);
        frame.getContentPane().add(btnLista);
        
        /**
         * Bot�o Sair
         */
        btnSair = new JButton("Sair");
        btnSair.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.dispose(); // Fecha a janela atual
            }
        });
        btnSair.setFont(new Font("Segoe UI Semibold", Font.BOLD, 18));
        btnSair.setBounds(91, 297, 210, 45);
        frame.getContentPane().add(btnSair);
    }

    /**
     * Retorna o JFrame da janela principal.
     */
    public JFrame getOriginFrame() {
        return frame;
    }
}
