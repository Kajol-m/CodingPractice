

class Solution
{    
    //Function is to check whether two strings are anagram of each other or not.
    public static boolean isAnagram(String a,String b)
    {
        char aa[]=a.toCharArray();
        char bb[]=b.toCharArray();
        Arrays.sort(aa);
        Arrays.sort(bb);
        if (aa.length!= bb.length) {
            return false;
        }
        for(int i=0;i<aa.length;i++){
            if(aa[i]!=bb[i]){
                //System.out.print("NO");
                return false;
    
            }
            
        }
        //System.out.print("YES");
        return true;
    }
}
