package org.example;

import java.io.Serializable;

public class Move {

    public int Player;
    public int x;
    public int y;

    public Move(int x, int y, int Player)
    {
        this.Player = Player;
        this.x = x;
        this.y = y;
    }

}
