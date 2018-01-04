//49. Group Anagrams
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<List<String>>();
        if(strs.length == 0) return result;
        Map<String,Integer> map = new HashMap<String, Integer>();
        int count = 0;
        for(int i=0; i<strs.length; i++){
            char[] tempArray = strs[i].toCharArray();
            Arrays.sort(tempArray);
            String key = new String(tempArray);
            if(map.get(key)!=null){
                result.get(map.get(key)).add(strs[i]);
            }else{
                List<String> newList = new ArrayList<String>();
                newList.add(strs[i]);
                result.add(newList);
                map.put(key,count);
                count++;
            }
        }

        return result;
    }
}