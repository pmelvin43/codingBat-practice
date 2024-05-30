package main.java;

public class warmupOne {


    public boolean sleepIn(boolean weekday, boolean vacation) {
        //solution to exercise
        return !weekday || vacation;
    }

    public static void main(String[] args){

        warmupOne sleeps = new warmupOne();

        boolean sleeping = sleeps.sleepIn(true, false);

        System.out.println(sleeping);
    }
}
