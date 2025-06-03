package game.code.serverSide.world;

import java.io.FileNotFoundException;

public class World {

    private static final int width = 10;
    private static final int height = 10;

    private static World instance;

    public static World getInstance() {
        if (instance == null) {
            instance = new World();
        }
        return instance;
    }

    public String dumpState() {

        String[][] grid = new String[height][width];

        // empty fields
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                grid[i][j] = ".  ";
            }
        }

        // String representation
        StringBuilder stringRepresentation = new StringBuilder();
        for (int i=0; i < height; i++) {
            for (int j=0; j < width; j++) {
                stringRepresentation.append(grid[i][j]);
            }
            stringRepresentation.append('\n');
        }

        return stringRepresentation.toString();
    }
}
