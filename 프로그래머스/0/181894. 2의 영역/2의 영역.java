// import java.util.*;

// class Solution {
//     public int[] solution(int[] arr) {

//         int start = -1;
//         int end = -1;
        
//         for(int i=0 ; i< arr.length; i++){
//             if(arr[i]==2){
//                 if(start==-1){
//                     start = i;
//                 }
//                 end = i;
//             }    
//         }
        
//         int[] answer = new int[start<0? 1: end-start+1];
        
//         if(start<0){
//             answer[0] = -1;
//         }else{
//             for(int i=start, j=0; i <= end; i++){
//                 answer[j++] = arr[i];
//             }
//         }
        
//         return answer;
//     }
// }

// import java.util.stream.IntStream;

// class Solution {
//     public int[] solution(int[] arr) {
//         int[] idx = IntStream.range(0, arr.length).filter(i -> arr[i] == 2).toArray();
//         if (idx.length == 0) return new int[]{-1};
//         return IntStream.rangeClosed(idx[0], idx[idx.length - 1]).map(i -> arr[i]).toArray();
//     }
// }



import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        int start = -1;
        int end = -1;

        for(int i=0;i<arr.length;i++){
            if(arr[i]==2){
                if(start==-1){
                    start = i;
                }
                end = i;
            }
        }

        if(start==-1){
            answer = new int[]{-1};
        }else{

            answer = Arrays.copyOfRange(arr,start,end+1);
        }



        return answer;
    }
}
