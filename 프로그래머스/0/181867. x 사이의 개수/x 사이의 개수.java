// class Solution {
//     public int[] solution(String myString) {
        
//         String[] result = myString.split("x",-1);
//         int[] answer = new int[result.length];
//         int i=0;
        
//         for(String value : result )
//             answer[i++] = value.length();
//         return answer;
//     }
// }


import java.util.Arrays;

class Solution {
    public int[] solution(String myString) {

        return Arrays.stream(myString.split("x", myString.length()))
            .mapToInt(x -> x.length())
            .toArray();
    }
}