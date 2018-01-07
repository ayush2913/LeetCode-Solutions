//692. Top K Frequent Words
class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        Map<String, Integer> map = new HashMap<String,Integer>();
        for(int i=0; i<words.length; i++){
            if(map.get(words[i])!=null){
                map.put(words[i],map.get(words[i])+1);
            }else{
                map.put(words[i],1);
            }
        }
        List<String> keys = new ArrayList<String>(map.keySet());
        Collections.sort(keys, new Comparator<String>(){
            public int compare(String a, String b){
                return map.get(a)!=map.get(b)?map.get(b)-map.get(a):a.compareTo(b);
            }
        });
        return keys.subList(0,k);
    }
}