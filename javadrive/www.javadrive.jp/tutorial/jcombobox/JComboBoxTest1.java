import javax.swing.*;
import java.awt.BorderLayout;

public class JComboBoxTest1 extends JFrame{

  public static void main(String[] args){
    JComboBoxTest1 frame = new JComboBoxTest1();

    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setBounds(10, 10, 300, 200);
    frame.setTitle("ƒ^ƒCƒgƒ‹");
    frame.setVisible(true);
  }

  JComboBoxTest1(){
    JComboBox combo = new JComboBox();

    JPanel p = new JPanel();
    p.add(combo);

    getContentPane().add(p, BorderLayout.CENTER);
  }
}