
public class Voter {
    private int voterId;
    private String name;
    private int age;

    public Voter(int voterId, String name, int age) {
        this.voterId = voterId;
        this.name = name;
        this.age = age;
    }

    public int getVoterId() {
        return voterId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}