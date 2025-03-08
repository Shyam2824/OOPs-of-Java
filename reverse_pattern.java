import java.util.Scanner;

public class reverse_pattern {

    public static void main(String[] args) {
        
        System.out.println("Reverse number pattern problem");

        Scanner read= new Scanner(System.in);

        System.out.println("Enter number of row: ");
        int row = read.nextInt();
        int i,j;
        
        for(i=row; i>=1; i--){
            for(j=1; j<=i; j++){

                System.out.print(j + " ");
            }

            System.out.println();
        }

        read.close();
    }
    
}
