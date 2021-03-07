import javax.swing.*;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.BorderLayout;
import java.awt.Component;

public class JComboBoxTest18 extends JFrame{

  public static void main(String[] args){
    JComboBoxTest18 frame = new JComboBoxTest18();

    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setBounds(10, 10, 300, 200);
    frame.setTitle("ƒ^ƒCƒgƒ‹");
    frame.setVisible(true);
  }

  JComboBoxTest18(){
    DefaultComboBoxModel model = new DefaultComboBoxModel();
    model.addElement(new ComboLabel("Lion", new ImageIcon("./img/reo1s.png")));
    model.addElement(new ComboLabel("Elephant", new ImageIcon("./img/zou1s.png")));
    model.addElement(new ComboLabel("Ostrich", new ImageIcon("./img/dacho_s.png")));
    model.addElement(new ComboLabel("Hippo", new ImageIcon("./img/hip03s.png")));

    JComboBox combo = new JComboBox(model);

    MyCellRenderer renderer = new MyCellRenderer();
    combo.setRenderer(renderer);

    JPanel p = new JPanel();
    p.add(combo);

    getContentPane().add(p, BorderLayout.CENTER);
  }

  class ComboLabel{
    String text;
    Icon icon;

    ComboLabel(String text, Icon icon){
      this.text = text;
      this.icon = icon;
    }

    public String getText(){
      return text;
    }

    public Icon getIcon(){
      return icon;
    }
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

      ComboLabel data = (ComboLabel)value;
      setText(data.getText());
      setIcon(data.getIcon());

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

