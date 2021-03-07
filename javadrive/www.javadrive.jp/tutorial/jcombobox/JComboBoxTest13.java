import javax.swing.*;
import java.awt.Dimension;
import java.awt.BorderLayout;
import java.awt.event.*;

public class JComboBoxTest13 extends JFrame implements ActionListener{

  DefaultComboBoxModel model;
  JTextField indextext;
  JButton button;

  public static void main(String[] args){
    JComboBoxTest13 frame = new JComboBoxTest13();

    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setBounds(10, 10, 300, 200);
    frame.setTitle("ƒ^ƒCƒgƒ‹");
    frame.setVisible(true);
  }

  JComboBoxTest13(){
    String[] combodata = {"Swing", "Java2D", "Java3D", "JavaMail"};
    model = new DefaultComboBoxModel(combodata);

    JComboBox combo = new JComboBox(model);
    combo.setPreferredSize(new Dimension(80, 30));

    JPanel p = new JPanel();
    p.add(combo);

    indextext = new JTextField(2);
    button = new JButton("delete");
    button.addActionListener(this);

    JPanel controlPanel = new JPanel();
    controlPanel.add(new JLabel("index:"));
    controlPanel.add(indextext);
    controlPanel.add(button);

    getContentPane().add(p, BorderLayout.CENTER);
    getContentPane().add(controlPanel, BorderLayout.PAGE_END);
  }

  public void actionPerformed(ActionEvent e) {
    int index = Integer.parseInt(indextext.getText());

    int size = model.getSize();
    if ((index < 0) || (index >= size)){
        indextext.setText("");
        return;
    }

    model.removeElementAt(index);
    indextext.setText("");
  }
}