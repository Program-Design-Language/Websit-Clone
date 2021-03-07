import javax.swing.*;
import java.awt.Color;
import java.awt.BorderLayout;

public class JTabbedPaneTest6 extends JFrame{

  public static void main(String[] args){
    JTabbedPaneTest6 frame = new JTabbedPaneTest6();

    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setBounds(10, 10, 300, 200);
    frame.setTitle("ƒ^ƒCƒgƒ‹");
    frame.setVisible(true);
  }

  JTabbedPaneTest6(){
    JTabbedPane tabbedpane = new JTabbedPane();

    JPanel tabPanel1 = new JPanel();
    tabPanel1.add(new JButton("button1"));

    JPanel tabPanel2 = new JPanel();
    tabPanel2.add(new JLabel("Name:"));
    tabPanel2.add(new JTextField("", 10));

    JPanel tabPanel3 = new JPanel();
    tabPanel3.add(new JButton("button2"));

    tabbedpane.addTab("tab1", tabPanel1);
    tabbedpane.addTab("tab2", tabPanel2);
    tabbedpane.addTab("tab3", tabPanel3);

    tabbedpane.setForegroundAt(0, Color.RED);
    tabbedpane.setForegroundAt(1, Color.BLUE);
    tabbedpane.setForegroundAt(2, Color.GREEN);

    getContentPane().add(tabbedpane, BorderLayout.CENTER);
  }
}