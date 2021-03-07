import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.event.*;

public class JPopupMenuTest5 extends JFrame implements MouseListener{

  JPopupMenu popup;

  public static void main(String[] args){
    JPopupMenuTest5 frame = new JPopupMenuTest5();

    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setBounds(10, 10, 300, 200);
    frame.setTitle("�^�C�g��");
    frame.setVisible(true);
  }

  JPopupMenuTest5(){
    JButton button = new JButton("button");

    JPanel p = new JPanel();
    p.addMouseListener(this);
    p.add(button);

    popup = new JPopupMenu();

    JMenuItem newMenuitem = new JMenuItem("�V�K�쐬");
    JMenuItem openMenuitem = new JMenuItem("�J��");
    JMenuItem saveMenuitem = new JMenuItem("�ۑ�");
    JMenuItem saveasMenuitem = new JMenuItem("���O��t���ĕۑ�");
    JMenuItem closeMenuitem = new JMenuItem("����");

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