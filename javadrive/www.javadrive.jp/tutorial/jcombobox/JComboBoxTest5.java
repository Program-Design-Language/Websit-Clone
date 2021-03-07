import javax.swing.*;
import java.awt.Dimension;
import java.awt.BorderLayout;

public class JComboBoxTest5 extends JFrame{

  public static void main(String[] args){
    JComboBoxTest5 frame = new JComboBoxTest5();

    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setBounds(10, 10, 300, 200);
    frame.setTitle("ƒ^ƒCƒgƒ‹");
    frame.setVisible(true);
  }

  JComboBoxTest5(){
    String[] startTime = {"08:00","09:00","10:00","11:00",
                          "12:00","13:00","14:00","15:00",
                          "16:00","17:00","18:00","19:00"};

    String[] endTime = {"08:00","09:00","10:00","11:00",
                          "12:00","13:00","14:00","15:00",
                          "16:00","17:00","18:00","19:00"};

    JComboBox combo1 = new JComboBox(startTime);
    combo1.setPreferredSize(new Dimension(80, 30));

    JComboBox combo2 = new JComboBox(endTime);
    combo2.setPreferredSize(new Dimension(80, 30));
    combo2.setMaximumRowCount(5);

    JPanel p = new JPanel();
    p.add(new JLabel("start:"));
    p.add(combo1);
    p.add(new JLabel("  end:"));
    p.add(combo2);

    getContentPane().add(p, BorderLayout.CENTER);
  }
}