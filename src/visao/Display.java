package visao;

import javax.swing.*;
import java.awt.*;

@SuppressWarnings("serial")
public class Display extends JPanel implements MemoriaObserver {


    private final JLabel label;

    public Display() {

        Memoria.getInstance().addObservador(this);
        setBackground(new Color(46,49,50));
        label = new JLabel(Memoria.getInstance().getTextoAtual());
        label.setForeground(Color.WHITE);
        label.setFont(new Font("courier", Font.PLAIN, 30));
        setLayout(new FlowLayout(FlowLayout.RIGHT, 10, 25));
        add(label);
    }

    @Override
    public void AlterarValor(String novoValor) {
        label.setText(novoValor);
    }
}
