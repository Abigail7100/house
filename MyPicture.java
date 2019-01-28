
/**
 * Write a description of class MyPicture here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MyPicture
{
    // instance variables - replace the example below with your own
    private Square jaw;
    private Square teeth;
    private Triangle hat;
    private Circle head;
    private boolean drawn;


    /**
     * Constructor for objects of class MyPicture
     */
    public MyPicture()
    {
        jaw = new Square();
        teeth = new Square();
        hat = new Triangle();  
        head = new Circle();
        drawn = false;
    }
public void draw()
    {
        if(!drawn) {
             teeth.changeColor("black");
            teeth.moveHorizontal(-20);
            teeth.moveVertical(30);
            teeth.changeSize(20);
            teeth.makeVisible();
            
            jaw.moveHorizontal(-50);
            jaw.moveVertical(40);
            jaw.changeSize(70);
            jaw.changeColor("blue");
            jaw.makeVisible();
           
    
            hat.changeSize(60, 180);
            hat.moveHorizontal(80);
            hat.moveVertical(-100);
            hat.makeVisible();
    
            head.changeColor("blue");
            head.moveHorizontal(0);
            head.moveVertical(0);
            head.changeSize(120);
            head.makeVisible();
            drawn = true;
        }
    
}
}
