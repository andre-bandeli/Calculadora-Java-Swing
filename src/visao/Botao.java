package visao;

import javax.swing.*;
import java.awt.*;

@SuppressWarnings("serial")
public class Botao  extends JButton {

    public Botao(String texto, Color cor) {
        setText(texto);
        setOpaque(true);
        setBackground(cor);
        setFont(new Font("courier", Font.PLAIN, 25));
    }

}
