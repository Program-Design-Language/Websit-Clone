import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.event.*;

public class JOptionPaneTest1 extends JFrame implements ActionListener{

  public static void main(String[] args){
    JOptionPaneTest1 frame = new JOptionPaneTest1();

    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setBounds(10, 10, 300, 200);
    frame.setTitle("�^�C�g��");
    frame.setVisible(true);
  }

  JOptionPaneTest1(){
    JButton button = new JButton("dialog");
    button.addActionListener(this);

    JPanel p = new JPanel();
    p.add(button);

    getContentPane().add(p, BorderLayout.CENTER);
  }

  public void actionPerformed(ActionEvent e){
    JOptionPane.showMessageDialog(this, "JOptionPane");
  }
}
