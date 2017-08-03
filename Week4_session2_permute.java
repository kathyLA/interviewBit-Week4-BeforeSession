public class Solution {
    public ArrayList<ArrayList<Integer>> permute(ArrayList<Integer> a) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
        permute(a, 0, res);
        return res;
    }
    
    
    void permute(ArrayList<Integer> num, int start, ArrayList<ArrayList<Integer>> res) {
        
        if (start >= num.size()) {
            ArrayList<Integer> item = new ArrayList<Integer>(num);
            res.add(item);
        }
        
        for (int j = start; j <= num.size() - 1; j++) {
            swap(num, start, j);
            permute(num, start + 1, res);
            swap(num, start, j);
        }
    }
    
    
    private void swap(ArrayList<Integer> a, int i, int j) {
        int temp = a.get(i);
        a.set(i,a.get(j));
        a.set(j,temp);
    }
}
