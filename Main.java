public class Main
{
	public static void main(String[] args)
	{
		Team MissDaisy = new Team();
		MissDaisy.setTeamNum( 341 );
		MissDaisy.setMatchesPlayed(13);
		MissDaisy.setAutoHigherShotsMade(130);
		MissDaisy.setAutoHigherShotsAttempted(130);
		MissDaisy.setAutoGearsAttempted(13);
		MissDaisy.setAutoGearsMade(13);
		MissDaisy.setAutoRotorsStarted(13);
		MissDaisy.setTeleOpGearsAttempted(13);
		MissDaisy.setTeleOpGearsMade(13);
		System.out.println( MissDaisy.getTotalScore() );
		System.out.println( MissDaisy.getAutoAverageScore() );
		System.out.println( MissDaisy.getAverageScore() );
	}
}