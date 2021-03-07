import javax.swing.*;
import java.awt.BorderLayout;

public class JSplitPaneTest2 extends JFrame{

  public static void main(String[] args){
    JSplitPaneTest2 frame = new JSplitPaneTest2();

    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setBounds(10, 10, 300, 200);
    frame.setTitle("ƒ^ƒCƒgƒ‹");
    frame.setVisible(true);
  }

  JSplitPaneTest2(){
    JSplitPane splitpane = new JSplitPane();
    splitpane.setOrientation(JSplitPane.VERTICAL_SPLIT);

    getContentPane().add(splitpane, BorderLayout.CENTER);
  }
}