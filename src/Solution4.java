import java.util.Arrays;
class Solution4 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int lenghtOfNum1=nums1.length;
        int lengthOfNum2=nums2.length;
        int mergedArrayLength = lenghtOfNum1+lengthOfNum2;
        int[] mergedArray =new int[mergedArrayLength];
        System.arraycopy(nums1,0,mergedArray,0,lenghtOfNum1);
        System.arraycopy(nums2,0,mergedArray,lenghtOfNum1,lengthOfNum2);
        Arrays.sort(mergedArray);
        int total=mergedArray.length;
        if(total%2==1)
        {
            return(double) mergedArray[total/2];
        }
        else{
            int middle1=mergedArray[total/2-1];
            int middle2=mergedArray[total/2];
            return((double) middle1+(double)middle2)/2.0;
        }


    }
}