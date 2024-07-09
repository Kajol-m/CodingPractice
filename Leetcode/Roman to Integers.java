import java.util.*;
class Solution {
    public int romanToInt(String s) {
        int result=0;
        HashMap<Character,Integer> map=new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        char a[]=s.toCharArray();
        int n=a.length;
        int prev=0;int curr=0;
        for(int i=n-1;i>=0;i--){
            curr=map.get(a[i]);
            if(curr>=prev){
                result=result+curr;
            }
            else{
                result=result-curr;
                if(result==prev){
                    return -1;
                }
            }
            prev=curr;
        }
        return result;
        
    }
}
