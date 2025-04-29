package Medium;
import java.util.*;

public class ValidSudoku {
    public boolean isValidSudoku(char[][] board) {        
        // Part 1
        for(int i=0; i<9; i++){
            Hashtable<Character, Boolean> hash = new Hashtable<>();
            for(int j=0; j<9; j++){
                if (board[i][j] == '.') continue;
                if (hash.containsKey(board[i][j])) {
                    return false;
                }
                hash.put(board[i][j], true);
            }
        }

        // Part 2
        for(int i=0; i<9; i++){
            Hashtable<Character, Boolean> hash = new Hashtable<>();
            for(int j=0; j<9; j++){
                if (board[j][i] == '.') continue;
                if (hash.containsKey(board[j][i])) {
                    return false;
                }
                hash.put(board[j][i], true);
            }
        }

        for (int boxRow = 0; boxRow < 3; boxRow++) {
            for (int boxCol = 0; boxCol < 3; boxCol++) {
                int startRow = boxRow * 3;
                int startCol = boxCol * 3;
                Hashtable<Character, Boolean> hash = new Hashtable<>();
                for(int i=startRow; i<startRow+3; i++){
                    for(int j=startCol; j<startCol+3; j++){
                        if (board[j][i] == '.') continue;
                        if (hash.containsKey(board[j][i])) {
                            return false;
                        }
                        hash.put(board[j][i], true);
                    }
                }
            }
        }

        return true;
    }
}
