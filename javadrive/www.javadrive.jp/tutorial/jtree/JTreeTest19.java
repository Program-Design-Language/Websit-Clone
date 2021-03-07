import javax.swing.*;
import java.awt.Dimension;
import java.awt.BorderLayout;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.event.*;

public class JTreeTest19 extends JFrame implements TreeSelectionListener{

  JTree tree;
  JLabel label;

  public static void main(String[] args){
    JTreeTest19 frame = new JTreeTest19();

    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setBounds(10, 10, 300, 200);
    frame.setTitle("タイトル");
    frame.setVisible(true);
  }

  JTreeTest19(){
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

    label = new JLabel();
    JPanel labelPanel = new JPanel();
    labelPanel.add(label);

    getContentPane().add(p, BorderLayout.CENTER);
    getContentPane().add(labelPanel, BorderLayout.PAGE_END);
  }

  public void valueChanged(TreeSelectionEvent e){
    DefaultMutableTreeNode node = 
      (DefaultMutableTreeNode)tree.getLastSelectedPathComponent();

    if (node != null){
      if (node.isRoot()){
        label.setText("ルートノードです");
      }else{
        String data = (String)node.getUserObject();

        DefaultMutableTreeNode parent = (DefaultMutableTreeNode)node.getParent();
        if (parent == null){
          label.setText("親ノードはありません");
        }else{
          String parentdata = (String)parent.getUserObject();
          label.setText(data + "の親ノードは" + parentdata + "です");
        }
      }
    }

  }
}