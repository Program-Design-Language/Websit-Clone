import javax.swing.*;
import java.awt.BorderLayout;

public class JDesktopPaneTest11 extends JFrame{

  public static void main(String[] args){
    JDesktopPaneTest11 frame = new JDesktopPaneTest11();

    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setBounds(10, 10, 400, 300);
    frame.setTitle("ƒ^ƒCƒgƒ‹");
    frame.setVisible(true);
  }

  JDesktopPaneTest11(){
    JDesktopPane desktop = new JDesktopPane();

    JInternalFrame iframe = new JInternalFrame("IFrame");
    iframe.setSize(250, 120);
    iframe.setLocation(10, 10);
    iframe.setVisible(true);

    JLabel label = new JLabel("Name");
    JTextField text = new JTextField("", 10);

    JPanel p = new JPanel();
    p.add(label);
    p.add(text);

    iframe.getContentPane().add(p, BorderLayout.CENTER);

    desktop.add(iframe);

    getContentPane().add(desktop, BorderLayout.CENTER);
  }
}
