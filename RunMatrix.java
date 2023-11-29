import java.util.Scanner;


public class RunMatrix {
  public static void main(String[] args) {
    int size,x1,x2,y2,y1;


    Scanner scan = new Scanner(System.in);

    System.out.println("Enter the size you want the matrix to be ");

    size = scan.nextInt();

    Matrix matrix = new Matrix(size);

    matrix.printMatrix(size);

    System.out.println("\nThe populated matrix looks like: ");
    matrix.populateMatrix();
    matrix.printMatrix(size);

    System.out.println("\nFlipping Matrix...");
    matrix.flipMatrix();
    matrix.printMatrix(size);

    scan.close();
  }

}
