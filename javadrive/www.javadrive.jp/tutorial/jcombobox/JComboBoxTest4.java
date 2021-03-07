import javax.swing.*;
import java.awt.Dimension;
import java.awt.BorderLayout;

public class JComboBoxTest4 extends JFrame{

  public static void main(String[] args){
    JComboBoxTest4 frame = new JComboBoxTest4();

    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setBounds(10, 10, 300, 200);
    frame.setTitle("ƒ^ƒCƒgƒ‹");
    frame.setVisible(true);
  }

  JComboBoxTest4(){
    String[] combodata = {"Swing", "Java2D", "Java3D", "JavaMail"};
    JComboBox combo = new JComboBox(combodata);
    combo.setPreferredSize(new Dimension(180, 40));

    JPanel p = new JPanel();
    p.add(combo);

    getContentPane().add(p, BorderLayout.CENTER);
  }
}