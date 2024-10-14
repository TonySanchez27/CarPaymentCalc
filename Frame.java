import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class Frame extends JFrame{

  Panel newPanel;
  Frame(){
    newPanel = new Panel();
    this.add(newPanel);
    this.setTitle("Car Payment Calculator");
    this.setResizable(false);
    this.setBackground(Color.white);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.pack();
    this.setVisible(true);
    this.setLocationRelativeTo(null);
  }
}
