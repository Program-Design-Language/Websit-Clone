import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.event.*;

public class JPopupMenuTest5 extends JFrame implements MouseListener{

  JPopupMenu popup;

  public static void main(String[] args){
    JPopupMenuTest5 frame = new JPopupMenuTest5();

    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setBounds(10, 10, 300, 200);
    frame.setTitle("タイトル");
    frame.setVisible(true);
  }

  JPopupMenuTest5(){
    JButton button = new JButton("button");

    JPanel p = new JPanel();
    p.addMouseListener(this);
    p.add(button);

    popup = new JPopupMenu();

    JMenuItem newMenuitem = new JMenuItem("新規作成");
    JMenuItem openMenuitem = new JMenuItem("開く");
    JMenuItem saveMenuitem = new JMenuItem("保存");
    JMenuItem saveasMenuitem = new JMenuItem("名前を付けて保存");
    JMenuItem closeMenuitem = new JMenuItem("閉じる");

    popup.add(newMenuitem);
    popup.add(openMenuitem);
    popup.addSeparator();
    popup.add(saveMenuitem);
    popup.add(saveasMenuitem);
    popup.addSeparator();
    popup.add(closeMenuitem);

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