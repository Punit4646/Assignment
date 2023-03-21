public class PrintArea {
    public void printArea(int side) {
        int area = side * side;
        System.out.println("Area of square with side " + side + " = " + area);
    }

    public void printArea(int length, int breadth) {
        int area = length * breadth;
        System.out.println("Area of rectangle with length " + length + " and breadth " + breadth + " = " + area);
    }

    public static void main(String[] args) {
        PrintArea printer = new PrintArea();
        printer.printArea(5); // prints area of square with side 5
        printer.printArea(4, 8); // prints area of rectangle with length 4 and breadth 8
    }
}
