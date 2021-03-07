import javax.swing.*;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.BorderLayout;
import java.awt.Component;

public class JComboBoxTest19 extends JFrame{

  public static void main(String[] args){
    JComboBoxTest19 frame = new JComboBoxTest19();

    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setBounds(10, 10, 300, 200);
    frame.setTitle("ƒ^ƒCƒgƒ‹");
    frame.setVisible(true);
  }

  JComboBoxTest19(){
    String[] combodata = {"08:00","09:00","10:00","11:00",
                          "12:00","13:00","14:00","15:00",
                          "16:00","17:00","18:00","19:00"};

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
      setText(data);

      if (isSelected){
        setForeground(Color.white);
        setBackground(Color.black);
      }else{
        setForeground(Color.black);

        if (index % 2 == 0){
          setBackground(Color.white);
        }else{
          setBackground(new Color(238, 232, 170));
        }
      }

      return this;
    }
  }
}

