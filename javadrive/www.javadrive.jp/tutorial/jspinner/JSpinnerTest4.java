import javax.swing.*;
import java.awt.Dimension;
import java.awt.BorderLayout;

public class JSpinnerTest4 extends JFrame{

  public static void main(String[] args){
    JSpinnerTest4 frame = new JSpinnerTest4();

    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setBounds(10, 10, 300, 200);
    frame.setTitle("ƒ^ƒCƒgƒ‹");
    frame.setVisible(true);
  }

  JSpinnerTest4(){
    SpinnerListModel model = new SpinnerListModel();

    JSpinner spinner = new JSpinner(model);
    spinner.setPreferredSize(new Dimension(100, 25));

    JPanel p = new JPanel();
    p.add(spinner);

    getContentPane().add(p, BorderLayout.CENTER);
  }
}