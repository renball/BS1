package org.example;

import org.example.service.BattleshipServer;
import org.example.service.BattleshipServerService;

import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Client {

    static int FieldSize = 10;
    static char[][] myBoard = new char[FieldSize][FieldSize];
    static char[][] enemyBoard = new char[FieldSize][FieldSize];
    static int NumberPlayer = 0;
    static int cur = 0;
    static Scanner scanner = new Scanner(System.in);
    static BattleshipServer game;
    static int last = -1;

    public static void main(String[] args) throws RemoteException, NotBoundException {

        BattleshipServerService battleshipServer = new BattleshipServerService();
        game = battleshipServer.getBattleshipServerPort();

        NumberPlayer = game.connectPlayer();

        for (int i = 0; i < myBoard.length; i++)
        {
            for (int j = 0; j < enemyBoard.length; j++)
            {
                myBoard[i][j] = '.';
                enemyBoard[i][j] = '.';
            }
        }

        myBoard[0][0] = 'K';
        myBoard[0][1] = 'K';
        myBoard[5][5] = 'K';
        myBoard[7][7] = 'K';
        enemyBoard[0][0] = 'K';
        enemyBoard[0][1] = 'K';
        enemyBoard[6][6] = 'K';
        enemyBoard[8][8] = 'K';



//        Thread thread = new Thread(() -> {

            while(true) {

                cur = game.getCur();

                int lastMove = game.getLastMove();

                if (last != lastMove){
                    int x = lastMove / 10;
                    int y = lastMove % 10;

                    char sim = myBoard[x][y];
                    if (sim != 'X' && sim != 'M'){

                        if (sim == 'K')
                        {
                            myBoard[x][y] = 'X';
                        } else if (sim == '.') {
                            myBoard[x][y] = 'M';
                        }
                    }
                }


                if (cur == NumberPlayer)
                {
                    print(myBoard, enemyBoard);

                    System.out.println("Ваш ход");
                    System.out.println("Введите номер строки и колонки: ");
                    int res = scanner.nextInt();

                    game.makeMove(res, NumberPlayer);
                    last = res;

                    int x = res / 10;
                    int y = res % 10;

                    char sim = enemyBoard[x][y];
                    if (sim != 'X' && sim != 'M'){

                        if (sim == 'K')
                        {
                            enemyBoard[x][y] = 'X';

                            boolean lost = true;
                            for (int i = 0; i < enemyBoard.length - 1; i++){
                                for (int k = 0; k < enemyBoard.length - 1; k++){
                                    if (enemyBoard[i][k] == 'K') lost = false;
                                }
                            }

                            if (lost)
                            {
                                if (NumberPlayer == 1){
                                    game.setCur(3);
                                } else if (NumberPlayer == 2) {
                                    game.setCur(4);
                                }
                            }
                        } else if (sim == '.') {
                            enemyBoard[x][y] = 'M';
                            if (NumberPlayer == 1){
                                game.setCur(2);
                            } else if (NumberPlayer == 2) {
                                game.setCur(1);
                            }
                        }


                    }




                } else if (cur == 3) {

                    if (NumberPlayer == 1){
                        System.out.println("Ура, ты победил!!!");
                    } else if (NumberPlayer == 2) {
                        System.out.println("Иногда противникам больно везет... Вы проиграли");
                    }

                    return;

                } else if (cur == 4) {

                    if (NumberPlayer == 2){
                        System.out.println("Ура, ты победил!!!");
                    } else if (NumberPlayer == 1) {
                        System.out.println("Иногда противникам больно везет... Вы проиграли");
                    }

                    return;

                }


//                try {
//                    Thread.sleep(100);
//                } catch (InterruptedException e) {
//                    throw new RuntimeException(e);
//                }
            }
//        });
//        thread.setDaemon(true);
//        thread.start();
    }


    private static void fillPlayerField(char[][] playerField, ObjectOutputStream output)
    {

        PrintOnlyMine(playerField);
        for (int i = 2; i >= 1; i--)
        { //i = 4
            for (int k = 3 - i; k != 0; k--)
            { //k = 5-i
                System.out.println("Расставляем " + i + "-палубный корабль. Осталось расставить: " + (k));

                System.out.println("Введите номер строки: ");
                int y = scanner.nextInt();

                System.out.println("Введите номер столбца: ");
                int x = scanner.nextInt();

                int position = 0;
                if (i != 1)
                {
                    System.out.println("1 - горизонтально; 2 - вертикально?");
                    position = scanner.nextInt();
                }
                else {
                    position = 1;
                }

                if (position == 1)
                {
                    for (int q = 0; q < i; q++)
                    {
                        playerField[y][x + q] = 'К';
//                        makeMove(output, y, (x + q), true);
                    }
                }

                if (position == 2)
                {
                    for (int m = 0; m < i; m++)
                    {
                        playerField[y + m][x] = 'К';
//                        makeMove(output, (y + m), x, true);
                    }
                }
                PrintOnlyMine(playerField);
            }
        }
    }

    private static int getPort()
    {
        return 8080;
    }


    public static void PrintOnlyMine(char[][] boardMine)
    {
        System.out.println("К - КОРАБЛЬ, X - ПОПАЛИ, М - МИМО");
        int i = 0;
        int k = 0;
        StringBuilder Upper = new StringBuilder();
        Upper.append(" ").append('|').append(" ");
        while (k < FieldSize){
            Upper.append(k).append("  ");
            k++;
        }
        System.out.println(Upper);

        while (i < FieldSize) {
            StringBuilder s = new StringBuilder();
            s.append(i).append("|").append(" ");
            {
                int j = 0;
                while (j < FieldSize) {
                    s.append(boardMine[i][j]).append("  ");
                    j++;
                }
            }
            System.out.println(s);
            i++;
        }
    }

    public static void print(char[][] myBoard, char[][] enemyBoard)
    {

        System.out.println("К - КОРАБЛЬ, X - ПОПАЛИ, М - МИМО");

        int k = 0;
        StringBuilder Upper = new StringBuilder();
        Upper.append(" ").append('|').append(" ");
        while (k < FieldSize)
        {
            Upper.append(k).append("  ");
            k++;
        }
        Upper.append("   ");
        k = 0;
        while (k < FieldSize)
        {
            Upper.append(k).append("  ");
            k++;
        }
        System.out.println(Upper);

        int i = 0;
        while (i < FieldSize)
        {
            StringBuilder str = new StringBuilder();
            str.append(i).append("|").append(" ");
            {
                int j = 0;
                while (j < FieldSize)
                {
                    str.append(myBoard[i][j]).append("  ");
                    j++;
                }
            }
            str.append("   ");
            int j = 0;
            while (j < FieldSize)
            {

                if (enemyBoard[i][j] == 'K')
                {
                    str.append("K").append("  ");
                }
                else {
                    str.append(enemyBoard[i][j]).append("  ");
                }
                j++;

            }
            i++;
//            System.out.println("Проверка");
            System.out.println(str);
        }
    }

//    public static Data getData(ObjectInputStream in, Data data)
//    {
//        try
//        {
//            data = (Data) in.readObject();
//        }
//        catch (IOException | ClassNotFoundException ignored){}
//
//        if (NumberPlayer == 2)
//        {
//            enemyBoard = data.ffield;
//            myBoard = data.sfield;
//        } else if (NumberPlayer == 1)
//        {
//            enemyBoard = data.sfield;
//            myBoard = data.ffield;
//        }
//        else
//        {
//            System.out.println("В getDate пришло не то");
//        }
//
//        cur = data.cur;
//
//        return data;
//    }

}
