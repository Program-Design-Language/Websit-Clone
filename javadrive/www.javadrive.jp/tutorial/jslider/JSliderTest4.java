import javax.swing.*;
import java.awt.BorderLayout;
import javax.swing.event.*;

public class JSliderTest4 extends JFrame implements ChangeListener{

  JSlider slider;
  JLabel label;

  public static void main(String[] args){
    JSliderTest4 frame = new JSliderTest4();

    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setBounds(10, 10, 300, 200);
    frame.setTitle("�^�C�g��");
    frame.setVisible(true);
  }

  JSliderTest4(){

    slider = new JSlider(10, 1000);
    slider.setValue(100);
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