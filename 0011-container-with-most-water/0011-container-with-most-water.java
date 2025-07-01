// class Solution {
//     public int maxArea(int[] height) {
//         int left=0;
//         int right=height.length-1;
//         int max=0;
//         while(left<right){  //heigth                    //distance
//             int current=Math.min(height[left],height[right])*(right-left);
//             //because max area depends on  shorter line * distance between the lines
//             max=Math.max(max,current);
//             if(height[left]<height[right]){ // move the shorter line inward
//                 left++;
//             }else{
//                 right--;
//             }
//         }
//         return max;
//     }
// }
class Solution{
    public int maxArea(int [] height){
        int left=0;
        int right=height.length-1;
        int max=0;
        while(left<right){
            int current=Math.min(height[left],height[right])*(right-left);
            max=Math.max(max,current);
            if(height[left]<height[right]){
                left++;
            }else{
                right--;
            }
        }
        return max;
    }
}