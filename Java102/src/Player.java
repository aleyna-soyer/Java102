
public class Player {
	static int OnlinePlayers;
	Player(){
		OnlinePlayers++;
	}
	
	public static void main(String[] args) {
		
		Player p1=new Player();
		Player p2=new Player();
		Player p3=new Player();
		
		System.out.println("Online Players: " + Player.OnlinePlayers);
	}
}
