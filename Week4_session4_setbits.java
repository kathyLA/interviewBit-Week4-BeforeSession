public class Solution {
    public int numSetBits(long a) {
        String s = String.valueOf(Long.toBinaryString(a));
        int count =0;
        
        for(int i=0;i<s.length();i++) {
            if( s.charAt(i) == '1'){
                count ++;
            }
        }
        return count;
    }
}
