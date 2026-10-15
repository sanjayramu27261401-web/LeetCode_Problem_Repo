class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int a=m+n;
        int[] b =new int[a];
        for(int i=0;i<m;i++){
            b[i]=nums1[i];
        }
        int g=0;
        for(int j=m;j<a;j++){
            b[j]=nums2[g];
            g++;
        } 
        int temp=0;
        for(int i=0;i<b.length;i++){
            for(int j=i+1;j<b.length;j++){
                if(b[i]>b[j]){
                    temp=b[i];
                    b[i]=b[j];
                    b[j]=temp;
                }
            }
        }
        for(int i=0;i<b.length;i++){
            nums1[i]=b[i];
        }
    }
}