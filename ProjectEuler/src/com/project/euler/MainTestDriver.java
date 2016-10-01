package com.project.euler;

/**
 * Created by BrianLinden on 9/26/16.
 */
public class MainTestDriver {

    public static void main(String[] args) {

        //ProblemOne problemOne = new ProblemOne();
        //int oneAnswer = problemOne.oneSum();
        //System.out.println("Answer to Problem One is = "+oneAnswer);

//        ProblemTwo problemTwo = new ProblemTwo();
//        int twoAnswer = problemTwo.twoFib();
//        System.out.println();
//        System.out.println("Answer to Problem Two is = "+twoAnswer);

        ProblemThree problemThree = new ProblemThree();
        //problemThree.factorCheck(600851475143L);
        long largePrimeFactor = problemThree.primeFactor(600851475143L);
        System.out.println("The largest prime factor is: "+largePrimeFactor);


    }
}
