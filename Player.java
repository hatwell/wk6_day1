public class Player{
  private String name;
  private int jerseyNumber;
  public Player(String name, int jerseyNumber){
    this.name = name;
    this.jerseyNumber = jerseyNumber;
  }

  public String getName(){
    return this.name;
  }

  public int jerseyNumber(){
    return this.jerseyNumber;
  }
}
