class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb=new StringBuilder();
        for(String s:strs){
            sb.append(s.length()).append('#').append(s);
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> res=new ArrayList<>();
        char[] ch=str.toCharArray();

        for(int i=0;i<ch.length;i++){
            StringBuilder sb=new StringBuilder();
            while(ch[i]!='#'){
                sb.append(ch[i++]);
            }
            i++;
            int length=Integer.valueOf(sb.toString());
            int end=i+length;
            sb=new StringBuilder();
            while(i<end){
                sb.append(ch[i++]);
            }
            i--;
            res.add(sb.toString());
        }
        return res;
    }
}
