import javax.swing.*;
import java.awt.Dimension;
import java.awt.BorderLayout;

public class JComboBoxTest14 extends JFrame{

  public static void main(String[] args){
    JComboBoxTest14 frame = new JComboBoxTest14();

    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setBounds(10, 10, 300, 200);
    frame.setTitle("ƒ^ƒCƒgƒ‹");
    frame.setVisible(true);
  }

  JComboBoxTest14(){
    String[] combodata = {"Swing", "Java2D", "Java3D", "JavaMail"};
    DefaultComboBoxModel model = new DefaultComboBoxModel(combodata);

    JComboBox combo = new JComboBox(model);
    combo.setPreferredSize(new Dimension(80, 30));

    model.setSelectedItem(model.getElementAt(1));

    JPanel p = new JPanel();
    p.add(combo);

    getContentPane().add(p, BorderLayout.CENTER);
  }
}