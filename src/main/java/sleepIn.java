package main.java;

public class sleepIn {

    //The parameter weekday is true if it is a weekday, and the parameter vacation is true if we are on vacation.
    // We sleep in if it is not a weekday or we're on vacation. Return true if we sleep in.

    public boolean sleepsIn(boolean weekday, boolean vacation) {
        //solution to exercise
        return !weekday || vacation;
    }

    public static void main(String[] args){

        sleepIn sleeps = new sleepIn();

        boolean sleeping = sleeps.sleepsIn(true, false);

        System.out.println(sleeping);
    }
}
