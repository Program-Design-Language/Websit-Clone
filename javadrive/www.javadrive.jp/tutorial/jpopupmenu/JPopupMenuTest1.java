import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.*;

public class JPopupMenuTest1 extends JFrame implements MouseListener{

  JPopupMenu popup;

  public static void main(String[] args){
    JPopupMenuTest1 frame = new JPopupMenuTest1();

    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setBounds(10, 10, 300, 200);
    frame.setTitle("タイトル");
    frame.setVisible(true);
  }

  JPopupMenuTest1(){
    JButton button = new JButton("button");

    JPanel p = new JPanel();
    p.add(button);

    p.addMouseListener(this);

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