public class Compound{
  public static void main(String[] args){

    int x = 4;
    int y = 1;
    int z = -5;

    /* AND logical operator -> True only if both operands are true */

    boolean result = (x <= 2) && (y > 0); //false as 4 is not <= 2
    result = (x > 3) && (x <= 6); //true since both 4>3 and 4<=6 are true

    /* OR logical operator -> True if either operand is true */

    result = (x <= 2) || (y > 0); //true as 1 > 0 is true
    result = (x < -6) || (x > 6); //false as both operands are false

    double height = 67; /* inches */
    int age = 18;


    /* AND logical operator -> True only if both operands are true */
    boolean tall = (height >= 72); // false as height is less than 72
    boolean young = (age < 25); // true as age is less than 25

     /* OR logical operator -> True if either operand is true */

    //int age = 18;
    boolean teenage = (age >= 13) && (age <= 19); //true as age is 18

    boolean notTeenage = (age < 13) || (age > 19);
    //false as age is > 13

    boolean myBirthdayIsToday = false;
    boolean climateChange = true;

    /* true since && gets evaluated before || */
    boolean r1 = 3 > 2 || 3 < 4 && 1 > 6;

    /* parantheses have priority so || goes before && */
    boolean r2 = 3 >= 3 && (2 > -3 || 1 == -1);

    boolean r3 = 2 > 3 || 3 < 4 && 6 > 1;

  }
}
