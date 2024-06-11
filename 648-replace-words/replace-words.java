class Solution {
    public String replaceWords(List<String> dictionary, String sentence) {
        String[] arr = sentence.split(" ");

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<dictionary.size();j++){
                if(arr[i].startsWith(dictionary.get(j))){
                    arr[i] = dictionary.get(j);
                }
            }
        }
        String ans = "";
        for(String i:arr){
            ans+=i;
            ans+=" ";
        }
        return ans.trim();
    }
}