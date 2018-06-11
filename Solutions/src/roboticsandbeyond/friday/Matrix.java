package roboticsandbeyond.friday;

public class Matrix {
	
	private int rows;
	private int cols;
	private int[][] data;
	
	public Matrix(int rows, int cols) {
		this.rows = rows;
		this.cols = cols;
		this.data = new int[rows][cols];
	}
	
	public Matrix(int[][] data) {
		this.rows = data.length;
		this.cols = data[0].length;
		this.data = new int[rows][cols];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				this.data[i][j] = data[i][j];
			}
		}
	}
	
	public Matrix multiply(Matrix m) {
		if (cols != m.rows) {
			System.out.println("Invalid dimensions.");
			return null;
		}
		
		Matrix result = new Matrix(rows, m.cols);
		for (int i = 0; i < result.rows; i++) {
			for (int j = 0; j < result.cols; j++) {
				for (int k = 0; k < cols; k++) {
					result.data[i][j] += (data[i][k] * m.data[k][j]);
				}
			}
		}
		
		return result;
	}
	
	public void print() {
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				System.out.print(data[i][j] + " ");
			}
			System.out.print("\n");
		}
	}
	
	public int getRows() {
		return rows;
	}
	
	public int getCols() {
		return cols;
	}
	
	public int[][] getData() {
		int[][] dataCopy = new int[rows][cols];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				dataCopy[i][j] = data[i][j];
			}
		}
		
		return dataCopy;
	}

}
