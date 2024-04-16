// class Solution {
//     public String solution(String myString) {
//         StringBuilder answer = new StringBuilder();
        
//         for(char c : myString.toCharArray()){
//             answer.append(c <'l' ? 'l' : c);            
//         }
        
//         return answer.toString();
//     }
// }

class Solution{
    public String solution(String myString){
        
        return myString.replaceAll("[^l-z]","l");
    }
}