class Solution {
    public int romanToInt(String s) {
        int[] x = new int[26];
        x['I' - 'A'] = 1;
        x['V' - 'A'] = 5;
        x['X' - 'A'] = 10;
        x['L' - 'A'] = 50;
        x['C' - 'A'] = 100;
        x['D' - 'A'] = 500;
        x['M' - 'A'] = 1000;
        if(s.length == 1) return x[s.charAt[0] - 'A'];

        char[] value = s.toCharArray();
        int answer = 0;
        int j=0;
        int temp = 0;
        
        // 1. 현재 수가 다음 수보다 크다면 더한다.
        // 2. 현재 수가 다음 수와 같다면 기록한다.
        // 3. 현재 수가 다음 수와 다르고, 현재 수가 다음 수보다 작다면, (기록된 값을 더한 값 - 다음 값)을 더한다.
        // 그 후, i 를 2더해준다.
        for(int i=0; i+1<value.length; i++){
            if(x[value[i] - 'A'] > x[value[i+1] - 'A']) {
                answer += x[value[i] - 'A'] + temp;
                temp = 0;
            }
            else if(x[value[i] - 'A'] == x[value[i+1] - 'A']) temp += x[value[i]-'A'];
            else{
                int z = x[value[i+1] - 'A'] -temp -x[value[i] - 'A'] ;
                answer += z;
                i++;
                temp =0;
            }
            System.out.println(answer);
        }

        if(x[value[value.length-1]-'A'] <= x[value[value.length-2] - 'A']) 
            answer += temp + x[value[value.length-1] - 'A'];

        return answer;
    }
}