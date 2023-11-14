import java.util.Scanner;


public class RunMatrix {
  public static void main(String[] args) {
    int size;


    Scanner scan = new Scanner(System.in);

    System.out.println("Enter the size you want the matrix to be ");

    size = scan.nextInt();

    Matrix matrix = new Matrix(size);

    matrix.printMatrix(size);

    //for (int i = 0; i < size;i++) {
    //  for(int j = 0; j < size;j++) {
     //   System.out.print(matrix[i][j] + "\t");
    //  }System.out.println();
   // }
    System.out.println("\nThe populated matrix looks like: ");
    matrix.populateMatrix();
    matrix.printMatrix(size);

   // for (int i = 0; i < size;i++) {
    //  for(int j = 0; j < size; j++) {
   //     System.out.print(matrix[i][j] + "\t");
  //    }System.out.println(); //Move to the next line for the next row
 //   }
  }
}
