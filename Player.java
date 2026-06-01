public class Player{

  private String name;
  private int creditPoints = 0;
  private int numLives = 2;

  public Player(String name)
  {
    this.name = name;
    this.creditPoints = 50;
    this.numLives = 2;
  }

  

  public String getName()
  {
    return name;
  }

  public int getCreditPoints()
  {
    return creditPoints;
  }
  public int getNumLives()
  {
    return numLives;
  }
  

  public void setName(String newName)
  {
    this.name = newName;
  }

  public void creditPoints(int amount)
  {
    this.creditPoints += amount;
  }

  
}