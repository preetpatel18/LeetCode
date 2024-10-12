package Easy;

public class SpecialPositionInBinaryMatrix {
    public int numSpecial(int[][] mat) {
        int co = 0;
        for (int i = 0; i < mat.length; i++) {
            cont: for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] == 1) {
                    boolean b = true;
                    // horizontal twice
                    // before
                    for (int k = 0; k < j; k++) {
                        if (mat[i][k] == 1) {
                            b = false;
                            continue cont;
                        }
                    }

                    // after
                    for (int k = j + 1; k < mat[i].length; k++) {
                        if (mat[i][k] == 1) {
                            b = false;
                            continue cont;
                        }
                    }
                    // vertical twice
                    for (int k = 0; k < i; k++) {
                        if (mat[k][j] == 1) {
                            b = false;
                            continue cont;
                        }
                    }
                    // after
                    for (int k = i + 1; k < mat.length; k++) {
                        if (mat[k][j] == 1) {
                            b = false;
                            continue cont;
                        }
                    }
                    if (b) {
                        co++;
                    }
                }
            }
        }
        return co;
    }
}