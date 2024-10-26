/**
* Car Payment Calculator
*
* Provides a visualization of the initial purchase cost
* and monthly payments for a car.
*
* @author Tony Sanchez October 2024
*/

import java.awt.*;
import javax.swing.*;

public class Frame extends JFrame {

    JPanel newPanel, subPanel1, subPanel2;

    Frame() {
        // Create the panels
        newPanel = new JPanel();
        subPanel1 = new JPanel();
        subPanel2 = new JPanel();

        // Set background colors
        subPanel1.setBackground(new Color(249, 221, 177)); // #f9ddb1
        subPanel2.setBackground(Color.WHITE); // White color for subPanel2

        // Set layout for the main panel to BorderLayout
        newPanel.setLayout(new BorderLayout());

        // Set borders for the sub-panels
        subPanel1.setBorder(BorderFactory.createTitledBorder("Car Payment Details"));
        subPanel2.setBorder(BorderFactory.createTitledBorder("Sub Panel 2"));

        // Set layout for subPanel1 to GridLayout for vertical arrangement
        subPanel1.setLayout(new GridLayout(12, 2, 5, 5)); // 12 rows, 2 columns, with gaps

        // Create and add labels and text fields to subPanel1
        subPanel1.add(new JLabel("Car Price:"));
        subPanel1.add(new JTextField(10));
        
        subPanel1.add(new JLabel("Loan Term (months):"));
        subPanel1.add(new JTextField(10));
        
        subPanel1.add(new JLabel("Interest Rate (%):"));
        subPanel1.add(new JTextField(10));
        
        subPanel1.add(new JLabel("Cash Incentives:"));
        subPanel1.add(new JTextField(10));
        
        subPanel1.add(new JLabel("Down Payment:"));
        subPanel1.add(new JTextField(10));
        
        subPanel1.add(new JLabel("Trade In:"));
        subPanel1.add(new JTextField(10));
        
        subPanel1.add(new JLabel("Amount Owed on Trade In:"));
        subPanel1.add(new JTextField(10));
        
        subPanel1.add(new JLabel("State:"));
        subPanel1.add(new JTextField(10));
        
        subPanel1.add(new JLabel("Sales Tax (%):"));
        subPanel1.add(new JTextField(10));
        
        subPanel1.add(new JLabel("Fees (Title, Registration, etc.):"));
        subPanel1.add(new JTextField(10));
        
        subPanel1.add(new JLabel("Monthly Insurance:"));
        subPanel1.add(new JTextField(10));
        
        // Add Calculate button
        JButton calculateButton = new JButton("Calculate");
        subPanel1.add(calculateButton); // Add button in the last row
        subPanel1.add(new JLabel("")); // Empty label to maintain grid structure

        // Add example components to subPanel2
        subPanel2.add(new JLabel("Label in Sub Panel 2"));
        subPanel2.add(new JTextField(10)); // Text field for input

        // Add sub-panels to the main panel
        newPanel.add(subPanel1, BorderLayout.WEST); // Place subPanel1 on the left
        newPanel.add(subPanel2, BorderLayout.CENTER); // Place subPanel2 in the center

        // Add the main panel to the frame
        this.add(newPanel);

        // Set frame properties
        this.setSize(900, 500);
        this.setTitle("Car Payment Calculator");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null); // Center the frame
        this.setVisible(true);
    }

    public static void main(String[] args) {
        // Create an instance of the frame
        SwingUtilities.invokeLater(() -> new Frame());
    }
}