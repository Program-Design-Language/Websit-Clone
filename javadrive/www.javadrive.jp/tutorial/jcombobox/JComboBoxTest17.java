import javax.swing.*;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.BorderLayout;
import java.awt.Component;

public class JComboBoxTest17 extends JFrame{

  public static void main(String[] args){
    JComboBoxTest17 frame = new JComboBoxTest17();

    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setBounds(10, 10, 300, 200);
    frame.setTitle("ƒ^ƒCƒgƒ‹");
    frame.setVisible(true);
  }

  JComboBoxTest17(){
    String[] combodata = {"Swing", "Java2D", "Java3D", "JavaMail"};
    DefaultComboBoxModel model = new DefaultComboBoxModel(combodata);

    JComboBox combo = new JComboBox(model);
    combo.setPreferredSize(new Dimension(140, 30));

    MyCellRenderer renderer = new MyCellRenderer();
    combo.setRenderer(renderer);

    JPanel p = new JPanel();
    p.add(combo);

    getContentPane().add(p, BorderLayout.CENTER);
  }

  class MyCellRenderer extends JLabel implements ListCellRenderer{
    MyCellRenderer(){
      setOpaque(true);
    }

    public Component getListCellRendererComponent(
            JList list,
            Object value,
            int index,
            boolean isSelected,
            boolean cellHasFocus){

      String data = value.toString();
      setText(data.toUpperCase());

      if (isSelected){
        setForeground(Color.white);
        setBackground(Color.black);
      }else{
        setForeground(Color.black);
        setBackground(Color.white);
      }

      return this;
    }
  }
}

