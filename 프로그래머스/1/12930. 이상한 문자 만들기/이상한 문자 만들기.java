class Solution {
    public String solution(String s) {
        StringBuilder answer=new StringBuilder();
        int cnt = 0;

        for (int i=0; i < s.length(); i++) {
            char c=s.charAt(i);

            if (c==' ') {
                answer.append(' ');
                cnt = 0;
                continue;
            }

            if (cnt % 2 == 0) {
                answer.append(Character.toUpperCase(c));
            } else {
                answer.append(Character.toLowerCase(c));
            }
            cnt++;
        }

        return answer.toString();
    }
}
