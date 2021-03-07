/* Swingサンプル */

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.Container;
import java.awt.BorderLayout;

class SSample18_1 extends JFrame{
  JLabel label;

  public static void main(String args[]){
    SSample18_1 frame = new SSample18_1("タイトル");
    frame.setVisible(true);
  }

  SSample18_1(String title){
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
    menubar.add(menu3);
    menubar.add(menu4);

    JMenuItem menuitem1_1 = new JMenuItem("New");
    JMenuItem menuitem1_2 = new JMenuItem("Open");
    JMenuItem menuitem1_3 = new JMenuItem("Save");
    JMenuItem menuitem1_4 = new JMenuItem("Close");

    menu1.add(menuitem1_1);
    menu1.addSeparator();
    menu1.add(menuitem1_2);
    menu1.add(menuitem1_3);
    menu1.addSeparator();
    menu1.add(menuitem1_4);

    setJMenuBar(menubar);

    JPanel p = new JPanel();

    label = new JLabel();
    p.add(label);

    Container contentPane = getContentPane();
    contentPane.add(p, BorderLayout.CENTER);
  }
}
