class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int res=0;
        for(char s:stones.toCharArray()){
            for(char j:jewels.toCharArray()){
                if(s==j){
                    res=res+1;
                }
                
            }
        }
        return res;
           
       
    }
}