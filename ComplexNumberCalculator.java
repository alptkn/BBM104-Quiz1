package Quiz1;

class ComplexNumber {
    private double real;
    private double imaginary;

    ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal() {
        // code here 
    }

    public double getImaginary() {
        // code here 
    }

    public void setReal(double real) {
        // code here 
    }

    public void setImaginary(double imaginary) {
        // code here 
    }

    public String toString(){
       // code here 
    }

}


public class ComplexNumberCalculator {

    private ComplexNumber num1;
    private ComplexNumber num2;

    ComplexNumberCalculator(double real_1, double imaginary_1, double real_2, double imaginary_2){
        // code here 
    }

    public boolean equal(){
        // code here 
    }

    public ComplexNumber add(){

        // code here 
    }

    public ComplexNumber sub(){
        // code here 
    }

    public ComplexNumber mul(){
        // code here 
    }

    public static void main(String[] args) {
        int real_1 = Integer.parseInt(args[0]);
        int imag_1 = Integer.parseInt(args[1]);
        int real_2 = Integer.parseInt(args[2]);
        int imag_2 = Integer.parseInt(args[3]);
        String operator = args[4];

        // code here 
    }


}
