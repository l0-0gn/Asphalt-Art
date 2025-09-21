import org.code.neighborhood.*;

public class PainterPlus extends Painter{

//turns right
  public void turnRight(){
    turnLeft();
    turnLeft();
    turnLeft();
  }
  
//takes all paint
  public void takeAllPaint(){
    while (isOnBucket() == true){
      takePaint();
    }  
     }
  
//moves until it can't
   public void moveFast(){
    while(canMove() == true){
      move();
    }
  }



  //paints a donut
  public void paintDonut(String color){
    while (hasPaint()) {
      move();
      turnRight();
      paint(color);
      move();
      paint(color);
      
      }
    }
  public void paintToEmpty(String color){
    while(hasPaint()){
      paint(color);
      move();
    }
  }

  public void rightUTurn(){
      turnRight();
      move();
      turnRight();
  
  }

    public void leftUTurn(){
      turnLeft();
      move();
      turnLeft();
  
  }
   public void turnAround(){
      turnRight();
      turnRight();
  
  } 
    public void paintToBorder(String color){
          while(!isOnPaint()){
          paint(color);
          move();
        }
    }
  //Last curly brace do not touch
  }