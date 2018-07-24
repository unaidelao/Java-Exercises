import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class SwingOperacionesAritmeticas extends JFrame {
    private JLabel etiquetaNum1, etiquetaNum2, etiquetaResultado;
    private JTextField campoNum1, campoNum2, campoResultado;
    private JButton botonSuma, botonResta, botonMultiplicacion, botonDivision, botonModulo, botonLimpiar;
    private double num1, num2, numResultado;

    public SwingOperacionesAritmeticas() {
        setSize(340, 340);
        setTitle("Swing Operaciones Aritméticas");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container cp = getContentPane();
        cp.setLayout(new GridLayout(6, 2, 10, 3));

        etiquetaNum1 = new JLabel("Primer número ");
        cp.add(etiquetaNum1);
        campoNum1 = new JTextField(10);
        campoNum1.setHorizontalAlignment(JTextField.RIGHT);
        cp.add(campoNum1);

        etiquetaNum2 = new JLabel("Segundo número ");
        cp.add(etiquetaNum2);
        campoNum2 = new JTextField(10);
        campoNum2.setHorizontalAlignment(JTextField.RIGHT);
        cp.add(campoNum2);

        etiquetaResultado = new JLabel("Resultado ");
        cp.add(etiquetaResultado);
        campoResultado = new JTextField(10);
        campoResultado.setHorizontalAlignment(JTextField.RIGHT);
        campoResultado.setEditable(false);
        cp.add(campoResultado);

        botonSuma = new JButton("+");
        cp.add(botonSuma);
        botonSuma.addActionListener(new ActionListener(){
        
            @Override
            public void actionPerformed(ActionEvent evento) {
                num1 = Double.parseDouble(campoNum1.getText());
                num2 = Double.parseDouble(campoNum2.getText());
                numResultado = num1 + num2;
                campoResultado.setText(numResultado + "");
            }
        });

        botonResta = new JButton("-");
        cp.add(botonResta);
        botonResta.addActionListener(new ActionListener(){
        
            @Override
            public void actionPerformed(ActionEvent evento) {
                num1 = Double.parseDouble(campoNum1.getText());
                num2 = Double.parseDouble(campoNum2.getText());
                numResultado = num1 - num2;
                campoResultado.setText(numResultado + "");
            }
        });

        botonMultiplicacion = new JButton("*");
        cp.add(botonMultiplicacion);
        botonMultiplicacion.addActionListener(new ActionListener(){
        
            @Override
            public void actionPerformed(ActionEvent evento) {
                num1 = Double.parseDouble(campoNum1.getText());
                num2 = Double.parseDouble(campoNum2.getText());
                numResultado = num1 * num2;
                campoResultado.setText(numResultado + "");
            }
        });

        botonDivision = new JButton("/");
        cp.add(botonDivision);
        botonDivision.addActionListener(new ActionListener(){
        
            @Override
            public void actionPerformed(ActionEvent evento) {
                num1 = Double.parseDouble(campoNum1.getText());
                num2 = Double.parseDouble(campoNum2.getText());
                numResultado = num1 / num2;
                campoResultado.setText(numResultado + "");
            }
        });

        botonModulo = new JButton("%");
        cp.add(botonModulo);
        botonModulo.addActionListener(new ActionListener(){
        
            @Override
            public void actionPerformed(ActionEvent evento) {
                num1 = Double.parseDouble(campoNum1.getText());
                num2 = Double.parseDouble(campoNum2.getText());
                numResultado = num1 % num2;
                campoResultado.setText(numResultado + "");
            }
        });

        botonLimpiar = new JButton("Limpiar");
        cp.add(botonLimpiar);
        botonLimpiar.addActionListener(new ActionListener(){
        
            @Override
            public void actionPerformed(ActionEvent evento) {
                campoNum1.setText("");
                campoNum2.setText("");
                campoResultado.setText("");
                num1 = 0;
                num2 = 0;
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
                new SwingOperacionesAritmeticas();
            }
        });
    }
}