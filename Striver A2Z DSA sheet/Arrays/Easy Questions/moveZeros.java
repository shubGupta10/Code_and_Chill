import java.util.ArrayList;

public class moveZeros {
    public static void main(String[] args) {
        int [] a = {1, 0, 2, 3, 2, 0, 0, 4, 5, 1};
        int n = a.length;
        int [] result = moveZerotoEnd(a, n);
        for(int ans : result){
            System.out.println(ans);
        }
    }

    static int [] moveZerotoEnd(int [] a, int n){
        ArrayList<Integer> temp = new ArrayList<>();
        n = a.length;
        for(int i=0; i<n; i++){
            if(a[i] != 0){
                temp.add(a[i]); //elem ko add kiya
            }
        }
            int nz = temp.size();
        

        //coping elem from nz
        for(int i=0; i<n; i++){
            a[i] = temp.get(a[i]);
        }

        //fill rest of the cell with zero
        for(int i=nz; i<n; i++){
            a[i] = 0;
        }

        return a;
        
    }
}
