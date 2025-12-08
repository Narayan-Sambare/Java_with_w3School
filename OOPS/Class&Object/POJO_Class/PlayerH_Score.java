/*
4. Player High Score
Task:
 Create a Player class with fields: name and score.
 In the main method:
Create two individual Player objects.
Compare their scores and print the name of the player with the higher score.
Explanation:
 This helps to understand comparing fields between objects.
 */
 import java.util.*;
 public class PlayerH_Score
 {
	 public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number of player ");
		int n=sc.nextInt();
		sc.nextLine();
		Player p[]=new Player[n];//create array object
		
		for(int i=0;i<p.length;i++)
		{	p[i]=new Player();//create object of each person
			System.out.println("Enter name and Score");
			String name=sc.nextLine();
			int score=sc.nextInt();
			sc.nextLine();
			p[i].setName(name);
			p[i].setScore(score);
		}
		
		int h=0;
		for(int i=0;i<p.length;i++)
		{	
			if(p[i].getScore()>p[h].getScore())	
			{
				h=i;
			}
			
		}
		System.out.println("Name: "+(p[h].getName())+" Score: "+(p[h].getScore()));			
	}
	
}

 
 class Player
 {
	private String name;
	private int score;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	
 }