package menu;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Rectangulo extends JFrame implements ActionListener {

    private static final long serialVersionUID = 1L;
    private JTextField field_altura, field_base;
    private JLabel label_area, label_perimetro;
    private JButton button;

   
    public Rectangulo() {
        field_altura = new JTextField(4);
        field_base = new JTextField(4);
        label_area = new JLabel("", JLabel.RIGHT);
        label_perimetro = new JLabel("", JLabel.RIGHT);
        button = new JButton("Procesar");
        Container pane = getContentPane();
        pane.setLayout(new BorderLayout());
        JPanel panel, subpanel;
        panel = new JPanel(new BorderLayout());
        subpanel = new JPanel(new GridLayout(2, 1));
        subpanel.add(new JLabel("Ingresa el valor de altura:"));
        subpanel.add(new JLabel("Ingresa el valor de base:"));
        panel.add(subpanel, BorderLayout.WEST);
        subpanel = new JPanel(new GridLayout(2, 1));
        subpanel.add(field_altura);
        subpanel.add(field_base);
        panel.add(subpanel);
        pane.add(panel, BorderLayout.NORTH);
        panel = new JPanel(new FlowLayout());
        panel.add(button);
        pane.add(panel);
        panel = new JPanel(new BorderLayout());
        subpanel = new JPanel(new GridLayout(2, 1));
        subpanel.add(new JLabel("Valor de area:"));
        subpanel.add(new JLabel("Valor de perimetro:"));
        panel.add(subpanel, BorderLayout.WEST);
        subpanel = new JPanel(new GridLayout(2, 1));
        subpanel.add(label_area);
        subpanel.add(label_perimetro);
        panel.add(subpanel);
        pane.add(panel, BorderLayout.SOUTH);
        button.addActionListener(this);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setLocationRelativeTo(null);
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        double altura, area, base, perimetro;
        try {
            altura = Double.parseDouble(field_altura.getText());
            base = Double.parseDouble(field_base.getText());
        } catch (NumberFormatException numberFormatException) {
            return;
        }
        area=altura*base;
        perimetro=altura+base+altura+base;
        label_area.setText(String.valueOf(area));
        label_perimetro.setText(String.valueOf(perimetro));
        pack();
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        new Rectangulo().setVisible(true);
    }

}