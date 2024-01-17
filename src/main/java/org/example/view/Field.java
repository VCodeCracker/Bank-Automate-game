package org.example.view;

import org.example.model.PixelObject;

import javax.swing.*;
import java.awt.*;
import java.util.Set;

public class Field extends JPanel {
    private View view;

    public Field(View view) {
        this.view = view;
    }
    @Override
    public void paint(Graphics g) {
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, getWidth(), getHeight());

        Set<PixelObject> pixelObjects = view.getPixelObjects();

        for (PixelObject gameObject : pixelObjects) {
            gameObject.draw(g);
        }
    }
}
