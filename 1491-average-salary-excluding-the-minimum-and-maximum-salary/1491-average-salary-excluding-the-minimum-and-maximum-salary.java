class Solution {
    public double average(int[] salary) {
        int max = IntStream.of(salary).max().orElse(0);;
        int min = IntStream.of(salary).min().orElse(0);;
        int sum = IntStream.of(salary).sum() - max - min;
        return (double) sum / (salary.length-2);
    }
}