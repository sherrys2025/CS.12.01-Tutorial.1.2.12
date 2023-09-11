public class Successors {


    public static Position findPosition(int i, int[][] array2d) {
        for (int y = 0; y < array2d.length; y++) {
            for (int x = 0; x < array2d[0].length; x++) {
                if (array2d[y][x] == i) {
                    return new Position(y, x);
                }
            }
        }
        return null;
    }


    public static Position[][] getSuccessorArray(int[][] array2d) {
        Position[][] positions = new Position[array2d.length][array2d[0].length];

        for (int r = 0; r < array2d.length; r++) {
            for (int c = 0; c < array2d[0].length; c++) {
                positions[r][c] = findPosition(array2d[r][c] + 1, array2d);
            }
         }
        return positions;
    }
}
