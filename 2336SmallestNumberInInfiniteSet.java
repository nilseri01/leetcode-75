// https://leetcode.com/problems/smallest-number-in-infinite-set
class SmallestInfiniteSet {
    TreeSet<Integer> treeSet;

    public SmallestInfiniteSet() {
        treeSet = new TreeSet<>();
        for (int i = 1; i <= 1000; ++i) {
            treeSet.add(i);
        }
    }
    
    public int popSmallest() {
        return treeSet.pollFirst();
    }
    
    public void addBack(int num) {
        treeSet.add(num);
    }
}

/**
 * Your SmallestInfiniteSet object will be instantiated and called as such:
 * SmallestInfiniteSet obj = new SmallestInfiniteSet();
 * int param_1 = obj.popSmallest();
 * obj.addBack(num);
 */
