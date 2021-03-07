import javax.swing.*;
import java.awt.BorderLayout;

public class JProgressBarTest1 extends JFrame{

  public static void main(String[] args){
    JProgressBarTest1 frame = new JProgressBarTest1();

    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setBounds(10, 10, 300, 200);
    frame.setTitle("ƒ^ƒCƒgƒ‹");
    frame.setVisible(true);
  }

  JProgressBarTest1(){
    JProgressBar bar = new JProgressBar();

    JPanel barPanel = new JPanel();
    barPanel.add(bar);

    getContentPane().add(barPanel, BorderLayout.CENTER);
  }
}