/*8. Create a class called 'Matrix' containing constructor that initializes the number of rows and number of columns of a new Matrix object. The Matrix class has the following information:
1 - number of rows of matrix
2 - number of columns of matrix
3 - elements of matrix in the form of 2D array
The Matrix class has methods for each of the following:
1 - get the number of rows
2 - get the number of columns
3 - set the elements of the matrix at given position (i,j)
4 - adding two matrices. If the matrices are not addable, "Matrices cannot be added" will be displayed.
5 - multiplying the two matrices
 */

 public class Matrix {
  private int rows;
  private int columns;
  private int[][] elements;

  public Matrix(int rows, int columns) {
      this.rows = rows;
      this.columns = columns;
      this.elements = new int[rows][columns];
  }

  public int getRows() {
      return rows;
  }

  public int getColumns() {
      return columns;
  }

  public void setElement(int i, int j, int value) {
      if (i >= 0 && i < rows && j >= 0 && j < columns) {
          elements[i][j] = value;
      } else {
          System.out.println("Invalid position. Cannot set element.");
      }
  }
  public Matrix add(Matrix matrix) {
 
      Matrix result = new Matrix(rows, columns);
      for (int i = 0; i < rows; i++) {
          for (int j = 0; j < columns; j++) {
              result.elements[i][j] = this.elements[i][j] + matrix.elements[i][j];
          }
      }
      return result;
 }

  public Matrix multiply(Matrix matrix) {

      Matrix result = new Matrix(rows, matrix.columns);
      for (int i = 0; i < rows; i++) {
          for (int j = 0; j < matrix.columns; j++) {
              for (int k = 0; k < columns; k++) {
                  result.elements[i][j] += this.elements[i][k] * matrix.elements[k][j];
              }
          }
      }
      return result;
  }

  public void printMatrix() {
      for (int i = 0; i < rows; i++) {
          for (int j = 0; j < columns; j++) {
              System.out.print(elements[i][j] + " ");
          }
          System.out.println();
      }
  }
}