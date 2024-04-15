class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
        int i = 0;
        int j = 0;
        int index = 0;
        int[] answer = new int[nums1.length + nums2.length];
        while(i < nums1.length && j < nums2.length && index <= answer.length/2 +1){
            if(nums1[i] > nums2[j]) answer[index++] = nums2[j++];
            else if(nums1[i] <= nums2[j]) answer[index++] = nums1[i++];
        }

        while( i < nums1.length && index <= answer.length/2 +1){
            answer[index++] = nums1[i++];
        }
        while(j < nums2.length && index <= answer.length/2 +1){
            answer[index++] = nums2[j++];
        }

        if(answer.length % 2 == 0){
            return ((double)answer[answer.length / 2] + (double)answer[answer.length / 2 - 1]) /2;
        }else{
            return (double)answer[answer.length / 2];
        }
    }
}