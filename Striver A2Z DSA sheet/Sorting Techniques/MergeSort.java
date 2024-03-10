


public class MergeSort {
    public static void main(String[] args) {
        int [] arr = {6,3,9,2,5,8};
        int n = arr.length;

        Divide(arr, 0, n-1);
        for (int i=0; i<n; i++){
            System.out.printf(arr[i] + " ");
        }
        System.out.printf("");
    }

    static void Divide(int [] arr, int si, int ei){
        if(si>=ei){
            return;
        }
        int mid = si + (ei-si) / 2;
        Divide(arr, si, mid);
        Divide(arr, mid+1, ei);
        Conquer(arr, mid, si, ei);
    }


    static void Conquer(int[] arr, int mid, int si, int ei){
        int merged[] = new int[ei-si+1]; // defining the length of the new merged array
        int idx1 = si;
        int idx2 = mid+1;

//        to track out merged array we use x
        int x = 0;
        while (idx1 <= mid  && idx2 <= ei){ //agar idx1 ke elem chota h to usko x me daal do aur x++ aur idx1++ kr do
            if(arr[idx1] <= arr[idx2]){
                merged[x] = arr[idx1];
                x++; idx1++; //x ko aage badha do aur idx1 ko bhi agle index pe bhej do.
            } else {
                merged[x] = arr[idx2];
                x++; idx2++; //same uper wala
            }
        }

        while (idx1 <= mid){
            merged[x++] = arr[idx1++];
        }

        while(idx2 <= ei){
            merged[x++] = arr[idx2++];
        }

        for (int i=0, j=si; i<merged.length; i++ , j++){
            arr[j] = merged[i]; //yha pe loop run kr rhe aur merged elem ko original array me daal rhe.
        }
    }
}
