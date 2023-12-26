// https://leetcode.com/problems/dota2-senate
class Solution {
    public String predictPartyVictory(String senate) {
        int senatorCount = senate.length();
        Deque<Integer> queueRadiant = new ArrayDeque<>();
        Deque<Integer> queueDire = new ArrayDeque<>();
        for (int i = 0; i < senatorCount; ++i) {
            if (senate.charAt(i) == 'R') {
                queueRadiant.offer(i);
            } else {
                queueDire.offer(i);
            }
        }
        while (!queueRadiant.isEmpty() && !queueDire.isEmpty()) {
            if (queueRadiant.peek() < queueDire.peek()) {
                queueRadiant.offer(queueRadiant.peek() + senatorCount);
            } else {
                queueDire.offer(queueDire.peek() + senatorCount);
            }
            queueRadiant.poll();
            queueDire.poll();
        }
        return queueRadiant.isEmpty() ? "Dire" : "Radiant";
    }
}
