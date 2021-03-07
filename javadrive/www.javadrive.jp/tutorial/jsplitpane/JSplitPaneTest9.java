import javax.swing.*;
import java.awt.BorderLayout;

public class JSplitPaneTest9 extends JFrame{

  public static void main(String[] args){
    JSplitPaneTest9 frame = new JSplitPaneTest9();

    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setBounds(10, 10, 300, 200);
    frame.setTitle("ƒ^ƒCƒgƒ‹");
    frame.setVisible(true);
  }

  JSplitPaneTest9(){
    JSplitPane splitpane = new JSplitPane();
    splitpane.setDividerSize(20);

    JPanel leftPanel = new JPanel();
    JButton leftButton = new JButton("Left");
    leftPanel.add(leftButton);

    JPanel rightPanel = new JPanel();
    JButton rightButton = new JButton("Right");
    rightPanel.add(rightButton);

    splitpane.setLeftComponent(leftPanel);
    splitpane.setRightComponent(rightPanel);

    getContentPane().add(splitpane, BorderLayout.CENTER);
  }
}