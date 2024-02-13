package module4.UN1EXC1;

import static java.lang.Math.abs;

public class Tank {
    int positionX;
    int positionY;
    int fuel;
    String axes="x+";

    public Tank(int positionX, int positionY, int fuel) {
        this.positionX = positionX;
        this.positionY = positionY;
        this.fuel = fuel;
    }

    public Tank(int positionX, int positionY) {
        this(positionX,positionY,100);
    }

    public Tank() {
        this(0,0,100);
    }

    public void goForward(int i) {
        if (i>=0){
            if (fuel>=i){
                fuel-=i;
            }else {
                i=fuel;
                fuel=0;
            }
        } else {
            if (fuel>=-i){
                fuel-=-i;
            }else {
                i=-fuel;
                fuel=0;
            }
        }

        switch (axes){
            case "x+":
                positionX+=i;
                return;
            case "y+":
                positionY+=i;
                return;
            case "x-":
                positionX-=i;
                return;
            case "y-":
                positionY-=i;
                return;
        }
    }

    public void printPosition() {
        System.out.println("The Tank is at " + positionX +", " + positionY + " now.");
    }

    public void goBackward(int i) {
        goForward(-i);
    }

    public void turnRight() {
        switch (axes){
            case "x+":
                axes="y+";
                return;
            case "y+":
                axes="x-";
                return;
            case "x-":
                axes="y-";
                return;
            case "y-":
                axes="x+";
                return;
        }
    }

    public void turnLeft() {
        switch (axes){
            case "x+":
                axes="y-";
                return;
            case "y-":
                axes="x-";
                return;
            case "x-":
                axes="y+";
                return;
            case "y+":
                axes="x+";
                return;
        }
    }
}
