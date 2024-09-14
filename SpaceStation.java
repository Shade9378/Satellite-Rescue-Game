import java.util.Random;
/**
 * The space station moves diagonally from upper-left to lower right. It is
 * green on the first orbit (the first time it moves on a diagonal), yellow
 * on the second orbit, and red thereafter until a new refueling operation
 * begins.
 * 
 * @author Carl Singer, Brian Howard, David Maharry
 * @version September 2004
 * @version September 2005, revised by Carl Singer
 * @version September 2006, revised by Carl Singer
 */
public class SpaceStation
{
  private Diamond spaceStation;
  private Canvas canvas;

  private int initXPosition; // where to start the shuttle (a random x-coordinate
                             // in the canvas boundary
  private int initYPosition; // the initial y-coordinate is always zero
  private int xDistance;     // the distance to move in the x direction
  private int yDistance;     // the distance to move in the y direction
  private int orbitCount;    // the number of orbits completed, used for color change control
  private Random r;          // a random number generator
  

  public SpaceStation(Canvas simCanvas)
  {
      canvas = simCanvas;
      spaceStation = new Diamond(simCanvas);
      spaceStation.changeSize(50,80);
      r = new Random();



      orbitCount = 0;
      ///Solution
      int d = r.nextInt( + canvas.getWidth() - 100); ///In case the number generated is too big or two small
      initXPosition = d;
      initYPosition = 0;
      spaceStation.moveTo(initXPosition,initYPosition);
      spaceStation.changeColor("green");
      spaceStation.makeVisible();
      
  }


  public void moveSmallDistance()
  {
     if (((spaceStation.getXPosition() < canvas.getWidth()) && (spaceStation.getYPosition() < canvas.getHeight()))) ///Move spacestation diagonally until reach bound
     {
            spaceStation.moveDirection(xDistance,yDistance);
            canvas.wait(300);
     }
     else
     {
            orbitCount += 1;
            if(initXPosition > 30) ///Move to a lower starting point
            {
                 spaceStation.moveTo(initXPosition - 30 ,initYPosition);
                 initXPosition = spaceStation.getXPosition(); ///Store x position for the next call
            }
            else ///in case the x value is < 0
            {
                 spaceStation.moveTo(15,0); 
            }
     }
     ///Change color base on orbitCount
     if (orbitCount == 1)
     {
         spaceStation.changeColor("yellow");
     }
     else if (orbitCount >= 2)
     {
         spaceStation.changeColor("red");
     }
  }

  public void reFuel()
  {
       spaceStation.changeColor("green");
       canvas.wait(3000); /// wait3000 miliseconds = 3 seconds
  }
  

  public void setSpeed(char newSpeed)
  {
       if (newSpeed == 'B')
       {
           xDistance = 30;
           yDistance = 25;
       }
       if (newSpeed == 'I')
       {
           xDistance = 50;
           yDistance = 40;
       }
       if (newSpeed == 'A') 
       {
           xDistance = 70;
           yDistance = 60;
       }
       
  }
 
  public int getXPosition()
  {
      return spaceStation.getXPosition();
  }

 
  public int getYPosition()
  {
      return spaceStation.getYPosition();
  }
}
