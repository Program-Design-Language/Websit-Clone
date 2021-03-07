import javax.swing.*;
import java.awt.Dimension;
import java.awt.BorderLayout;
import java.awt.event.*;

public class JComboBoxTest11 extends JFrame implements ActionListener{

  DefaultComboBoxModel model;
  JTextField text;
  JButton button;

  public static void main(String[] args){
    JComboBoxTest11 frame = new JComboBoxTest11();

    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setBounds(10, 10, 300, 200);
    frame.setTitle("ƒ^ƒCƒgƒ‹");
    frame.setVisible(true);
  }

  JComboBoxTest11(){
    String[] combodata = {"Swing", "Java2D", "Java3D", "JavaMail"};
    model = new DefaultComboBoxModel(combodata);

    JComboBox combo = new JComboBox(model);
    combo.setPreferredSize(new Dimension(80, 30));

    JPanel p = new JPanel();
    p.add(combo);

    text = new JTextField(10);
    button = new JButton("add");
    button.addActionListener(this);

    JPanel controlPanel = new JPanel();
    controlPanel.add(text);
    controlPanel.add(button);

    getContentPane().add(p, BorderLayout.CENTER);
    getContentPane().add(controlPanel, BorderLayout.PAGE_END);
  }

  public void actionPerformed(ActionEvent e) {
    String newdata = text.getText();

    if ((newdata == null) || (newdata.equals(""))){
      return;
    }

    model.addElement(newdata);
    text.setText("");
  }
}