import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.event.*;

public class JOptionPaneTest4 extends JFrame implements ActionListener{

  public static void main(String[] args){
    JOptionPaneTest4 frame = new JOptionPaneTest4();

    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setBounds(10, 10, 300, 200);
    frame.setTitle("ƒ^ƒCƒgƒ‹");
    frame.setVisible(true);
  }

  JOptionPaneTest4(){
    JButton infoButton = new JButton("Info");
    infoButton.addActionListener(this);

    JPanel p = new JPanel();
    p.add(infoButton);

    getContentPane().add(p, BorderLayout.CENTER);
  }

  public void actionPerformed(ActionEvent e){
    ImageIcon icon = new ImageIcon("./img/reo1s.gif");

    JOptionPane.showMessageDialog(this, "CUSTOM ICON", "Info",
      JOptionPane.INFORMATION_MESSAGE, icon);
  }
}
