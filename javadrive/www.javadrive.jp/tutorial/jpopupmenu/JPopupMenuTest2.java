import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.*;

public class JPopupMenuTest2 extends JFrame implements MouseListener{

  JPopupMenu popup;

  public static void main(String[] args){
    JPopupMenuTest2 frame = new JPopupMenuTest2();

    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setBounds(10, 10, 300, 200);
    frame.setTitle("タイトル");
    frame.setVisible(true);
  }

  JPopupMenuTest2(){
    JButton button = new JButton("button");
    button.addMouseListener(this);

    JPanel p = new JPanel();
    p.add(button);

    popup = new JPopupMenu();

    JMenuItem updateMenuItem = new JMenuItem("最新の情報に更新");
    JMenuItem propertyMenuItem = new JMenuItem("画像のプロパティ");
    popup.add(updateMenuItem);
    popup.add(propertyMenuItem);

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