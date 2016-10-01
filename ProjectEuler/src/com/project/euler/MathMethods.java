package com.project.euler;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by BrianLinden on 9/27/16.
 */
public class MathMethods {

    public boolean evenCheck(int number){
        int remainder = number%2;

        if(remainder==0){
            return true;
        }else return false;
    }

    public List<Long>  factorCheckList(long number){

        List<Long> factors = new ArrayList<Long>();

        long remainder=0;
        for(long i=2; i<number/2; i++){
            remainder=number%i;

            if(remainder==0){
                factors.add(i);
            }
        }
        return factors;
    }




    public boolean isPrime(long number){

        for(int i =2; i<number/2; i++){
            long remainder = number%i;
            if(remainder==0){
                return false;
            }
        }
        return true;
    }




}
