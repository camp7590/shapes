import TurtleGraphics.*;
public class Wheel extends Circle {
    //inherit x , y and radius from circle
    private int spokes; // new porperty
    
    public Wheel(){
        super(); // calling circle default constroctor
        spokes = 0;
    }
    public Wheel(double x, double y, double r, int s){
        super(x,y,r); // calllingcircleconst , passing up x y and r
        spokes = s;
    }
    
    public void draw(StandardPen p){
        //draw outer part of the wheel
        super.draw(p);
        //draw the spokes
        for (int i = 1; i <= spokes; i++) {
            p.up();
            p.move(xPos, yPos);
            p.down();
            p.setDirection(i * 360.0 / spokes);
            p.move(radius);
        }
    }
    
    public void setSpokes(int s){
        spokes = s;
    }
    public String toString(){
        String s = "Wheel\n======\n"  ;
      s += "XPOS = " + xPos;
      s += "\nYPOS = " + yPos;
      s += "\nRadius = " + radius;
      s += "\nArea = " + area();
      s+= "\nNumber of spokes = " + spokes;
      return s;
    }
}
