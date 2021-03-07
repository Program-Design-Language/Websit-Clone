import javax.swing.*;
import java.awt.Dimension;
import java.awt.BorderLayout;

public class JSpinnerTest3 extends JFrame{

  public static void main(String[] args){
    JSpinnerTest3 frame = new JSpinnerTest3();

    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setBounds(10, 10, 300, 200);
    frame.setTitle("�^�C�g��");
    frame.setVisible(true);
  }

  JSpinnerTest3(){
    String[] price = {"5���~�ȓ�", "10���~�ȓ�", "10���~�ȏ�"};
    SpinnerListModel model = new SpinnerListModel(price);

    JSpinner spinner = new JSpinner(model);
    spinner.setPreferredSize(new Dimension(100, 25));

    JPanel p = new JPanel();
    p.add(spinner);

    getContentPane().add(p, BorderLayout.CENTER);
  }
}