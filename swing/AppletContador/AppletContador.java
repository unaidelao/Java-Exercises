import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;


public class AppletContador extends Applet implements ActionListener {
    private Label etiqueta;
    private TextField texto;
    private Button boton;
    private int contador = 0;

    public void init() {
        etiqueta = new Label("Contador");
        add(etiqueta);
        
        texto = new TextField(contador + "", 10);
        texto.setEditable(false);
        add(texto);

        boton = new Button("Siguiente");
        add(boton);
        boton.addActionListener(this);
    }

    public void actionPerformed (ActionEvent evento) {
        ++contador;
        texto.setText(contador + "");
        showStatus("Resultado del conteo: " + contador);
    }
}