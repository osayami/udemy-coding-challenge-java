/* 
The Carpet Company has asked you to write an application that calculates the price of carpeting for rectangular rooms. To calculate the price, you multiply the area of the floor (width times length) by the price per square meter of carpet. For example, the area of the floor that is 12 meters long and 10 meters wide is 120 square meters. To cover the floor with a carpet that costs $8 per square meter would cost $960.

1. Write a class with the name Floor. The class needs two fields (instance variables) with name width and length of type double.

The class needs to have one constructor with parameters width and length of type double and it needs to initialize the fields.

In case the width parameter is less than 0 it needs to set the width field value to 0, in case the length parameter is less than 0 it needs to set the length field value to 0.

Write the following methods (instance methods):

* Method named getArea without any parameters, it needs to return the calculated area (width * length).


TEST EXAMPLE

→ TEST CODE:

Carpet carpet = new Carpet(3.5);
Floor floor = new Floor(2.75, 4.0);
Calculator calculator = new Calculator(floor, carpet);
System.out.println("total= " + calculator.getTotalCost());
carpet = new Carpet(1.5);
floor = new Floor(5.4, 4.5);
calculator = new Calculator(floor, carpet);
System.out.println("total= " + calculator.getTotalCost());

→ OUTPUT

total= 38.5
total= 36.45


NOTE: All methods should be defined as public NOT public static.

NOTE: In total, you have to write 3 classes.

NOTE: Do not add a main method to the solution code. */
public class Floor {
    private double width, length;

    public Floor(double width, double length) {
        if (width >= 0)
            this.width = width;
        else
            this.width = 0;
        if (length >= 0)
            this.length = length;
        else
            this.length = 0;
    }

    public double getArea() {
        return (width * length);
    }
}



