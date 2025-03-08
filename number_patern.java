import java.util.Scanner;

public class number_patern {

    public static void main(String[] args) {
        int i, j;
        System.out.println("Number pattern based.....");
        Scanner read= new Scanner(System.in);

        System.out.println("Enter the number of row");
        int row= read.nextInt();

        for(i=1;i<=row; i++){

            for(j=1;j<=i;j++){
                System.out.print(j + " ");
            }

            System.out.println();
        }

        read.close();
    }
    
}
