package game.code.serverSide.world;

import javax.swing.*;
import java.awt.*;

public class WorldPanel extends JPanel {
    private static int tileSize = 32;
    private static int rowCount = 21; // Number of tile in a row
    private static int colCount = 19; // Number of tiles in a column

    private static final int width = colCount * tileSize;
    private static final int height = rowCount * tileSize;

//    Images
    private Image fighterImage;

    WorldPanel(){
        setPreferredSize(new Dimension(width, height));
        setBackground(Color.DARK_GRAY);

//        Load images
//        fighterImage = new ImageIcon(getClass().getResource("./images/galaxyWarF1.png")).getImage();

    }
}
