class Solution {
    // here i am using a fixed limiter @5 which may be used in the string 
    // public String encode(List<String> strs) {
    //     int n = strs.size();
    //     StringBuilder string = new StringBuilder();
    //     for(int i = 0 ; i < n ; i++){
    //         string.append(strs.get(i));
    //         string.append("@5");
    //     }
    //     return string.toString();
    // }

    // public List<String> decode(String str) {
    //     List<String> ans = new ArrayList<>();
    //     int n = str.length();
    //     StringBuilder string = new StringBuilder();
    //     for(int i = 0 ; i < n ; i++){
    //         if((str.charAt(i) == '@') && ((i+1) < n) && (str.charAt(i+1) == '5')){
    //             ans.add(string.toString());
    //             i++;
    //             string = new StringBuilder();
    //             continue;
    //         }
    //         string.append(str.charAt(i));
    //     }
    //     return ans;
    // }

    public String encode(List<String> strs) {
        int n = strs.size();
        StringBuilder str = new StringBuilder();
        for(String s : strs){
            str.append(s.length());
            str.append('%');
            str.append(s);
        }

        return str.toString();
    }

    public List<String> decode(String str) {
        int n = str.length();
        List<String> ans = new ArrayList<>();
        for(int i = 0 ; i < n ; i++){
            int len = 0;
            while(str.charAt(i) != '%'){
                len *= 10;
                len += str.charAt(i) - '0';
                i++;
            }
            
            ans.add(str.substring(i + 1, i + 1 + len));
            
            i = i + len;
        }

        return ans;
    }
    
}