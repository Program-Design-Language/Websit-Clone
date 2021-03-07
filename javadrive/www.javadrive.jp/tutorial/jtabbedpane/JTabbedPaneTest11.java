import javax.swing.*;
import java.awt.BorderLayout;

public class JTabbedPaneTest11 extends JFrame{

  public static void main(String[] args){
    JTabbedPaneTest11 frame = new JTabbedPaneTest11();

    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setBounds(10, 10, 300, 200);
    frame.setTitle("ƒ^ƒCƒgƒ‹");
    frame.setVisible(true);
  }

  JTabbedPaneTest11(){
    JTabbedPane tabbedpane = new JTabbedPane();

    JPanel tabPanel1 = new JPanel();
    tabPanel1.add(new JButton("button1"));

    JPanel tabPanel2 = new JPanel();
    tabPanel2.add(new JLabel("Name:"));
    tabPanel2.add(new JTextField("", 10));

    JPanel tabPanel3 = new JPanel();
    tabPanel3.add(new JButton("button2"));

    ImageIcon icon = new ImageIcon("./img/mem10.gif");
    ImageIcon disabledicon = new ImageIcon("./img/mem10s.gif");

    tabbedpane.addTab("tab1", icon, tabPanel1);
    tabbedpane.addTab("tab2", icon, tabPanel2);
    tabbedpane.addTab("tab3", icon, tabPanel3);

    tabbedpane.setEnabledAt(1, false);
    tabbedpane.setEnabledAt(2, false);
    tabbedpane.setDisabledIconAt(2, disabledicon);

    getContentPane().add(tabbedpane, BorderLayout.CENTER);
  }
}