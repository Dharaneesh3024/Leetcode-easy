class Solution {
    public long interchangeableRectangles(int[][] rectangles) {
     long count=0;
     double arr[]=new double[rectangles.length];
     for(int i=0;i<rectangles.length;i++){
        arr[i]=(double)rectangles[i][0]/rectangles[i][1];
     }
    long same=1;
    Arrays.sort(arr);
    for(int i=1;i<arr.length;i++){
        if(arr[i]==arr[i-1]){
            count+=same;
            same++;
        }
        else{
            same=1;
        }
    }
     return count;
    }
}