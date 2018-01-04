// 207. Course Schedule
// Basically Cycle Detection in directed graph
class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        if(prerequisites.length==0) return true;
        ArrayList[] adjMatrix = new ArrayList[numCourses];
        for(int i=0; i<numCourses; i++){
            adjMatrix[i] = new ArrayList<Integer>();
        }
        for(int i=0; i<prerequisites.length; i++){
            adjMatrix[prerequisites[i][1]].add(prerequisites[i][0]);
        }
        int[] coursesVisited = new int[numCourses];
        for(int i=0; i<numCourses; i++){
            if(isCycle(adjMatrix,coursesVisited,i)) return false;
        }
        return true;
    }

    public boolean isCycle(ArrayList[] adjMatrix, int[] coursesVisited, int course){
        if(coursesVisited[course]==1) return true;
        coursesVisited[course] = 1;
        for(int i=0; i<adjMatrix[course].size(); i++){
            if(isCycle(adjMatrix,coursesVisited,(int)adjMatrix[course].get(i))) return true;
        }

        coursesVisited[course] = 0;
        return false;
    }
}