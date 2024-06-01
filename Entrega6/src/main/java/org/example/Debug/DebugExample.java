package org.example.Debug;

public class DebugExample {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        int result = add(a, b);
        System.out.println("Result: " + result);

        int multiResult = multiply(a,b);
        System.out.println("Resultado de la multiplicacion: " + multiResult);
    }
    public static int add(int x, int y) {
        int sum = x + y;
        return sum;
    }

    public static int multiply(int x, int y){
        int mult = x * y;
        return mult;
    }
}
