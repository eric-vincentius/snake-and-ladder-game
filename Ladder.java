/**
 * -----------------------------------------------------
 * ES234211 - Programming Fundamental
 * Genap - 2023/2024
 * Group Capstone Project: Snake and Ladder Game
 * -----------------------------------------------------
 * Class    : C
 * Group    : 12
 * Members  :
 * 1. 5026231103 - Eric Vincentius Jaolis
 * 2. 5026231085 - Firmansyah Adi Prasetyo
 * 3. 5026231206 - Rafael Dimas Khristianto
 * ------------------------------------------------------
 */

public class Ladder {
    private int fromPosition;
    private int toPosition;

    public Ladder(int fromPosition, int toPosition) {
        this.fromPosition = fromPosition;
        this.toPosition = toPosition;
    }

    public void setFromPosition(int fromPosition) {
        this.fromPosition = fromPosition;
    }

    public void setToPosition(int toPosition) {
        this.toPosition = toPosition;
    }

    public int getFromPosition() {
        return this.fromPosition;
    }
    public int getToPosition() {
        return this.toPosition;
    }
}
