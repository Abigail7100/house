
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
    private Square tooth;
    private Square tooth1;
    private Triangle hat;
    private Circle head;
    private Square tooth2;
    private Square tooth3;
    private Square tooth1a;
    private Square tooth2a;
    private Square tooth3a;
    private Square background;
    private Circle eye;
    private Circle eye1;
    private Circle pupil;
    private Circle pupil1;
    private Triangle nose;
    private Triangle nose1;
    private Square bone; 
    private boolean drawn;


    /**
     * Constructor for objects of class MyPicture
     */
    public MyPicture()
    {
        jaw = new Square();
        tooth = new Square();
        hat = new Triangle();  
        head = new Circle();
        tooth1 = new Square();
        tooth2 = new Square();
        tooth3= new Square();
        tooth1a = new Square();
        tooth2a = new Square();
        tooth3a = new Square();
        background = new Square();
        eye = new Circle();
        eye1 = new Circle();
        pupil = new Circle();
        pupil1 = new Circle();
        nose = new Triangle();
        nose1 = new Triangle();
        bone = new Square();
      
        
        drawn = false;
    }
public void draw()
    {
        if(!drawn) {
            background.moveHorizontal(-400);
            background.moveVertical(-120);
            background.changeSize(700);
            background.changeColor("black");
            background.makeVisible();
            
            jaw.moveHorizontal(-50);
            jaw.moveVertical(40);
            jaw.changeSize(70);
            jaw.changeColor("white");
            jaw.makeVisible();
            
            bone.changeSize(30);
            bone.moveHorizontal(-35);
            bone.moveVertical(130);
            bone.changeColor("white");
            bone.makeVisible();
    
            head.changeColor("white");
            head.moveHorizontal(0);
            head.moveVertical(0);
            head.changeSize(120);
            head.makeVisible();
            
            hat.changeSize(60, 180);
            hat.moveHorizontal(80);
            hat.moveVertical(-90);
            hat.makeVisible();
            
             tooth.changeColor("black");
            tooth.moveHorizontal(-40);
            tooth.moveVertical(80);
            tooth.changeSize(10);
            tooth.makeVisible();
            
            tooth1.changeColor("black");
            tooth1.moveHorizontal(-25);
            tooth1.moveVertical(80);
            tooth1.changeSize(10);
            tooth1.makeVisible();
            
            tooth2.changeColor("black");
            tooth2.moveHorizontal(-10);
            tooth2.moveVertical(80);
            tooth2.changeSize(10);
            tooth2.makeVisible();
            
             tooth3.changeColor("black");
            tooth3.moveHorizontal(5);
            tooth3.moveVertical(80);
            tooth3.changeSize(10);
            tooth3.makeVisible();
            
            tooth1a.changeColor("black");
            tooth1a.moveHorizontal(-35);
            tooth1a.moveVertical(90);
            tooth1a.changeSize(10);
            tooth1a.makeVisible();
            
            tooth2a.changeColor("black");
            tooth2a.moveHorizontal(-15);
            tooth2a.moveVertical(90);
            tooth2a.changeSize(10);
            tooth2a.makeVisible();
            
            tooth3a.changeColor("black");
            tooth3a.moveHorizontal(0);
            tooth3a.moveVertical(90);
            tooth3a.changeSize(10);
            tooth3a.makeVisible();
            
            eye.changeColor("black");
            eye.moveHorizontal(35);
            eye.moveVertical(50);
            eye.changeSize(30);
            eye.makeVisible();
            
            eye1.changeColor("black");
            eye1.moveHorizontal(85);
            eye1.moveVertical(50);
            eye1.changeSize(30);
            eye1.makeVisible();
            
            pupil.changeColor("blue");
            pupil.moveHorizontal(45);
            pupil.moveVertical(60);
            pupil.changeSize(15);
            pupil.makeVisible();
            
            pupil1.changeColor("blue");
            pupil1.moveHorizontal(95);
            pupil1.moveVertical(60);
            pupil1.changeSize(15);
            pupil1.makeVisible();
            
            nose.changeColor("black");
            nose.changeSize(5,10 );
            nose.moveHorizontal(90);
            nose.moveVertical(40);
            nose.makeVisible();
            
            nose1.changeColor("black");
            nose1.changeSize(5,10 );
            nose1.moveHorizontal(100);
            nose1.moveVertical(40);
            nose1.makeVisible();
            
            
            drawn = true;
        }
    
}
}
