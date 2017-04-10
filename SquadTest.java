import static org.junit.Assert.assertEquals;
import org.junit.*;

public class SquadTest{
  Team team;
  Player player;
  Squad squad;

  @Before
  public void before(){
    team = new Team("Cleveland Cavaliers");
    squad = new Squad();
    player = new Player("Kevin Love", 0);
  }


}
