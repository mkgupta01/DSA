class Solution {
    public boolean judgeSquareSum(int c) {
     
  
    for(long i=0;i*i<=c;i++){
        long diff=c-i*i;
        if(check(diff)){
            return true;
        }
    }
        return false;
    }

    public boolean check(long c){
        long l=0;
        long r=c;
        while(l<=r){
           long mid=(l+r)/2;
            if(mid*mid==c){
                return true;
            }
            else if(mid*mid<c){
                l=mid+1;
            }
            else{
              r=mid-1;
            }
        }
        return false;
    }
}