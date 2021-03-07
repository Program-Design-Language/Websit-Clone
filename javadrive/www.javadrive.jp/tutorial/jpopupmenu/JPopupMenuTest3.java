import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.*;

public class JPopupMenuTest3 extends JFrame implements MouseListener{

  JPopupMenu popup;

  public static void main(String[] args){
    JPopupMenuTest3 frame = new JPopupMenuTest3();

    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setBounds(10, 10, 300, 200);
    frame.setTitle("タイトル");
    frame.setVisible(true);
  }

  JPopupMenuTest3(){
    JButton button = new JButton("button");

    JPanel p = new JPanel();
    p.addMouseListener(this);
    p.add(button);

    popup = new JPopupMenu();

    ImageIcon icon = new ImageIcon("./img/mem10.gif");

    JMenuItem updateMenuItem = new JMenuItem("最新の情報に更新(U)", icon);
    updateMenuItem.setFont(new Font("MS UI Gothic", Font.PLAIN, 12));
    updateMenuItem.setBackground(Color.WHITE);
    updateMenuItem.setMnemonic(KeyEvent.VK_U);

    JMenuItem propertyMenuItem = new JMenuItem("画像のプロパティ(P)", icon);
    propertyMenuItem.setFont(new Font("MS UI Gothic", Font.PLAIN, 12));
    propertyMenuItem.setBackground(Color.WHITE);
    propertyMenuItem.setMnemonic(KeyEvent.VK_P);
    propertyMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P, InputEvent.CTRL_DOWN_MASK));

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