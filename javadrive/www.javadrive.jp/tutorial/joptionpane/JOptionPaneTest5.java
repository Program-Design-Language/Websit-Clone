import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.event.*;

public class JOptionPaneTest5 extends JFrame implements ActionListener{

  JLabel ansLabel;

  public static void main(String[] args){
    JOptionPaneTest5 frame = new JOptionPaneTest5();

    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setBounds(10, 10, 300, 200);
    frame.setTitle("�^�C�g��");
    frame.setVisible(true);
  }

  JOptionPaneTest5(){
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
    int option = JOptionPane.showConfirmDialog(this, "�j���ł����H");

    if (option == JOptionPane.YES_OPTION){
      ansLabel.setText("�j���ł�");
    }else if (option == JOptionPane.NO_OPTION){
      ansLabel.setText("�����ł�");
    }else if (option == JOptionPane.CANCEL_OPTION){
      ansLabel.setText("�L�����Z������܂���");
    }
  }
}
