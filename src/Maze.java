import javalib.colors.Black;
import javalib.colors.White;
import javalib.impworld.World;
import javalib.worldimages.Posn;
import javalib.worldimages.RectangleImage;
import javalib.worldimages.TriangleImage;
import javalib.worldimages.WorldImage;

import java.awt.*;

public class Maze extends World {
    @Override
    public WorldImage makeImage() {
        int width = 10;
        int PIXEL = 30;
        int height = 20;
        WorldImage board =
                new RectangleImage(new Posn(width * PIXEL / 2,
                        height * PIXEL / 2),
                        width * PIXEL, height * PIXEL, new White());
        Posn a = new Posn(10,20);
        Posn b = new Posn(10,50);
        Posn c = new Posn(0,20);
        WorldImage triangle = new TriangleImage(a, b, c, Color.BLACK);
        return board.overlayImages(triangle);

    }
}