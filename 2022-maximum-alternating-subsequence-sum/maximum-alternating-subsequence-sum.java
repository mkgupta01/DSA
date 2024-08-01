class Solution {
    public long maxAlternatingSum(int[] num) {
        int n = num.length;
        HashMap<String,Long>ans = new HashMap<>();
        return fun(num,0,n,true,ans);
    }
    public long fun(int [] a, int i, int n, boolean b, HashMap<String,Long> map){
        if(i>=n){
            return 0;
        }
        if(map.containsKey(b+" "+i))
        return map.get(b+" "+i);
        long ans = 0;
        if(b){
            ans = Math.max(a[i]+fun(a,i+1,n,!b,map),ans);
        }else{
            ans = Math.max(-a[i]+fun(a,i+1,n,!b,map),ans);
        }
        ans = Math.max(ans,fun(a,i+1,n,b,map));
        map.put(b+" "+i,ans);
        return ans;
    }
}