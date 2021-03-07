import javax.swing.*;
import java.awt.Dimension;
import java.awt.BorderLayout;
import java.awt.event.*;

public class JComboBoxTest16 extends JFrame implements ActionListener{

  DefaultComboBoxModel model;
  JButton button;

  public static void main(String[] args){
    JComboBoxTest16 frame = new JComboBoxTest16();

    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setBounds(10, 10, 300, 200);
    frame.setTitle("タイトル");
    frame.setVisible(true);
  }

  JComboBoxTest16(){
    String[] combodata = {"Swing", "Java2D", "Java3D", "JavaMail"};
    model = new DefaultComboBoxModel(combodata);

    JComboBox combo = new JComboBox(model);
    combo.setPreferredSize(new Dimension(80, 30));

    JPanel p = new JPanel();
    p.add(combo);

    button = new JButton("get all data");
    button.addActionListener(this);

    JPanel controlPanel = new JPanel();
    controlPanel.add(button);

    getContentPane().add(p, BorderLayout.CENTER);
    getContentPane().add(controlPanel, BorderLayout.PAGE_END);
  }

  public void actionPerformed(ActionEvent e) {
    int count = model.getSize();

    System.out.println("データ総数は:" + count + "です");

    for (int i = 0 ; i < count ; i++){
      String data = (String)model.getElementAt(i);
      System.out.println(data);
    }
  }
}