import java.util.ArrayList;

public class Event
{
	private ArrayList<Match> matchList;
	private ArrayList<Team> allAttendingTeams;
	private ArrayList<Team> predictedRankings;
	private Team[] winners;
	
	public Event()
	{
		allAttendingTeams = new ArrayList<Team>();
		predictedRankings = new ArrayList<Team>();
		matchList = new ArrayList<Match>();
		winners = new Team[3];
	}
	public ArrayList<Match> getMatchList()
	{
		return matchList;
	}
	public void setMatchList(ArrayList<Match> matchList)
	{
		this.matchList = matchList;
	}
	public ArrayList<Team> getAllAttendingTeams()
	{
		return allAttendingTeams;
	}
	public void setAllAttendingTeams(ArrayList<Team> allAttendingTeams)
	{
		this.allAttendingTeams = allAttendingTeams;
	}
	public ArrayList<Team> getPredictedRankings()
	{
		predictRankings();
		
		return predictedRankings;
	}
	public void setPredictedRankings(ArrayList<Team> predictedRankings)
	{
		this.predictedRankings = predictedRankings;
	}
	public Team[] getWinners()
	{
		return winners;
	}
	public void setWinners(Team[] winners)
	{
		this.winners = winners;
	}
	public void predictRankings()
	{
		
	}
}
