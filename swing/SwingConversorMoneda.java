import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class SwingConversorMoneda extends JFrame {
    private JLabel etiquetaPesetas;
    private JLabel etiquetaEuros;
    private JLabel etiquetaDolares;
    private JTextField textoPesetas;
    private JTextField textoEuros;
    private JTextField textoDolares;

    public SwingConversorMoneda() {
        setLayout(new GridLayout(3, 2, 10, 3));
        setSize(350, 100);
        setTitle("Conversor Moneda");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        etiquetaPesetas = new JLabel("Pesetas");
        add(etiquetaPesetas);
        textoPesetas = new JTextField(10);
        textoPesetas.setHorizontalAlignment(JTextField.RIGHT);
        add(textoPesetas);
        textoPesetas.addActionListener(new ActionListener(){
        
            @Override
            public void actionPerformed(ActionEvent e) {
                double pesetas = Double.parseDouble(textoPesetas.getText());
                double calculoPesetasEuros = pesetas / 166.386;
                textoEuros.setText(String.format("%.2f", calculoPesetasEuros));

                double calculoPesetasDolares = pesetas * 0.007;
                textoDolares.setText(String.format("%.3f", calculoPesetasDolares));
            }
        });

        etiquetaEuros = new JLabel("Euros");
        add(etiquetaEuros);
        textoEuros = new JTextField(10);
        textoEuros.setHorizontalAlignment(JTextField.RIGHT);
        add(textoEuros);
        textoEuros.addActionListener(new ActionListener(){
        
            @Override
            public void actionPerformed(ActionEvent e) {
                double euros = Double.parseDouble(textoEuros.getText());
                double calculoEurosPesetas = euros * 166.386;
                textoPesetas.setText(String.format("%.2f", calculoEurosPesetas));

                double calculoEurosDolares = euros * 1.17;
                textoDolares.setText(String.format("%.3f", calculoEurosDolares));
            }
        });

        etiquetaDolares = new JLabel("Dólares");
        add(etiquetaDolares);
        textoDolares = new JTextField(10);
        textoDolares.setHorizontalAlignment(JTextField.RIGHT);
        add(textoDolares);
        textoDolares.addActionListener(new ActionListener(){
        
            @Override
            public void actionPerformed(ActionEvent e) {
                double dolares = Double.parseDouble(textoDolares.getText());
                double calculoDolaresPesetas = dolares / 0.007;
                textoPesetas.setText(String.format("%.2f", calculoDolaresPesetas));

                double calculoDolaresEuros = dolares / 1.17;
                textoEuros.setText(String.format("%.3f", calculoDolaresEuros));
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        // Uso seguro de hilos.
        javax.swing.SwingUtilities.invokeLater(new Runnable(){
        
            @Override
            public void run() {
                new SwingConversorMoneda();
            }
        });
    }
}