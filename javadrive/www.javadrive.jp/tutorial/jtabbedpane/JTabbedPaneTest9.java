import javax.swing.*;
import java.awt.BorderLayout;

public class JTabbedPaneTest9 extends JFrame{

  public static void main(String[] args){
    JTabbedPaneTest9 frame = new JTabbedPaneTest9();

    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setBounds(10, 10, 300, 200);
    frame.setTitle("ƒ^ƒCƒgƒ‹");
    frame.setVisible(true);
  }

  JTabbedPaneTest9(){
    JTabbedPane tabbedpane = new JTabbedPane();

    for (int i = 0 ; i < 10 ; i++){
      tabbedpane.addTab("tab" + i, new JButton("button"));
    }

    tabbedpane.setTabLayoutPolicy(JTabbedPane.SCROLL_TAB_LAYOUT);

    getContentPane().add(tabbedpane, BorderLayout.CENTER);
  }
}