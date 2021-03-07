import javax.swing.*;
import java.awt.Font;
import java.awt.Dimension;
import java.awt.BorderLayout;
import javax.swing.DefaultCellEditor;
import javax.swing.tree.DefaultMutableTreeNode;

public class JTreeTest31 extends JFrame{

  public static void main(String[] args){
    JTreeTest31 frame = new JTreeTest31();

    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setBounds(10, 10, 300, 200);
    frame.setTitle("ƒ^ƒCƒgƒ‹");
    frame.setVisible(true);
  }

  JTreeTest31(){
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

    JTree tree = new JTree(root);
    tree.setEditable(true);

    JTextField text = new JTextField();
    text.setFont(new Font("‚l‚r ƒSƒVƒbƒN", Font.BOLD, 16));
    text.setPreferredSize(new Dimension(120, 30));

    DefaultCellEditor editor = new DefaultCellEditor(text);

    tree.setCellEditor(editor);

    JScrollPane scrollPane = new JScrollPane();
    scrollPane.getViewport().setView(tree);
    scrollPane.setPreferredSize(new Dimension(180, 120));

    JPanel p = new JPanel();
    p.add(scrollPane);

    getContentPane().add(p, BorderLayout.CENTER);
  }
}
