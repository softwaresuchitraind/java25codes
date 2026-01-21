//Sum of numbers between 0 to 100

import java.util.stream.IntStream;

public class ImperativevsDeclative1 
    {
    public static void main(String[] args) {
        /**
         * Imperative- how style of programming
         */
            int sum = 0;
            for(int i=0;i<=100;i++)
            {
                sum+=i;           
             }
             System.out.println(sum);
        /** 
         * Declarative - what style of programming
         */
       int sum1= IntStream.rangeClosed(0, 100)//it splits the value
       .parallel()
        .sum();
        System.out.println("sum using declarive approach "+sum1);             
    }

}