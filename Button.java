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

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Button extends JButton {
    Button() {
        JButton button = new JButton();
        button.setBackground(Color.darkGray);
        button.setForeground(Color.white);
        button.setFont(new Font("Calibri",Font.BOLD,10));
        button.setFocusable(false);
        button.setText("Roll Dice");
    }
}
