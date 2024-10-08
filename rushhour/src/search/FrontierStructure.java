// Rushhour AI assignment
//
// Description: Sample Rushhour boards
// Date: December 2020
// Author: John Maraist

package search;

/**
 *  Methods required of a representation of a search tree frontier.
 *
 *  The {@link Frontiers} class contains some standard implementations
 *  and utilities of this interface.
 *
 * @param <Node> The type of tree nodes stored in the frontier.
 *
 * @see GraphSearcher#search
 * @see Frontiers
 */
public interface FrontierStructure<Node> {

  /**
   *  Adds a (usually newly-generated) tree node to the frontier.
   *
   * @param n The new node
   */
  public void add(Node n);

  /**
   *  Checks whether any tree nodes remain in the frontier
   *
   * @return <tt>false</tt> when the frontier is empty, which
   * generally indicates that the search has failed.
   */
  public boolean isEmpty();

  /**
   *  Removes one tree node from the frontier, and returns it.
   *
   * @return The dequeued tree node
   *
   * @throws IllegalStateException when this method is called but the
   * frontier is empty; the exception may contain a cause if the
   * exception was generated by some other data structure.
   */
  public Node pop();

  /**
   *  Returns the number of open nodes sitting unexpanded in the
   *  frontier.
   *
   * @return The number of open nodes
   */
  public int countOpen();

  /**
   *  Print debugging information about the frontier.  By default,
   *  does nothing.
   */
  public default void debugDisplayFrontier() { }

}
