/*
Q4. Problem:
Create a POJO class Player with fields: playerId, name, runs, and matches.
Store details of 5 players using an array of objects. Perform the following operations:

1. Calculate the average runs per match for each player.
2. Find and display the player with the highest batting average.
3. Print the details of players whose batting average is above the team average.

Why?
 This teaches ratio calculations, finding max averages, and filtering players — same aggregation + comparison style.
 */
 import java.util.*;
 public class Match
 {
	 public static void main(String x[])
	 {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the player count");
		int count=sc.nextInt();
        Player p[] = new Player[count];

        for (int i = 0; i < p.length; i++) 
		{
            p[i] = new Player();
            System.out.println("\nEnter details of "+(i + 1)+" player " );

            System.out.print("player ID: ");
            p[i].setPlayerId(sc.nextInt());

            System.out.print("name: ");
            p[i].setName(sc.next());

            System.out.print("Runs:");
            p[i].setRuns(sc.nextInt());

            System.out.print("matches: ");
            p[i].setMatches(sc.nextInt());
        }
		double batAvg=0;
		double hBAvg=0;
		int idx=0;
		int totalruns=0;
		for(int i=0;i<p.length;i++)
		{
			System.out.printf("\n player name: %s\t Average run: %f\n",p[i].getName(),p[i].getAvgRun());
			totalruns+=p[i].getAvgRun();
			
			if(p[i].getAvgRun()>hBAvg)
			{
				hBAvg=p[i].getAvgRun();
				idx=i;
			}
			
		}
		System.out.println("\n highest batting average Player\n");
		System.out.printf("\nplayer name: %s\t Highest Batting Average: %f",p[idx].getName(),hBAvg);
		
		double teamAvg=totalruns/p.length;
		
		System.out.println("\nThe details of players whose batting average is above the team average("+teamAvg+")");
		
		for(int i=0;i<p.length;i++)
		{
			if(teamAvg<p[i].getAvgRun())
			{   
				System.out.printf("\nplayerId: %d \tName: %s \tRuns: %d \tMatches: %d",p[i].getPlayerId(),p[i].getName(),p[i].getRuns(),p[i].getMatches());
			}
		}
	}
 }
 
 class Player
 {  
	private int playerId;
    private String name;
    private int runs;       
    private int matches; 

    public int getPlayerId() {
        return playerId;
    }
	public String getName() {
        return name;
    }
	public int getRuns() {
        return runs;
    }
	public int getMatches() {
        return matches;
    }
	
    public void setPlayerId (int playerId) {
        this.playerId = playerId;
    }
	public void setName(String name) {
        this.name = name;
    }
    
    public void setRuns(int runs) {
        this.runs = runs;
    }
	public void setMatches(int matches ){
        this.matches = matches;
    }
	
	
	public double getAvgRun()
	{
		return runs/matches;
	}
 }
	 