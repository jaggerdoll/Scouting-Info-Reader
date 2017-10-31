import java.util.ArrayList;

import javax.swing.JFrame;

public class Main
{
	public static void main(String[] args)
	{
		ArrayList<Team> allTeams = new ArrayList<Team>();
		Team MissDaisy = new Team();
		MissDaisy.setTeamNum( 341 );
		MissDaisy.setMatchesPlayed(16);
		//MissDaisy.setAutoHigherShotsMade(130);
		//MissDaisy.setAutoHigherShotsAttempted(130);
		//MissDaisy.setAutoGearsAttempted(16);
		//MissDaisy.setAutoGearsMade(16);
		//MissDaisy.setAutoRotorsStarted(16);
		//MissDaisy.setTeleOpGearsAttempted(64);
		//MissDaisy.setTeleOpGearsMade(64);
		//MissDaisy.setTeleOpRotorsStarted(26);
		//MissDaisy.getTeleOpTotalScore();
		//System.out.println( MissDaisy.getAutoAverageScore() );
		System.out.println( MissDaisy.getAverageScore() );
		MissDaisy.setAverageScore(100);
		
		allTeams.add(MissDaisy);
		
		JFrame frame = new JFrame("Scouting App Info Reader");
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        frame.setContentPane(new HomePage(frame, allTeams));
        frame.pack();
        frame.setVisible(true);
	}
}