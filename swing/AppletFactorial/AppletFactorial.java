import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;


public class AppletFactorial extends Applet implements ActionListener {
    private Label etiquetaEntrada;
    private Label etiquetaSalida;
    private TextField textoEntrada;
    private TextField textoSalida;
    private Button botonResultado;
    private int resultado = 1;

    public void init() {
        etiquetaEntrada = new Label("n");
        add(etiquetaEntrada);
   
        textoEntrada = new TextField("", 10);
        add(textoEntrada);
  
        etiquetaSalida = new Label("n!");
        add(etiquetaSalida);
  
        textoSalida = new TextField("", 10);
        textoSalida.setEditable(false);
        add(textoSalida);
   
        botonResultado = new Button("Resultado");
        add(botonResultado);
        botonResultado.addActionListener(this);
    }

    public void actionPerformed (ActionEvent evento) {
        for (int i = Integer.parseInt(textoEntrada.getText()); i > 0; i--) {
            resultado *= i;
        }
        textoSalida.setText(resultado + "");
        resultado = 1;
    }
}