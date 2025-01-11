class Solution {
    public String solution(int age) {
        StringBuilder answer = new StringBuilder();
        String change = Integer.toString(age);

        for (char num : change.toCharArray()) {
            answer.append((char) (num - '0' + 'a'));
        }

        return answer.toString();
    }
}