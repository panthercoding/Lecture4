public class relation{
  public static void main(String[] args){
    
    int numPlayers = 10;
    System.out.println(numPlayers == 10); // prints true since numPlayer is 10
    System.out.println(numPlayers > 20); // prints false since numPlayers is not > 20
    System.out.println(numPlayers <= 11); //prints true; as 10 <= 10
    System.out.println(numPlayers != 4); //prints true since 10 is not equal to 4

    boolean videoGameOn = false; // initially false

    videoGameOn = !videoGameOn; //it is now true
    videoGameOn = !videoGameOn; //it is now false

    int age = 10;
    boolean stillBelievesSanta = !(age > 10); //false

  }
}
