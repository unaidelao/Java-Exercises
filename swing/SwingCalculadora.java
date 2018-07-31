import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SwingCalculadora extends JFrame {
    private JPanel panelDisplay;
    private JPanel panelBotones;
    private JTextField display;
    private JButton boton1;
    private JButton boton2;
    private JButton boton3;
    private JButton boton4;
    private JButton boton5;
    private JButton boton6;
    private JButton boton7;
    private JButton boton8;
    private JButton boton9;
    private JButton boton0;
    private JButton botonSuma;
    private JButton botonResta;
    private JButton botonMultiplicacion;
    private JButton botonDivision;
    private JButton botonResultado;
    private JButton botonLimpiar;
    private String expresion = "";
    private char operador = ' ';
    private double resultado = 0;

    public SwingCalculadora() {
        // Opciones del Frame.
        setSize(450, 450);
        setTitle("Calculadora Java");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // Se crea una nueva fuente de texto.
        Font nuevaFuente = new Font("Courier", Font.BOLD, 35);

        // Display.
        display = new JTextField("0", 20);
        display.setEditable(false);
        display.setHorizontalAlignment(JTextField.RIGHT);
        display.setFont(nuevaFuente);

        // Botones.
        boton1 = new JButton("1");
        boton2 = new JButton("2");
        boton3 = new JButton("3");
        boton4 = new JButton("4");
        boton5 = new JButton("5");
        boton6 = new JButton("6");
        boton7 = new JButton("7");
        boton8 = new JButton("8");
        boton9 = new JButton("9");
        boton0 = new JButton("0");
        botonSuma = new JButton("+");
        botonResta = new JButton("-");
        botonMultiplicacion = new JButton("*");
        botonDivision = new JButton("/");
        botonResultado = new JButton("=");
        botonLimpiar = new JButton("C");

        // Panel para el display.
        panelDisplay = new JPanel();
        panelDisplay.add(display);
        add(panelDisplay, BorderLayout.NORTH);

        // Panel para los botones.
        panelBotones = new JPanel();
        panelBotones.setLayout(new GridLayout(4, 4, 5, 5));
        panelBotones.add(boton7);
        panelBotones.add(boton8);
        panelBotones.add(boton9);
        panelBotones.add(botonSuma);
        panelBotones.add(boton4);
        panelBotones.add(boton5);
        panelBotones.add(boton6);
        panelBotones.add(botonResta);
        panelBotones.add(boton1);
        panelBotones.add(boton2);
        panelBotones.add(boton3);
        panelBotones.add(botonMultiplicacion);
        panelBotones.add(botonLimpiar);
        panelBotones.add(boton0);
        panelBotones.add(botonResultado);
        panelBotones.add(botonDivision);
        add(panelBotones, BorderLayout.CENTER);

        // Añade los oyentes a los botones, por su tipo de funcionalidad.
        boton1.addActionListener(new OyenteBotonNumero());
        boton2.addActionListener(new OyenteBotonNumero());
        boton3.addActionListener(new OyenteBotonNumero());
        boton4.addActionListener(new OyenteBotonNumero());
        boton5.addActionListener(new OyenteBotonNumero());
        boton6.addActionListener(new OyenteBotonNumero());
        boton7.addActionListener(new OyenteBotonNumero());
        boton8.addActionListener(new OyenteBotonNumero());
        boton9.addActionListener(new OyenteBotonNumero());
        boton0.addActionListener(new OyenteBotonNumero());
        botonSuma.addActionListener(new OyenteBotonOperacion());
        botonResta.addActionListener(new OyenteBotonOperacion());
        botonMultiplicacion.addActionListener(new OyenteBotonOperacion());
        botonDivision.addActionListener(new OyenteBotonOperacion());
        botonResultado.addActionListener(new OyenteBotonResultado());
        botonLimpiar.addActionListener(new OyenteBotonLimpiar());

        // Visible
        setVisible(true);
    }

    public static void main(String[] args) {
        // Uso seguro de hilos.
        javax.swing.SwingUtilities.invokeLater(new Runnable(){
        
            @Override
            public void run() {
                new SwingCalculadora();
            }
        });
    }

    // Clase interna para oyente de botones número.
    class OyenteBotonNumero implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent evento) {
            expresion += evento.getActionCommand();
            display.setText(expresion);
        }
    }

    // Clase interna para oyente de botones de operaciones aritméticas.
    class OyenteBotonOperacion implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent evento) {
            operador = evento.getActionCommand().charAt(0);
            expresion += operador;
            display.setText(expresion);
        }
    }

    // Clase interna para botón limpiar.
    class OyenteBotonLimpiar implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent evento) {
            display.setText("0");
            expresion = "";
            operador = ' ';
        }
    }

    // Clase interna para botón resultado.
    class OyenteBotonResultado implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent evento) {
            // Necesario añadir "\\" en split() ya que si no se escapan los caracteres '+' o '*',
            // luego regex da problemas en tiempo de ejecución.
            String[] expresiones = expresion.split("\\" + Character.toString(operador));
            double expresion1 = Double.parseDouble(expresiones[0]);
            double expresion2 = Double.parseDouble(expresiones[1]);

            switch (operador) {
                case '+':
                    resultado = expresion1 + expresion2;
                    display.setText(String.format("%f", resultado));
                    break;
                case '-':
                    resultado = expresion1 - expresion2;
                    display.setText(String.format("%f", resultado));
                    break;
                case '*':
                    resultado = expresion1 * expresion2;
                    display.setText(String.format("%f", resultado));
                    break;
                case '/':
                    resultado = expresion1 / expresion2;
                    display.setText(String.format("%f", resultado));
                    break;
            }
        }
    }
}