package engine;

import mrnichols.alphabeta.Player;

/**
 * Represents a chess player.
 * @author 2014-2015 LCHS Computer Science II 
 */
public enum ChessPlayer implements Player {
    /** The white player. In chess, white goes first. */
    WHITE(true), 
    
    /** The black player. */
    BLACK(false);

    private final boolean maximizingPlayer;

    private ChessPlayer(boolean maximizingPlayer) {
        this.maximizingPlayer = maximizingPlayer;
    }

    /**
     * Returns true if the player is the "maximizing" player and false
     * otherwise.
     * In minimax game-playing algorithms, one player is designated as the
     * maximizing player and the other is the minimizing player.
     * The maximizing player is the player who is trying to maximize the
     * numerical value of the position (higher values being favorable to him).
     * Likewise, lower values favor the "minimizing" player, so he tries
     * to minimize the position's value.
     * Here, white has been arbitrarily chosen to be the maximizing player
     * (since he goes first).
     * @return true if the player is the "maximizing" player and false
     * otherwise
     */
    @Override
    public boolean isMaximizingPlayer() {
        return maximizingPlayer;
    }

}
