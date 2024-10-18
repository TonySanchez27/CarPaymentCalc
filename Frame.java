/**
* Car Payment Calculator
*
* Visualizes what a car will cost to purchase initially and
* monthly.
*
* @author Tony Sanchez October 2024
*/

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class Frame extends JFrame{

  JPanel newPanel, subPanel1, subPanel2;

  Frame(){
    newPanel = new JPanel();
    subPanel1 = new JPanel();
    subPanel2 = new JPanel();
    subPanel1.setBackground(Color.GREEN);
    newPanel.setBackground(Color.RED);
    newPanel.setSize(200, 300);
    subPanel1.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20)); // Top, Left, Bottom, Right
    newPanel.setBorder(BorderFactory.createTitledBorder("Main Panel"));
    newPanel.setLayout(new GridLayout(1,2));
    subPanel1.setBorder(BorderFactory.createTitledBorder("Sub Panel 1"));
    subPanel1.setLayout(new GridLayout(1,1));
    subPanel2.setBorder(BorderFactory.createTitledBorder("Sub Panel 2"));
    subPanel2.setLayout(new GridLayout(1,1));

    newPanel.add(subPanel1);
    newPanel.add(subPanel2);
    this.add(newPanel);
    subPanel1.setSize(10, 400);
    
    this.setSize(900, 500);
    this.setTitle("Car Payment Calculator");
    this.setResizable(true);
    this.setBackground(Color.BLUE);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    //this.pack();
    this.setVisible(true);
    this.setLocationRelativeTo(null);
  }
}
