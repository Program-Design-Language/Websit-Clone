/* Swingサンプル */

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.BoxLayout;
import javax.swing.Box;
import java.awt.Container;
import java.awt.BorderLayout;
import java.awt.Dimension;

class SSample22_1 extends JFrame{
  public static void main(String args[]){
    SSample22_1 frame = new SSample22_1("タイトル");
    frame.setVisible(true);
  }

  SSample22_1(String title){
    setTitle(title);
    setBounds(100, 100, 300, 250);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    JMenuBar menubar = new JMenuBar();
    JMenu menu1 = new JMenu("File");
    JMenu menu2 = new JMenu("Edit");
    JMenu menu3 = new JMenu("Tool");
    JMenu menu4 = new JMenu("Help");

    menubar.add(menu1);
    menubar.add(menu2);
    menubar.add(Box.createRigidArea(new Dimension(20, 1)));
    menubar.add(menu3);
    menubar.add(Box.createHorizontalGlue());
    menubar.add(menu4);

    setJMenuBar(menubar);

    Container contentPane = getContentPane();
  }
}
