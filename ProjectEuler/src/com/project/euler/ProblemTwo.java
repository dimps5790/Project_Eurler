package com.project.euler;

/**
 * Created by BrianLinden on 9/26/16.
 */
public class ProblemTwo extends MathMethods{

    private int prevNum=1;
    private int nextNum=2;
    private int fibNum=0;
    private int sum=0;

    public int twoFib(){
        while(prevNum<4000000){

            fibNum=prevNum;
            prevNum=nextNum;
            nextNum=fibNum+prevNum;


            System.out.print(fibNum+", ");

            if(evenCheck(fibNum)){
                sum=sum+fibNum;
            }

        }

        return sum;
    }

/*    public boolean evenCheck(int number){
        int remainder = number%2;

        if(remainder==0){
            return true;
        }else{
            return false;
        }
    }*/
}
