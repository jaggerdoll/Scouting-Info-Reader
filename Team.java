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
	
	private int teleOpGearsAttempted, teleOpGearsMade, teleOpRotorsStarted;
	private double teleOpGearPercentage;
	private boolean canScoreGears;
	
	private int autoLowerShotsAttempted, autoLowerShotsMade;
	private double autoLowerShootingPercentage;
	private boolean canAutoShootLow;
	
	private int autoHigherShotsAttempted, autoHigherShotsMade;
	private double autoHigherShootingPercentage;
	private boolean canAutoShootHigh;
	
	private int autoGearsAttempted, autoGearsMade, autoRotorsStarted;
	private double autoGearPercentage;
	private boolean canAutoScoreGears;
	
	private int climbsAttempted, climbsSuccesful;
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
		teleOpGearPercentage = 0.0;
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
		autoGearPercentage = 0.0;
		canAutoScoreGears = false;
		
		climbsAttempted = 0;
		climbsSuccesful = 0;
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
		teleOpGearPercentage = 0.0;
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
		autoGearPercentage = 0.0;
		canAutoScoreGears = false;
		
		climbsAttempted = 0;
		climbsSuccesful = 0;
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
			int teleOpGearsMade, int teleOpRotorsStarted, double teleOpGearPercentage, boolean canScoreGears,
			int autoLowerShotsAttempted, int autoLowerShotsMade, double autoLowerShootingPercentage,
			boolean canAutoShootLow, int autoHigherShotsAttempted, int autoHigherShotsMade,
			double autoHigherShootingPercentage, boolean canAutoShootHigh, int autoGearsAttempted,
			int autoGearsMade, int autoRotorsStarted, double autoGearPercentage, boolean canAutoScoreGears,
			int climbsAttempted, int climbsSuccesful, double climbPercentage, boolean canClimb,
			double totalScore, double autoTotalScore, double teleOpTotalScore, double averageScore,
			double autoAverageScore, double teleOpAverageScore, ArrayList<Integer> matchesPlayedIn,int matchesPlayed )
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
		teleOpGearPercentage = 0.0;
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
		autoGearPercentage = 0.0;
		canAutoScoreGears = false;
		
		climbsAttempted = 0;
		climbsSuccesful = 0;
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
		if( climbsAttempted != 0 )
			climbPercentage = (double) ( climbsSuccesful / climbsAttempted );
				
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
	 * @return the teleOpLowerShotsAttempted
	 */
	public int getteleOpLowerShotsAttempted()
	{
		return teleOpLowerShotsAttempted;
	}

	/**
	 * @param teleOpLowerShotsAttempted the teleOpLowerShotsAttempted to set
	 */
	public void setteleOpLowerShotsAttempted(int teleOpLowerShotsAttempted)
	{
		this.teleOpLowerShotsAttempted = teleOpLowerShotsAttempted;
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
	public void setteleOpLowerShotsMade(int teleOpLowerShotsMade)
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
		totalScore = (double) ( teleOpTotalScore + autoTotalScore );
		
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
		averageScore = (double) ( totalScore / matchesPlayed );
		
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
	public double getautoHigherShootingPercentage()
	{
		if( autoHigherShotsAttempted != 0 )
			autoHigherShootingPercentage = (double) ( autoHigherShotsMade / autoHigherShotsAttempted * 100 );
		
		return autoHigherShootingPercentage;
	}

	/**
	 * @param autoHigherShootingPercentage the autoHigherShootingPercentage to set
	 */
	public void setautoHigherShootingPercentage(double autoHigherShootingPercentage)
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
		totalScore += (double) ( autoLowerShotsMade / 3 );
		totalScore += (double) ( autoHigherShotsMade / 1 );
		totalScore += (double) ( autoRotorsStarted * 60 );
		
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
			autoAverageScore = (double) ( autoTotalScore / matchesPlayed );
			
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
	 * @param teleOpLowerShotsMade the teleOpLowerShotsMade to set
	 */
	public void setTeleOpLowerShotsMade(int teleOpLowerShotsMade)
	{
		this.teleOpLowerShotsMade = teleOpLowerShotsMade;
	}

	/**
	 * @return the autoHigherShootingPercentage
	 */
	public double getAutoHigherShootingPercentage()
	{
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
		totalScore += (double) ( teleOpLowerShotsMade / 9 );
		totalScore += (double) ( teleOpHigherShotsMade / 3 );
		totalScore += (double) ( teleOpRotorsStarted * 40 );
		totalScore += (double) ( climbsSuccesful * 50 );
		
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
			teleOpAverageScore = (double) ( teleOpTotalScore / matchesPlayed );
			
		return teleOpAverageScore;
	}

	/**
	 * @param teleOpAverageScore the teleOpAverageScore to set
	 */
	public void setTeleOpAverageScore(double teleOpAverageScore)
	{
		this.teleOpAverageScore = teleOpAverageScore;
	}	

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Team teamNum=" + teamNum + ", \n[teleOpLowerShotsAttempted=" + teleOpLowerShotsAttempted
				+ ", teleOpLowerShotsMade=" + teleOpLowerShotsMade + ", teleOpLowerShootingPercentage="
				+ teleOpLowerShootingPercentage + ", canShootLow=" + canShootLow + ", teleOpHigherShotsAttempted="
				+ teleOpHigherShotsAttempted + ", teleOpHigherShotsMade=" + teleOpHigherShotsMade
				+ ", teleOpHigherShootingPercentage=" + teleOpHigherShootingPercentage + ", canShootHigh=" + canShootHigh
				+ ", teleOpGearsAttempted=" + teleOpGearsAttempted + ", teleOpGearsMade=" + teleOpGearsMade
				+ ", teleOpRotorsStarted=" + teleOpRotorsStarted + ", teleOpGearPercentage=" + teleOpGearPercentage
				+ ", canScoreGears=" + canScoreGears + ", autoLowerShotsAttempted=" + autoLowerShotsAttempted
				+ ", autoLowerShotsMade=" + autoLowerShotsMade + ", autoLowerShootingPercentage="
				+ autoLowerShootingPercentage + ", canAutoShootLow=" + canAutoShootLow + ", autoHigherShotsAttempted="
				+ autoHigherShotsAttempted + ", autoHigherShotsMade=" + autoHigherShotsMade
				+ ", autoHigherShootingPercentage=" + autoHigherShootingPercentage + ", canAutoShootHigh=" + canAutoShootHigh
				+ ", autoGearsAttempted=" + autoGearsAttempted + ", autoGearsMade=" + autoGearsMade
				+ ", autoRotorsStarted=" + autoRotorsStarted + ", autoGearPercentage=" + autoGearPercentage
				+ ", canAutoScoreGears=" + canAutoScoreGears + ", climbsAttempted=" + climbsAttempted
				+ ", climbsSuccesful=" + climbsSuccesful + ", climbPercentage=" + climbPercentage + ", canClimb="
				+ canClimb + ", totalScore=" + totalScore + ", autoTotalScore=" + autoTotalScore + ", averageScore="
				+ averageScore + ", autoAverageScore=" + autoAverageScore + ", matchesPlayedIn=" + matchesPlayedIn
				+ ", matchesPlayed=" + matchesPlayed + ", getTeamNum()=" + getTeamNum()
				+ ", getTeleOpHigherShotsAttempted()=" + getTeleOpHigherShotsAttempted()
				+ ", getTeleOpHigherShotsMade()=" + getTeleOpHigherShotsMade() + ", getteleOpHigherShootingPercentage()="
				+ getTeleOpHigherShootingPercentage() + ", getTeleOpGearsAttempted()=" + getTeleOpGearsAttempted()
				+ ", getTeleOpGearsMade()=" + getTeleOpGearsMade() + ", getTeleOpGearPercentage()="
				+ getTeleOpGearPercentage() + ", getClimbsAttempted()=" + getClimbsAttempted()
				+ ", getClimbsSuccesful()=" + getClimbsSuccesful() + ", getClimbPercentage()=" + getClimbPercentage()
				+ ", getMatchesPlayedIn()=" + getMatchesPlayedIn() + ", getteleOpLowerShotsAttempted()="
				+ getteleOpLowerShotsAttempted() + ", getTeleOpLowerShotsMade()=" + getTeleOpLowerShotsMade()
				+ ", getTeleOpLowerShootingPercentage()=" + getTeleOpLowerShootingPercentage() + ", isCanShootLow()="
				+ isCanShootLow() + ", isCanShootHigh()=" + isCanShootHigh() + ", isCanScoreGears()="
				+ isCanScoreGears() + ", isCanClimb()=" + isCanClimb() + ", getTotalScore()=" + getTotalScore()
				+ ", getAverageScore()=" + getAverageScore() + ", getTeleOpLowerShotsAttempted()="
				+ getTeleOpLowerShotsAttempted() + ", getTeleOpRotorsStarted()=" + getTeleOpRotorsStarted()
				+ ", getAutoLowerShotsAttempted()=" + getAutoLowerShotsAttempted() + ", getAutoLowerShotsMade()="
				+ getAutoLowerShotsMade() + ", getAutoLowerShootingPercentage()=" + getAutoLowerShootingPercentage()
				+ ", isCanAutoShootLow()=" + isCanAutoShootLow() + ", getAutoHigherShotsAttempted()="
				+ getAutoHigherShotsAttempted() + ", getAutoHigherShotsMade()=" + getAutoHigherShotsMade()
				+ ", getautoHigherShootingPercentage()=" + getautoHigherShootingPercentage() + ", isCanAutoShootHigh()="
				+ isCanAutoShootHigh() + ", getAutoGearsAttempted()=" + getAutoGearsAttempted()
				+ ", getAutoGearsMade()=" + getAutoGearsMade() + ", getAutoRotorsStarted()=" + getAutoRotorsStarted()
				+ ", getAutoGearPercentage()=" + getAutoGearPercentage() + ", iscanAutoScoreGears()="
				+ iscanAutoScoreGears() + ", getAutoTotalScore()=" + getAutoTotalScore() + ", getAutoAverageScore()="
				+ getAutoAverageScore() + ", getMatchesPlayed()=" + getMatchesPlayed()
				+ ", getTeleOpHigherShootingPercentage()=" + getTeleOpHigherShootingPercentage();
	}
}