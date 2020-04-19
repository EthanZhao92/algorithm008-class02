/*
给定一个数组，将数组中的元素向右移动 k 个位置，其中 k 是非负数。
 */

public void rotate(int[]nums,int k){

    int temp;
    int prev;
    for(int i=0;i<k; i++){
        prev=nums[nums.length-1];
        for(int j=0;j<nums.length;j++){
            temp=nums[j];
            nums[j]=prev;
            prev=temp;
        }
    }

}