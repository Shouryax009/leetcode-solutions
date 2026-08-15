class Solution {
    public int[] findRightInterval(int[][] intervals) {
        int n = intervals.length;
        int[] result = new int[n];
        TreeMap<Integer,Integer> starts = new TreeMap<>();
        for(int i =0;i<n;i++){
            starts.put(intervals[i][0],i);
        }
        for(int i =0;i<n;i++){
         Integer key = starts.ceilingKey(intervals[i][1]);
           if(key == null){
                result[i] = -1;
            }   
            else{
                result[i] = starts.get(key);
            }
        }
        return result;
        
    }
}