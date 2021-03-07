import javax.swing.*;
import java.awt.BorderLayout;

public class JSliderTest1 extends JFrame{

  public static void main(String[] args){
    JSliderTest1 frame = new JSliderTest1();

    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setBounds(10, 10, 300, 200);
    frame.setTitle("ƒ^ƒCƒgƒ‹");
    frame.setVisible(true);
  }

  JSliderTest1(){

    JSlider slider = new JSlider();

    JPanel p = new JPanel();
    p.add(slider);

    getContentPane().add(p, BorderLayout.CENTER);
  }
}