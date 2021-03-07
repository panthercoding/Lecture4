public class Prime{
  public static void main(String[] args){
    boolean p = isPrime(Integer.parseInt(args[0]));
    System.out.println(p);
  }

  public static boolean isPrime(int n){
    /* a number is prime if it is divisible by 
    only 1 and itself, which means it has 2 divisors */
    int numDivisors = 0;

    /* search for all possible divisors between 1 and n */
    for (int d=1; d <= n; d++){
      if (n % d == 0){ /* found a divisor */
        numDivisors++;
      }
    }
    return(numDivisors==2);
  }

}
