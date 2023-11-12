import java.util.Scanner;


public class RunMatrix {
  public static void main(String[] args) {
    int count = 1;

    Scanner scan = new Scanner(System.in);

    System.out.println("Enter the size you want the matrix to be ");

    int size = scan.nextInt();

    int[][] matrix = new int [size][size];

    System.out.println("\nThe size of your matrix will be " + size + "x" + size);
    System.out.println("Printing Matrix...");
    for (int i = 0; i < size;i++) {
      for(int j = 0; j < size;j++) {
        System.out.print(matrix[i][j] + "\t");
      }System.out.println();
    }
    for(int i = 0;i < size; i++) {
      for(int j = 0;j < size;j++) {
        matrix[i][j] = count++;
      }
    }
    System.out.println("The populated matrix looks like: ");

    for (int i = 0; i < size;i++) {
      for(int j = 0; j < size; j++) {
        System.out.print(matrix[i][j] + "\t");
      }System.out.println(); //Move to the next line for the next row
    }




  }
}
