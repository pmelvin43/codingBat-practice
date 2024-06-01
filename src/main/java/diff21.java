package main.java;

public class diff21 {

    //Given an int n, return the absolute difference between n and 21, except return double the absolute difference if n is over 21.

    public int difference21(int n){
        //solution to exercise
        if (n > 21) {
            return 2 * (n - 21);
        } else {
            return -1*(n - 21);
        }
    }

    public static void main(String[] args){

         diff21 theDiff = new diff21();

         int result = theDiff.difference21(-2);

         System.out.println(result);
    }
}
