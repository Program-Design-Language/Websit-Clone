import javax.swing.*;
import java.awt.BorderLayout;

public class JSplitPaneTest10 extends JFrame{

  public static void main(String[] args){
    JSplitPaneTest10 frame = new JSplitPaneTest10();

    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setBounds(10, 10, 300, 200);
    frame.setTitle("�^�C�g��");
    frame.setVisible(true);
  }

  JSplitPaneTest10(){
    JSplitPane splitpane = new JSplitPane();
    splitpane.setOneTouchExpandable(true);

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