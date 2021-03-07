/* Swingサンプル */

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.ImageIcon;
import java.awt.Container;
import java.awt.BorderLayout;

class SSample14_1 extends JFrame{
  public static void main(String args[]){
    SSample14_1 frame = new SSample14_1("タイトル");
    frame.setVisible(true);
  }

  SSample14_1(String title){
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

    ImageIcon icon1 = new ImageIcon("./calculator.png");
    ImageIcon icon2 = new ImageIcon("./camera.png");
    ImageIcon icon3 = new ImageIcon("./clock.png");
    ImageIcon icon4 = new ImageIcon("./computer.png");

    JMenuItem menuitem1_1 = new JMenuItem("New", icon1);
    menuitem1_1.setHorizontalTextPosition(JMenuItem.LEFT);
    menuitem1_1.setVerticalTextPosition(JMenuItem.TOP);

    JMenuItem menuitem1_2 = new JMenuItem("Open", icon2);
    menuitem1_2.setHorizontalTextPosition(JMenuItem.LEFT);
    menuitem1_2.setVerticalTextPosition(JMenuItem.CENTER);

    JMenuItem menuitem1_3 = new JMenuItem("Save", icon3);
    menuitem1_3.setHorizontalTextPosition(JMenuItem.LEFT);
    menuitem1_3.setVerticalTextPosition(JMenuItem.BOTTOM);

    JMenuItem menuitem1_4 = new JMenuItem("Close", icon4);
    menuitem1_4.setHorizontalTextPosition(JMenuItem.CENTER);

    menu1.add(menuitem1_1);
    menu1.add(menuitem1_2);
    menu1.add(menuitem1_3);
    menu1.add(menuitem1_4);

    setJMenuBar(menubar);

    JPanel p = new JPanel();

    JButton button = new JButton("button");
    p.add(button);

    Container contentPane = getContentPane();
    contentPane.add(p, BorderLayout.CENTER);
  }
}
