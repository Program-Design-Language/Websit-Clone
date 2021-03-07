import javax.swing.*;
import java.awt.Dimension;
import java.awt.BorderLayout;

public class JTreeTest9 extends JFrame{

  public static void main(String[] args){
    JTreeTest9 frame = new JTreeTest9();

    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setBounds(10, 10, 300, 200);
    frame.setTitle("ƒ^ƒCƒgƒ‹");
    frame.setVisible(true);
  }

  JTreeTest9(){
    String[] treedata = {"Swing", "Java2D", "Java3D", "JavaMail"};
    JTree tree = new JTree(treedata);

    tree.setRootVisible(true);

    JScrollPane scrollPane = new JScrollPane();
    scrollPane.getViewport().setView(tree);
    scrollPane.setPreferredSize(new Dimension(180, 120));

    JPanel p = new JPanel();
    p.add(scrollPane);

    getContentPane().add(p, BorderLayout.CENTER);
  }
}