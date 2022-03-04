package visao;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

@SuppressWarnings("serial")
public class Teclado extends JPanel implements ActionListener {

    private final Color cor_cinza_escuro = new Color(68, 68, 68);
    private final Color cor_cinza_claro = new Color(99, 99, 99);
    private final Color cor_laranja = new Color(242, 163, 60);

    public Teclado() {

        GridBagLayout layout = new GridBagLayout();
        GridBagConstraints c = new GridBagConstraints();

        setLayout(layout);

        c.weightx = 1;
        c.weighty = 1;
        c.fill = GridBagConstraints.BOTH;

        //linha 1
        c.gridwidth = 3;
        adicionarBotao("AC", cor_cinza_escuro, c, 0, 0);
        c.gridwidth = 1;
        adicionarBotao("%", cor_cinza_escuro, c, 2, 0);
        adicionarBotao("/", cor_laranja, c, 3, 0);
        // linha2
        adicionarBotao("7", cor_cinza_claro, c, 0, 1);
        adicionarBotao("8", cor_cinza_claro, c, 1, 1);
        adicionarBotao("9", cor_cinza_claro, c, 2, 1);
        adicionarBotao("*", cor_laranja, c, 3, 1);
        // linha 3
        adicionarBotao("4", cor_cinza_claro, c, 0, 2);
        adicionarBotao("5", cor_cinza_claro, c, 1, 2);
        adicionarBotao("6", cor_cinza_claro, c, 2, 2);
        adicionarBotao("-", cor_laranja, c, 3, 2);
        // linha 4
        adicionarBotao("1", cor_cinza_claro, c, 0, 3);
        adicionarBotao("2", cor_cinza_claro, c, 1, 3);
        adicionarBotao("3", cor_cinza_claro, c, 2, 3);
        adicionarBotao("+", cor_laranja, c, 3, 3);
        // linha 5
        c.gridwidth = 2;
        adicionarBotao("0", cor_cinza_claro, c, 0, 4);
        c.gridwidth = 1;
        adicionarBotao(",", cor_cinza_claro, c, 2, 4);
        adicionarBotao("=", cor_laranja, c, 3, 4);


    }

    private void adicionarBotao(String texto, Color cor,
                                GridBagConstraints c, int x, int y) {
        c.gridx = x;
        c.gridy = y;
        Botao botao = new Botao(texto, cor);
        botao.addActionListener(this);
        add(botao, c);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton botao = (JButton) e.getSource();
        Memoria.getInstance().processarComando(botao.getText());
        System.out.println(botao.getText());
    }
}
