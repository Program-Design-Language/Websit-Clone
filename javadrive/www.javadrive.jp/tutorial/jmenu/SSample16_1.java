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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

class SSample16_1 extends JFrame implements ActionListener{
  public static void main(String args[]){
    SSample16_1 frame = new SSample16_1("タイトル");
    frame.setVisible(true);
  }

  SSample16_1(String title){
    setTitle(title);
    setBounds(100, 100, 300, 250);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    JMenuBar menubar = new JMenuBar();
    JMenu menu1 = new JMenu("File");
    menu1.setMnemonic(KeyEvent.VK_F);
    JMenu menu2 = new JMenu("Edit");
    JMenu menu3 = new JMenu("Tool");
    JMenu menu4 = new JMenu("Help");

    menubar.add(menu1);
    menubar.add(menu2);
    menubar.add(menu3);
    menubar.add(menu4);

    JMenuItem menuitem1_1 = new JMenuItem("New");
    menuitem1_1.setMnemonic(KeyEvent.VK_N);
    JMenuItem menuitem1_2 = new JMenuItem("Open");
    menuitem1_2.setMnemonic(KeyEvent.VK_O);
    JMenuItem menuitem1_3 = new JMenuItem("Save");
    menuitem1_3.setMnemonic(KeyEvent.VK_S);
    JMenuItem menuitem1_4 = new JMenuItem("Close(X)");
    menuitem1_4.setMnemonic(KeyEvent.VK_X);
    menuitem1_4.addActionListener(this);

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

  public void actionPerformed(ActionEvent e){
    System.exit(0);
  }
}
