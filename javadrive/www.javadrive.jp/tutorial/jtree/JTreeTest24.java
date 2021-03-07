import javax.swing.*;
import java.awt.Dimension;
import java.awt.BorderLayout;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.DefaultMutableTreeNode;
import java.awt.event.*;

public class JTreeTest24 extends JFrame implements ActionListener{

  JTree tree;
  DefaultTreeModel model;
  JTextField text;

  public static void main(String[] args){
    JTreeTest24 frame = new JTreeTest24();

    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setBounds(10, 10, 300, 250);
    frame.setTitle("ƒ^ƒCƒgƒ‹");
    frame.setVisible(true);
  }

  JTreeTest24(){
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
    model = (DefaultTreeModel)tree.getModel();

    JScrollPane scrollPane = new JScrollPane();
    scrollPane.getViewport().setView(tree);
    scrollPane.setPreferredSize(new Dimension(180, 120));

    JPanel p = new JPanel();
    p.add(scrollPane);

    text = new JTextField(10);
    JPanel textPanel = new JPanel();
    textPanel.add(text);

    JButton addButton = new JButton("Add");
    addButton.addActionListener(this);
    addButton.setActionCommand("Add");
    JButton deleteButton = new JButton("Delete");
    deleteButton.addActionListener(this);
    deleteButton.setActionCommand("Delete");
    JButton replaceButton = new JButton("Replace");
    replaceButton.addActionListener(this);
    replaceButton.setActionCommand("Replace");

    JPanel buttonPanel = new JPanel();
    buttonPanel.add(addButton);
    buttonPanel.add(deleteButton);
    buttonPanel.add(replaceButton);

    getContentPane().add(p, BorderLayout.CENTER);
    getContentPane().add(textPanel, BorderLayout.PAGE_START);
    getContentPane().add(buttonPanel, BorderLayout.PAGE_END);
  }

  public void actionPerformed(ActionEvent e){
    DefaultMutableTreeNode node = 
      (DefaultMutableTreeNode)tree.getLastSelectedPathComponent();

    if (node == null){
      return;
    }

    String action = e.getActionCommand();

    if (action.equals("Add")){
      String name = text.getText();
      if (!name.equals("")){
        node.add(new DefaultMutableTreeNode(name));
        model.reload();
      }
    }else if (action.equals("Delete")){
      node.removeFromParent();
      model.reload();
    }else if (action.equals("Replace")){
      String name = text.getText();
      if (!name.equals("")){
        node.setUserObject(new DefaultMutableTreeNode(name));
        model.nodeChanged(node);
      }
    }

    text.setText("");
  }
}
