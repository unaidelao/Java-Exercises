import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class SwingConversorTemperatura extends JFrame {
    private JLabel etiquetaCelsius;
    private JLabel etiquetaFahrenheit;
    private JTextField textoCelsius;
    private JTextField textoFahrenheit;

    public SwingConversorTemperatura() {
        setLayout(new GridLayout(2, 2, 10, 3));
        setSize(350,100);
        setTitle("Conversor Temperatura");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        etiquetaCelsius = new JLabel("Celsius");
        add(etiquetaCelsius);
        textoCelsius = new JTextField(10);
        textoCelsius.setHorizontalAlignment(JTextField.RIGHT);
        add(textoCelsius);
        textoCelsius.addActionListener(new ActionListener(){
        
            @Override
            public void actionPerformed(ActionEvent evento) {
                double grados = Double.parseDouble(textoCelsius.getText());
                double calculo = grados * 9 / 5 + 32;
                String resultado = String.format("%.1f", calculo);
                textoFahrenheit.setText(resultado);
            }
        });

        etiquetaFahrenheit = new JLabel("Fahrenheit");
        add(etiquetaFahrenheit);
        textoFahrenheit = new JTextField(10);
        textoFahrenheit.setHorizontalAlignment(JTextField.RIGHT);
        add(textoFahrenheit);
        textoFahrenheit.addActionListener(new ActionListener(){
        
            @Override
            public void actionPerformed(ActionEvent evento) {
                double grados = Double.parseDouble(textoFahrenheit.getText());
                double calculo = (grados - 32) * 5 / 9;
                String resultado = String.format("%.1f", calculo);
                textoCelsius.setText(resultado);
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        // Uso seguro de hilos.
        javax.swing.SwingUtilities.invokeLater(new Runnable(){
        
            @Override
            public void run() {
                new SwingConversorTemperatura();
            }
        });
    }
}