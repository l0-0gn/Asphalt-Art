import org.code.neighborhood.*;

public class NeighborhoodRunner {
  public static void main(String[] args) {

    OutlinePainter edger = new OutlinePainter();

      edger.paintOutline("black");

    BallPainter baller = new BallPainter();
    
      baller.moveToLocation();
      baller.paintBall("Lime");

    SeamPainter SeanTheSeamer = new SeamPainter();
      
      SeanTheSeamer.seam1("white");
      SeanTheSeamer.moveToLocation2();
      SeanTheSeamer.paintSeam2("white");
  }
}