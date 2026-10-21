import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MetricConverter extends JFrame implements ActionListener {

    JLabel lblValue, lblResult;
    JTextField txtValue;
    JComboBox<String> combo;
    JButton btnConvert;

    public MetricConverter() {

        setTitle("Metric Conversion");
        setSize(400, 250);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        lblValue = new JLabel("Enter Value:");
        txtValue = new JTextField(15);

        String conversions[] = {
                "Meters to Kilometers",
                "Kilometers to Meters",
                "Grams to Kilograms",
                "Kilograms to Grams"
        };

        combo = new JComboBox<>(conversions);

        btnConvert = new JButton("Convert");
        lblResult = new JLabel("Result: ");

        btnConvert.addActionListener(this);

        add(lblValue);
        add(txtValue);
        add(combo);
        add(btnConvert);
        add(lblResult);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {

        try {
            double value = Double.parseDouble(txtValue.getText());
            double result = 0;

            String choice = (String) combo.getSelectedItem();

            if (choice.equals("Meters to Kilometers")) {
                result = value / 1000;
            } else if (choice.equals("Kilometers to Meters")) {
                result = value * 1000;
            } else if (choice.equals("Grams to Kilograms")) {
                result = value / 1000;
            } else if (choice.equals("Kilograms to Grams")) {
                result = value * 1000;
            }

            lblResult.setText("Result: " + result);

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this,
                    "Please enter a valid number.");
        }
    }

    public static void main(String[] args) {
        new MetricConverter();
    }
}
