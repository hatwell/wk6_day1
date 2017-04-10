import static org.junit.Assert.assertEquals;
import org.junit.*;

public static void main(String[] args){

  public TeamTest{
  Team team;
  Player player;

  @Before
  public void before(){
    team = new Team("Cleveland Cavaliers");
    player = new Player("Kevin Love", 0);
  }

  @Test
  public void hasName(){
    assertEquals("Cleveland Cavaliers", team.getName());
  }

}
