//java abstract class
package com.mateusborja.javaabstractclassex01;

public abstract class Item {

    private static int posX;
    private static int posY;

    public abstract void pegar();

    public static int getPosX() {
        return posX;
    }

    public static int getPosY() {
        return posY;
    }

    public static void setPosX(int posX) {
        Item.posX = posX;
    }

    public static void setPosY(int posY) {
        Item.posY = posY;
    }
}
