import javax.swing.*;
import java.awt.BorderLayout;

public class JSliderTest10 extends JFrame{

  public static void main(String[] args){
    JSliderTest10 frame = new JSliderTest10();

    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setBounds(10, 10, 300, 200);
    frame.setTitle("ƒ^ƒCƒgƒ‹");
    frame.setVisible(true);
  }

  JSliderTest10(){

    JSlider slider1 = new JSlider();
    slider1.setMajorTickSpacing(10);
    slider1.setPaintTicks(true);
    slider1.setPaintLabels(true);

    JSlider slider2 = new JSlider();
    slider2.setLabelTable(slider2.createStandardLabels(20));
    slider2.setPaintLabels(true);

    JSlider slider3 = new JSlider();
    slider3.setMajorTickSpacing(10);
    slider3.setPaintTicks(true);
    slider3.setLabelTable(slider3.createStandardLabels(20));
    slider3.setPaintLabels(true);

    JPanel p = new JPanel();
    p.add(slider1);
    p.add(slider2);
    p.add(slider3);

    getContentPane().add(p, BorderLayout.CENTER);
  }

}