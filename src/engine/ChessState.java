package engine;

import java.util.Objects;
import java.util.Set;
import mrnichols.alphabeta.State;

/**
 * Represents a state of a game of chess.
 * @author 2014-2015 LCHS Computer Science II
 */
public class ChessState implements State<ChessState, ChessMove, ChessPlayer> {

    /*  Note from Mr. Nichols: Like ChessMove, this class is intended to
        have immutable data. Since we have a "nextState" method that
        returns a whole new state, we can get away with this.

        You will also note the inclusion of a couple of "factory methods" in
        this "stubbed out" class. Factory methods are like constructors
        in the sense that they return instances of the class, but unlike
        constructors, factory methods are actually static methods of the
        class. 
    
        To create instances of the class, factory methods must call the class's
        constructor (so they don't completely obviate the need for a constructor).
        However, if you have factory methods, you don't have to have your
        constructor(s) be public. In fact, the usual practice is to make the
        constructor private when you provide factory methods.
    */

    /**
     * Factory method returning a {@code ChessState} representing the
     * initial state of a chess game.
     * @return an initial game state
     */
    public static ChessState initialState() {
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    /**
     * Factory method returning a {@code ChessState} corresponding to
     * the supplied string in Forsyth-Edwards notation.
     * Forsyth-Edwards notation (FEN) is a standard notation for describing
     * the state of a game (as opposed to the moves themselves).
     * Supplying this method a FEN causes it to return a new {@code ChessState}
     * object representing that state.
     * @see <a href="http://en.wikipedia.org/wiki/Forsyth%E2%80%93Edwards_Notation">Wikipedia: Forsyth-Edwards Notation</a>
     * @see #toFEN() 
     * @param fen string representing a game state in Forsyth-Edwards notation
     * @return the game state as an object
     */
    public static ChessState fromFEN(String fen) {
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    /**
     * Private constructor enforces the requirement of using the factory
     * methods.
     */
    private ChessState() {

    }

    /**
     * Generate the set of all legal moves possible from the current state.
     * @return set of all legal moves possible from the current state
     */
    @Override
    public Set<ChessMove> genMoves() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * Returns the state resulting from applying the supplied move
     * to the present state.
     * @param m the move to apply
     * @return the new {@code ChessState} resulting from applying the
     * supplied move to the present state.
     */
    @Override
    public ChessState nextState(ChessMove m) {
        Objects.requireNonNull(m); // Note from Mr. Nichols: You should get 
                                   // in the habit of checking your arguments
                                   // for validity. In private methods, you
                                   // can use an assert statement for this,
                                   // but in public methods, you are supposed
                                   // to do an explicit check in the code.
                                   // (Remember that assert statements are
                                   // ignored unless you run the code with
                                   // option -ea enabled.)
                                   // Fortunately, the Java folks gave us
                                   // a utility method for doing null checks,
                                   // so you can do that in one line like this.
                                   // If you try to pass in a null into this
                                   // method, Java will throw a
                                   // NullPointerException because of this 
                                   // "Objects.requireNotNull" line.
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * Returns the heuristic value of the position.
     * Positive values favor white (who tries to maximize the value), 
     * negative values favor black (who tries to minimize the value), 
     * and a value of zero is neutral (equivalent to a drawn position).
     * @return the heuristic value of the position represented by this
     * {@code ChessState} object
     */
    @Override
    public double getValue() {
    /* Note from Mr. Nichols:
     * This is the critical part that determines how good your AI is, because
     * it is where the concept of a "good" position is defined. The value
     * returned by this method should be higher the better the position is
     * for the "maximizing" player (white) and lower the better the position
     * is for the "minimizing" player (black). In a typical chess engine,
     * positive position values favor white, negative values favor black,
     * and a zero value is neutral. The term "heuristic" is a fancy way
     * of describing an educated guess that you hear a lot in AI.
     */
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * Returns true if this object represents a terminal state.
     * The game is in a terminal state if it has ended (checkmate or stalemate).
     * @return true if this objects represents an end-of-game (terminal) state,
     * and false otherwise
     */
    @Override
    public boolean isTerminal() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * Returns the player whose turn it is to play in the game state represented
     * by this object.
     * @return the player whose turn it is to play in
     */
    @Override
    public ChessPlayer getTurn() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * Returns a string representing the game state in Forsyth-Edwards notation.
     * @return Forsyth-Edwards notation representation of this game state
     * @see <a href="http://en.wikipedia.org/wiki/Forsyth%E2%80%93Edwards_Notation">Wikipedia: Forsyth-Edwards Notation</a>
     * @see #fromFEN(java.lang.String) 
     */
    public String toFEN() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
