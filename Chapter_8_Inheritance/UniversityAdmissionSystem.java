/*
Q3. University Admission System – Priority Ranking
Base class: Applicant
Fields: name, score
 Method: getRankScore() → returns score directly
Child classes:
SportsQuota: adds +15 to score
DefenseQuota: adds +10 to score
General: no extra
NRIQuota: +20 but fee is 3× normal
Task:
Take 12 applicants (mix of all categories).
Override getRankScore() in each child.
Sort applicants by rank score (high to low).
Print top 3 shortlisted candidates.
Concepts
Overriding
Sorting array of objects
Multiple child classes
Priority logic
 */
import java.util.*;

import javafx.scene.effect.DisplacementMap;
public class UniversityAdmissionSystem 
{
    public static void main(String[] x) 
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Number of student :");
        int n=sc.nextInt();
        Applicant ap[]= new Applicant[n];     

        for(int i=0;i<ap.length;i++){
            System.out.println("Name of student :");
            sc.nextLine(); 
            String name=sc.nextLine();
            System.out.println("Score of student :");
            double score=sc.nextDouble();
            System.out.println("fees of student :");
            double fees=sc.nextDouble();

            System.out.println("1.SportsQuota\n2.DefenseQuota\n3.General\n4.NRIQuota");
             int ch=sc.nextInt(); 
            switch (ch) 
            {
                case 1:
                    ap[i]=new SportsQuota(name,score,fees);
                    break;
                case 2:
                    ap[i]=new DefenseQuota(name,score,fees);
                    break;
                case 3:
                    ap[i]=new General(name,score,fees);
                    break;
                case 4:
                    ap[i]=new NRIQuota(name,score,fees);
                    break;
             
                default:
                    System.out.println("Enter valid input");
                    i--;
                    break;
            }        
        }
            
        Applicant sort[]=sort(ap);

        System.out.println("=============Sorted Details============");
        for(int i=0;i<sort.length;i++)
        {
         sort[i].display();
        }
        System.out.println("how many top student u need ");
        int top=sc.nextInt();
        System.out.println("=============Top "+top+" Student Details============");

        for(int i=0;i<top;i++)
        {
           ap[i].display();
        }

    }
    public static Applicant[] sort(Applicant[] a)
    {
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i].getRankScore() < a[j].getRankScore()) {
                    Applicant temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        return a;

    }
    

}

class Applicant 
{
    private String name; 
    private double score;
    private double fees;
    void SetName(String name)
    {
        this. name=name;;
    }
    void SetScore(double score)
    {
        this. score=score;;
    }
    void setFees(double fees)
    {
        this. fees=fees;;
    }
    String getName()
    {
        return name;
    }
    double getScore()
    {
        return score;
    }
    double getFees()
    {
        return fees;
    }
    void display()
    {
        System.out.println("Name : "+getName()+"\t Score : "+getScore());
    }

      
    double getRankScore()
    {
        return score;
    }
}

class SportsQuota extends Applicant{
    SportsQuota(String name, double score, double fees)
    {
        this.SetName(name);
        this.SetScore(score);
        this.setFees(fees);
    }    
     double getRankScore()
    {
        double sc=getScore()+15;
        return sc;
    }
}
class DefenseQuota extends Applicant{ 
    DefenseQuota(String name, double score, double fees)
    {
        this.SetName(name);
        this.SetScore(score);
        this.setFees(fees);
    }  
     double getRankScore()
    {
        double sc=getScore()+10;
        return sc;
    }     
}
class General extends Applicant{ 
    General(String name, double score, double fees)
    {
        this.SetName(name);
        this.SetScore(score);
        this.setFees(fees);
    }      
     double getRankScore()
    {
       return getScore();
    }
}
class NRIQuota extends Applicant{
    NRIQuota(String name, double score, double fees)
    {
        this.SetName(name);
        this.SetScore(score);
        this.setFees(fees);
    }    
     double getRankScore()
    {
        double sc=getScore()+20;
        return sc;
    }    
}