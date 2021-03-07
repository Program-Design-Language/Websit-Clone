import javax.swing.*;
import java.awt.Dimension;
import java.awt.BorderLayout;

public class JSpinnerTest2 extends JFrame{

  public static void main(String[] args){
    JSpinnerTest2 frame = new JSpinnerTest2();

    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setBounds(10, 10, 300, 200);
    frame.setTitle("ƒ^ƒCƒgƒ‹");
    frame.setVisible(true);
  }

  JSpinnerTest2(){
    JSpinner spinner = new JSpinner();
    spinner.setPreferredSize(new Dimension(80, 30));

    JPanel p = new JPanel();
    p.add(spinner);

    getContentPane().add(p, BorderLayout.CENTER);
  }
}