public class Loops1{
  public static void main(String[] args){

    for (int i = 0; i < 4; i++){
      System.out.println("Hello World");
    }

    int j = 0;
    /* keep running loop unless j<4 is false */
    while (j<4){
      System.out.println("Hello World")
      j++; /* increase j by 1 each time the loop runs */
    }

    int sum = 0;
    /* iterates between i = 1 and i = 10 */ 
    for (int i = 1; i <= 10; i++){
      sum = sum + i; // increase sum by i
    }
    System.out.println(sum);

    

  }
}
