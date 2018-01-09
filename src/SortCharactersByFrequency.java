//451. Sort Characters By Frequency
class Solution {
    public String frequencySort(String s) {
        char[] arr = s.toCharArray();
        Map<Character,Integer> map = new HashMap<Character, Integer>();
        for(int i=0; i<arr.length; i++){
            if(map.get(arr[i])!=null){
                map.put(arr[i], map.get(arr[i])+1);
            }else{
                map.put(arr[i],1);
            }
        }
        PriorityQueue<Character> pq = new PriorityQueue<Character>(new Comparator<Character>(){
            public int compare(Character a, Character b){
                return map.get(a)<map.get(b)?1:-1;
            }
        });
        for(char key : map.keySet())
            pq.add(key);
        char[] res = new char[arr.length];
        int count = 0;
        while(!pq.isEmpty()){
            char letter = pq.poll();
            for(int i=0; i<map.get(letter); i++){
                res[count] = letter;
                count++;
            }
        }

        return new String(res);
    }
}