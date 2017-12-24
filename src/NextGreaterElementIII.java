class Solution {
    public int nextGreaterElement(int n) {
        String num = Integer.toString(n);
        int index = -1;
        for(int i=num.length()-2; i>=0; i--){
            //System.out.println("AYUSH");
            if(num.charAt(i)<num.charAt(i+1)){
                index = i;
                break;
            }
        }
        if(index == -1)
            return index;
        for(int i=num.length()-1; i>index; i--){
            if(num.charAt(i)>num.charAt(index)){
                StringBuilder sb = new StringBuilder(num);
                sb.setCharAt(i, num.charAt(index));
                sb.setCharAt(index, num.charAt(i));
                num = sb.toString();
                break;
            }
        }
        String res = "";
        for(int i=0; i<num.length(); i++){
            if(i<=index){
                res = res+num.charAt(i);
            }else{
                res = res+num.charAt(num.length()-(i-index));
            }
        }
        //System.out.println(res);
        try {
            return Integer.parseInt(res);
        } catch (final NumberFormatException e) {
            return -1;
        }
    }
}