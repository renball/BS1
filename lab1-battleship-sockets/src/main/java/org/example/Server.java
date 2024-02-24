//package org.example;
//
//import java.io.IOException;
//import java.io.ObjectInputStream;
//import java.io.ObjectOutputStream;
//import java.net.ServerSocket;
//import java.net.Socket;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.concurrent.atomic.AtomicBoolean;
//
//public class Server
//{
//    public static void main(String[] args) {
//
//
//        final List<Integer> cur = new ArrayList<>();
//        int FieldSize = 10;
//        char[][] ffield = new char[FieldSize][FieldSize];
//        char[][] sfield = new char[FieldSize][FieldSize];
//        List<ObjectOutputStream> outputs = new ArrayList<>();
//
//        AtomicBoolean fready = new AtomicBoolean(false);
//        AtomicBoolean sready = new AtomicBoolean(false);
//        cur.add(1);
//
//
//        for (int i = 0; i < ffield.length; i++)
//        {
//            for (int j = 0; j < sfield.length; j++)
//            {
//                ffield[i][j] = '.';
//                sfield[i][j] = '.';
//            }
//        }
//
//
//
//        try
//        {
//
//            ServerSocket server = new ServerSocket(getPort());
//
//            while (true)
//            {
//
//                Socket socket = server.accept();
//
//                ObjectOutputStream out = new ObjectOutputStream(socket.getOutputStream());
//                ObjectInputStream in = new ObjectInputStream(socket.getInputStream());
//
//                outputs.add(out);
//
//
//                synchronized (out)
//                {
//
////                    System.out.println("Отправка");
//
//                    try {
//                        out.writeByte(outputs.size());
//                        out.reset();
//                    } catch (IOException e) {
//                        e.printStackTrace();
//                    }
//
//
//                    Data data = new Data(cur.get(0), ffield, sfield, fready, sready);
//                    try {
//                        out.writeObject(data);
//                        out.reset();
//                    } catch (IOException e) {
//                        e.printStackTrace();
//                    }
//
//                    out.reset();
//                }
//
//                Thread ThrCl = new Thread(() ->
//                {
//                    while (true)
//                    {
//
//                        Move move = null;
//
//                        try
//                        {
////                            System.out.println("Read move on serv");
//                            move = (Move) in.readObject();
//                        }
//                        catch (IOException | ClassNotFoundException e)
//                        {
//                            outputs.remove(out);
//                            break;
//                        }
//
//                        assert move != null;
//
//                        int x = move.x;
//                        int y = move.y;
//
////                        boolean Filling = move.Filling;
//                        int Player = move.Player;
//
//                        if (true)   //Filling
//                        {
//                            if (Player == 1)
//                            {
//                                ffield[x][y] = 'К';
//                            } else if (Player == 2)
//                            {
//                                sfield[x][y] = 'К';
//                            }
//                        }
//                        else
//                        {
//                            if (!(x == -1 && y == -1))
//                            {
//                                if (cur.get(0) == 2) {
//                                    char sym = ffield[x][y];
//
//                                    if (sym != 'X' && sym != 'M') {
//                                        if (sym == 'К') {
//                                            ffield[x][y] = 'X';
//
//                                            boolean lost = true;
//                                            for (int i = 0; i < ffield.length - 1; i++) {
//                                                for (int k = 0; k < ffield.length - 1; k++) {
//                                                    if (ffield[i][k] == 'К') lost = false;
//                                                }
//                                            }
//                                            if (lost) cur.set(0, 4);
//
//                                            if (cur.get(0) == 4) return;
//
//                                        } else if (sym == '.') {
//                                            ffield[x][y] = 'M';
//                                            cur.set(0, 1);
//                                        }
//                                    }
//                                } else if (cur.get(0) == 1) {
//
//                                    char sym = sfield[x][y];
//
//                                    if (sym != 'X' && sym != 'M') {
//                                        if (sym == 'К') {
//                                            sfield[x][y] = 'X';
//
//                                            boolean lost = true;
//                                            for (int i = 0; i < sfield.length - 1; i++) {
//                                                for (int k = 0; k < sfield.length - 1; k++) {
//                                                    if (sfield[i][k] == 'К') lost = false;
//                                                }
//                                            }
//
//                                            if (lost) cur.set(0, 3);
//
//                                            if (cur.get(0) == 3) return;
//
//                                        } else if (sym == '.') {
//                                            sfield[x][y] = 'M';
//                                            cur.set(0, 2);
//                                        }
//                                    }
//
//                                }
//                                sendDataFull(outputs, new Data(cur.get(0), ffield, sfield, fready, sready));
//                            }else
//                            {
//                                if (Player == 1)
//                                {
//                                    fready.set(true);
//                                    sendDataFull(outputs, new Data(cur.get(0), ffield, sfield, fready, sready));
//                                } else if (Player == 2)
//                                {
//                                    sready.set(true);
//                                    sendDataFull(outputs, new Data(cur.get(0), ffield, sfield, fready, sready));
//                                }
//                                else sendDataFull(outputs, new Data(cur.get(0), ffield, sfield, fready, sready));
//
//                            }
//                        }
//
//                    }
//                });
//
//                ThrCl.start();
//
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//
//
//    private static int getPort() {
//        return 8080;
//    }
//
//    private static void sendData(ObjectOutputStream toClient, Data data) {
//        try {
//            toClient.writeObject(data);
//            toClient.reset();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//
//
//    private static void sendDataFull(List<ObjectOutputStream> outputs, Data data)
//    {
//
//        for (ObjectOutputStream cur : outputs)
//        {
//
//            synchronized (cur)
//            {
//
//                try {
//                    cur.writeObject(data);
//                    cur.reset();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//
//            }
//
//        }
//    }
//
//
//
//}
