package org.example.model;

import java.awt.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.util.HashSet;
import java.util.Set;

public class AutomatePictureLoader {
    private final Path picture;

    public AutomatePictureLoader(Path path) {
        picture = path;
    }

    public Set<PixelObject> loadPicture() {
        Set<PixelObject> pixelObjects = new HashSet<>();
        try(BufferedReader reader = new BufferedReader(new FileReader(picture.toFile()))) {
            int x = 0;
            int y = Model.FIELD_CELL_SIZE/2;

            String line;
            while((line = reader.readLine()) != null) {
                char[] chars = line.toCharArray();
                for(char c : chars) {
                    switch (c) {
                        case 'B' -> pixelObjects.add(new PixelObject(x, y, Color.BLUE));
                        case 'Y' -> pixelObjects.add(new PixelObject(x, y, Color.YELLOW));
                        case 'O' -> pixelObjects.add(new PixelObject(x, y, Color.ORANGE));
                        case 'D' -> pixelObjects.add(new PixelObject(x, y, Color.BLACK));
                        case 'W' -> pixelObjects.add(new PixelObject(x, y, Color.WHITE));
                        case 'G' -> pixelObjects.add(new PixelObject(x,y,Color.GREEN));
                    }
                    x+=Model.FIELD_CELL_SIZE;
                }
                y += Model.FIELD_CELL_SIZE;
                x = 0;
            }

        }catch (IOException e) {
            e.printStackTrace();
        }

        return pixelObjects;
    }
}
