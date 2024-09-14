public class Star
{
    private Diamond star;
    private Canvas canvas;
    
    public Star(Canvas simCanvas)
    {
        canvas = simCanvas;
        star = new Diamond(simCanvas);
        star.changeSize(10,5);
        star.moveTo(100,100);
        star.changeColor("yellow");
        star.makeVisible();
    }
    
    public Star(Canvas simCanvas, int xPos, int yPos)
    {
        canvas = simCanvas;
        star = new Diamond(simCanvas);
        star.changeSize(10,5);
        star.moveTo(xPos,yPos);
        star.changeColor("yellow");
        star.makeVisible();
    }
    
}
