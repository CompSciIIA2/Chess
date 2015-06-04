/**
 * Minimax algorithm with alpha-beta pruning.
 * The alpha-beta pruned minimax algorithm is the "standard" AI algorithm for
 * two-player games with perfect information, such as checkers or chess.
 * In these types of games, the entire state of the game is known to both
 * players (unlike the situation in card games) and there is no element
 * of chance (unlike games with dice).
 * <p/>Minimax algorithms work by searching a "game tree" of possible variations.
 * A heuristic (guessing) function is used to value each game position, and
 * one of the players tries to maximize this function while the other one
 * ties to minimize the function. Depending on how many moves (plies) the
 * algorithm looks ahead, this game tree may be quite large. Therefore
 * most minimax implementations rely on some kind of "pruning" to cut down the
 * search space. Alpha-beta pruning is perhaps the mostly widely known of these.
 * Pruning reduces the search by skipping over branches of the tree associated
 * with inferior moves (inferior for the player making the move, that is). 
 * 
 * @see http://en.wikipedia.org/wiki/Alpha%E2%80%93beta_pruning
 * @author 2014-2015 LCHS Computer Science II
 */
package mrnichols.alphabeta;