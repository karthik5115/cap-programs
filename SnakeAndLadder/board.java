import java.util.*;

public class board {
    int board_size;
    Queue<player> players;
    Dice dyc;
    HashMap<Integer, Integer> snkldr;

    board(int board_size, Queue<player> players, Dice dyc, HashMap<Integer, Integer> snkldr) {
        this.board_size = board_size;
        this.players = players;
        this.dyc = dyc;
        this.snkldr = snkldr;
    }

    public player getplayers() {
        return players.poll();
    }

    public void setplayers(player plyr) {
        players.offer(plyr);
    }
}
