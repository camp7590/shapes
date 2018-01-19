import TurtleGraphics.*;

public class Circle extends AbsShape{

    
    protected  double radius;
    
    public Circle(){
        super(0,0);
        radius = 1;
    }
    public Circle(double x, double y, double r){
       super(x,y);
        radius = r;
    }
    
   
    public double area() {
        return radius * radius * Math.PI;
    }

   
    public void draw(StandardPen p) {
        double side = 2.0 * Math.PI * radius / 120;
        p.up();
        //move to right edge of circle
        p.move(xPos + radius, yPos-side/2.0);
        p.setDirection(90); //poiting up
        //draw 120 lines with 120 3-degree turns
        p.down();
        for (int i = 0; i < 120; i++) {
            p.move(side);
            p.turn(3);
        }
    }

    
   

   
    public void stretchBy(double factor) {
        radius *= factor;
    }
    
    public String toString(){
      String s = "Circle\n======\n"  ;
       s += super.toString(); // class absshhape version
      s += "\nRadius = " + radius;
      
      return s;  
    }

    @Override
    public double perimeter() {
        return 2*Math.PI*radius;
    }
    
}
