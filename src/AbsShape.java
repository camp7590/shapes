import TurtleGraphics.*;
 abstract public class AbsShape {
       protected double xPos, yPos;
       
       public AbsShape(){
           xPos = 0;
           yPos = 0;
       }
       
        public AbsShape(double x, double y){
           xPos = x;
           yPos = y;
       }
        //abstrat method is not definied in parent
        // it forceds  children to define it
        // later you wont need to cast to run this
        //from child to object
        public abstract double area();
        public abstract double perimeter();
        public abstract void draw(StandardPen p);
           public abstract void stretchBy(double factor);
         //final means that cant be over ridden
        //by children class or even added to
       final public double getXPos() {
             return xPos;
        }

   
        final public double getYPos() {
         return yPos;
        }
        
       public void move(double xLoc, double yLoc) {
        xPos = xLoc;
        yPos = yLoc;
        }
      public String toString(){
        String str = "XPos " + xPos;
        str += "\nYPos:  " + yPos;
        str += "\nArea: " + area();
        str += "\nPerimeter: " + perimeter();
        return str;
      }
}
