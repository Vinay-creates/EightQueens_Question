public class GameStrategy {
	private boolean placedQueens[][] = new boolean[8][8];
	private int numQueens = 0;

	private int getColumn(int cellId) {
		// WRITE YOUR LOGIC HERE...................................	
		
		int cn = cellId%8;
		return cn;	// just for the heck of it
	}
	
	private int getRow(int cellId) {
		// WRITE YOUR LOGIC HERE....................................
		
		int rn = cellId/8;
		return rn;	// just for the heck of it
	}

	public boolean isValidPosition(int cellId) {
		boolean isValid = true;
        
		if(numQueens == 8) throw new GameOverException();	// just return out of the method

		// the game is still on, so let us continue...
		
		int col = getColumn(cellId);
		
		int row = getRow(cellId);
		/*
			WRITE YOUR LOGIC HERE...............................

		*/
//		[row][col]
		for(int i =0;i < 8;i++) {
			if(placedQueens[i][col] == true) {
				if(i != row) {
					return false;
				}
			}
		}
		for(int i =0;i < 8;i++) {
			if(placedQueens[row][i] == true) {
				if(i != col) {
					return false;
				}
			}
		}
		int row1= row;
		int col1= col;
		while(row1 < 8 && col1 < 8 && row1>=0 && col1>=0) {
			if(placedQueens[row1][col1] == true) {
				return false;
			}
			row1++;
			col1++;
		}
		
	    row1= row;
		col1= col;
		while(row1 < 8 && col1 < 8 && row1>=0 && col1>=0) {
			if(placedQueens[row1][col1] == true) {
				return false;
			}
			row1++;
			col1--;
		}
		
		row1= row;
		col1= col;
		while(row1 < 8 && col1 < 8 && row1>=0 && col1>=0) {
			if(placedQueens[row1][col1] == true) {
				return false;
			}
			row1--;
			col1--;
		}
		
		row1= row;
		col1= col;
		while(row1 < 8 && col1 < 8 && row1>=0 && col1>=0) {
			if(placedQueens[row1][col1] == true) {
				return false;
			}
			row1--;
			col1++;
		}
		placedQueens[row][col] = true;	
		numQueens++;
		return isValid;
	}
}














