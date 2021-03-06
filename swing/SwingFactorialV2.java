import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
 

public class SwingFactorialV2 extends JFrame implements ActionListener {
   private JLabel etiquetaEntrada;
   private JLabel etiquetaSalida;
   private JTextField textoEntrada;
   private JLabel textoSalida;
   private JButton botonResultado;
   private int resultado = 1;
 
   // Constructor.
   public SwingFactorialV2() {
      setLayout(new FlowLayout());
      setSize(250, 100);
      setTitle("Swing Factorial");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
      etiquetaEntrada = new JLabel("n");
      add(etiquetaEntrada);
 
      textoEntrada = new JTextField("", 10);
      add(textoEntrada);

      etiquetaSalida = new JLabel("n! = ");
      add(etiquetaSalida);

      textoSalida = new JLabel("--");
      add(textoSalida);
 
      botonResultado = new JButton("Resultado");
      add(botonResultado);
      botonResultado.addActionListener(this);
 
      setVisible(true);
   }
 
   // Manejador de ActionEvent.
   @Override
   public void actionPerformed(ActionEvent evento) {
        for (int i = Integer.parseInt(textoEntrada.getText()); i > 0; i--) {
           resultado *= i;
        }
        textoSalida.setText(resultado + "");
        resultado = 1;
   }
 
   // MAIN
   public static void main(String[] args) {
      // Invoca al constructor mediante una instancia anónima.
      new SwingFactorialV2();
   }
}