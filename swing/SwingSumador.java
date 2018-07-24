import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class SwingSumador extends JFrame {
    private JLabel etiqueta1, etiqueta2, etiquetaResultado;
    private JTextField campo1, campo2, campoResultado;
    private JButton botonSuma, botonLimpiar;
    private int numero1, numero2, numResultado;

    public SwingSumador() {
        setSize(300, 200);
        setTitle("Swing Sumador");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container cp = getContentPane();
        // GridLayout con 4 filas, 2 columnas, separación horizontal 10 y vertical 3.
        cp.setLayout(new GridLayout(4, 2, 10, 3));

        etiqueta1 = new JLabel("Primer número ");
        cp.add(etiqueta1);
        campo1 = new JTextField(10);
        campo1.setHorizontalAlignment(JTextField.RIGHT);
        cp.add(campo1);

        etiqueta2 = new JLabel("Segundo número ");
        cp.add(etiqueta2);
        campo2 = new JTextField(10);
        campo2.setHorizontalAlignment(JTextField.RIGHT);
        cp.add(campo2);

        etiquetaResultado = new JLabel("Resultado ");
        cp.add(etiquetaResultado);
        campoResultado = new JTextField(10);
        campoResultado.setHorizontalAlignment(JTextField.RIGHT);
        campoResultado.setEditable(false);
        cp.add(campoResultado);

        botonSuma = new JButton("Sumar");
        cp.add(botonSuma);
        botonSuma.addActionListener(new ActionListener(){
        
            @Override
            public void actionPerformed(ActionEvent evento) {
                numero1 = Integer.parseInt(campo1.getText());
                numero2 = Integer.parseInt(campo2.getText());
                numResultado = numero1 + numero2;
                campoResultado.setText(numResultado + "");
            }
        });

        botonLimpiar = new JButton("Limpiar");
        cp.add(botonLimpiar);
        botonLimpiar.addActionListener(new ActionListener(){
        
            @Override
            public void actionPerformed(ActionEvent evento) {
                campo1.setText("");
                campo2.setText("");
                campoResultado.setText("");
                numero1 = 0;
                numero2 = 0;
                numResultado = 0;
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        // Uso seguro de hilos.
        javax.swing.SwingUtilities.invokeLater(new Runnable(){
        
            @Override
            public void run() {
                new SwingSumador();
            }
        });
    }
}