//java abstract class
package com.mateusborja.javaabstractclass.ex01;

public abstract class Item {

    private int posX;
    private int posY;

    public abstract void pegar();

    public int getPosX() {
        return posX;
    }

    public int getPosY() {
        return posY;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }
}
