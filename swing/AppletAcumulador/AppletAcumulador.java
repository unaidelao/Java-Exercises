import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;


public class AppletAcumulador extends Applet implements ActionListener {
    private Label etiquetaEntrada;
    private TextField textoEntrada;
    private int resultado;

    public void init() {
        etiquetaEntrada = new Label("Introduce un número");
        add(etiquetaEntrada);
        textoEntrada = new TextField(10);
        add(textoEntrada);
        textoEntrada.addActionListener(this);
    }

    public void actionPerformed (ActionEvent evento) {
        int numeroEntrada = Integer.parseInt(evento.getActionCommand());
        resultado += numeroEntrada;
        textoEntrada.setText("");
        showStatus("Resultado de la suma acumulada: " + resultado);
    }
}