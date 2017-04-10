public class Team {
  private String name;
  private Player[] players;

  public Team(String name){
    this.name = name;
    this.players = new Player[5];
  }

  public String getName(){
    return this.name;
  }

  public Player[] getPlayers(){
    return this.players;
  }

  public void draft(Player player){
    if(this.players.length >=5){
      return;
    }
    int playerCount = this.players.length;
    this.players[playerCount] = player;
  }


  }
