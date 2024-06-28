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

public class Text extends JLabel{
    Text(String text) {
        JLabel turn = new JLabel(text);
        this.setBackground(Color.lightGray);
        this.setForeground(Color.black);
        this.setFont(new Font("Calibri", Font.BOLD, 25));
        this.setHorizontalAlignment(JLabel.LEFT);
    }
}
