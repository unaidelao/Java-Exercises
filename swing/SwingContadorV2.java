import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
 

public class SwingContadorV2 extends JFrame {
   private JLabel etiqueta;
   private JTextField texto;
   private JButton botonSumar;
   private JButton botonRestar;
   private int contador = 0;
 
   // Constructor.
   public SwingContadorV2() {
      setLayout(new FlowLayout());
      setSize(350, 100);
      setTitle("Swing Contador V2");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
      etiqueta = new JLabel("Contador");
      add(etiqueta);
 
      texto = new JTextField(contador + "", 10);
      texto.setEditable(false);
      add(texto);
 
      botonSumar = new JButton("+ 1");
      add(botonSumar);
      botonSumar.addActionListener(new ActionListener(){
      
          @Override
          public void actionPerformed(ActionEvent e) {
              ++contador;
              texto.setText(contador + "");
          }
      });

      botonRestar = new JButton("- 1");
      add(botonRestar);
      botonRestar.addActionListener(new ActionListener(){
      
          @Override
          public void actionPerformed(ActionEvent e) {
              --contador;
              texto.setText(contador + "");
          }
      });
 
      setVisible(true);
   }
 
   // MAIN
   public static void main(String[] args) {
      // Invoca al constructor mediante una instancia anónima.
      new SwingContadorV2();
   }
}