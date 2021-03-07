import javax.swing.*;
import java.awt.Dimension;
import java.awt.BorderLayout;

public class JSplitPaneTest5 extends JFrame{

  public static void main(String[] args){
    JSplitPaneTest5 frame = new JSplitPaneTest5();

    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setBounds(10, 10, 300, 200);
    frame.setTitle("ƒ^ƒCƒgƒ‹");
    frame.setVisible(true);
  }

  JSplitPaneTest5(){
    JSplitPane splitpane = new JSplitPane();

    JPanel leftPanel = new JPanel();
    JButton leftButton = new JButton("Left");
    leftPanel.add(leftButton);
    leftPanel.setMinimumSize(new Dimension(0,0));

    JPanel rightPanel = new JPanel();
    JButton rightButton = new JButton("Right");
    rightPanel.add(rightButton);
    rightPanel.setMinimumSize(new Dimension(0,0));

    splitpane.setLeftComponent(leftPanel);
    splitpane.setRightComponent(rightPanel);

    getContentPane().add(splitpane, BorderLayout.CENTER);
  }
}