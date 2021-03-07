import javax.swing.*;
import java.awt.Dimension;
import java.awt.BorderLayout;
import java.awt.event.*;

public class JComboBoxTest15 extends JFrame implements ItemListener{

  DefaultComboBoxModel model;
  JLabel label;

  public static void main(String[] args){
    JComboBoxTest15 frame = new JComboBoxTest15();

    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setBounds(10, 10, 300, 200);
    frame.setTitle("ƒ^ƒCƒgƒ‹");
    frame.setVisible(true);
  }

  JComboBoxTest15(){
    String[] combodata = {"Swing", "Java2D", "Java3D", "JavaMail"};
    model = new DefaultComboBoxModel(combodata);

    JComboBox combo = new JComboBox(model);
    combo.setPreferredSize(new Dimension(80, 30));
    combo.addItemListener(this);

    JPanel p = new JPanel();
    p.add(combo);

    label = new JLabel();

    JPanel labelPanel = new JPanel();
    labelPanel.add(label);

    getContentPane().add(p, BorderLayout.CENTER);
    getContentPane().add(labelPanel, BorderLayout.PAGE_END);
  }

  public void itemStateChanged(ItemEvent e) {
    if (e.getStateChange() == ItemEvent.SELECTED){
      String data = (String)model.getSelectedItem();
      label.setText(data);
    }
  }
}