import java.util.*;

public class Controller 
{
	private Level level1;
	
	public Controller()
	{
		level1 = null;
	}
	
	public static void main(String[] args)
	{
		Controller master = new Controller();
		master.createLevels();
		View viewer = new View(master.level1);
	}
	
	public void createLevels()
	{
		//level 1
		ArrayList<Platform> plats = new ArrayList<Platform>();
		ArrayList<Cloud> clouds = new ArrayList<Cloud>();
		
		//create platforms for level1
		plats.add(new Platform(400, 700, 100, 100, "lolli"));
		plats.add(new Platform(225, 600, 125, 125, "lolli2"));
		plats.add(new Platform(500, 200, 150, 110, "flower"));
		plats.add(new Platform(1200, 200, 100, 50, "platform"));
		plats.add(new Platform(1100, 200, 100, 50, "platform"));
		
		plats.add(new Cloud(300, 300, 120, 60, "cloud", 200, 400));
		
		//instantiate level 1
		level1 = new Level(plats);
		
	}
}
