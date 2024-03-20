import java.util.ArrayList;

public class superiorElement {
    public static void main(String[] args){

        int n = 6;
        int arr[]=  {10, 22, 12, 3, 0, 6};
      
      
        ArrayList<Integer> ans = superiorElements(arr, n);
        
        for (int i = 0; i < ans.size(); i++) {
          System.out.print(ans.get(i)+" ");
        }
    }

    static ArrayList<Integer> superiorElements(int []a, int n){
        
        ArrayList<Integer> ans = new ArrayList<>();

        for(int i=0; i<n; i++ ){
            boolean leader = true;


            for(int j=i+1; j<n; j++ ){
                if(a[j] > a[i]){
                    leader = false;
                    break;
                } 
            }
            if(leader){
                ans.add(a[i]);
            }
        }
        return ans;
        
    }
}
