package mrnichols.alphabeta;

/**
 * Represents a move with a heuristic value.
 * @author Mr. Nichols
 * @param <M> class representing a move
 * @param <P> enum representing players
 */
public class RatedMove<M extends Move<P>, P extends Enum<P> & Player> implements
    Comparable<RatedMove<M,P>> {
    private final M move;
    private final double value;

    /**
     * Creates a {@code RatedMove} object from a given move and value.
     * @param move the move
     * @param value the estimated value of the move
     */
    public RatedMove(M move, double value) {
        this.move = move;
        this.value = value;
    }

    /**
     * Returns the move itself.
     * @return the move
     */
    public M getMove() {
        return move;
    }

    /**
     * Returns the value of the move.
     * @return the value of the move
     */
    public double getValue() {
        return value;
    }

    @Override
    public int compareTo(RatedMove<M,P> o) {
        return Double.compare(value, o.getValue());
    }

}
