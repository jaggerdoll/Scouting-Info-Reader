import java.util.ArrayList;

public class Team
{
	private int teamNum;
	
	private int totalShots, shotsMade;
	private double shootingPercentage;
	
	private int gearsAttempted, gearsMade;
	private double gearPercentage;
	
	private int climbsAttempted, climbsSuccesful;
	private double climbPercentage;
	
	private ArrayList<Integer> matchesPlayedIn;
	
	//private ArrayList<String> eventsAttended;
	
	public Team()
	{
		teamNum = 0000;
		
		totalShots = 0;
		shotsMade = 0;
		shootingPercentage = 0.0;
		
		gearsAttempted = 0;
		gearsMade = 0;
		gearPercentage = 0.0;
		
		climbsAttempted = 0;
		climbsSuccesful = 0;
		climbPercentage = 0.0;
		
		matchesPlayedIn = new ArrayList<Integer>();
		
		//eventsAttended = new ArrayList<String>();
	}

	/**
	 * @return the teamNum
	 */
	public int getTeamNum()
	{
		return teamNum;
	}

	/**
	 * @param teamNum the teamNum to set
	 */
	public void setTeamNum(int teamNum)
	{
		this.teamNum = teamNum;
	}

	/**
	 * @return the totalShots
	 */
	public int getTotalShots() {
		return totalShots;
	}

	/**
	 * @param totalShots the totalShots to set
	 */
	public void setTotalShots(int totalShots)
	{
		this.totalShots = totalShots;
	}

	/**
	 * @return the shotsMade
	 */
	public int getShotsMade()
	{
		return shotsMade;
	}

	/**
	 * @param shotsMade the shotsMade to set
	 */
	public void setShotsMade(int shotsMade)
	{
		this.shotsMade = shotsMade;
	}

	/**
	 * @return the shootingPercentage
	 */
	public double getShootingPercentage()
	{
		return shootingPercentage;
	}

	/**
	 * @param shootingPercentage the shootingPercentage to set
	 */
	public void setShootingPercentage(double shootingPercentage)
	{
		this.shootingPercentage = shootingPercentage;
	}

	/**
	 * @return the gearsAttempted
	 */
	public int getGearsAttempted()
	{
		return gearsAttempted;
	}

	/**
	 * @param gearsAttempted the gearsAttempted to set
	 */
	public void setGearsAttempted(int gearsAttempted)
	{
		this.gearsAttempted = gearsAttempted;
	}

	/**
	 * @return the gearsMade
	 */
	public int getGearsMade()
	{
		return gearsMade;
	}

	/**
	 * @param gearsMade the gearsMade to set
	 */
	public void setGearsMade(int gearsMade)
	{
		this.gearsMade = gearsMade;
	}

	/**
	 * @return the gearPercentage
	 */
	public double getGearPercentage()
	{
		return gearPercentage;
	}

	/**
	 * @param gearPercentage the gearPercentage to set
	 */
	public void setGearPercentage(double gearPercentage)
	{
		this.gearPercentage = gearPercentage;
	}

	/**
	 * @return the climbsAttempted
	 */
	public int getClimbsAttempted()
	{
		return climbsAttempted;
	}

	/**
	 * @param climbsAttempted the climbsAttempted to set
	 */
	public void setClimbsAttempted(int climbsAttempted)
	{
		this.climbsAttempted = climbsAttempted;
	}

	/**
	 * @return the climbsSuccesful
	 */
	public int getClimbsSuccesful()
	{
		return climbsSuccesful;
	}

	/**
	 * @param climbsSuccesful the climbsSuccesful to set
	 */
	public void setClimbsSuccesful(int climbsSuccesful)
	{
		this.climbsSuccesful = climbsSuccesful;
	}

	/**
	 * @return the climbPercentage
	 */
	public double getClimbPercentage()
	{
		return climbPercentage;
	}

	/**
	 * @param climbPercentage the climbPercentage to set
	 */
	public void setClimbPercentage(double climbPercentage)
	{
		this.climbPercentage = climbPercentage;
	}

	/**
	 * @return the matchesPlayedIn
	 */
	public ArrayList<Integer> getMatchesPlayedIn()
	{
		return matchesPlayedIn;
	}

	/**
	 * @param matchesPlayedIn the matchesPlayedIn to set
	 */
	public void setMatchesPlayedIn(ArrayList<Integer> matchesPlayedIn)
	{
		this.matchesPlayedIn = matchesPlayedIn;
	}
	
	
}
