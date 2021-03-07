import javax.swing.*;
import java.awt.BorderLayout;

public class JSplitPaneTest13 extends JFrame{

  public static void main(String[] args){
    JSplitPaneTest13 frame = new JSplitPaneTest13();

    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setBounds(10, 10, 300, 200);
    frame.setTitle("ƒ^ƒCƒgƒ‹");
    frame.setVisible(true);
  }

  JSplitPaneTest13(){
    JSplitPane splitpane = new JSplitPane();

    JPanel leftPanel = new JPanel();
    JButton leftButton = new JButton("Left");
    leftPanel.add(leftButton);

    JSplitPane rightSplitpane = new JSplitPane(JSplitPane.VERTICAL_SPLIT);

    JPanel topPanel = new JPanel();
    JButton topButton = new JButton("Top");
    topPanel.add(topButton);

    JPanel bottomPanel = new JPanel();
    JButton bottomButton = new JButton("Bottom");
    bottomPanel.add(bottomButton);

    rightSplitpane.setLeftComponent(topPanel);
    rightSplitpane.setRightComponent(bottomPanel);

    splitpane.setLeftComponent(leftPanel);
    splitpane.setRightComponent(rightSplitpane);

    getContentPane().add(splitpane, BorderLayout.CENTER);
  }
}