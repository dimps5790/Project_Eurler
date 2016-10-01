package com.project.euler;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by BrianLinden on 9/27/16.
 */
public class ProblemThree extends MathMethods{

public long primeFactor(long numParam){

    long primeNum=0;

    for(int i =3; i<numParam/2; i=i+2){
        //check if i is a factor of numParam
        long remainder = numParam%i;

        if(remainder==0){
            //if i is a factor, check if i is prime
            boolean iPrime = isPrime(i);

            //if i is prime, set primeNum=i
            if(iPrime){
                primeNum=i;
            }
        }
    }

    //return primeNum
    return primeNum;

}


}
