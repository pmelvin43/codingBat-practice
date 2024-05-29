package main.java;

public class SimpleCalculator {

    public int add(int numberA, int numberB) {
        return numberA + numberB;
    }

    public static void main(String[] args) {
        int x = 1;
        int y = 2;

        SimpleCalculator newCalc = new SimpleCalculator();

        int result = newCalc.add(x, y);

        System.out.println(result);
    }
}
