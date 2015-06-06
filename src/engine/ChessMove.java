package engine;

import mrnichols.alphabeta.Move;

/**
 * Represents a move in the game of chess.
 * @author 2014-2015 LCHS Computer Science II
 */
public class ChessMove implements Move<ChessPlayer> {

    private /* final */ ChessPlayer player; // This should be declared "final" 
                                            // once we have a constructor.
                                            // The "Move" interface this
                                            // implements was intended to
                                            // be implemented by a class with
                                            // immutable data. Immutability
                                            // reduces the incidence of errors.
                                            // --Mr. Nichols

    /**
     * Returns the player making this move.
     * @return the player making this move.
     */
    @Override
    public ChessPlayer getPlayer() {
        return player;
    }
    
}
