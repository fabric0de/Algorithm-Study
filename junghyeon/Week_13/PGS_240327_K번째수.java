package junghyeon.Week_13;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length]; 

        for (int i = 0; i < commands.length; i++) {
            int start = commands[i][0] - 1; 
            int end = commands[i][1]; 
            int k = commands[i][2] - 1; 

            int[] tempArray = new int[end - start];
            for (int j = start; j < end; j++) {
                tempArray[j - start] = array[j];
            }
            
            java.util.Arrays.sort(tempArray);

            answer[i] = tempArray[k];
        }
        return answer;
    }
}
