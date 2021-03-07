import javax.swing.*;
import java.awt.Font;
import java.awt.BorderLayout;

public class SpringLayoutTest1 extends JFrame{

  public static void main(String[] args){
    SpringLayoutTest1 frame = new SpringLayoutTest1();

    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setBounds(10, 10, 300, 200);
    frame.setTitle("ƒ^ƒCƒgƒ‹");
    frame.setVisible(true);
  }

  SpringLayoutTest1(){
    SpringLayout layout = new SpringLayout();
    JPanel p = new JPanel();
    p.setLayout(layout);

    JButton button1 = new JButton("Google");
    JButton button2 = new JButton("Yahoo!");
    button2.setFont(new Font("Arial", Font.PLAIN, 30));
    JButton button3 = new JButton("MSN");

    p.add(button1);
    p.add(button2);
    p.add(button3);

    getContentPane().add(p, BorderLayout.CENTER);
  }
}