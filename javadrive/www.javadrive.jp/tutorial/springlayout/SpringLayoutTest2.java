import javax.swing.*;
import java.awt.Font;
import java.awt.BorderLayout;

public class SpringLayoutTest2 extends JFrame{

  public static void main(String[] args){
    SpringLayoutTest2 frame = new SpringLayoutTest2();

    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setBounds(10, 10, 300, 200);
    frame.setTitle("ƒ^ƒCƒgƒ‹");
    frame.setVisible(true);
  }

  SpringLayoutTest2(){
    SpringLayout layout = new SpringLayout();
    JPanel p = new JPanel();
    p.setLayout(layout);

    JButton button1 = new JButton("Google");
    JButton button2 = new JButton("Yahoo!");
    button2.setFont(new Font("Arial", Font.PLAIN, 30));
    JButton button3 = new JButton("MSN");

    layout.putConstraint(SpringLayout.NORTH, button1, 50,
        SpringLayout.NORTH, p);
    layout.putConstraint(SpringLayout.WEST, button1, 10,
        SpringLayout.WEST, p);

    layout.putConstraint(SpringLayout.NORTH, button2, 50,
        SpringLayout.NORTH, p);
    layout.putConstraint(SpringLayout.WEST, button2, 10,
        SpringLayout.EAST, button1);

    layout.putConstraint(SpringLayout.NORTH, button3, 10,
        SpringLayout.SOUTH, button2);
    layout.putConstraint(SpringLayout.WEST, button3, 0,
        SpringLayout.WEST, button2);

    p.add(button1);
    p.add(button2);
    p.add(button3);

    getContentPane().add(p, BorderLayout.CENTER);
  }
}