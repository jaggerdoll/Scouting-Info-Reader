public class Main
{
	public static void main(String[] args)
	{
		Team MissDaisy = new Team();
		MissDaisy.setTeamNum( 341 );
		MissDaisy.setMatchesPlayed(16);
		MissDaisy.setAutoHigherShotsMade(130);
		MissDaisy.setAutoHigherShotsAttempted(130);
		MissDaisy.setAutoGearsAttempted(13);
		MissDaisy.setAutoGearsMade(16);
		MissDaisy.setAutoRotorsStarted(16);
		MissDaisy.setTeleOpGearsAttempted(64);
		MissDaisy.setTeleOpGearsMade(64);
		MissDaisy.setTeleOpRotorsStarted(26);
		System.out.println( MissDaisy.getTeleOpTotalScore() );
		System.out.println( MissDaisy.getAutoAverageScore() );
		System.out.println( MissDaisy.getAverageScore() );
	}
}