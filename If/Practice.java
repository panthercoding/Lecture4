public class Practice{
  public static void main(String[] args){


    int ranking = 12;
    int numContestants = 100;

    if (ranking <= 0.05 * numContestants){
      System.out.println("Gold Award");
    }
    else if (ranking <= 0.15 * numContestants){
      System.out.println("Silver Award");
    }
    else if (ranking <= 0.30 * numContestants){
      System.out.println("Bronze Award");
    }

    double vaccineEfficacy = 0.94;
    if (vaccineEfficacy > 0.80){
      System.out.println("Test 1 Passed");
    }
    if (vaccineEfficacy > 0.85){
      System.out.println("Test 2 Passed");
    }
    if (vaccineEfficacy > 0.90){
      System.out.println("Test 3 Passed");
    }

  }
}
