/* Swingサンプル */

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.Container;
import java.awt.BorderLayout;
import java.awt.event.KeyEvent;

class SSample10_1 extends JFrame{
  public static void main(String args[]){
    SSample10_1 frame = new SSample10_1("タイトル");
    frame.setVisible(true);
  }

  SSample10_1(String title){
    setTitle(title);
    setBounds(100, 100, 300, 250);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    JMenuBar menubar = new JMenuBar();
    JMenu menu1 = new JMenu("File");
    JMenu menu2 = new JMenu("Edit");
    JMenu menu3 = new JMenu("Tool");
    JMenu menu4 = new JMenu("Help");

    menu1.setMnemonic(KeyEvent.VK_F);
    menu2.setMnemonic(KeyEvent.VK_E);
    menu3.setMnemonic(KeyEvent.VK_O);
    menu4.setMnemonic(KeyEvent.VK_H);

    menubar.add(menu1);
    menubar.add(menu2);
    menubar.add(menu3);
    menubar.add(menu4);

    JMenuItem menuitem1_1 = new JMenuItem("New");
    JMenuItem menuitem1_2 = new JMenuItem("Open");
    JMenuItem menuitem1_3 = new JMenuItem("Close");

    menu1.add(menuitem1_1);
    menu1.add(menuitem1_2);
    menu1.add(menuitem1_3);

    JMenuItem menuitem2_1 = new JMenuItem("Cut");
    JMenuItem menuitem2_2 = new JMenuItem("Copy");
    JMenuItem menuitem2_3 = new JMenuItem("Paste");

    menu2.add(menuitem2_1);
    menu2.add(menuitem2_3);
    menu2.insert(menuitem2_2, 1);

    setJMenuBar(menubar);

    JPanel p = new JPanel();

    JButton button = new JButton("button");
    p.add(button);

    Container contentPane = getContentPane();
    contentPane.add(p, BorderLayout.CENTER);
  }
}
