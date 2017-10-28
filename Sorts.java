import java.util.ArrayList;

public class Sorts
{
	public Sorts()
	{
		//This class will contain (only static) methods which will be able to sort the teams by their stored stats.
    }
	
	/*
		Framework for sorting the teams
	   	public static void selectionSort ( ArrayList<Team> teams )
	   	{
	      	int min;
	      	Team temp;

	      	for ( int index = 0; index < teams.size() - 1; index++ )
	      	{
	         	min = index;
	         	for ( int scan = index + 1; scan < teams.size(); scan++ )
	            	if ( teams.get(scan) < teams.get(min) )
	               		min = scan;

	         	// Swap the values
	         	temp = teams.get(min);
	         	teams.set( min, teams.get(index) );
	         	teams.set( min, temp );
	      	}
	   	}
	   	*/
	public static void sortByAverageScoreDown ( ArrayList<Team> teams )
   	{
      	int min;
      	Team temp;

      	for ( int index = 0; index < teams.size() - 1; index++ )
      	{
         	min = index;
         	for ( int scan = index + 1; scan < teams.size(); scan++ )
            	if ( teams.get(scan).getAverageScore() < teams.get(min).getAverageScore() )
               		min = scan;

         	// Swap the values
         	temp = teams.get(min);
         	teams.set( min, teams.get(index) );
         	teams.set( min, temp );
      	}
   	}
	
	public static void sortByAverageScoreUp ( ArrayList<Team> teams )
   	{
      	int max;
      	Team temp;

      	for ( int index = teams.size() - 1; index > 0; index-- )
      	{
         	max = index;
         	for ( int scan = index - 1; scan > 0; scan-- )
            	if ( teams.get(scan).getAverageScore() > teams.get(max).getAverageScore() )
               		max = scan;

         	// Swap the values
         	temp = teams.get(max);
         	teams.set( max, teams.get(index) );
         	teams.set( max, temp );
      	}
   	}
	
	public static void sortByAutoAverageScoreDown ( ArrayList<Team> teams )
   	{
      	int min;
      	Team temp;

      	for ( int index = 0; index < teams.size() - 1; index++ )
      	{
         	min = index;
         	for ( int scan = index + 1; scan < teams.size(); scan++ )
            	if ( teams.get(scan).getAutoAverageScore() < teams.get(min).getAutoAverageScore() )
               		min = scan;

         	// Swap the values
         	temp = teams.get(min);
         	teams.set( min, teams.get(index) );
         	teams.set( min, temp );
      	}
   	}
	
	public static void sortByAutoAverageScoreUp ( ArrayList<Team> teams )
   	{
      	int max;
      	Team temp;

      	for ( int index = teams.size() - 1; index > 0; index-- )
      	{
         	max = index;
         	for ( int scan = index - 1; scan > 0; scan-- )
            	if ( teams.get(scan).getAutoAverageScore() > teams.get(max).getAutoAverageScore() )
               		max = scan;

         	// Swap the values
         	temp = teams.get(max);
         	teams.set( max, teams.get(index) );
         	teams.set( max, temp );
      	}
   	}
}
