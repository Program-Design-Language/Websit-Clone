import javax.swing.*;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.BorderLayout;

public class BoxLayoutTest9 extends JFrame{

  public static void main(String[] args){
    BoxLayoutTest9 frame = new BoxLayoutTest9();

    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setBounds(10, 10, 300, 200);
    frame.setTitle("ƒ^ƒCƒgƒ‹");
    frame.setVisible(true);
  }

  BoxLayoutTest9(){
    JButton button1 = new JButton("Google");
    JButton button2 = new JButton("Yahoo!");
    button2.setFont(new Font("Arial", Font.PLAIN, 30));
    JButton button3 = new JButton("MSN");

    JPanel p = new JPanel();
    p.setLayout(new BoxLayout(p, BoxLayout.LINE_AXIS));

    p.add(button1);
    p.add(Box.createGlue());
    p.add(button2);
    p.add(Box.createGlue());
    p.add(button3);

    getContentPane().add(p, BorderLayout.CENTER);
  }
}