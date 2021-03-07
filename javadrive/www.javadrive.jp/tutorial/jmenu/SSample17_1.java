/* Swingサンプル */

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;
import java.awt.Container;
import java.awt.BorderLayout;
import java.awt.event.KeyEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.InputEvent;

class SSample17_1 extends JFrame implements ActionListener{
  JLabel label;

  public static void main(String args[]){
    SSample17_1 frame = new SSample17_1("タイトル");
    frame.setVisible(true);
  }

  SSample17_1(String title){
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
    menuitem1_1.setMnemonic(KeyEvent.VK_N);
    menuitem1_1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, InputEvent.CTRL_DOWN_MASK));
    menuitem1_1.setActionCommand("New");
    menuitem1_1.addActionListener(this);

    JMenuItem menuitem1_2 = new JMenuItem("Open");
    menuitem1_2.setMnemonic(KeyEvent.VK_O);
    menuitem1_2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, InputEvent.CTRL_DOWN_MASK));
    menuitem1_2.setActionCommand("Open");
    menuitem1_2.addActionListener(this);

    JMenuItem menuitem1_3 = new JMenuItem("Save");
    menuitem1_3.setMnemonic(KeyEvent.VK_S);
    JMenuItem menuitem1_4 = new JMenuItem("Close(X)");
    menuitem1_4.setMnemonic(KeyEvent.VK_X);

    menu1.add(menuitem1_1);
    menu1.add(menuitem1_2);
    menu1.add(menuitem1_3);
    menu1.add(menuitem1_4);

    setJMenuBar(menubar);

    JPanel p = new JPanel();

    label = new JLabel();
    p.add(label);

    Container contentPane = getContentPane();
    contentPane.add(p, BorderLayout.CENTER);
  }

  public void actionPerformed(ActionEvent e){
    label.setText(e.getActionCommand());
  }
}
