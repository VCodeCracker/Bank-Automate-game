package org.example.controller;

import org.example.model.Model;
import org.example.model.PixelObject;
import org.example.view.View;

import java.net.URISyntaxException;
import java.util.Set;

public class Controller {
    private Model model;
    private View view;

    public Controller() throws URISyntaxException {
        model = new Model();
        view = new View(this);

        view.init();
        model.startGame();

        view.update();
    }

    public Set<PixelObject> getPixelObjects() {
        return model.getPixelObjects();
    }

    public static void main(String[] args) throws URISyntaxException {
        Controller controller = new Controller();
    }
}
