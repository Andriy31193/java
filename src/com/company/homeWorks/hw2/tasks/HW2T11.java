package com.company.homeWorks.hw2.tasks;

import com.company.homeWorks.interfaces.IHW;

public class HW2T11 implements IHW {
    @Override
    public void solve() {
        drawLine(5, Direction.HORIZONTAL, '*');
        drawLine(3, Direction.VERTICAL, '#');
    }

    enum Direction {
        HORIZONTAL,
        VERTICAL
    }

    public static void drawLine(int length, Direction direction, char symbol) {
        if (length <= 0) {
            System.out.println("Length must be a positive value.");
            return;
        }

        if (direction == Direction.HORIZONTAL) {
            for (int i = 0; i < length; i++) {
                System.out.print(symbol);
            }
            System.out.println();
        } else if (direction == Direction.VERTICAL) {
            for (int i = 0; i < length; i++) {
                System.out.println(symbol);
            }
        } else {
            System.out.println("Invalid direction.");
        }
    }
}
