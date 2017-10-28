import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SudokuImpl {
	private static final int VALUE_MAX = 9;
	private static final int VALUE_MIN = 1;
	private static final int VALUES_COUNT = VALUE_MAX - VALUE_MIN + 1;
	private static final int FIELD_WIDTH = VALUES_COUNT;
	private static final int FIELD_HEIGHT = FIELD_WIDTH;
	private static final int BOX_HEIGHT = (int) Math.round(Math
			.sqrt(VALUES_COUNT));
	private static final int BOX_WIDTH = BOX_HEIGHT;
	private Integer[][] field;

	public SudokuImpl(Integer[][] field) {
		this.field = field;
	}

	public boolean isValid() {
		boolean isValid = false;

		isValid = validateGrid();
		if (isValid) {
			isValid = validateRows();
		}

		if (isValid) {
			isValid = validateColumns();
		}

		if (isValid) {
			isValid = validateBoxes();
		}

		return isValid;

	}

	/**
	 * Validate whether the provided Grid is valid.
	 * 
	 * Checks the height, width and cell values
	 * 
	 * @return true if valid, false otherwise
	 */
	private boolean validateGrid() {
		// implement me
		//check lengths
		if(field.length > 9) return false;
		for(int i = 0; i < 9; i ++){
			if(field[i].length > 9) return false;
			for(int j = 0; j < 9; j++){
				if(field[i][j] == null) return false;
				if(field[i][j] > 9) return false;
				if(field[i][j] < 1) return false;
			}
		}
		return true;
	}

	/**
	 * Validate the grid rows
	 * 
	 * @return true if all rows are valid, false otherwise
	 */
	private boolean validateRows() {
		// implement me
		for(int i = 0; i < 9; i++){
			Integer[] row = field[i];
			Set<Integer> rowSet = new HashSet<>(Arrays.asList(row));
			if(rowSet.size() != 9) return false;
		}

		return true;
	}

	/**
	 * Validate the grid columns
	 * 
	 * @return true if all columns are valid, false otherwise
	 */
	private boolean validateColumns() {
		// implement me
		for(int i = 0; i < 9; i++){
			Set<Integer> column = new HashSet<>();
			for(int j = 0; j < 9; j++){
				column.add(field[j][i]);
			}
			if(column.size() != 9) return false;
		}
		return true;
	}

	/**
	 * Validate the grid boxes
	 * 
	 * @return true if all boxes are valid, false otherwise
	 */
	private boolean validateBoxes() {
		// implement me
		Set<Integer> box1 = new HashSet<>();
		box1.add(field[0][0]);
		box1.add(field[0][1]);
		box1.add(field[0][2]);
		box1.add(field[1][0]);
		box1.add(field[1][1]);
		box1.add(field[1][2]);
		box1.add(field[2][0]);
		box1.add(field[2][1]);
		box1.add(field[2][2]);
		if(box1.size() != 9) return false;

		Set<Integer> box2 = new HashSet<>();
		box2.add(field[0][3]);
		box2.add(field[0][4]);
		box2.add(field[0][5]);
		box2.add(field[1][3]);
		box2.add(field[1][4]);
		box2.add(field[1][5]);
		box2.add(field[2][3]);
		box2.add(field[2][4]);
		box2.add(field[2][5]);
		if(box2.size() != 9) return false;

		Set<Integer> box3 = new HashSet<>();
		box3.add(field[0][6]);
		box3.add(field[0][7]);
		box3.add(field[0][8]);
		box3.add(field[1][6]);
		box3.add(field[1][7]);
		box3.add(field[1][8]);
		box3.add(field[2][6]);
		box3.add(field[2][7]);
		box3.add(field[2][8]);
		if(box3.size() != 9) return false;


		Set<Integer> box4 = new HashSet<>();
		box4.add(field[3][0]);
		box4.add(field[3][1]);
		box4.add(field[3][2]);
		box4.add(field[4][0]);
		box4.add(field[4][1]);
		box4.add(field[4][2]);
		box4.add(field[5][0]);
		box4.add(field[5][1]);
		box4.add(field[5][2]);
		if(box4.size() != 9) return false;

		Set<Integer> box5 = new HashSet<>();
		box5.add(field[3][3]);
		box5.add(field[3][4]);
		box5.add(field[3][5]);
		box5.add(field[4][3]);
		box5.add(field[4][4]);
		box5.add(field[4][5]);
		box5.add(field[5][3]);
		box5.add(field[5][4]);
		box5.add(field[5][5]);
		if(box5.size() != 9) return false;

		Set<Integer> box6 = new HashSet<>();
		box6.add(field[3][6]);
		box6.add(field[3][7]);
		box6.add(field[3][8]);
		box6.add(field[4][6]);
		box6.add(field[4][7]);
		box6.add(field[4][8]);
		box6.add(field[5][6]);
		box6.add(field[5][7]);
		box6.add(field[5][8]);
		if(box6.size() != 9) return false;

		Set<Integer> box7 = new HashSet<>();
		box7.add(field[6][0]);
		box7.add(field[6][1]);
		box7.add(field[6][2]);
		box7.add(field[7][0]);
		box7.add(field[7][1]);
		box7.add(field[7][2]);
		box7.add(field[8][0]);
		box7.add(field[8][1]);
		box7.add(field[8][2]);
		if(box7.size() != 9) return false;

		Set<Integer> box8 = new HashSet<>();
		box8.add(field[6][3]);
		box8.add(field[6][4]);
		box8.add(field[6][5]);
		box8.add(field[7][3]);
		box8.add(field[7][4]);
		box8.add(field[7][5]);
		box8.add(field[8][3]);
		box8.add(field[8][4]);
		box8.add(field[8][5]);
		if(box8.size() != 9) return false;

		Set<Integer> box9 = new HashSet<>();
		box9.add(field[6][6]);
		box9.add(field[6][7]);
		box9.add(field[6][8]);
		box9.add(field[7][6]);
		box9.add(field[7][7]);
		box9.add(field[7][8]);
		box9.add(field[8][6]);
		box9.add(field[8][7]);
		box9.add(field[8][8]);
		if(box9.size() != 9) return false;

		return true;
	}
}