class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n=nums.length;
        int cnt1=0,cnt2=0;
        int el1 = Integer.MIN_VALUE, el2 = Integer.MIN_VALUE;
        for(int i =0;i<n;i++){
            if(cnt1==0 && el2!=nums[i]){
                cnt1=1;
                el1=nums[i];
            }
            else if (cnt2==0 && el1!=nums[i]){
                cnt2=1;
                el2=nums[i];
            }
            else if (el1==nums[i]){
                cnt1++;
            }
            else if(el2==nums[i]){
                cnt2++;
            }
            else{
                cnt1--;
                cnt2--;
            }
        }
        cnt1 = 0; cnt2 = 0; 
        for (int i = 0; i < n; i++) {
            if (nums[i] == el1) cnt1++; 
            if (nums[i] == el2) cnt2++;
        }
        int m =n/3 + 1;
        List<Integer> map=new ArrayList<>();
        if(cnt1>=m){
            map.add(el1);
        }
        if(cnt2>=m&&el2!=el1){
            map.add(el2);
        }
        return map ;
    }
}