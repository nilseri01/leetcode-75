// https://leetcode.com/problems/asteroid-collision
class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();
        Arrays.stream(asteroids).boxed().forEach(a -> {
            if (a > 0) {
                stack.push(a);
            } else {
                while (!stack.isEmpty() && stack.peek() > 0 && stack.peek() < -a) {
                    stack.pop();
                }

                if (stack.isEmpty() || stack.peek() < 0) {
                    stack.push(a);
                } else if (stack.peek() == -a) {
                    stack.pop();
                }
            }
        });
        return stack.stream().mapToInt(Integer::intValue).toArray();
    }
}
