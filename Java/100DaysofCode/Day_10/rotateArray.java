// Q: Rotate a array clockwise 


//  --> How do we approach it:
//      - First we store the last element into a temp variable.
//      - Now we run a loop backward because we need to traverse out element form end to  beginning , excluding 1st element.
//      - Now we shift the all elements to right.
//      - Place the last element to beginning that we taken into temp like arr[0] = temp;

public class rotateArray{
    public static void main(String[] args){

        int [] arr = {10,20,30,40,50};
        int n = arr.length;

        System.out.println();
        System.out.println("After before Rotation: ");
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }

        System.out.println();


        Arrayrotation(arr, n); 
        System.out.println();

        System.out.println("Arrays after rotation: " );
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }

        
    }

    static void Arrayrotation(int [] arr, int n){
        int temp = arr[n-1]; //storing the last element
        for(int i=n-1; i>0; i--){ //runing our loop backward
            arr[i] = arr[i-1];
        }
        arr[0] = temp; //placing the last element at beginning
    }
}