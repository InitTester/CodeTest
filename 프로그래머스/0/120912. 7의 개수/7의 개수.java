class Solution {
    public int solution(int[] array) {
        int answer = 0;
        for(int i=0; i <array.length; i ++){
            String value = String.valueOf(array[i]);
            
            for(char c : value.toCharArray()){
             if(c == '7')
                 answer++;
            }
        }
        return answer;
    }
}