class Solution {

    public String encode(List<String> strs) {
        int n = strs.size();
        StringBuilder string = new StringBuilder();
        for(int i = 0 ; i < n ; i++){
            string.append(strs.get(i));
            string.append("@5");
        }
        return string.toString();
    }

    public List<String> decode(String str) {
        List<String> ans = new ArrayList<>();
        int n = str.length();
        StringBuilder string = new StringBuilder();
        for(int i = 0 ; i < n ; i++){
            if((str.charAt(i) == '@') && ((i+1) < n) && (str.charAt(i+1) == '5')){
                ans.add(string.toString());
                i++;
                string = new StringBuilder();
                continue;
            }
            string.append(str.charAt(i));
        }
        return ans;
    }
}
