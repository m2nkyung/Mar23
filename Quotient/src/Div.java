//정수 num1과 num2가 매개변수로 주어질 때, num1을 num2로 나눈 값에 1,000을 곱한 후 정수 부분을 return 하도록 soltuion 함수를 완성해주세요.


class Solution {
    public int solution(int num1, int num2) {
        int answer = 0;
        double tmp = num1 / (double)num2;
        
        answer = (int)(tmp * 1000);
        return answer;
    }
}