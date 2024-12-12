//Time Complexity: O(nLog(k)
//Space Complexity: O(n)
class Solution {
    /* Min Heap
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int n = nums.length;
        int j =0;
        for(int i=0;i<n;i++)
        {
            pq.add(nums[i]);
            if(pq.size()>k)
                pq.poll();
        }
        return pq.peek();
    }*/
    // Max Heap
     public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->b-a);
        int result = Integer.MAX_VALUE;
        int n = nums.length;
        int j =0;
        for(int i=0;i<n;i++)
        {
            pq.add(nums[i]);
            if(pq.size()>(n-k))
                result = Math.min(pq.poll(),result);
        }
        return result;
    }
}
