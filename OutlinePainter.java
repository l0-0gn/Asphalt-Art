import org.code.neighborhood.*;
public class OutlinePainter extends PainterPlus {

  public void paintOutline(String color){
    moveToLocation();
    
  // paint top of ball
    setPaint(5);
    paintToEmpty(color);
    
  // paint the diagnal
    setPaint(3);
    paintStaircase(color);
    
  // repeat
    setPaint(5);
    paintToEmpty(color);
    
  // staircase

    setPaint(3);
    paintStaircase(color);

  //paintTop
    setPaint(5);
    paintToEmpty(color);

  //staircase

    setPaint(3);
    paintStaircase(color);


//paintTop
    setPaint(5);
    paintToEmpty(color);

// staircase
    setPaint(3);
    paintStaircase(color);
  }

  // staircase method
    public void paintStaircase(String color){
    turnRight();
    move();
    paint(color);
    turnLeft();
    move();

    turnRight();
    move();
    paint(color);
    turnLeft();
    move();

    turnRight();
    move();
    paint(color);
  }

  // moveToLocation
    public void moveToLocation(){
    turnRight();
    move();
    move();
    turnLeft();
    move();
    move();
    move();
    move();
    move();
    move();
    }
}