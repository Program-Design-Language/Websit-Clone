import javax.swing.*;
import java.awt.Dimension;
import java.awt.BorderLayout;

public class JTreeTest2 extends JFrame{

  public static void main(String[] args){
    JTreeTest2 frame = new JTreeTest2();

    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setBounds(10, 10, 300, 200);
    frame.setTitle("ƒ^ƒCƒgƒ‹");
    frame.setVisible(true);
  }

  JTreeTest2(){
    JTree tree = new JTree();
    tree.setPreferredSize(new Dimension(100, 100));

    JPanel p = new JPanel();
    p.add(tree);

    getContentPane().add(p, BorderLayout.CENTER);
  }
}