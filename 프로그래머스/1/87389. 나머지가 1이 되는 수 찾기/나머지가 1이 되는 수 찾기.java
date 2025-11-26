class Solution {
    public int solution(int n) {
        int answer = 0;
        int result = 0;
        for(int i = 1; i < n ; i ++){
            if( (n % i) == 1){
                result = i;
            }
            if(answer == 0){
                answer = result;
            }
            else if (answer > result){
                answer = result;
            }
        }
        return answer;
    }
}