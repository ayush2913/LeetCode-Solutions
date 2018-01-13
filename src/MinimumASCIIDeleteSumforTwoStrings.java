//public class MinimumASCIIDeleteSumforTwoStrings {
//}
class Solution {
    public int minimumDeleteSum(String s1, String s2) {
        int[][] arr = new int[s1.length()+1][s2.length()+1];
        arr[s1.length()][s2.length()] = 0;
        for(int i=(s1.length()-1); i>=0; i--){
            System.out.println(i);
            arr[i][s2.length()] = arr[i+1][s2.length()] + (int) s1.charAt(i);
        }
        for(int i=s2.length()-1; i>=0; i--){
            arr[s1.length()][i] = arr[s1.length()][i+1] + (int) s2.charAt(i);
        }

        for(int i=s1.length()-1; i>=0; i--){
            for(int j=s2.length()-1; j>=0; j--){
                if(s1.charAt(i) == s2.charAt(j))
                    arr[i][j] = arr[i+1][j+1];
                else{
                    arr[i][j] = Math.min((int)s1.charAt(i) + arr[i+1][j], (int)s2.charAt(j) + arr[i][j+1]);
                }
            }
        }

        return arr[0][0];
    }
}

