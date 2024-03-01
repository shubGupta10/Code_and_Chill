import java.util.Scanner;

public class datatypeSize {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        String dataType = in.nextLine();

        switch (dataType.toLowerCase()) {
            case "integer":
                System.out.println("4");
                break;
        
            case "long":
                 System.out.println("8");
                 break;
        
            case "float":
                  System.out.println("4");
                  break;

            case "double":
                  System.out.println("8");
                  break;

            case "character":
                  System.out.println("1");
                  break;
            default:
                break;
        }
    }
}
