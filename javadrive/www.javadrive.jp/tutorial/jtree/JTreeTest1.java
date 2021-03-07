import javax.swing.*;
import java.awt.BorderLayout;

public class JTreeTest1 extends JFrame{

  public static void main(String[] args){
    JTreeTest1 frame = new JTreeTest1();

    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setBounds(10, 10, 300, 200);
    frame.setTitle("ƒ^ƒCƒgƒ‹");
    frame.setVisible(true);
  }

  JTreeTest1(){
    JTree tree = new JTree();

    JPanel p = new JPanel();
    p.add(tree);

    getContentPane().add(p, BorderLayout.CENTER);
  }
}