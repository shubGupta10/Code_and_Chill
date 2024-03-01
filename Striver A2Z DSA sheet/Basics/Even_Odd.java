public class Even_Odd {
    public static void main(String[] args) {
     int n = 123456;
     int even = 0;
     int odd = 0;
     
     while(n > 0){
        int digit = n % 10;
        if(digit % 2 == 0){
            even = even +  digit;
        } else{
            odd = odd + digit;
        }
     }

     System.out.println("Sum of even digits: " + even);
        System.out.println("Sum of odd digits: " + odd);
    }
    
}
