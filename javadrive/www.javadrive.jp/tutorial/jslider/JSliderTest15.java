import javax.swing.*;
import java.awt.Dimension;
import java.awt.Color;
import java.awt.BorderLayout;

public class JSliderTest15 extends JFrame{

  public static void main(String[] args){
    JSliderTest15 frame = new JSliderTest15();

    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setBounds(10, 10, 300, 200);
    frame.setTitle("ƒ^ƒCƒgƒ‹");
    frame.setVisible(true);
  }

  JSliderTest15(){
    JSlider slider = new JSlider();
    slider.setMajorTickSpacing(10);
    slider.setPaintTicks(true);
    slider.setLabelTable(slider.createStandardLabels(20));
    slider.setPaintLabels(true);
    slider.setBackground(Color.WHITE);
    slider.setPreferredSize(new Dimension(120, 100));

    JPanel p = new JPanel();
    p.add(slider);

    getContentPane().add(p, BorderLayout.CENTER);
  }
}