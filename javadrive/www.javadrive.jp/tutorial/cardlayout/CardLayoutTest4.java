import javax.swing.*;
import java.awt.Color;
import java.awt.CardLayout;
import java.awt.BorderLayout;

public class CardLayoutTest4 extends JFrame{

  public static void main(String[] args){
    CardLayoutTest4 frame = new CardLayoutTest4();

    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setBounds(10, 10, 300, 200);
    frame.setTitle("ƒ^ƒCƒgƒ‹");
    frame.setVisible(true);
  }

  CardLayoutTest4(){
    JPanel p = new JPanel();
    CardLayout layout = new CardLayout();
    layout.setHgap(10);
    layout.setVgap(25);
    p.setLayout(layout);

    JPanel buttonPanel = new JPanel();
    buttonPanel.setBackground(Color.WHITE);
    buttonPanel.add(new JButton("button"));

    p.add(buttonPanel, "button");

    getContentPane().add(p, BorderLayout.CENTER);
  }
}