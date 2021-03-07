import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.event.*;

public class JOptionPaneTest13 extends JFrame implements ActionListener{

  JLabel ansLabel;

  public static void main(String[] args){
    JOptionPaneTest13 frame = new JOptionPaneTest13();

    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setBounds(10, 10, 300, 200);
    frame.setTitle("�^�C�g��");
    frame.setVisible(true);
  }

  JOptionPaneTest13(){
    JButton infoButton = new JButton("Question");
    infoButton.addActionListener(this);

    JPanel p = new JPanel();
    p.add(infoButton);

    ansLabel = new JLabel("�����͂ł�");
    JPanel ansPanel = new JPanel();
    ansPanel.add(ansLabel);

    getContentPane().add(p, BorderLayout.CENTER);
    getContentPane().add(ansPanel, BorderLayout.PAGE_END);
  }

  public void actionPerformed(ActionEvent e){
    String selectvalues[] = {"�Ǐ�", "�h���C�u", "�f��", "�X�|�[�c"};

    int select = JOptionPane.showOptionDialog(this,
      "�x���̉߂������́H", 
      "�x���̉߂�����", 
      JOptionPane.YES_NO_OPTION,
      JOptionPane.QUESTION_MESSAGE,
      null, 
      selectvalues, 
      selectvalues[0]
    );

    if (select == JOptionPane.CLOSED_OPTION){
      ansLabel.setText("�I�����ꂸ�ɕ����܂���");
    }else{
      ansLabel.setText(selectvalues[select]);
    }
  }
}
