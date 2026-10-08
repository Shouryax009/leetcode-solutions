class Solution {
    public boolean canfinish(int[] piles,int speed , int h){
        int hours = 0;
        for(int pile:piles){
            hours+=(pile+speed-1)/speed;
            if(hours>h){
                return false;
            }
        }
        return true;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = 0;
        for(int pile : piles){
            high = Math.max(pile,high);
        }
            while(low<high){
                int mid = low + (high-low)/2;
                if(canfinish(piles,mid,h)){
                    high = mid;
                }
                else{
                    low = mid+1;
                }
            }
        return low;
    }
}