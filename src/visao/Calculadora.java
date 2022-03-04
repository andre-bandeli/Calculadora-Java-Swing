package visao;

import javax.swing.*;
import java.awt.*;

public class Calculadora extends JFrame {

    public Calculadora() {
        organizarLayout();
        setSize(232, 322);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void organizarLayout() {
        setLayout(new BorderLayout());
        Display display = new Display();
        Teclado teclado = new Teclado();

        display.setPreferredSize(new Dimension(233, 60));

        add(teclado, BorderLayout.CENTER);
        add(display, BorderLayout.NORTH);

    }


    public static void main(String[] args) {
        new Calculadora();
    }

}
