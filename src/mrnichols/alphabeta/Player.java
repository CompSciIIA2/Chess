package mrnichols.alphabeta;

/**
 * Interface that must be implemented by player enums.
 * @author Mr. Nichols
 */
public interface Player {

    /**
     * Returns true if and only if the present player is the maximizing player
     * in the game.
     * @return true if the present player is the maximizing player, false
     * otherwise
     */
    boolean isMaximizingPlayer();
}
