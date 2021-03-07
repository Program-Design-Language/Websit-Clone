import javax.swing.*;
import java.awt.BorderLayout;

public class JTabbedPaneTest4 extends JFrame{


  public static void main(String[] args){
    JTabbedPaneTest4 frame = new JTabbedPaneTest4();

    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setBounds(10, 10, 300, 200);
    frame.setTitle("ƒ^ƒCƒgƒ‹");
    frame.setVisible(true);
  }

  JTabbedPaneTest4(){
    JTabbedPane tabbedpane = new JTabbedPane();

    JPanel tabPanel1 = new JPanel();
    tabPanel1.add(new JButton("button1"));

    JPanel tabPanel2 = new JPanel();
    tabPanel2.add(new JLabel("Name:"));
    tabPanel2.add(new JTextField("", 10));

    JPanel tabPanel3 = new JPanel();
    tabPanel3.add(new JButton("button2"));

    ImageIcon icon1 = new ImageIcon("./img/mem10.gif");
    ImageIcon icon2 = new ImageIcon("./img/reo1s.gif");

    tabbedpane.addTab("tab1", icon1, tabPanel1);
    tabbedpane.addTab("tab2", tabPanel2);
    tabbedpane.addTab("tab3", tabPanel3);

    tabbedpane.setIconAt(1, icon2);

    getContentPane().add(tabbedpane, BorderLayout.CENTER);
  }
}