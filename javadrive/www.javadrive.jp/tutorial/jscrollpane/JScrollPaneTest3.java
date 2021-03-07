import javax.swing.*;
import java.awt.BorderLayout;

public class JScrollPaneTest3 extends JFrame{

  public static void main(String[] args){
    JScrollPaneTest3 frame = new JScrollPaneTest3();

    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setBounds(10, 10, 300, 200);
    frame.setTitle("タイトル");
    frame.setVisible(true);
  }

  JScrollPaneTest3(){
    JTextArea textarea = new JTextArea("JTextAreaを配置");

    JScrollPane scrollpane = new JScrollPane(textarea);
    scrollpane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
    scrollpane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);

    getContentPane().add(scrollpane, BorderLayout.CENTER);
  }
}