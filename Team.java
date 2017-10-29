import java.util.ArrayList;

public class Team
{
	private int teamNum;
	
	private int teleOpLowerShotsAttempted, teleOpLowerShotsMade;
	private double teleOpLowerShootingPercentage;
	private boolean canShootLow;
	
	private int teleOpHigherShotsAttempted, teleOpHigherShotsMade;
	private double teleOpHigherShootingPercentage;
	private boolean canShootHigh;
	
	private int teleOpGearsAttempted, teleOpGearsMade, teleOpRotorsStarted, teleOpEstimatedTeamGearsMade;
	private double teleOpGearPercentage, teleOpRotorsStartedPercentage;
	private boolean canScoreGears;
	
	private int autoLowerShotsAttempted, autoLowerShotsMade;
	private double autoLowerShootingPercentage;
	private boolean canAutoShootLow;
	
	private int autoHigherShotsAttempted, autoHigherShotsMade;
	private double autoHigherShootingPercentage;
	private boolean canAutoShootHigh;
	
	private int autoGearsAttempted, autoGearsMade, autoRotorsStarted;

	double autoEstimatedTeamGearsMade;
	private double autoGearPercentage, autoRotorsStartedPercentage;
	private boolean canAutoScoreGears;
	
	private int climbsAttempted, climbsSuccessful;
	private double climbPercentage;
	private boolean canClimb;
	
	private double totalScore, autoTotalScore, teleOpTotalScore, averageScore, autoAverageScore, teleOpAverageScore;
	
	private ArrayList<Integer> matchesPlayedIn;
	private int matchesPlayed;
	
	//private ArrayList<String> eventsAttended;
	
	public Team()
	{
		teamNum = 0000;
		
		teleOpLowerShotsAttempted = 0;
		teleOpLowerShotsMade = 0;
		teleOpLowerShootingPercentage = 0.0;
		canShootLow = false;
		
		teleOpHigherShotsAttempted = 0;
		teleOpHigherShotsMade = 0;
		teleOpHigherShootingPercentage = 0.0;
		canShootHigh = false;
		
		teleOpGearsAttempted = 0;
		teleOpGearsMade = 0;
		teleOpRotorsStarted = 0;
		teleOpEstimatedTeamGearsMade = 0;
		teleOpGearPercentage = 0.0;
		teleOpRotorsStartedPercentage = 0.0;
		canScoreGears = false;
		
		autoLowerShotsAttempted = 0;
		autoLowerShotsMade = 0;
		autoLowerShootingPercentage = 0.0;
		canAutoShootLow = false;
		
		autoHigherShotsAttempted = 0;
		autoHigherShotsMade = 0;
		autoHigherShootingPercentage = 0.0;
		canAutoShootHigh = false;
		
		autoGearsAttempted = 0;
		autoGearsMade = 0;
		autoRotorsStarted = 0;
		autoEstimatedTeamGearsMade = 0;
		autoGearPercentage = 0.0;
		autoRotorsStartedPercentage = 0.0;
		canAutoScoreGears = false;
		
		climbsAttempted = 0;
		climbsSuccessful = 0;
		climbPercentage = 0.0;
		canClimb = false;
		
		totalScore = 0.0;
		averageScore = 0.0;
		
		autoTotalScore = 0.0;
		autoAverageScore = 0.0;
		
		teleOpTotalScore = 0.0;
		teleOpAverageScore = 0.0;
		
		
		matchesPlayedIn = new ArrayList<Integer>();
		
		//eventsAttended = new ArrayList<String>();
	}
	
	public Team( int teamNumber )
	{
		teamNum = teamNumber;
		
		teleOpLowerShotsAttempted = 0;
		teleOpLowerShotsMade = 0;
		teleOpLowerShootingPercentage = 0.0;
		canShootLow = false;
		
		teleOpHigherShotsAttempted = 0;
		teleOpHigherShotsMade = 0;
		teleOpHigherShootingPercentage = 0.0;
		canShootHigh = false;
		
		teleOpGearsAttempted = 0;
		teleOpGearsMade = 0;
		teleOpRotorsStarted = 0;
		teleOpEstimatedTeamGearsMade = 0;
		teleOpGearPercentage = 0.0;
		teleOpRotorsStartedPercentage = 0.0;
		canScoreGears = false;
		
		autoLowerShotsAttempted = 0;
		autoLowerShotsMade = 0;
		autoLowerShootingPercentage = 0.0;
		canAutoShootLow = false;
		
		autoHigherShotsAttempted = 0;
		autoHigherShotsMade = 0;
		autoHigherShootingPercentage = 0.0;
		canAutoShootHigh = false;
		
		autoGearsAttempted = 0;
		autoGearsMade = 0;
		autoRotorsStarted = 0;
		autoEstimatedTeamGearsMade = 0;
		autoGearPercentage = 0.0;
		autoRotorsStartedPercentage = 0.0;
		canAutoScoreGears = false;
		
		climbsAttempted = 0;
		climbsSuccessful = 0;
		climbPercentage = 0.0;
		canClimb = false;
		
		totalScore = 0.0;
		averageScore = 0.0;
		
		autoTotalScore = 0.0;
		autoAverageScore = 0.0;
		
		teleOpTotalScore = 0.0;
		teleOpAverageScore = 0.0;
		
		
		matchesPlayedIn = new ArrayList<Integer>();
		
		//eventsAttended = new ArrayList<String>();
	}
	
