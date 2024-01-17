package org.example.view;

import org.example.controller.Controller;
import org.example.model.Model;
import org.example.model.PixelObject;

import javax.swing.*;
import java.util.Set;

public class View extends JFrame {
    private Controller controller;
    private Field field;

    public View(Controller controller) {
        this.controller = controller;
    }
    public void init() {
        field = new Field(this);
        add(field);

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(Model.FIELD_CELL_SIZE *13, Model.FIELD_CELL_SIZE*18 - 1);
        setLocationRelativeTo(null);
        setTitle("Bank Automate Game");
        setVisible(true);
    }

    public void update() {field.repaint();}

    public Set<PixelObject> getPixelObjects() {
        return controller.getPixelObjects();
    }

}
