import javax.swing.*;
import java.awt.BorderLayout;

public class JComboBoxTest2 extends JFrame{

  public static void main(String[] args){
    JComboBoxTest2 frame = new JComboBoxTest2();

    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setBounds(10, 10, 300, 200);
    frame.setTitle("ƒ^ƒCƒgƒ‹");
    frame.setVisible(true);
  }

  JComboBoxTest2(){
    String[] combodata = {"Swing", "Java2D", "Java3D", "JavaMail"};
    JComboBox combo = new JComboBox(combodata);

    JPanel p = new JPanel();
    p.add(combo);

    getContentPane().add(p, BorderLayout.CENTER);
  }
}