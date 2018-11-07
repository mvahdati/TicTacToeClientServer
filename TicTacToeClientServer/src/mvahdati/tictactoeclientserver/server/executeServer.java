package mvahdati.tictactoeclientserver.server;

import javax.swing.*;

/**
 * Created by Monireh Vahdati
 * E-Mail: vahdati.monireh@gmail.com
 */
public class executeServer {
    public static void main(String[] args) {
        TicTacToeServer application = new TicTacToeServer();
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.execute();    }
}
