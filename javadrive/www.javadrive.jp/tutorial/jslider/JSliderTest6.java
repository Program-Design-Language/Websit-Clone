import javax.swing.*;
import java.awt.BorderLayout;
import javax.swing.event.*;

public class JSliderTest6 extends JFrame implements ChangeListener{

  JSlider slider;
  JLabel label;

  public static void main(String[] args){
    JSliderTest6 frame = new JSliderTest6();

    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setBounds(10, 10, 300, 200);
    frame.setTitle("�^�C�g��");
    frame.setVisible(true);
  }

  JSliderTest6(){

    slider = new JSlider();
    slider.setInverted(true);
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