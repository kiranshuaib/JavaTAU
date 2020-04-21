package chapter6;
/*
 *OBJECTS are structures which contain data in the form of fields and methods. All objects have constructors.
 * constructors rae used to initialize an object or set a state.
 * Write a class that describes the fields and methods of a rectangle
 * Write another class that creates instances of the rectangle class
 * to find the total area of the two rooms in a house.
 */

public class Rectangle {

    //private means we are practicing encapsulation
        private double length;
        private double width;

        public Rectangle(){ //default constructor
            length =0;
            width = 0;
        }

        public Rectangle(double length,double width){
            this.length = length; //can be set this way
            setWidth(width);// can be set this way.these are only here to
                            // demonstrate different alternative options

        }
        public double getLength(){
            return length;
        }

        public void setLength(double length){
            this.length = length;
        }

        public double getWidth(){
            return width;
        }

        public void setWidth(double width){
            this.width = width;
        }

        public double calculatePerimeter(){
            return (2*length) +(2*width);
        }
        public double calculateArea(){
            return length * width;
        }




}
