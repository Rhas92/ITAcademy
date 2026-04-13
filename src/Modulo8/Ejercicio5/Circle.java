package Modulo8.Ejercicio5;

public class Circle {
    Dot center;
    double radio;

    public Circle (Dot center, double radio) {
        this.center = center;
        this.radio = radio;
    }
    public Dot getCenter() {
        return center;
    }
    public double getRadio() {
        return radio;
    }
    public double distanceCenters(Circle otherCircle) {
        double x1 = this.center.getPositionX();
        double y1 = this.center.getPositionY();
        double x2 = otherCircle.center.getPositionX();
        double y2 = otherCircle.center.getPositionY();
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }
    public boolean equals(Circle otherCircle) {
        return distanceCenters(otherCircle) == 0 && sameRadio(otherCircle);
    }
    public boolean areConcentric(Circle otherCircle) {
        return distanceCenters(otherCircle) == 0;
    }
    public boolean sameRadio(Circle otherCircle) {
        double radio1 = this.radio;
        double radio2 = otherCircle.radio;
        return radio1 == radio2;
    }
    public boolean areTangents(Circle otherCircle) {
        double radio1 = this.radio;
        double radio2 = otherCircle.radio;
        return distanceCenters(otherCircle) == radio1 + radio2 || distanceCenters(otherCircle) == Math.abs(radio1 - radio2);
    }
    public boolean areSecant(Circle otherCircle) {
        double radio1 = this.radio;
        double radio2 = otherCircle.radio;
        return Math.abs(radio1 - radio2) < distanceCenters(otherCircle) && distanceCenters(otherCircle) < radio1 + radio2;
    }
    public boolean dontTouch(Circle otherCircle) {
        double radio1 = this.radio;
        double radio2 = otherCircle.radio;
        return distanceCenters(otherCircle) > radio1 + radio2 || distanceCenters(otherCircle) < Math.abs(radio1 - radio2);
    }
}
