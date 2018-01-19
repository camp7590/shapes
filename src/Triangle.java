import TurtleGraphics.*;
public class Triangle extends AbsShape {
      private double x2,y2,x3,y3;
      
      public Triangle(){
       super(0,0);
        x2 = 1;
        y2 = 1;
        x3 = 1;
        y3 = 1;
    }
    
    public Triangle(double x, double y, double xd, double yd,double xa, double ya){
        super(x,y);
        x2 = xd;
        y2 = yd;
        x3 = xa;
        y3 = ya;
       
    }
    public double perimeter(){
        return Math.abs((xPos-x2) * (xPos-x2) + (yPos-y2) * (yPos-y2));
    }
    
    public double area() {
         return Math.abs((xPos*y2-x2*yPos) + (x2*y3-x3*y2) + (x3*yPos-xPos*y3)) / 2;
    }

  
    public void draw(StandardPen p) {
         p.up();
         p.move(xPos,yPos);
         p.down();
         p.move(x2,y2);
         p.move(x3,y3);
         p.move(xPos,yPos);
         
    }

   
    public void stretchBy(double factor) {
        x2 = (x2-xPos) * factor + xPos;
        y2 = (y2-yPos) * factor + yPos;
        x3 = (x3-xPos) * factor + xPos;
        y3 = (y3-yPos) * factor + yPos;
    }
    
     public void move(double xLoc, double yLoc) {
        double xch = xLoc-xPos;
        double ych = yLoc-xPos;
        xPos+=xch;
        yPos+=ych;
        x2+=xch;
        y2+=ych;
        x3+=xch;
        y3+=ych;
    }
     
       public String toString(){
        String s = "Triangle\n======\n"  ;
        s+= super.toString();
        return s;
    }
   

}
