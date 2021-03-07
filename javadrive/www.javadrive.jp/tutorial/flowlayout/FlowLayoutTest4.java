import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.BorderLayout;

public class FlowLayoutTest4 extends JFrame{

  public static void main(String[] args){
    FlowLayoutTest4 frame = new FlowLayoutTest4();

    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setBounds(10, 10, 300, 200);
    frame.setTitle("ƒ^ƒCƒgƒ‹");
    frame.setVisible(true);
  }

  FlowLayoutTest4(){
    JButton button1 = new JButton("Button1");
    JButton button2 = new JButton("Button2");
    JButton button3 = new JButton("Button3");
    JButton button4 = new JButton("Button4");

    JPanel p = new JPanel();
    p.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 30));
    p.add(button1);
    p.add(button2);
    p.add(button3);
    p.add(button4);

    getContentPane().add(p, BorderLayout.CENTER);
  }
}