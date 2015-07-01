package mrnichols.alphabeta;

import java.util.Set;

/**
 * Represents a game state in the alpha-beta pruned minimax algorithm.
 *
 * @author Michael Nichols
 * @version 1.0
 * @param <S> the class implementing this interface
 * @param <M> a class implementing the {@code Move} interface to represent
 * a game move
 * @param <P> an enum representing players of the game and implementing the
 * {@code Player} interface
 */
public interface State<S, M extends Move<P>, P extends Enum<P> & Player> {
    /**
     * Generates the set of possible moves from the given state.
     *
     * @return the set of possible moves from the given state.
     */
    Set<M> genMoves();
    /**
     * Returns the state reached from the current state by
     * following the given move.
     *
     * @param m the move to be followed
     * @return the new state
     */
    S nextState(M m);

    /**
     * Returns the heuristic value for the state.
     * @return the heuristic value for the state
     */
    double getValue();

    /**
     * Returns true if the state is terminal (<i>i.e.,</i> the game is over).
     * @return  true if the state is terminal, false otherwise
     */
    boolean isTerminal();

    /**
     * Returns the player whose turn it is.
     * @return the player whose turn it is
     */
    P getTurn();
}
