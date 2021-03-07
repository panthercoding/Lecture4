public class Prime{
  public static void main(String[] args){
    int p = sumDigits(Integer.parseInt(args[0]));
    System.out.println(p);
  }
  
  public static int sumDigits(int n){
    
    int sum = 0; 
    int digit = 0;
    while (n>0){ /* while we still have digits */
      digit = n % 10; //ones digit
      sum+=digit; //add digit to the sum
      n /= 10; //removes one digit
    }  
    return(sum);
  }

}