	public Team( int teamNumber, int teleOpLowerShotsAttempted, int teleOpLowerShotsMade, double teleOpLowerShootingPercentage,
			boolean canShootLow, int teleOpHigherShotsAttempted, int teleOpHigherShotsMade, 
			double teleOpHigherShootingPercentage, boolean canShootHigh, int teleOpGearsAttempted,
			int teleOpGearsMade, int teleOpRotorsStarted, double teleOpGearPercentage,
			boolean canScoreGears, int autoLowerShotsAttempted, int autoLowerShotsMade, double autoLowerShootingPercentage,
			boolean canAutoShootLow, int autoHigherShotsAttempted, int autoHigherShotsMade,
			double autoHigherShootingPercentage, boolean canAutoShootHigh, int autoGearsAttempted,
			int autoGearsMade, int autoRotorsStarted, double autoGearPercentage,
			boolean canAutoScoreGears, int climbsAttempted, int climbsSuccessful, double climbPercentage, boolean canClimb,
			double totalScore, double autoTotalScore, double teleOpTotalScore, double averageScore,
			double autoAverageScore, double teleOpAverageScore, ArrayList<Integer> matchesPlayedIn, int matchesPlayed )
	{
		teamNum = teamNumber;
		
		this.teleOpLowerShotsAttempted = teleOpLowerShotsAttempted;
		this.teleOpLowerShotsMade = teleOpLowerShotsMade;
		this.teleOpLowerShootingPercentage = teleOpLowerShootingPercentage;
		this.canShootLow = canShootLow;
		
		this.teleOpHigherShotsAttempted = teleOpHigherShotsAttempted;
		this.teleOpHigherShotsMade = teleOpHigherShotsMade;
		this.teleOpHigherShootingPercentage = teleOpHigherShootingPercentage;
		this.canShootHigh = canShootHigh;
		
		this.teleOpGearsAttempted = teleOpGearsAttempted;
		this.teleOpGearsMade = teleOpGearsMade;
		this.teleOpRotorsStarted = teleOpRotorsStarted;
		this.teleOpGearPercentage = teleOpGearPercentage;
				
		if( teleOpRotorsStarted % 4 == 0 )
			teleOpRotorsStartedPercentage = teleOpGearsMade / ( 12 - (int) ( autoRotorsStarted * 1.5 ) );
		else if( teleOpRotorsStarted % 3 == 0 )
			teleOpRotorsStartedPercentage = teleOpGearsMade / ( 6 - (int) ( autoRotorsStarted * 1.5 ) );
		else if( teleOpRotorsStarted % 2 == 0 )
			teleOpRotorsStartedPercentage = teleOpGearsMade / ( 3 - (int) ( autoRotorsStarted * 1.5 ) );
		else if( teleOpRotorsStarted > 0 )
			teleOpRotorsStartedPercentage = teleOpGearsMade / ( 1 - (int) ( autoRotorsStarted * 1.5 ) );
		else
			teleOpRotorsStartedPercentage = 0;
		
		this.canScoreGears = canScoreGears;
		
		this.autoLowerShotsAttempted = autoLowerShotsAttempted;
		this.autoLowerShotsMade = autoLowerShotsMade;
		this.autoLowerShootingPercentage = autoLowerShootingPercentage;
		this.canAutoShootLow = canAutoShootLow;
		
		this.autoHigherShotsAttempted = autoHigherShotsAttempted;
		this.autoHigherShotsMade = autoHigherShotsMade;
		this.autoHigherShootingPercentage = autoHigherShootingPercentage;
		this.canAutoShootHigh = canAutoShootHigh;
		
		this.autoGearsAttempted = autoGearsAttempted;
		this.autoGearsMade = autoGearsMade;
		this.autoRotorsStarted = autoRotorsStarted;
		this.autoGearPercentage = autoGearPercentage;

		if( autoRotorsStarted == 2 )
			autoRotorsStartedPercentage = autoGearsMade / 3;
		else if( autoRotorsStarted == 1 )
			autoRotorsStartedPercentage = autoGearsMade / 1;
		else
			autoRotorsStartedPercentage = 0;
		
		this.canAutoScoreGears = canAutoScoreGears;
		
		this.climbsAttempted = climbsAttempted;
		this.climbsSuccessful = climbsSuccessful;
		this.climbPercentage = climbPercentage;
		this.canClimb = canClimb;
		
		this.totalScore = totalScore;
		this.averageScore = averageScore;
		
		this.autoTotalScore = autoTotalScore;
		this.autoAverageScore = autoAverageScore;
		
		this.teleOpTotalScore = teleOpTotalScore;
		this.teleOpAverageScore = teleOpAverageScore;
		
		
		this.matchesPlayedIn = matchesPlayedIn;
		
		//this.eventsAttended = eventAttended;
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
	 * @return the teleOpHigherShotsAttempted
	 */
	public int getTeleOpHigherShotsAttempted()
	{
		return teleOpHigherShotsAttempted;
	}

	/**
	 * @param teleOpHigherShotsAttempted the teleOpHigherShotsAttempted to set
	 */
	public void setTeleOpHigherShotsAttempted(int teleOpHigherShotsAttempted)
	{
		this.teleOpHigherShotsAttempted = teleOpHigherShotsAttempted;
	}

	/**
	 * @return the teleOpHigherShotsMade
	 */
	public int getTeleOpHigherShotsMade()
	{
		return teleOpHigherShotsMade;
	}

	/**
	 * @param teleOpHigherShotsMade the teleOpHigherShotsMade to set
	 */
	public void setTeleOpHigherShotsMade(int teleOpHigherShotsMade)
	{
		this.teleOpHigherShotsMade = teleOpHigherShotsMade;
	}

	/**
	 * @return the teleOpHigherShootingPercentage
	 */
	public double getTeleOpHigherShootingPercentage()
	{
		if( teleOpHigherShotsAttempted != 0 )
			teleOpHigherShootingPercentage = (double) ( teleOpHigherShotsMade / teleOpHigherShotsAttempted * 100 );
		
		return teleOpHigherShootingPercentage;
	}

	/**
	 * @param teleOpHigherShootingPercentage the teleOpHigherShootingPercentage to set
	 */
	public void setTeleOpHigherShootingPercentage(double teleOpHigherShootingPercentage)
	{
		this.teleOpHigherShootingPercentage = teleOpHigherShootingPercentage;
	}

	/**
	 * @return the teleOpGearsAttempted
	 */
	public int getTeleOpGearsAttempted()
	{
		return teleOpGearsAttempted;
	}

	/**
	 * @param teleOpGearsAttempted the teleOpGearsAttempted to set
	 */
	public void setTeleOpGearsAttempted(int teleOpGearsAttempted)
	{
		this.teleOpGearsAttempted = teleOpGearsAttempted;
	}

	/**
	 * @return the teleOpGearsMade
	 */
	public int getTeleOpGearsMade()
	{
		return teleOpGearsMade;
	}

	/**
	 * @param teleOpGearsMade the teleOpGearsMade to set
	 */
	public void setTeleOpGearsMade(int teleOpGearsMade)
	{
		this.teleOpGearsMade = teleOpGearsMade;
	}

	/**
	 * @return the gearPercentage
	 */
	public double getTeleOpGearPercentage()
	{
		if( teleOpGearsAttempted != 0 )
			teleOpGearPercentage = (double) ( teleOpGearsMade / teleOpGearsAttempted * 100);
		
		return teleOpGearPercentage;
	}

	/**
	 * @param gearPercentage the gearPercentage to set
	 */
	public void setTeleOpGearPercentage(double teleOpGearPercentage)
	{
		this.teleOpGearPercentage = teleOpGearPercentage;
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
	 * @return the climbsSuccessful
	 */
	public int getClimbsSuccessful()
	{
		return climbsSuccessful;
	}

	/**
	 * @param climbsSuccessful the climbsSuccessful to set
	 */
	public void setClimbsSuccessful(int climbsSuccessful)
	{
		this.climbsSuccessful = climbsSuccessful;
	}

	/**
	 * @return the climbPercentage
	 */
	public double getClimbPercentage()
	{
		if( climbsAttempted != 0 )
			climbPercentage = (double) ( climbsSuccessful / climbsAttempted );
				
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

	/**
	 * @return the teleOpLowerteleOpHigherShotsMade
	 */
	public int getTeleOpLowerShotsMade()
	{
		return teleOpLowerShotsMade;
	}

	/**
	 * @param teleOpLowerteleOpHigherShotsMade the teleOpLowerteleOpHigherShotsMade to set
	 */
	public void setTeleOpLowerShotsMade(int teleOpLowerShotsMade)
	{
		this.teleOpLowerShotsMade = teleOpLowerShotsMade;
	}

	/**
	 * @return the lowerteleOpHigherShootingPercentage
	 */
	public double getTeleOpLowerShootingPercentage()
	{
		if( teleOpLowerShotsAttempted != 0 )
			teleOpLowerShootingPercentage = (double) ( teleOpLowerShotsMade / teleOpLowerShotsAttempted );
		
		return teleOpLowerShootingPercentage;
	}

	/**
	 * @param lowerTeleOpHigherShootingPercentage the lowerteleOpHigherShootingPercentage to set
	 */
	public void setTeleOpLowerShootingPercentage(double teleOpLowerShootingPercentage)
	{
		this.teleOpLowerShootingPercentage = teleOpLowerShootingPercentage;
	}

	/**
	 * @return the canShootLow
	 */
	public boolean isCanShootLow()
	{
		return canShootLow;
	}

	/**
	 * @param canShootLow the canShootLow to set
	 */
	public void setCanShootLow(boolean canShootLow)
	{
		this.canShootLow = canShootLow;
	}

	/**
	 * @return the canShootHigh
	 */
	public boolean isCanShootHigh()
	{
		return canShootHigh;
	}

	/**
	 * @param canShootHigh the canShootHigh to set
	 */
	public void setCanShootHigh(boolean canShootHigh)
	{
		this.canShootHigh = canShootHigh;
	}

	/**
	 * @return the canScoreGears
	 */
	public boolean isCanScoreGears()
	{
		return canScoreGears;
	}

	/**
	 * @param canScoreGears the canScoreGears to set
	 */
	public void setCanScoreGears(boolean canScoreGears)
	{
		this.canScoreGears = canScoreGears;
	}

	/**
	 * @return the canClimb
	 */
	public boolean isCanClimb()
	{
		return canClimb;
	}

	/**
	 * @param canClimb the canClimb to set
	 */
	public void setCanClimb(boolean canClimb)
	{
		this.canClimb = canClimb;
	}

	/**
	 * @return the totalScore
	 */
	public double getTotalScore()
	{
		totalScore = (double) ( getTeleOpTotalScore() + getAutoTotalScore() );
		
		return totalScore;
	}

	/**
	 * @param totalScore the totalScore to set
	 */
	public void setTotalScore(double totalScore)
	{
		this.totalScore = totalScore;
	}

	/**
	 * @return the averageScore
	 */
	public double getAverageScore()
	{
		averageScore = (double) ( getTotalScore() / getMatchesPlayed() );
		
		return averageScore;
	}

	/**
	 * @param averageScore the averageScore to set
	 */
	public void setAverageScore(double averageScore)
	{
		this.averageScore = averageScore;
	}

	/**
	 * @return the teleOpLowerShotsAttempted
	 */
	public int getTeleOpLowerShotsAttempted()
	{
		return teleOpLowerShotsAttempted;
	}

	/**
	 * @param teleOpLowerShotsAttempted the teleOpLowerShotsAttempted to set
	 */
	public void setTeleOpLowerShotsAttempted(int teleOpLowerShotsAttempted)
	{
		this.teleOpLowerShotsAttempted = teleOpLowerShotsAttempted;
	}

	/**
	 * @return the teleOpRotorsStarted
	 */
	public int getTeleOpRotorsStarted()
	{		
		return teleOpRotorsStarted;
	}

	/**
	 * @param teleOpRotorsStarted the teleOpRotorsStarted to set
	 */
	public void setTeleOpRotorsStarted(int teleOpRotorsStarted)
	{
		this.teleOpRotorsStarted = teleOpRotorsStarted;
	}

	/**
	 * @return the autoLowerShotsAttempted
	 */
	public int getAutoLowerShotsAttempted()
	{
		return autoLowerShotsAttempted;
	}

	/**
	 * @param autoLowerShotsAttempted the autoLowerShotsAttempted to set
	 */
	public void setAutoLowerShotsAttempted(int autoLowerShotsAttempted)
	{
		this.autoLowerShotsAttempted = autoLowerShotsAttempted;
	}

	/**
	 * @return the autoLowerShotsMade
	 */
	public int getAutoLowerShotsMade()
	{
		return autoLowerShotsMade;
	}

	/**
	 * @param autoLowerShotsMade the autoLowerShotsMade to set
	 */
	public void setAutoLowerShotsMade(int autoLowerShotsMade)
	{
		this.autoLowerShotsMade = autoLowerShotsMade;
	}

	/**
	 * @return the autoLowerShootingPercentage
	 */
	public double getAutoLowerShootingPercentage()
	{
		if( autoLowerShotsAttempted != 0 )
			autoLowerShootingPercentage = (double) ( autoLowerShotsMade / autoLowerShotsAttempted * 100 );
		
		return autoLowerShootingPercentage;
	}

	/**
	 * @param autoLowerShootingPercentage the autoLowerShootingPercentage to set
	 */
	public void setAutoLowerShootingPercentage(double autoLowerShootingPercentage)
	{
		this.autoLowerShootingPercentage = autoLowerShootingPercentage;
	}

	/**
	 * @return the canAutoShootLow
	 */
	public boolean isCanAutoShootLow()
	{
		return canAutoShootLow;
	}

	/**
	 * @param canAutoShootLow the canAutoShootLow to set
	 */
	public void setCanAutoShootLow(boolean canAutoShootLow)
	{
		this.canAutoShootLow = canAutoShootLow;
	}

	/**
	 * @return the autoHigherShotsAttempted
	 */
	public int getAutoHigherShotsAttempted()
	{
		return autoHigherShotsAttempted;
	}

	/**
	 * @param autoHigherShotsAttempted the autoHigherShotsAttempted to set
	 */
	public void setAutoHigherShotsAttempted(int autoHigherShotsAttempted)
	{
		this.autoHigherShotsAttempted = autoHigherShotsAttempted;
	}

	/**
	 * @return the autoHigherShotsMade
	 */
	public int getAutoHigherShotsMade()
	{
		return autoHigherShotsMade;
	}

	/**
	 * @param autoHigherShotsMade the autoHigherShotsMade to set
	 */
	public void setAutoHigherShotsMade(int autoHigherShotsMade)
	{
		this.autoHigherShotsMade = autoHigherShotsMade;
	}

	/**
	 * @return the autoHigherShootingPercentage
	 */
	public double getAutoHigherShootingPercentage()
	{
		if( autoHigherShotsAttempted != 0 )
			autoHigherShootingPercentage = (double) ( autoHigherShotsMade / autoHigherShotsAttempted * 100 );
		
		return autoHigherShootingPercentage;
	}

	/**
	 * @param autoHigherShootingPercentage the autoHigherShootingPercentage to set
	 */
	public void setAutoHigherShootingPercentage(double autoHigherShootingPercentage)
	{
		this.autoHigherShootingPercentage = autoHigherShootingPercentage;
	}

	/**
	 * @return the canAutoShootHigh
	 */
	public boolean isCanAutoShootHigh()
	{
		return canAutoShootHigh;
	}

	/**
	 * @param canAutoShootHigh the canAutoShootHigh to set
	 */
	public void setCanAutoShootHigh(boolean canAutoShootHigh)
	{
		this.canAutoShootHigh = canAutoShootHigh;
	}

	/**
	 * @return the autoGearsAttempted
	 */
	public int getAutoGearsAttempted()
	{
		return autoGearsAttempted;
	}

	/**
	 * @param autoGearsAttempted the autoGearsAttempted to set
	 */
	public void setAutoGearsAttempted(int autoGearsAttempted)
	{
		this.autoGearsAttempted = autoGearsAttempted;
	}

	/**
	 * @return the autoGearsMade
	 */
	public int getAutoGearsMade()
	{
		return autoGearsMade;
	}

	/**
	 * @param autoGearsMade the autoGearsMade to set
	 */
	public void setAutoGearsMade(int autoGearsMade)
	{
		this.autoGearsMade = autoGearsMade;
	}

	/**
	 * @return the autoRotorsStarted
	 */
	public int getAutoRotorsStarted()
	{
		return autoRotorsStarted;
	}

	/**
	 * @param autoRotorsStarted the autoRotorsStarted to set
	 */
	public void setAutoRotorsStarted(int autoRotorsStarted)
	{
		this.autoRotorsStarted = autoRotorsStarted;
	}

	/**
	 * @return the autoGearPercentage
	 */
	public double getAutoGearPercentage()
	{
		if( autoGearsAttempted != 0 )
			autoGearPercentage = (double) ( autoGearsMade / autoGearsAttempted * 100 );
		
		return autoGearPercentage;
	}

	/**
	 * @param autoGearPercentage the autoGearPercentage to set
	 */
	public void setAutoGearPercentage(double autoGearPercentage)
	{
		this.autoGearPercentage = autoGearPercentage;
	}

	/**
	 * @return the canAutoScoreGears
	 */
	public boolean iscanAutoScoreGears()
	{
		return canAutoScoreGears;
	}

	/**
	 * @param canAutoScoreGears the canAutoScoreGears to set
	 */
	public void setcanAutoScoreGears(boolean canAutoScoreGears)
	{
		this.canAutoScoreGears = canAutoScoreGears;
	}

	/**
	 * @return the autoTotalScore
	 */
	public double getAutoTotalScore()
	{
		autoTotalScore = (double) ( getAutoLowerShotsMade() / 3 );
		autoTotalScore += (double) ( getAutoHigherShotsMade() / 1 );
		autoTotalScore += (double) ( getAutoRotorsStartedPercentage() / 100 * 60 );
		
		return autoTotalScore;
	}

	/**
	 * @param autoTotalScore the autoTotalScore to set
	 */
	public void setAutoTotalScore(double autoTotalScore)
	{
		this.autoTotalScore = autoTotalScore;
	}

	/**
	 * @return the autoAverageScore
	 */
	public double getAutoAverageScore()
	{
		if( matchesPlayed != 0 )
			autoAverageScore = (double) ( getAutoTotalScore() / getMatchesPlayed() );
			
		return autoAverageScore;
	}

	/**
	 * @param autoAverageScore the autoAverageScore to set
	 */
	public void setAutoAverageScore(double autoAverageScore)
	{
		this.autoAverageScore = autoAverageScore;
	}

	/**
	 * @return the matchesPlayed
	 */
	public int getMatchesPlayed()
	{
		return matchesPlayed;
	}

	/**
	 * @param matchesPlayed the matchesPlayed to set
	 */
	public void setMatchesPlayed(int matchesPlayed)
	{
		this.matchesPlayed = matchesPlayed;
	}

	/**
	 * @return the canAutoScoreGears
	 */
	public boolean isCanAutoScoreGears()
	{
		return canAutoScoreGears;
	}

	/**
	 * @param canAutoScoreGears the canAutoScoreGears to set
	 */
	public void setCanAutoScoreGears(boolean canAutoScoreGears)
	{
		this.canAutoScoreGears = canAutoScoreGears;
	}

	/**
	 * @return the teleOpTotalScore
	 */
	public double getTeleOpTotalScore()
	{
		teleOpTotalScore = (double) ( getTeleOpLowerShotsMade() / 9 );
		teleOpTotalScore += (double) ( getTeleOpHigherShotsMade() / 3 );
		teleOpTotalScore += (double) ( getTeleOpRotorsStartedPercentage() * 40 );
		teleOpTotalScore += (double) ( getClimbsSuccessful() * 50 );
		
		return teleOpTotalScore;
	}
	
	/**
	 * @param teleOpTotalScore the teleOpTotalScore to set
	 */
	public void setTeleOpTotalScore(double teleOpTotalScore)
	{
		this.teleOpTotalScore = teleOpTotalScore;
	}

	/**
	 * @return the teleOpAverageScore
	 */
	public double getTeleOpAverageScore()
	{
		if( matchesPlayed != 0 )
			teleOpAverageScore = (double) ( getTeleOpTotalScore() / getMatchesPlayed() );
			
		return teleOpAverageScore;
	}

	/**
	 * @param teleOpAverageScore the teleOpAverageScore to set
	 */
	public void setTeleOpAverageScore(double teleOpAverageScore)
	{
		this.teleOpAverageScore = teleOpAverageScore;
	}	

	/**
	 * @return the teleOpRotorsStartedPercentage
	 */
	public double getTeleOpRotorsStartedPercentage()
	{
		if( getTeleOpEstimatedTeamGearsMade() != 0 )
			teleOpRotorsStartedPercentage = (double) ( getTeleOpGearsMade() / getTeleOpEstimatedTeamGearsMade() );
		//System.out.println(getTeleOpEstimatedTeamGearsMade());
			
		return teleOpRotorsStartedPercentage;
	}

	/**
	 * @param teleOpRotorsStartedPercentage the teleOpRotorsStartedPercentage to set
	 */
	public void setTeleOpRotorsStartedPercentage(double teleOpRotorsStartedPercentage)
	{
		this.teleOpRotorsStartedPercentage = teleOpRotorsStartedPercentage;
	}

	/**
	 * @return the autoRotorsStartedPercentage
	 */
	public double getAutoRotorsStartedPercentage()
	{
		if( autoGearsMade != 0 )
			autoRotorsStartedPercentage = (double) ( getAutoGearsMade() / getAutoEstimatedTeamGearsMade() * 100 );
		
		return autoRotorsStartedPercentage;
	}

	/**
	 * @param autoRotorsStartedPercentage the autoRotorsStartedPercentage to set
	 */
	public void setAutoRotorsStartedPercentage(double autoRotorsStartedPercentage)
	{
		this.autoRotorsStartedPercentage = autoRotorsStartedPercentage;
	}

	/**
	 * @return the teleOpEstimatedTeamGearsMade
	 */
	public int getTeleOpEstimatedTeamGearsMade()
	{
		/* must work out better logic, this isn't good
		if( ( ( ( (double) teleOpRotorsStarted / matchesPlayed ) ) ) % 4 <= 1 )
			teleOpEstimatedTeamGearsMade = (int) ( ( ( teleOpRotorsStarted * 12 ) - ( getAutoRotorsStarted() * 1.5 ) ) );
		else if( ( ( (double) teleOpRotorsStarted / matchesPlayed ) ) % 3 <= 1 )
			teleOpEstimatedTeamGearsMade = (int) ( ( ( teleOpRotorsStarted * 6 ) - ( getAutoRotorsStarted() * 1.5 ) ) );
		else if( ( ( (double) teleOpRotorsStarted / matchesPlayed ) ) % 2 <= 1 )
			teleOpEstimatedTeamGearsMade = (int) ( ( ( teleOpRotorsStarted * 3 ) - ( getAutoRotorsStarted() * 1.5 ) ) );
		else if( teleOpRotorsStarted > 0 )
			teleOpEstimatedTeamGearsMade = (int) ( ( ( teleOpRotorsStarted ) - ( getAutoRotorsStarted() * 1.5 ) ) );
		else
			teleOpEstimatedTeamGearsMade = 0;
		
		System.out.println(teleOpEstimatedTeamGearsMade);
		System.out.println( (double) teleOpRotorsStarted / matchesPlayed);
		//System.out.println(getAutoRotorsStarted());
		 *
		 */
		
		return teleOpEstimatedTeamGearsMade;
	}

	/**
	 * @param teleOpEstimatedTeamGearsMade the teleOpEstimatedTeamGearsMade to set
	 */
	public void setTeleOpEstimatedTeamGearsMade(int teleOpEstimatedTeamGearsMade)
	{
		this.teleOpEstimatedTeamGearsMade = teleOpEstimatedTeamGearsMade;
	}

	/**
	 * @return the autoEstimatedTeamGearsMade
	 */
	public double getAutoEstimatedTeamGearsMade()
	{
		if( autoRotorsStarted != 0)
			autoEstimatedTeamGearsMade = autoRotorsStarted * 1.5;
		else
			autoEstimatedTeamGearsMade = 0;
		
		return autoEstimatedTeamGearsMade;
	}

	/**
	 * @param autoEstimatedTeamGearsMade the autoEstimatedTeamGearsMade to set
	 */
	public void setAutoEstimatedTeamGearsMade(int autoEstimatedTeamGearsMade)
	{
		this.autoEstimatedTeamGearsMade = autoEstimatedTeamGearsMade;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Team " + teamNum + ": \n[teleOpLowerShotsAttempted=" + teleOpLowerShotsAttempted
				+ ", teleOpLowerShotsMade=" + teleOpLowerShotsMade + ", teleOpLowerShootingPercentage="
				+ teleOpLowerShootingPercentage + ", canShootLow=" + canShootLow + ", teleOpHigherShotsAttempted="
				+ teleOpHigherShotsAttempted + ", teleOpHigherShotsMade=" + teleOpHigherShotsMade
				+ ", teleOpHigherShootingPercentage=" + teleOpHigherShootingPercentage + ", canShootHigh="
				+ canShootHigh + ", teleOpGearsAttempted=" + teleOpGearsAttempted + ", teleOpGearsMade="
				+ teleOpGearsMade + ", teleOpRotorsStarted=" + teleOpRotorsStarted + ", teleOpEstimatedTeamGearsMade="
				+ teleOpEstimatedTeamGearsMade + ", teleOpGearPercentage=" + teleOpGearPercentage
				+ ", teleOpRotorsStartedPercentage=" + teleOpRotorsStartedPercentage + ", canScoreGears="
				+ canScoreGears + ", autoLowerShotsAttempted=" + autoLowerShotsAttempted + ", autoLowerShotsMade="
				+ autoLowerShotsMade + ", autoLowerShootingPercentage=" + autoLowerShootingPercentage
				+ ", canAutoShootLow=" + canAutoShootLow + ", autoHigherShotsAttempted=" + autoHigherShotsAttempted
				+ ", autoHigherShotsMade=" + autoHigherShotsMade + ", autoHigherShootingPercentage="
				+ autoHigherShootingPercentage + ", canAutoShootHigh=" + canAutoShootHigh + ", autoGearsAttempted="
				+ autoGearsAttempted + ", autoGearsMade=" + autoGearsMade + ", autoRotorsStarted=" + autoRotorsStarted
				+ ", autoEstimatedTeamGearsMade=" + autoEstimatedTeamGearsMade + ", autoGearPercentage="
				+ autoGearPercentage + ", autoRotorsStartedPercentage=" + autoRotorsStartedPercentage
				+ ", canAutoScoreGears=" + canAutoScoreGears + ", climbsAttempted=" + climbsAttempted
				+ ", climbsSuccessful=" + climbsSuccessful + ", climbPercentage=" + climbPercentage + ", canClimb="
				+ canClimb + ", totalScore=" + totalScore + ", autoTotalScore=" + autoTotalScore + ", teleOpTotalScore="
				+ teleOpTotalScore + ", averageScore=" + averageScore + ", autoAverageScore=" + autoAverageScore
				+ ", teleOpAverageScore=" + teleOpAverageScore + ", matchesPlayedIn=" + matchesPlayedIn
				+ ", matchesPlayed=" + matchesPlayed + ", getTeamNum()=" + getTeamNum()
				+ ", getTeleOpHigherShotsAttempted()=" + getTeleOpHigherShotsAttempted()
				+ ", getTeleOpHigherShotsMade()=" + getTeleOpHigherShotsMade()
				+ ", getTeleOpHigherShootingPercentage()=" + getTeleOpHigherShootingPercentage()
				+ ", getTeleOpGearsAttempted()=" + getTeleOpGearsAttempted() + ", getTeleOpGearsMade()="
				+ getTeleOpGearsMade() + ", getTeleOpGearPercentage()=" + getTeleOpGearPercentage()
				+ ", getClimbsAttempted()=" + getClimbsAttempted() + ", getClimbsSuccessful()=" + getClimbsSuccessful()
				+ ", getClimbPercentage()=" + getClimbPercentage() + ", getMatchesPlayedIn()=" + getMatchesPlayedIn()
				+ ", getTeleOpLowerShotsMade()="
				+ getTeleOpLowerShotsMade() + ", getTeleOpLowerShootingPercentage()="
				+ getTeleOpLowerShootingPercentage() + ", isCanShootLow()=" + isCanShootLow() + ", isCanShootHigh()="
				+ isCanShootHigh() + ", isCanScoreGears()=" + isCanScoreGears() + ", isCanClimb()=" + isCanClimb()
				+ ", getTotalScore()=" + getTotalScore() + ", getAverageScore()=" + getAverageScore()
				+ ", getTeleOpLowerShotsAttempted()=" + getTeleOpLowerShotsAttempted() + ", getTeleOpRotorsStarted()="
				+ getTeleOpRotorsStarted() + ", getAutoLowerShotsAttempted()=" + getAutoLowerShotsAttempted()
				+ ", getAutoLowerShotsMade()=" + getAutoLowerShotsMade() + ", getAutoLowerShootingPercentage()="
				+ getAutoLowerShootingPercentage() + ", isCanAutoShootLow()=" + isCanAutoShootLow()
				+ ", getAutoHigherShotsAttempted()=" + getAutoHigherShotsAttempted() + ", getAutoHigherShotsMade()="
				+ getAutoHigherShotsMade() + ", isCanAutoShootHigh()=" + isCanAutoShootHigh() + ", getAutoGearsAttempted()="
				+ getAutoGearsAttempted() + ", getAutoGearsMade()=" + getAutoGearsMade() + ", getAutoRotorsStarted()="
				+ getAutoRotorsStarted() + ", getAutoGearPercentage()=" + getAutoGearPercentage()
				+ ", iscanAutoScoreGears()=" + iscanAutoScoreGears() + ", getAutoTotalScore()=" + getAutoTotalScore()
				+ ", getAutoAverageScore()=" + getAutoAverageScore() + ", getMatchesPlayed()=" + getMatchesPlayed()
				+ ", getAutoHigherShootingPercentage()=" + getAutoHigherShootingPercentage()
				+ ", isCanAutoScoreGears()=" + isCanAutoScoreGears() + ", getTeleOpTotalScore()="
				+ getTeleOpTotalScore() + ", getTeleOpAverageScore()=" + getTeleOpAverageScore()
				+ ", getTeleOpRotorsStartedPercentage()=" + getTeleOpRotorsStartedPercentage()
				+ ", getAutoRotorsStartedPercentage()=" + getAutoRotorsStartedPercentage()
				+ ", getTeleOpEstimatedTeamGearsMade()=" + getTeleOpEstimatedTeamGearsMade()
				+ ", getAutoEstimatedTeamGearsMade()=" + getAutoEstimatedTeamGearsMade() + "]";
	}
}