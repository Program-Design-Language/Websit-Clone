import javax.swing.*;
import java.awt.BorderLayout;

public class JScrollPaneTest2 extends JFrame{

  public static void main(String[] args){
    JScrollPaneTest2 frame = new JScrollPaneTest2();

    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setBounds(10, 10, 300, 200);
    frame.setTitle("�^�C�g��");
    frame.setVisible(true);
  }

  JScrollPaneTest2(){
    JTextArea textarea = new JTextArea("JTextArea��z�u");

    JScrollPane scrollpane = new JScrollPane();
    scrollpane.setViewportView(textarea);

    getContentPane().add(scrollpane, BorderLayout.CENTER);
  }
}