import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.event.*;

public class JPopupMenuTest4 extends JFrame implements MouseListener{

  JPopupMenu popup;

  public static void main(String[] args){
    JPopupMenuTest4 frame = new JPopupMenuTest4();

    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setBounds(10, 10, 300, 200);
    frame.setTitle("�^�C�g��");
    frame.setVisible(true);
  }

  JPopupMenuTest4(){
    JButton button = new JButton("button");

    JPanel p = new JPanel();
    p.addMouseListener(this);
    p.add(button);

    popup = new JPopupMenu();

    JMenuItem backMenuItem = new JMenuItem("�߂�");
    JMenuItem forwardMenuItem = new JMenuItem("�i��");

    JMenu updateMenu = new JMenu("�����X�V");

    JMenuItem defaultMenuItem = new JMenuItem("�W���̐ݒ�");
    JRadioButtonMenuItem fiveRadioitem = new JRadioButtonMenuItem("5�b");
    JRadioButtonMenuItem tenRadioitem = new JRadioButtonMenuItem("10�b");

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