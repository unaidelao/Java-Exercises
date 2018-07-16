import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class SwingAcumuladorV2 extends JFrame implements ActionListener {
    private JLabel etiquetaEntrada;
    private JTextField textoEntrada;
    private JLabel etiquetaSalida;
    private JLabel textoSalida;
    private int resultado = 0;
    
    // Constructor.
    public SwingAcumuladorV2() {
        setLayout(new FlowLayout());
        setSize(300, 100);
        setTitle("Swing Acumulador");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        etiquetaEntrada = new JLabel("Introduce un entero:");
        add(etiquetaEntrada);

        textoEntrada = new JTextField(10);
        add(textoEntrada);
        // Al pulsar ENTER sobre este evento, se ejecutará el actionPerformed().
        textoEntrada.addActionListener(this);

        etiquetaSalida = new JLabel("Resultado");
        add(etiquetaSalida);

        textoSalida = new JLabel("0");
        add(textoSalida);

        setVisible(true);
    }

    public static void main(String[] args) {
        new SwingAcumuladorV2();        
    }

    @Override
    public void actionPerformed(ActionEvent evento) {
        int numeroEntrada = Integer.parseInt(textoEntrada.getText());
        resultado += numeroEntrada;
        textoEntrada.setText("");
        textoSalida.setText("" + resultado);
    }
}