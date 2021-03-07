import javax.swing.*;
import java.awt.Dimension;
import java.awt.BorderLayout;

public class JSpinnerTest5 extends JFrame{

  public static void main(String[] args){
    JSpinnerTest5 frame = new JSpinnerTest5();

    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setBounds(10, 10, 300, 200);
    frame.setTitle("�^�C�g��");
    frame.setVisible(true);
  }

  JSpinnerTest5(){
    String[] data = {"�p��", "����", "���w", "����", "�Љ�"};
    SpinnerListModel model = new SpinnerListModel(data);

    JSpinner spinner = new JSpinner(model);
    spinner.setPreferredSize(new Dimension(100, 25));

    JPanel p = new JPanel();
    p.add(spinner);

    getContentPane().add(p, BorderLayout.CENTER);
  }
}