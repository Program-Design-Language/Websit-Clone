import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.event.*;

public class JOptionPaneTest12 extends JFrame implements ActionListener{

  JLabel ansLabel;

  public static void main(String[] args){
    JOptionPaneTest12 frame = new JOptionPaneTest12();

    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setBounds(10, 10, 300, 200);
    frame.setTitle("タイトル");
    frame.setVisible(true);
  }

  JOptionPaneTest12(){
    JButton infoButton = new JButton("Question");
    infoButton.addActionListener(this);

    JPanel p = new JPanel();
    p.add(infoButton);

    ansLabel = new JLabel("未入力です");
    JPanel ansPanel = new JPanel();
    ansPanel.add(ansLabel);

    getContentPane().add(p, BorderLayout.CENTER);
    getContentPane().add(ansPanel, BorderLayout.PAGE_END);
  }

  public void actionPerformed(ActionEvent e){
    ImageIcon icon = new ImageIcon("./img/reo1s.gif");
    String selectvalues[] = {"読書", "ドライブ", "映画", 
      "スポーツ","インターネット"};

    Object value = JOptionPane.showInputDialog(this, "休日の過ごし方は？", 
      "休日の過ごし方", JOptionPane.INFORMATION_MESSAGE,
      icon, selectvalues, selectvalues[0]);

    if (value == null){
      ansLabel.setText("取消されました");
    }else{
      ansLabel.setText((String)value);
    }
  }
}
