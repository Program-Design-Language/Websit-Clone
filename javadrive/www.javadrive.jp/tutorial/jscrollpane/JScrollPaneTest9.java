import javax.swing.*;
import java.awt.Dimension;
import java.awt.BorderLayout;
import java.awt.Point;
import javax.swing.event.*;

public class JScrollPaneTest9 extends JFrame implements ChangeListener{

  JViewport view;
  JLabel positionLabel;

  public static void main(String[] args){
    JScrollPaneTest9 frame = new JScrollPaneTest9();

    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setBounds(10, 10, 300, 200);
    frame.setTitle("�^�C�g��");
    frame.setVisible(true);
  }

  JScrollPaneTest9(){
    JScrollPane scrollpane = new JScrollPane();
    scrollpane.setPreferredSize(new Dimension(200, 120));

    view = scrollpane.getViewport();

    ImageIcon icon = new ImageIcon("./img/hana.jpg");
    JLabel label = new JLabel(icon);
    view.setView(label);

    view.addChangeListener(this);

    positionLabel = new JLabel("�ʒu��\��");

    JPanel panel = new JPanel();
    panel.add(scrollpane);

    getContentPane().add(panel, BorderLayout.CENTER);
    getContentPane().add(positionLabel, BorderLayout.PAGE_END);
  }

  public void stateChanged(ChangeEvent e){
    Point point = view.getViewPosition();
    positionLabel.setText("x�F" + point.x + ", y:" + point.y);
  }
}
