public class LeapYear{

  public static void main(String[] args){
    int year = Integer.parseInt(args[0]);
    System.out.println(isLeapYear1(year));
  }

  /* approach 1 */
  public static boolean isLeapYear1(int year){
    return( (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0) );
  }

  /* approach 2 */
  public static boolean isLeapYear2(int year){
    if (year % 400 == 0){
      return(true);
    }
    else if ((year % 4 == 0) && (year % 100 != 0)){
      return(true);
    }
    else{
      return(false);
    }
  } 

  /* approach 3 */
  public static boolean isLeapYear3(int year){
    if (year % 4 == 0){
      if (year % 100 == 0){
        if (year % 400 == 0){
          return(true);
        }
        else{
          return(false);
        }
      }
      else{
        return(true);
      }
    }
    else{
      return(false);
    }
  }


}
