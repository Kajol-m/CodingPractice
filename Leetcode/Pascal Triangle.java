class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();//create ArrayList
        
        for(int i=0; i<numRows; i++){
            List<Integer> l1 = new ArrayList<>();//new ArrayList
            l1.add(1);//Add 1 in index 0
            if(i > 0){//for I>0
                List<Integer> prevRow = result.get(i-1);//Previous List
                for(int j=0; j<prevRow.size()-1; j++){//Iterate from 0---->size-1
                    int num = prevRow.get(j) + prevRow.get(j+1);//add nums
                    l1.add(num);
                }
                l1.add(1);//add 1 in end of list
            }
            result.add(l1);//add list to resultant list
        }
        return result;//return result
    }
}
