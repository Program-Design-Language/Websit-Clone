import javax.swing.*;
import java.awt.BorderLayout;
import javax.swing.event.*;

public class JSliderTest7 extends JFrame implements ChangeListener{

  JSlider slider;
  JLabel label;

  public static void main(String[] args){
    JSliderTest7 frame = new JSliderTest7();

    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setBounds(10, 10, 300, 200);
    frame.setTitle("�^�C�g��");
    frame.setVisible(true);
  }

  JSliderTest7(){

    slider = new JSlider();
    slider.setMajorTickSpacing(10);
    slider.setMinorTickSpacing(2);
    slider.setPaintTicks(true);
    slider.addChangeListener(this);

    JPanel p = new JPanel();
    p.add(slider);

    label = new JLabel();
    label.setText("�l�F" + slider.getValue());

    getContentPane().add(p, BorderLayout.CENTER);
    getContentPane().add(label, BorderLayout.PAGE_END);
  }

  public void stateChanged(ChangeEvent e) {
    label.setText("�l�F" + slider.getValue());
  }
}