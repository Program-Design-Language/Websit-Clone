import javax.swing.*;
import java.awt.Dimension;
import java.awt.BorderLayout;

public class JComboBoxTest9 extends JFrame{

  JComboBox startCombo;
  JComboBox endCombo;

  public static void main(String[] args){
    JComboBoxTest9 frame = new JComboBoxTest9();

    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setBounds(10, 10, 300, 200);
    frame.setTitle("ƒ^ƒCƒgƒ‹");
    frame.setVisible(true);
  }

  JComboBoxTest9(){
    String[] startTime = {"08:00","09:00","10:00","11:00",
                          "12:00","13:00","14:00","15:00",
                          "16:00","17:00","18:00","19:00"};

    String[] endTime = {"08:00","09:00","10:00","11:00",
                          "12:00","13:00","14:00","15:00",
                          "16:00","17:00","18:00","19:00"};

    DefaultComboBoxModel startModel = new DefaultComboBoxModel(startTime);
    JComboBox startCombo = new JComboBox(startModel);

    startCombo.setPreferredSize(new Dimension(80, 30));

    DefaultComboBoxModel endModel = new DefaultComboBoxModel(endTime);
    JComboBox endCombo = new JComboBox();
    endCombo.setModel(endModel);
    endCombo.setPreferredSize(new Dimension(80, 30));

    JPanel p = new JPanel();
    p.add(new JLabel("start:"));
    p.add(startCombo);
    p.add(new JLabel("  end:"));
    p.add(endCombo);

    getContentPane().add(p, BorderLayout.CENTER);
  }
}