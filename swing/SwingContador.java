import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
 

public class SwingContador extends JFrame implements ActionListener {
   private JLabel etiqueta;
   private JTextField texto;
   private JButton boton;
   private int contador = 0;
 
   // Constructor.
   public SwingContador() {
      setLayout(new FlowLayout());
      setSize(250, 100);
      setTitle("Swing Contador");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
      etiqueta = new JLabel("Contador");
      add(etiqueta);
 
      texto = new JTextField(contador + "", 10);
      texto.setEditable(false);
      add(texto);
 
      boton = new JButton("Siguiente");
      add(boton);
      boton.addActionListener(this);
 
      setVisible(true);
   }
 
   // Manejador de ActionEvent.
   @Override
   public void actionPerformed(ActionEvent evento) {
      ++contador;
      texto.setText(contador + "");
   }
 
   // MAIN
   public static void main(String[] args) {
      // Invoca al constructor mediante una instancia anónima.
      new SwingContador();
   }
}