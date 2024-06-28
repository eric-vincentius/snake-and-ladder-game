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

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import java.awt.*;

public class Frame extends JFrame{
    Frame() {
        this.setTitle("Snake and Ladder");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setLayout(new BorderLayout());
    }
}
