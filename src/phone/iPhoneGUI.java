package phone;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class iPhoneGUI extends JFrame implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    private JTextArea display;

    public iPhoneGUI() {
        // Configuração da janela
        setTitle("iPhone Simulator");
        setSize(400, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Área de exibição
        display = new JTextArea();
        display.setEditable(false);
        add(new JScrollPane(display), BorderLayout.CENTER);

        // Painel de botões
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(3, 1));

        // Botões do reprodutor musical
        JPanel musicPanel = new JPanel();
        musicPanel.setLayout(new GridLayout(2, 2));
        JButton playButton = new JButton("Tocar Música");
        JButton pauseButton = new JButton("Pausar Música");
        JButton nextButton = new JButton("Próxima Música");
        JButton previousButton = new JButton("Música Anterior");
        musicPanel.add(playButton);
        musicPanel.add(pauseButton);
        musicPanel.add(nextButton);
        musicPanel.add(previousButton);

        playButton.addActionListener(e -> tocarMusica());
        pauseButton.addActionListener(e -> pausarMusica());
        nextButton.addActionListener(e -> pularProxima());
        previousButton.addActionListener(e -> voltarAnterior());

        // Botões do aparelho telefônico
        JPanel phonePanel = new JPanel();
        phonePanel.setLayout(new GridLayout(1, 3));
        JButton callButton = new JButton("Fazer Chamada");
        JButton receiveButton = new JButton("Receber Chamada");
        JButton endButton = new JButton("Terminar Chamada");
        phonePanel.add(callButton);
        phonePanel.add(receiveButton);
        phonePanel.add(endButton);

        callButton.addActionListener(e -> fazerChamada("123-456-789"));
        receiveButton.addActionListener(e -> receberChamada());
        endButton.addActionListener(e -> terminarChamada());

        // Botões do navegador
        JPanel browserPanel = new JPanel();
        browserPanel.setLayout(new GridLayout(2, 2));
        JButton openPageButton = new JButton("Abrir Página");
        JButton refreshButton = new JButton("Atualizar Página");
        JButton addFavoriteButton = new JButton("Adicionar Favorito");
        JTextField urlField = new JTextField("https://www.exemplo.com");
        browserPanel.add(urlField);
        browserPanel.add(openPageButton);
        browserPanel.add(refreshButton);
        browserPanel.add(addFavoriteButton);

        openPageButton.addActionListener(e -> abrirPagina(urlField.getText()));
        refreshButton.addActionListener(e -> atualizarPagina());
        addFavoriteButton.addActionListener(e -> adicionarFavorito(urlField.getText()));

        // Adicionar os painéis ao painel principal
        buttonPanel.add(musicPanel);
        buttonPanel.add(phonePanel);
        buttonPanel.add(browserPanel);

        add(buttonPanel, BorderLayout.SOUTH);
    }

    // Implementação dos métodos de ReprodutorMusical
    @Override
    public void tocarMusica() {
        display.append("Tocando música\n");
    }

    @Override
    public void pausarMusica() {
        display.append("Pausando música\n");
    }

    @Override
    public void pularProxima() {
        display.append("Pulando para a próxima música\n");
    }

    @Override
    public void voltarAnterior() {
        display.append("Voltando para a música anterior\n");
    }

    // Implementação dos métodos de AparelhoTelefonico
    @Override
    public void fazerChamada(String numero) {
        display.append("Fazendo chamada para " + numero + "\n");
    }

    @Override
    public void receberChamada() {
        display.append("Recebendo chamada\n");
    }

    @Override
    public void terminarChamada() {
        display.append("Terminando chamada\n");
    }

    // Implementação dos métodos de NavegadorInternet
    @Override
    public void abrirPagina(String url) {
        display.append("Abrindo página: " + url + "\n");
    }

    @Override
    public void atualizarPagina() {
        display.append("Atualizando página\n");
    }

    @Override
    public void adicionarFavorito(String url) {
        display.append("Adicionando " + url + " aos favoritos\n");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            iPhoneGUI frame = new iPhoneGUI();
            frame.setVisible(true);
        });
    }
}

