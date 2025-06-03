package game.code.serverSide.world;

import javax.swing.*;
import javax.swing.JFrame;
import java.io.FileNotFoundException;

public class World {

//    Game window
    private static int tileSize = 32;
    private static int rowCount = 21; // Number of tile in a row
    private static int colCount = 19; // Number of tiles in a column

    private static final int width = colCount * tileSize;
    private static final int height = rowCount * tileSize;

    private JFrame frame;

    private static World instance;

    // Private constructor for singleton pattern
    private World() {
        initializeWindow();
    }


    public static World getInstance() {
        if (instance == null) {
            instance = new World();
        }
        return instance;
    }

    // Window Frame
    private void initializeWindow() {
        frame = new JFrame("Galaxy War");
        frame.setSize(width, height);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null); // Center the window
        frame.setResizable(false);

        // Add a simple drawing panel
        frame.add(new WorldPanel());

        frame.setVisible(true);
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
