public class Solution {
    // DO NOT MODIFY THE LIST
    public int singleNumber(final List<Integer> a) {
        int unique = 0;
        for (int i=0;i< a.size();i++){
            unique = unique ^ a.get(i) ;
        }
        return unique;
    }
}
