public class Count_NGE {
    public static void main(String[] args) {
        int[] arr = {3, 4, 2, 7, 5, 8, 10, 6};
        int[] indices = {0, 5};
        int queries = 2;
        
        int[] result = count_NGE(arr.length, arr, queries, indices);
        
        for (int count : result) {
            System.out.print(count + " ");
        }
    }

    public static int[] count_NGE(int N, int arr[], int queries, int indices[]){
        int [] result = new int[queries];

        for(int i=0; i<queries; i++){
            int index = indices[i];
            int count = 0;


            for(int j = index + 1; j<N; j++){
                if(arr[j] > arr[index]){
                    count++;
                }
            }
            result[i] = count;
        }
        return result;
    }
}
