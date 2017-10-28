public class Event
{
	private Match[] matchList;
	private Team[] allAttendingTeams;
	private Team[] predictedRankings;
	private Team[] winners;
	public Event()
	{
	
	}
	public void predictRankings()
	{
		
	}
	public Match[] getMatchList() {
		return matchList;
	}
	public void setMatchList(Match[] matchList) {
		this.matchList = matchList;
	}
	public Team[] getAllAttendingTeams() {
		return allAttendingTeams;
	}
	public void setAllAttendingTeams(Team[] allAttendingTeams) {
		this.allAttendingTeams = allAttendingTeams;
	}
	public Team[] getPredictedRankings() {
		return predictedRankings;
	}
	public void setPredictedRankings(Team[] predictedRankings) {
		this.predictedRankings = predictedRankings;
	}
	public Team[] getWinners() {
		return winners;
	}
	public void setWinners(Team[] winners) {
		this.winners = winners;
	}
	
}
