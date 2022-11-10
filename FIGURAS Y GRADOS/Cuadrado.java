package menu;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Cuadrado extends JFrame implements ActionListener {

    private static final long serialVersionUID = 1L;
    private JTextField field_lado;
    private JLabel label_area, label_perimetro;
    private JButton button;

    public Cuadrado() {
        field_lado = new JTextField(4);
        label_area = new JLabel("", JLabel.RIGHT);
        label_perimetro = new JLabel("", JLabel.RIGHT);
        button = new JButton("Procesar");
        Container pane = getContentPane();
        pane.setLayout(new BorderLayout());
        JPanel panel, subpanel;
        panel = new JPanel(new BorderLayout());
        subpanel = new JPanel(new GridLayout(1, 1));
        subpanel.add(new JLabel("Ingresa el valor de lado:"));
        panel.add(subpanel, BorderLayout.WEST);
        subpanel = new JPanel(new GridLayout(1, 1));
        subpanel.add(field_lado);
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
        double area, lado, perimetro;
        try {
            lado = Double.parseDouble(field_lado.getText());
        } catch (NumberFormatException numberFormatException) {
            return;
        }
        area=lado*lado;
        perimetro=lado*4;
        label_area.setText(String.valueOf(area));
        label_perimetro.setText(String.valueOf(perimetro));
        pack();
    }

    public static void main(String[] args) {
        new Cuadrado().setVisible(true);
    }

    public static long getSerialversionuid() {
        return serialVersionUID;
    }

    public JTextField getField_lado() {
        return field_lado;
    }

    public void setField_lado(JTextField field_lado) {
        this.field_lado = field_lado;
    }

    public JLabel getLabel_area() {
        return label_area;
    }

    public void setLabel_area(JLabel label_area) {
        this.label_area = label_area;
    }

    public JLabel getLabel_perimetro() {
        return label_perimetro;
    }

    public void setLabel_perimetro(JLabel label_perimetro) {
        this.label_perimetro = label_perimetro;
    }

    public JButton getButton() {
        return button;
    }

    public void setButton(JButton button) {
        this.button = button;
    }

}