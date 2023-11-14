public class Matrix {
  private int [][] matrix;
  public Matrix(int size) {
    matrix = new int[size][size];
    System.out.println("The size of your matrix will be" + size + "x" + size);
  }

  public void printMatrix(int size) {
    for (int i = 0; i < size;i++) {
      for(int j = 0; j < size;j++) {
        if(j == matrix.length - i - 1) {
          System.out.print("\u001b[31m");
        }
        else {
          System.out.print("\u001b[0m");
        }
          System.out.print(matrix[i][j] + "\t");
      }System.out.println();
    }
  }
  public void populateMatrix () {
    int count = 1;
    for(int i = 0;i < matrix.length; i++) {
      for(int j = 0;j < matrix.length;j++) {
        matrix[i][j] = count++;
      }
    }
  }
  public void flipMatrix() {
    int length = matrix.length;
    for(int i = 0; i < length / 2;i++) {
      for(int j = 0; j < length;j++) {
        if(j != i && j != length - 1 - i){
          //swap(i,j,length - 1 - i,j);
        }
      }
    }
  }
}
