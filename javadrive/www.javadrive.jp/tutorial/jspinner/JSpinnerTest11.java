import javax.swing.*;
import java.awt.Dimension;
import java.awt.BorderLayout;

public class JSpinnerTest11 extends JFrame{

  public static void main(String[] args){
    JSpinnerTest11 frame = new JSpinnerTest11();

    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setBounds(10, 10, 300, 200);
    frame.setTitle("ƒ^ƒCƒgƒ‹");
    frame.setVisible(true);
  }

  JSpinnerTest11(){

    SpinnerNumberModel model = new SpinnerNumberModel(100, 0, null, 10);

    JSpinner spinner = new JSpinner(model);
    spinner.setPreferredSize(new Dimension(100, 25));

    JPanel p = new JPanel();
    p.add(spinner);

    getContentPane().add(p, BorderLayout.CENTER);
  }
}