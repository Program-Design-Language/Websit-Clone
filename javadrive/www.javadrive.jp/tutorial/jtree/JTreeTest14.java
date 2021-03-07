import javax.swing.*;
import java.awt.Dimension;
import java.awt.BorderLayout;
import javax.swing.tree.DefaultMutableTreeNode;

public class JTreeTest14 extends JFrame{

  public static void main(String[] args){
    JTreeTest14 frame = new JTreeTest14();

    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setBounds(10, 10, 300, 200);
    frame.setTitle("ƒ^ƒCƒgƒ‹");
    frame.setVisible(true);
  }

  JTreeTest14(){
    DefaultMutableTreeNode root = new DefaultMutableTreeNode("JavaDrive");

    DefaultMutableTreeNode swing = new DefaultMutableTreeNode("Swing");
    DefaultMutableTreeNode swt = new DefaultMutableTreeNode("SWT");
    DefaultMutableTreeNode java2d = new DefaultMutableTreeNode("Java2D");
    DefaultMutableTreeNode java3d = new DefaultMutableTreeNode("Java3D");
    DefaultMutableTreeNode javamail = new DefaultMutableTreeNode("JavaMail");

    root.add(swing);
    root.add(swt);
    root.add(java2d);
    root.add(java3d);
    root.add(javamail);

    swt.removeFromParent();

    JTree tree = new JTree(root);

    JScrollPane scrollPane = new JScrollPane();
    scrollPane.getViewport().setView(tree);
    scrollPane.setPreferredSize(new Dimension(180, 120));

    JPanel p = new JPanel();
    p.add(scrollPane);

    getContentPane().add(p, BorderLayout.CENTER);
  }
}