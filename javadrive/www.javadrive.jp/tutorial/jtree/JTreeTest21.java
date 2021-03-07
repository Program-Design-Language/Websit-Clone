import javax.swing.*;
import java.awt.Dimension;
import java.awt.BorderLayout;
import javax.swing.tree.TreePath;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.event.*;

public class JTreeTest21 extends JFrame implements TreeSelectionListener{

  JTree tree;

  public static void main(String[] args){
    JTreeTest21 frame = new JTreeTest21();

    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setBounds(10, 10, 300, 200);
    frame.setTitle("タイトル");
    frame.setVisible(true);
  }

  JTreeTest21(){
    DefaultMutableTreeNode root = new DefaultMutableTreeNode("JavaDrive");

    DefaultMutableTreeNode swing = new DefaultMutableTreeNode("Swing");
    DefaultMutableTreeNode java2d = new DefaultMutableTreeNode("Java2D");
    DefaultMutableTreeNode java3d = new DefaultMutableTreeNode("Java3D");
    DefaultMutableTreeNode javamail = new DefaultMutableTreeNode("JavaMail");

    DefaultMutableTreeNode swingSub1 = new DefaultMutableTreeNode("JLabel");
    DefaultMutableTreeNode swingSub2 = new DefaultMutableTreeNode("JButton");
    DefaultMutableTreeNode swingSub3 = new DefaultMutableTreeNode("JTextField");

    swing.add(swingSub1);
    swing.add(swingSub2);
    swing.add(swingSub3);

    root.add(swing);
    root.add(java2d);
    root.add(java3d);
    root.add(javamail);

    tree = new JTree(root);
    tree.addTreeSelectionListener(this);

    JScrollPane scrollPane = new JScrollPane();
    scrollPane.getViewport().setView(tree);
    scrollPane.setPreferredSize(new Dimension(180, 120));

    JPanel p = new JPanel();
    p.add(scrollPane);

    getContentPane().add(p, BorderLayout.CENTER);
  }

  public void valueChanged(TreeSelectionEvent e){
    TreePath path = tree.getSelectionPath();

    if (path != null){
      int count = path.getPathCount();
      System.out.println("パス数は" + count + "です");

      Object[] data = path.getPath();

      System.out.println("ルートノードから選択ノードまでのパス：");
      for (int i = 0 ; i < count ; i++){
        System.out.println("ノード:" + data[i]);
      }
    }

  }
}