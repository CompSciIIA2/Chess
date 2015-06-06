package mrnichols.alphabeta;

/**
 * Represents a move in the game.
 *
 * @author Michael Nichols
 * @version 1.0
 * @param <P> an enum representing players in the game
 */
public interface Move<P extends Enum<P> & Player> { 
    /**
     * Returns the player who is making this move.
     * @return  the player who is making this move
     */
    P getPlayer();
}
