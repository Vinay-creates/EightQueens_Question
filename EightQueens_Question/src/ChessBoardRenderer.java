public class ChessBoardRenderer {
	public boolean isBlackSquare(int square) {

		// WRITE YOUR LOGIC HERE...
		boolean color = true;
		if((square/8) % 2 == 0) {
			if(square % 2 == 0) {
				color = false;
			}
		}
		else {
			if(square % 2 == 1)
				color = false;
		}
		
		return color;
	}
}
