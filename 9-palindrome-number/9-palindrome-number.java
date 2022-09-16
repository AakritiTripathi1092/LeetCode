class Solution {
    public boolean isPalindrome(int x) {
        int reverse=0;
        int n=0;
        if(x<0||x%10==0 && x!=0)
            return false;
        while(x>reverse){
            n=x%10;
            reverse=reverse*10+n;
            x=x/10;
        }
        return x==reverse||x==reverse/10;
        
        
            
            
            
            
        
        
    }
}