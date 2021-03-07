/* Swingサンプル */

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.Container;
import java.awt.BorderLayout;
import java.awt.FlowLayout;

class SSample22_2 extends JFrame{
  public static void main(String args[]){
    SSample22_2 frame = new SSample22_2("タイトル");
    frame.setVisible(true);
  }

  SSample22_2(String title){
    setTitle(title);
    setBounds(100, 100, 300, 250);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    JMenuBar menubar = new JMenuBar();
    menubar.setLayout(new FlowLayout());

    JMenu menu1 = new JMenu("File");
    JMenu menu2 = new JMenu("Edit");
    JMenu menu3 = new JMenu("Tool");
    JMenu menu4 = new JMenu("Help");

    menubar.add(menu1);
    menubar.add(menu2);
    menubar.add(menu3);
    menubar.add(menu4);

    setJMenuBar(menubar);

    Container contentPane = getContentPane();
  }
}
