import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class Panel extends JPanel implements Runnable{

  static final int SCREEN_WIDTH = 1000;
  static final int SCREEN_HEIGHT = (int)(SCREEN_WIDTH * (0.5555));
  static final Dimension SCREEN_SIZE = new Dimension(SCREEN_WIDTH, SCREEN_HEIGHT);
  Thread widgetThread;
  Image image;
  Graphics graphics;
  Random rand;


  Panel(){

    this.setFocusable(true);
    this.addKeyListener(new ActionListener());
    this.setPreferredSize(SCREEN_SIZE);

    widgetThread = new Thread(this);
    widgetThread.start();
  }





  public void paint(Graphics g){
    image = createImage(getWidth(), getHeight());
    graphics = image.getGraphics();
    draw(graphics);
    g.drawImage(image, 0, 0, this);
  }

  public void draw(Graphics g){

  }

  public void move(){

  }



  public void run(){
    long lastTime = System.nanoTime();
    double amountOfTicks = 60.0;
    double ns = 1000000000 / amountOfTicks;
    double delta = 0;
    while(true){
      long now = System.nanoTime();
      delta += (now - lastTime) / ns;
      lastTime = now;
      if(delta >= 1){
        move();
        repaint();
        delta--;
      }
    }
  }

  public class ActionListener extends KeyAdapter{
    public void keyPressed(KeyEvent e){
    }

    public void keyReleased(KeyEvent e){
    }
  }
}
