import java.util.*;

class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        Queue<int[]> q = new ArrayDeque<>();

        for (int i = 0; i < tickets.length; i++) {
            q.add(new int[]{tickets[i], i});
        }

        int time = 0;

        while (!q.isEmpty()) {
            int[] person = q.poll();
            person[0]--;
            time++;

            if (person[1] == k && person[0] == 0) {
                return time;
            }

            if (person[0] > 0) {
                q.add(person);
            }
        }

        return time;
    }
}