import org.code.neighborhood.*;

public class BallPainter extends PainterPlus {
    public void moveToLocation(){
        turnRight();
        move();
        move();
        move();
        turnLeft();
        move();
        move();
        move();
        move();
        move();
        move();
        setPaint(100);

    }

    public void paintBall(String color){

        paintToBorder(color);
          rightUTurn();
      
        paintToBorder(color);
         leftUTurn();
      
        paintToBorder(color);
          rightUTurn();
          move();

        paintToBorder(color);
          leftUTurn();
          move();
      
        paintToBorder(color);
          rightUTurn();
          move();
      
        paintToBorder(color);
          leftUTurn();
          move();

        paintToBorder(color);
          rightUTurn();
          move();
          move();

        paintToBorder(color);
          leftUTurn();
          move();
          move();
      
        paintToBorder(color);
       
      // while(hasPaint()){
        
      //   paintToBorder(color);
      //   rightUTurn();
      //   while(isOnPaint()){
      //     move();
      //   }
      
      //   paintToBorder(color);
      //   leftUTurn();
      //   while(isOnPaint()){
      //     move();
      //   }
      
      // }
      }
       
}