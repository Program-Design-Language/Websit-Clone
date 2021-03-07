import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.event.*;

public class JPopupMenuTest4 extends JFrame implements MouseListener{

  JPopupMenu popup;

  public static void main(String[] args){
    JPopupMenuTest4 frame = new JPopupMenuTest4();

    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setBounds(10, 10, 300, 200);
    frame.setTitle("タイトル");
    frame.setVisible(true);
  }

  JPopupMenuTest4(){
    JButton button = new JButton("button");

    JPanel p = new JPanel();
    p.addMouseListener(this);
    p.add(button);

    popup = new JPopupMenu();

    JMenuItem backMenuItem = new JMenuItem("戻る");
    JMenuItem forwardMenuItem = new JMenuItem("進む");

    JMenu updateMenu = new JMenu("自動更新");

    JMenuItem defaultMenuItem = new JMenuItem("標準の設定");
    JRadioButtonMenuItem fiveRadioitem = new JRadioButtonMenuItem("5秒");
    JRadioButtonMenuItem tenRadioitem = new JRadioButtonMenuItem("10秒");

    ButtonGroup group = new ButtonGroup();
    group.add(fiveRadioitem);
    group.add(tenRadioitem);

    updateMenu.add(defaultMenuItem);
    updateMenu.add(fiveRadioitem);
    updateMenu.add(tenRadioitem);

    popup.add(backMenuItem);
    popup.add(forwardMenuItem);
    popup.add(updateMenu);

    getContentPane().add(p, BorderLayout.CENTER);
  }

  public void mouseReleased(MouseEvent e){
    showPopup(e);
  }

  public void mousePressed(MouseEvent e){
    showPopup(e);
  }

  public void mouseClicked(MouseEvent e){}
  public void mouseEntered(MouseEvent e){}
  public void mouseExited(MouseEvent e){}

  private void showPopup(MouseEvent e){
    if (e.isPopupTrigger()) {
      popup.show(e.getComponent(), e.getX(), e.getY());
    }
  }
}