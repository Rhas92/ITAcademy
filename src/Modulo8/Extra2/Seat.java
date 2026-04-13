package Modulo8.Extra2;

public class Seat {
    int row;
    char column;
    boolean busy;

    public Seat(int row, char column) {
        this.row = row;
        this.column = column;
        this.busy = false;
    }
    public int getRow() {
        return row;
    }
    public char getColumn() {
        return column;
    }
    public boolean getBusy() {
        return busy;
    }
    public void setBusy(boolean busy) {
        this.busy = busy;
    }
    @Override
    public String toString() {
        return ("Seat: " + this.row + this.column + "\nIs busy: " + this.busy);
    }
}
