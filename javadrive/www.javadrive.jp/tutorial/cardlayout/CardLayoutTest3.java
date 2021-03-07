import javax.swing.*;
import java.awt.CardLayout;
import java.awt.BorderLayout;
import java.awt.event.*;

public class CardLayoutTest3 extends JFrame implements ActionListener{

  JPanel cardPanel;
  CardLayout layout;

  public static void main(String[] args){
    CardLayoutTest3 frame = new CardLayoutTest3();

    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setBounds(10, 10, 300, 200);
    frame.setTitle("�^�C�g��");
    frame.setVisible(true);
  }

  CardLayoutTest3(){
    /* �J�[�h1 */
    JPanel card1 = new JPanel();
    card1.add(new JButton("button"));

    /* �J�[�h2 */
    JPanel card2 = new JPanel();
    card2.add(new JLabel("label"));
    card2.add(new JTextField("", 10));

    /* �J�[�h3 */
    JPanel card3 = new JPanel();
    card3.add(new JCheckBox("checkbox1"));
    card3.add(new JCheckBox("checkbox2"));

    cardPanel = new JPanel();
    layout = new CardLayout();
    cardPanel.setLayout(layout);

    cardPanel.add(card1, "button");
    cardPanel.add(card2, "label");
    cardPanel.add(card3, "checkbox");

    /* �J�[�h�ړ��p�{�^�� */
    JButton button1 = new JButton("button");
    button1.addActionListener(this);
    button1.setActionCommand("button");

    JButton button2 = new JButton("label");
    button2.addActionListener(this);
    button2.setActionCommand("label");

    JButton button3 = new JButton("checkbox");
    button3.addActionListener(this);
    button3.setActionCommand("checkbox");

    JPanel btnPanel = new JPanel();
    btnPanel.add(button1);
    btnPanel.add(button2);
    btnPanel.add(button3);

    getContentPane().add(cardPanel, BorderLayout.CENTER);
    getContentPane().add(btnPanel, BorderLayout.PAGE_END);
  }

  public void actionPerformed(ActionEvent e){
    String cmd = e.getActionCommand();

    layout.show(cardPanel, cmd);
  }
}