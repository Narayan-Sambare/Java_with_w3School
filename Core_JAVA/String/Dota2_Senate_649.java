import java.util.*;

class Dota2_Senate_649 {
    public static void main(String[] args) {
        System.out.print(predictPartyVictory("sanket"));
    }
    public static String predictPartyVictory(String senate) {
        int n = senate.length();
        Queue<Integer> radiant = new LinkedList<>();
        Queue<Integer> dire = new LinkedList<>();
        
        // Step 1: Separate the senators into their respective queues with their indices
        for (int i = 0; i < n; i++) {
            if (senate.charAt(i) == 'R') {
                radiant.add(i);
            } else {
                dire.add(i);
            }
        }
        // Step 2: Simulate the voting rounds
        while (!radiant.isEmpty() && !dire.isEmpty()) {
            int rIdx = radiant.poll();
            int dIdx = dire.poll();
            
            // The one with the smaller index bans the other
            if (rIdx < dIdx) {
                // Radiant bans Dire. Radiant moves to the next round.
                radiant.add(rIdx + n);
            } else {
                // Dire bans Radiant. Dire moves to the next round.
                dire.add(dIdx + n);
            }
        }
        
        // Step 3: Whoever has remaining senators wins
        return radiant.isEmpty() ? "Dire" : "Radiant";
    }
}