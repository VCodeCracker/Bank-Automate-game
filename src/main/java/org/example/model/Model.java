package org.example.model;

import java.io.File;
import java.net.URISyntaxException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Set;

public class Model {
    public static final int FIELD_CELL_SIZE = 40;
    private Set<PixelObject> pixelObjects;
    private AutomatePictureLoader automatePictureLoader;

    public Model() throws URISyntaxException {
        automatePictureLoader = new AutomatePictureLoader(new File("C:\\myJavaApps\\Bank Automat Game\\src\\main\\java\\res\\Picture").toPath());
        pixelObjects = automatePictureLoader.loadPicture();
    }

    public void startGame() {
        pixelObjects = automatePictureLoader.loadPicture();
    }

    public Set<PixelObject> getPixelObjects() {
        return pixelObjects;
    }
}
