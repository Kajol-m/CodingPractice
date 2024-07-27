class Solution {
    public int[][] merge(int[][] intervals) {
        List<List<Integer>> result=new ArrayList<>();
        List<Integer> list1;
       if(intervals.length<2){
        return intervals;
       }else{
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        for(int i=0;i<intervals.length;i++){
            if(result.isEmpty()){
                list1=new ArrayList<>();
                list1.add(intervals[i][0]);
                list1.add(intervals[i][1]);
                result.add(list1);
            }
            else{
                int n=result.size();
                if(result.get(n-1).get(1)>=intervals[i][0]){
                    result.get(n-1).set(1,Math.max(result.get(n-1).get(1),intervals[i][1]));
                }
                else{
                    list1=new ArrayList<>();
                    list1.add(intervals[i][0]);
                    list1.add(intervals[i][1]);
                    result.add(list1);
                }
            }
        }
            int s=result.size();
            int res[][]=new int[s][2];
            for(int j=0;j<res.length;j++){
                for(int k=0;k<res[j].length;k++){
                    res[j][k]=result.get(j).get(k);
                }
            }
        
        return res;
       }
        
    }
}
/*
class Solution {
    public int[][] merge(int[][] intervals) {
        if (intervals.length < 2) {
            return intervals;
        }

        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        List<int[]> result = new ArrayList<>();
        int[] current = intervals[0];

        for (int i = 1; i < intervals.length; i++) {
            if (current[1] >= intervals[i][0]) {
                current[1] = Math.max(current[1], intervals[i][1]);
            } else {
                result.add(current);
                current = intervals[i];
            }
        }

        result.add(current);

        int[][] res = new int[result.size()][2];
        for (int i = 0; i < result.size(); i++) {
            res[i] = result.get(i);
        }

        return res;
    }
}
*/
