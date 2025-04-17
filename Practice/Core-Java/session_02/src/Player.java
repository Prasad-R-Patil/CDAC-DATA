
public class Player {
	private String playerName;
	private String playerCountry;
	
	
	public Player()
	{
		this("Dhoni");
		playerCountry="india";
		
	}
	
	public Player(String playerName)
	{
		this.playerName=playerName;
	}
	
	public String display()
	{
		return "Player Name = "+playerName+" Player Country = "+playerCountry; 
	}
	
	
	public static void main(String [] args)
	{
		Player p1=new Player();
		
		System.out.println(p1.display());
	}
}
