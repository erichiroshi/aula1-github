package chess.boardgame;

public class Position {

	private int row;
	private int column;

	public Position(int row, int column) {
		this.row = row;
		this.column = column;
	}

	public void setValues(int row, int column) {

	}

	public int getRow() {
		return row;
	}

	public int getColumn() {
		return column;
	}

	@Override
	public String toString() {

		return row + ", " + column;
	}

}
