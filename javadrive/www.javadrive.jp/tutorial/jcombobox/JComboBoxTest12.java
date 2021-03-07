import javax.swing.*;
import java.awt.Dimension;
import java.awt.BorderLayout;
import java.awt.event.*;

public class JComboBoxTest12 extends JFrame implements ActionListener{

  DefaultComboBoxModel model;
  JTextField datatext;
  JTextField indextext;
  JButton button;

  public static void main(String[] args){
    JComboBoxTest12 frame = new JComboBoxTest12();

    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setBounds(10, 10, 300, 200);
    frame.setTitle("ƒ^ƒCƒgƒ‹");
    frame.setVisible(true);
  }

  JComboBoxTest12(){
    String[] combodata = {"Swing", "Java2D", "Java3D", "JavaMail"};
    model = new DefaultComboBoxModel(combodata);

    JComboBox combo = new JComboBox(model);
    combo.setPreferredSize(new Dimension(80, 30));

    JPanel p = new JPanel();
    p.add(combo);

    datatext = new JTextField(6);
    indextext = new JTextField(2);
    button = new JButton("insert");
    button.addActionListener(this);

    JPanel controlPanel = new JPanel();
    controlPanel.add(new JLabel("index:"));
    controlPanel.add(indextext);
    controlPanel.add(new JLabel("data:"));
    controlPanel.add(datatext);
    controlPanel.add(button);

    getContentPane().add(p, BorderLayout.CENTER);
    getContentPane().add(controlPanel, BorderLayout.PAGE_END);
  }

  public void actionPerformed(ActionEvent e) {
    int index = Integer.parseInt(indextext.getText());
    String newdata = datatext.getText();

    if ((newdata == null) || (newdata.equals(""))){
      return;
    }

    model.insertElementAt(newdata, index);
    indextext.setText("");
    datatext.setText("");
  }
}