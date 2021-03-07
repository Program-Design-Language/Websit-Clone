import javax.swing.*;
import java.awt.Font;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.BorderLayout;

public class FlowLayoutTest5 extends JFrame{

  public static void main(String[] args){
    FlowLayoutTest5 frame = new FlowLayoutTest5();

    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setBounds(10, 10, 300, 200);
    frame.setTitle("ƒ^ƒCƒgƒ‹");
    frame.setVisible(true);
  }

  FlowLayoutTest5(){
    JLabel label1 = new JLabel("ABC");
    label1.setFont(new Font(Font.DIALOG, Font.PLAIN, 32));
    label1.setOpaque(true);
    label1.setBackground(Color.WHITE);

    JLabel label2 = new JLabel("ABC");
    label2.setFont(new Font(Font.DIALOG, Font.PLAIN, 12));
    label2.setOpaque(true);
    label2.setBackground(Color.WHITE);

    JLabel label3 = new JLabel("ABC");
    label3.setFont(new Font(Font.DIALOG, Font.PLAIN, 16));
    label3.setOpaque(true);
    label3.setBackground(Color.WHITE);

    JPanel p = new JPanel();

    FlowLayout layout = new FlowLayout();
    layout.setAlignOnBaseline(true);
    p.setLayout(layout);

    p.add(label1);
    p.add(label2);
    p.add(label3);

    getContentPane().add(p, BorderLayout.CENTER);
  }
}