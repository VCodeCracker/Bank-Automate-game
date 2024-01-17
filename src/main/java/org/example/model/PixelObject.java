package org.example.model;

import javax.swing.*;
import java.awt.*;

public class PixelObject {
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    private int x;
    private int y;
    private int height = Model.FIELD_CELL_SIZE;
    private int width = Model.FIELD_CELL_SIZE;
    private Color color;

    private JButton pixelButton;

    public PixelObject(int x, int y, Color color) {
        this.x = x;
        this.y = y;
        this.color = color;
        pixelButton = new JButton();
        pixelButton.setName("PixelObjectButton " + x + " " + y);
    }

    public void draw(Graphics graphics) {
        graphics.setColor(color);
        graphics.fillRect(x,y,width,height);
    }
}
