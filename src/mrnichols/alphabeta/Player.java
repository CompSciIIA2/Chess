package mrnichols.alphabeta;

/**
 * Interface that must be implemented by player enums.
 * @author Mr. Nichols
 */
public interface Player {

    /**
     * Returns true if and only if the present player is the maximizing player
     * in the game.
     * In the minimax algorithm, one player is designated as the
     * "maximizing" player and the other as the "minimizing" player.
     * Strictly speaking, the choice of which is which is entirely
     * arbitrary as long as one has one maximizing player and one
     * minimizing player.
     * @return true if the present player is the maximizing player, false
     * otherwise
     */
    boolean isMaximizingPlayer();
}
