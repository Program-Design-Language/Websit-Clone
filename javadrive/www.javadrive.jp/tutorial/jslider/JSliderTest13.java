import javax.swing.*;
import java.awt.Color;
import java.awt.BorderLayout;

public class JSliderTest13 extends JFrame{

  public static void main(String[] args){
    JSliderTest13 frame = new JSliderTest13();

    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setBounds(10, 10, 300, 200);
    frame.setTitle("ƒ^ƒCƒgƒ‹");
    frame.setVisible(true);
  }

  JSliderTest13(){

    JSlider slider = new JSlider();
    slider.setMajorTickSpacing(10);
    slider.setPaintTicks(true);
    slider.setLabelTable(slider.createStandardLabels(20));
    slider.setPaintLabels(true);
    slider.setForeground(Color.WHITE);
    slider.setBackground(Color.GRAY);

    JPanel p = new JPanel();
    p.add(slider);

    getContentPane().add(p, BorderLayout.CENTER);
  }
}