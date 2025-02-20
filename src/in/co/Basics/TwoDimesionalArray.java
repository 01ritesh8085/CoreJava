package in.co.Basics;

public class TwoDimesionalArray {
	
	public static void main(String[] args) {
		/*int[][]table = new int[9][10];//fill the table value from 1 to 10
		for(int row=0;row<9;row++);
		for(int col=0;0<10;col++);
		  table[row][col] = [row+1] * [col + 2];
		  
	
	
		
for(int row =0;row<9;row++) {
	
		for(int col=0;col<10;col++) {
			System.out.print(table[row][col] + "\t");
        }
        System.out.println();
    }
}



*/
		
	
		int[][] table = new int[9][10];

        // Initialize the table with values from 2 to 10
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 10; j++) {
                table[i][j] = (i + 2) * (j + 1);
            }
        }

        // Print the table
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(table[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
	
	

