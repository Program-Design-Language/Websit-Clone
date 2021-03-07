import javax.swing.*;
import java.awt.BorderLayout;
import javax.swing.event.*;

public class JSliderTest5 extends JFrame implements ChangeListener{

  JSlider slider;
  JLabel label;

  public static void main(String[] args){
    JSliderTest5 frame = new JSliderTest5();

    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setBounds(10, 10, 300, 270);
    frame.setTitle("タイトル");
    frame.setVisible(true);
  }

  JSliderTest5(){

    slider = new JSlider();
    slider.setOrientation(JSlider.VERTICAL);
    slider.addChangeListener(this);

    JPanel p = new JPanel();
    p.add(slider);

    label = new JLabel();
    label.setText("値：" + slider.getValue());

    getContentPane().add(p, BorderLayout.CENTER);
    getContentPane().add(label, BorderLayout.PAGE_END);
  }

  public void stateChanged(ChangeEvent e) {
    label.setText("値：" + slider.getValue());
  }
}