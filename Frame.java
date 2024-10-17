import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class Frame extends JFrame{

  JPanel newPanel, subPanel;
  //innerPanel() littlePanel;
  Frame(){
    newPanel = new JPanel();
    subPanel = new JPanel();
    //littlePanel = new innerPanel();
    subPanel.setBackground(Color.GREEN);
    newPanel.setBackground(Color.RED);
    newPanel.setSize(200, 300);
    //subPanel.setBorder(BorderFactory.createEmptyBorder(100, 20, 20, 20)); // Top, Left, Bottom, Right
    newPanel.setBorder(BorderFactory.createTitledBorder("Main Panel"));
    newPanel.setLayout(new GridLayout(1,2));
    subPanel.setBorder(BorderFactory.createTitledBorder("Sub Panel 1"));
    subPanel.setLayout(new GridLayout(1,1));

    this.add(subPanel);
    this.add(newPanel);
    subPanel.setSize(300, 400);
    //newPanel.add(subPanel);
    //subPanel.setBorder(BorderFactory.createTitledBorder("Sub Panel 1"));
    //subPanel.setLayout(new GridLayout(1,1));
    //subPanel.setBackground(Color.blue);
    //subPanel.setVisible(true);
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
