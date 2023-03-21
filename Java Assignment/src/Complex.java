import java.util.Scanner;

public class Complex {
    private double real;
    private double imaginary;

    public Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public void setImaginary(double imaginary) {
        this.imaginary = imaginary;
    }

    public Complex add(Complex other) {
        double realResult = this.real + other.real;
        double imaginaryResult = this.imaginary + other.imaginary;
        return new Complex(realResult, imaginaryResult);
    }

    public Complex subtract(Complex other) {
        double realResult = this.real - other.real;
        double imaginaryResult = this.imaginary - other.imaginary;
        return new Complex(realResult, imaginaryResult);
    }

    public Complex multiply(Complex other) {
        double realResult = (this.real * other.real) - (this.imaginary * other.imaginary);
        double imaginaryResult = (this.real * other.imaginary) + (this.imaginary * other.real);
        return new Complex(realResult, imaginaryResult);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter real part of first complex number: ");
        double real1 = scanner.nextDouble();
        System.out.print("Enter imaginary part of first complex number: ");
        double imaginary1 = scanner.nextDouble();
        Complex complex1 = new Complex(real1, imaginary1);

        System.out.print("Enter real part of second complex number: ");
        double real2 = scanner.nextDouble();
        System.out.print("Enter imaginary part of second complex number: ");
        double imaginary2 = scanner.nextDouble();
        Complex complex2 = new Complex(real2, imaginary2);

        Complex sum = complex1.add(complex2);
        Complex difference = complex1.subtract(complex2);
        Complex product = complex1.multiply(complex2);

        System.out.println("Sum: " + sum.getReal() + " + " + sum.getImaginary() + "i");
        System.out.println("Difference: " + difference.getReal() + " + " + difference.getImaginary() + "i");
        System.out.println("Product: " + product.getReal() + " + " + product.getImaginary() + "i");
    }
}
