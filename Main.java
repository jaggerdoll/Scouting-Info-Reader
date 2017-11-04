import java.util.ArrayList;

import javax.swing.JFrame;

public class Main
{
	public static void main(String[] args)
	{
		ArrayList<Team> allTeams = new ArrayList<Team>();
		ArrayList<Event> allEvents = new ArrayList<Event>();
		
		Event event = new Event();
		event.setEventName("Duel on the Delaware");
		allEvents.add(event);
		
		JFrame frame = new JFrame("Scouting App Info Reader");
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        frame.setContentPane(new HomePage(frame, allTeams, allEvents));
        frame.pack();
        frame.setVisible(true);
	}
}