package mrnichols.alphabeta;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/**
 * Class implementing the alpha-beta pruned minimax algorithm
 * for game playing.
 * @author Mr. Nichols
 * @param <S> class representing game states
 * @param <M> class representing the moves in this game
 * @param <P> enum representing players of the game
 */
public class AlphaBeta<S extends State<S,M,P>, M extends Move<P>, 
    P extends Enum<P> & Player> {

    /**
     * Given a game state, return a {@code RatedMove} object
     * containing a recommended next move and its value.
     * @param state the game state to start from
     * @param depth the maximum depth to search
     * @return a {@code RatedMove} object with the recommended next move
     */
    public RatedMove<M,P> findRatedMove(S state, int depth) {
        Objects.requireNonNull(state);
        if(depth <= 0) {
            throw new IllegalArgumentException("search depth must be at least 1");
        }
        if(state.isTerminal()) {
            throw new IllegalArgumentException("can't search for moves in terminal game state");
        }
        return alphaBeta(state, depth, Double.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY);
    }

    /**
     * Returns the next recommended move from a given state,
     * but without value information.
     * @param state the game state
     * @param depth the maximum search tree depth
     * @return the recommended next move
     */
    public M findMove(S state, int depth) {
        return findRatedMove(state, depth).getMove();
    }

    @SuppressWarnings("AssignmentToMethodParameter")
    private RatedMove<M,P> alphaBeta(S state, int depth, double alpha, double beta) {
        List<M> moves = new ArrayList<>(state.genMoves());
        Collections.shuffle(moves);
        if(state.getTurn().isMaximizingPlayer()) {
            RatedMove<M,P> v = new RatedMove<>(null, Double.NEGATIVE_INFINITY);
            for(M move : moves) {
                RatedMove<M,P> ab = alphaBeta(state.nextState(move), move, depth-1, alpha, beta);
                if(ab.compareTo(v) > 0) {
                    v = ab;
                }
                alpha = Math.max(alpha, v.getValue());
                if(beta <= alpha) {
                    break;
                }
            }
            return v;
        }
        else {
            RatedMove<M,P> v = new RatedMove<>(null, Double.POSITIVE_INFINITY);
            for(M move : moves) {
                RatedMove<M,P> ab = alphaBeta(state.nextState(move), move, depth-1, alpha, beta);
                if(ab.compareTo(v) < 0) {
                    v = ab;
                }
                beta = Math.min(beta, v.getValue());
                if(beta <= alpha) {
                    break;
                }
            }
            return v;
        }
    }

    private RatedMove<M,P> alphaBeta(S state, M move, int depth, double alpha, double beta) {
        if(depth == 0 || state.isTerminal()) {
            return new RatedMove<>(move, state.getValue());
        }
        else {
            return new RatedMove<>(move,alphaBeta(state, depth, alpha, beta).getValue());
        }
    }
    
}
