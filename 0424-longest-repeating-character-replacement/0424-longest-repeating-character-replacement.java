class Solution {
    public int characterReplacement(String s, int k) {
        int frequency[] = new int [26];
        int left =0;
        int maxfreq = 0;
        int maxlength = 0;
        for(int right = 0 ; right <s.length();right ++){
            int index = s.charAt(right) - 'A';
            frequency[index]++;
            maxfreq = Math.max(maxfreq,frequency[index]);
            int curlength = right - left +1;
            if (curlength - maxfreq > k){
                frequency[s.charAt(left)-'A']--;
                left++;
            }
            curlength = right - left +1;
            maxlength = Math.max(maxlength,curlength);
        }
        return maxlength;

        
    }
}