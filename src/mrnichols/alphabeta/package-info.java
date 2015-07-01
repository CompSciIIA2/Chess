/**
 * Minimax algorithm with alpha/beta pruning.
 * <p>This package contains a simple implementation of the classic
 * game-playing AI algorithm along with interfaces to allow the algorithm
 * to be applied to any two-player adversarial game with perfect information
 * (such as checkers or chess).</p>
 * 
 * <p>To use this package, one must make implementing classes of the three
 * interfaces, {@code Player}, {@code State}, and {@code Move}. Of these three,
 * {@code Player} must be implemented as an enum. In addition, one should
 * create a subclass of {@code AlphaBeta} to fill in the generics (type variables)
 * with the appropriate implementing classes. (Extensive use of generics
 * is done to avoid casts)</p>
 * 
 * <p>For example, to set up the algorithm to play chess, one could make
 * an enum {@code ChessPlayer} implementing the {@code Player} interface,
 * a {@code ChessMove} class implementing {@code Move<ChessPlayer>},
 * and a {@code ChessState} class implementing {@code State<ChessState,ChessMove,ChessPlayer>}.</p>
 */
package mrnichols.alphabeta;