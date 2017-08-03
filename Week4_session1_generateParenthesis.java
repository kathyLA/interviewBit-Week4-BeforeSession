public class Solution {
    public ArrayList<String> generateParenthesis(int a) {
        ArrayList res = new ArrayList<String>();
        generate(res,"",a,0);
        Collections.sort(res);
        return res;
    }
    
    
    void generate(ArrayList<String> a, String str, int n, int m){
        
        if(n==0 && m==0) {
            a.add(str);
            return;
        }
        
        if(m > 0){ generate(a, str+")", n, m-1); }
        if(n > 0){ generate(a, str+"(", n-1, m+1); }
    }
}
