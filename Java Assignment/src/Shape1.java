class Shape2 {
  public void printShape() {
    System.out.println("This is shape");
  }
}

class Rectangle1 extends Shape2 {
  public void printRectangle() {
    System.out.println("This is rectangular shape");
  }
}

class Circle extends Shape2 {
  public void printCircle() {
    System.out.println("This is circular shape");
  }
}

class Square1 extends Rectangle1 {
  public void printSquare() {
    System.out.println("Square is a rectangle");
  }
}

public class Shape1 {
  public static void main(String[] args) {
    Square1 square = new Square1();
    square.printShape();        // calling method of Shape class
    square.printRectangle();    // calling method of Rectangle class
    square.printSquare();       // calling method of Square class
  }
}
