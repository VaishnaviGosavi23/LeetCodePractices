class Solution9 {
    public boolean isPalindrome(int x) {
        if(x<0)
        {
            return false;
        }

        int sum=0;
        int temp=x;
        while(temp!=0)
        {
            int digit=(int)(temp%10);
            sum=sum*10+digit;
            temp/=10;
        }
        return(sum==x);
    }
}
