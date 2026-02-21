class Solution {
    public int countPrimeSetBits(int left, int right) {
        int cnt = 0;
        for(int i=left;i<=right;i++){
            if(checkPrime(countBits(i)))
            cnt++;
        }
        return cnt;
    }
    
    static int countBits(int n){
        int ans=0;
        while(n!=0){
            if((n&1) == 1){
                ans++;
            }
            n>>=1;
        }
        return ans;
    }

    static boolean checkPrime(int n){
        if(n <= 1){
            return false;
        }
        for(int i=2;i*i<=n;i++){
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }
}