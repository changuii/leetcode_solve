class Solution {
    public int calPoints(String[] operations) {
        int i = -1;
        List<Integer> arr = new ArrayList<>();

        for(String x : operations){
            if(x.equals("C")){
                arr.remove(i--);
            }else if(x.equals("D")){
                int v = arr.get(i++) * 2;
                arr.add(v);
            }else if(x.equals("+")){
                int v = arr.get(i) + arr.get(i-1);
                arr.add(v);
                i++;
            }else{
                arr.add(Integer.parseInt(x));
                i++;
            }
        }

        int sum = 0;
        for(int x : arr){
            sum += x;
        }
        return sum;
    }
}