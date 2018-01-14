package FunctionalProgramming;

public class Factorial {

    public static long factorial(long l) {
        long result = 1l;
        for (long j=2L; j<=l; j++){
            result *=j;
        }
        return result;
    }

    public static void main(String args[]){
        for (long l=1L; l<=10; l++)
            System.out.printf("%d:\t%d\n",l,factorial(l));
    }

}
