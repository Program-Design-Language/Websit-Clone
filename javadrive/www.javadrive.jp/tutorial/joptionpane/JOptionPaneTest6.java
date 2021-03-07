import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.event.*;

public class JOptionPaneTest6 extends JFrame implements ActionListener{

  JLabel ansLabel;

  public static void main(String[] args){
    JOptionPaneTest6 frame = new JOptionPaneTest6();

    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setBounds(10, 10, 300, 200);
    frame.setTitle("�^�C�g��");
    frame.setVisible(true);
  }

  JOptionPaneTest6(){
    JButton infoButton = new JButton("Question");
    infoButton.addActionListener(this);

    JPanel p = new JPanel();
    p.add(infoButton);

    ansLabel = new JLabel("���I���ł�");
    JPanel ansPanel = new JPanel();
    ansPanel.add(ansLabel);

    getContentPane().add(p, BorderLayout.CENTER);
    getContentPane().add(ansPanel, BorderLayout.PAGE_END);
  }

  public void actionPerformed(ActionEvent e){
    int option = JOptionPane.showConfirmDialog(this, "�w�����܂����H",
      "�I���_�C�A���O", JOptionPane.YES_NO_OPTION);

    if (option == JOptionPane.YES_OPTION){
      ansLabel.setText("�w�����܂���");
    }else if (option == JOptionPane.NO_OPTION){
      ansLabel.setText("�w������܂���ł���");
    }
  }
}
