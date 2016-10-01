package com.project.euler;

/**
 * Created by BrianLinden on 9/26/16.
 */
public class ProblemOne{


        private int sum=0;

        public int oneSum(){
            for (int i=0; i<1000; i++)    {
                 if (i % 5 == 0 | i % 3 == 0) {
                    sum = sum + i;
                 }

            }

            return sum;
         }



    }
