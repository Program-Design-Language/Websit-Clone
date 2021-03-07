import javax.swing.*;
import java.awt.Font;
import java.awt.BorderLayout;

public class JSliderTest14 extends JFrame{

  public static void main(String[] args){
    JSliderTest14 frame = new JSliderTest14();

    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setBounds(10, 10, 300, 200);
    frame.setTitle("ƒ^ƒCƒgƒ‹");
    frame.setVisible(true);
  }

  JSliderTest14(){
    JSlider slider = new JSlider();
    slider.setMajorTickSpacing(10);
    slider.setPaintTicks(true);
    slider.setLabelTable(slider.createStandardLabels(20));
    slider.setPaintLabels(true);
    slider.setFont(new Font(Font.MONOSPACED, Font.PLAIN, 18));

    JPanel p = new JPanel();
    p.add(slider);

    getContentPane().add(p, BorderLayout.CENTER);
  }
}