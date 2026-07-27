class Solution {
    public boolean isPalindrome(int x) {
        int s=0;
        int n=x;
        while(x>0){
            int r=x%10;
            s=(s*10) +r;
            x=x/10;
        }
        if(s==n){
            return true;
        }
        return false;
        
    }
    public void main(String args[]){
        int x=121;
        System.out.println(isPalindrome(x));
    }
}