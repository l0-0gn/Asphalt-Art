import org.code.neighborhood.*;

public class SeamPainter extends PainterPlus {

    public void moveToLocation1(){
        turnRight();
        moveFast();
        turnLeft();
        move();
        move();
        move();
        move();
        move();
        move();
        move();
        turnLeft();
        move();
        move();
        move();
        setPaint(100);
    }
  
    public void paintSeam1(String color){
        move();
        paint(color);
        move();
        paint(color);
        move();
        paint(color);
        turnLeft();
        move();
        paint(color);
        turnRight();
        move();
        paint(color);
        turnLeft();
        move();
        paint(color);
        move();
        paint(color);
    }
  
  public void seam1(String color){
    moveToLocation1();
    paintSeam1(color);
  }
  
  public void moveToLocation2(){
    turnRight();
    move();
    move();
    move();
    turnRight();

    move();
    move();
    move();    
    move();
    move();
    move();

    turnLeft();
    move();
    move();

    turnLeft();
  }

  public void paintSeam2(String color){
    paint(color);
    move();
    turnLeft();
    move();
    paint(color);
    turnRight();
    move();
    turnLeft();
    
    move();
    paint(color);
    move();
    paint(color);
    move();
    paint(color);

    move();
    turnLeft();
    move();
    paint(color);

    move();
    turnRight();
    move();
    paint(color);
    turnLeft();

    move();
    paint(color);
   

    turnLeft();
    move();
    turnRight();
    move();
    paint(color);
  }
  // last curly brace
}