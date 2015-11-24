package net.javavideotutorials.assignment4;

/**
 * This interface defines one contract, any class implementing the
 * AnagramSolver must have an isAnAnagram method that will return
 * true or false on the basis that the two Strings passed in do or 
 * do NOT constitute an anagram.
 * 
 * @author Trevor Page
 *
 */
public interface AnagramSolver 
{
  /**
   * @param The first word of the potential anagram
   * @param The second word of the potential anagram
   * @return <code>true</code> if the two words together constitute an anagram
   * <code>false</code> otherwise
   */
  public boolean isAnAnagram(String word1, String word2);
}
