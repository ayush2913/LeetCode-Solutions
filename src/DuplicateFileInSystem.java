//609. Find Duplicate File in System
class Solution {
    public List<List<String>> findDuplicate(String[] paths) {
        List<List<String>> result = new ArrayList<List<String>>();
        if(paths.length == 0) return result;
        Map<String,Integer> map = new HashMap<String,Integer>();
        for(String path:paths){
            System.out.println(path);
            String[] arr = path.split("\\s+");
            String root = arr[0];
            for(int i=1; i<arr.length; i++){
                String filePath = arr[i].split("\\(")[0];
                String content= arr[i].split("\\(")[1];
                if(map.get(content) != null){
                    result.get(map.get(content)).add(root+"/"+filePath);
                }else{
                    List<String> newFile = new ArrayList<String>();
                    newFile.add(root+"/"+filePath);
                    result.add(newFile);
                    map.put(content, result.size()-1);
                }
            }

        }
        int i=0;
        while(i<result.size()){
            if(result.get(i).size()>1) i++;
            else result.remove(i);
        }

        return result;
    }
}