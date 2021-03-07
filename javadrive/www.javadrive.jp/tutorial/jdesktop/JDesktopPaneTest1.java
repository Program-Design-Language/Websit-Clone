import javax.swing.*;
import java.awt.BorderLayout;

public class JDesktopPaneTest1 extends JFrame{

  public static void main(String[] args){
    JDesktopPaneTest1 frame = new JDesktopPaneTest1();

    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setBounds(10, 10, 300, 200);
    frame.setTitle("ƒ^ƒCƒgƒ‹");
    frame.setVisible(true);
  }

  JDesktopPaneTest1(){
    JDesktopPane desktop = new JDesktopPane();

    getContentPane().add(desktop, BorderLayout.CENTER);
  }
}
