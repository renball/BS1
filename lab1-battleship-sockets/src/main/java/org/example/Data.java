package org.example;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

public class Data {
    public int cur;
    char[][] ffield = new char[10][10];
    char[][] sfield = new char[10][10];

    public Data(int cur, char[][] ffield, char[][] sfield) {

        this.ffield = ffield;

        this.sfield = sfield;

        this.cur = cur;

    }
}
