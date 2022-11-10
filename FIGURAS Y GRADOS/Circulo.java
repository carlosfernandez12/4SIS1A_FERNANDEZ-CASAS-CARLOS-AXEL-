package menu;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Circulo extends JFrame implements ActionListener {

    private static final long serialVersionUID = 1L;
    private JTextField field_radio;
    private JLabel label_area, label_circunferencia, label_perimetro;
    private JButton button;

    public Circulo() {
        field_radio = new JTextField(4);
        label_area = new JLabel("", JLabel.RIGHT);
        label_circunferencia = new JLabel("", JLabel.RIGHT);
        label_perimetro = new JLabel("", JLabel.RIGHT);
        button = new JButton("Procesar");
        Container pane = getContentPane();
        pane.setLayout(new BorderLayout());
        JPanel panel, subpanel;
        panel = new JPanel(new BorderLayout());
        subpanel = new JPanel(new GridLayout(1, 1));
        subpanel.add(new JLabel("Ingresa el valor de radio:"));
        panel.add(subpanel, BorderLayout.WEST);
        subpanel = new JPanel(new GridLayout(1, 1));
        subpanel.add(field_radio);
        panel.add(subpanel);
        pane.add(panel, BorderLayout.NORTH);
        panel = new JPanel(new FlowLayout());
        panel.add(button);
        pane.add(panel);
        panel = new JPanel(new BorderLayout());
        subpanel = new JPanel(new GridLayout(3, 1));
        subpanel.add(new JLabel("Valor de area:"));
        subpanel.add(new JLabel("Valor de circunferencia:"));
        subpanel.add(new JLabel("Valor de perimetro:"));
        panel.add(subpanel, BorderLayout.WEST);
        subpanel = new JPanel(new GridLayout(3, 1));
        subpanel.add(label_area);
        subpanel.add(label_circunferencia);
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
        double area, circunferencia, perimetro, radio;
        try {
            radio = Double.parseDouble(field_radio.getText());
        } catch (NumberFormatException numberFormatException) {
            return;
        }
        circunferencia=2.0*Math.PI*radio;
        perimetro=circunferencia;
        area=Math.PI*radio*radio;
        label_area.setText(String.valueOf(area));
        label_circunferencia.setText(String.valueOf(circunferencia));
        label_perimetro.setText(String.valueOf(perimetro));
        pack();
    }

    public static void main(String[] args) {
        new figuras().setVisible(true);
    }

}