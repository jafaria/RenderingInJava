
import javalib.impworld.World;
import javalib.impworld.WorldScene;
import javalib.worldimages.*;

import java.awt.*;

public class Maze extends World {

    @Override
    public WorldScene makeScene() {
        WorldScene board = new WorldScene(500,500);
        WorldImage circle = new CircleImage(10, OutlineMode.SOLID, Color.RED);
        board.placeImageXY(circle, 20, 10);
        return board;
    }
}