/*
time complexity: O(1)
space complexity: O(1)
 */

public class FinfTheKthCharacterInString {
    public char kthCharacter(int k) {
        int shift=Integer.bitCount(k-1);
        return (char) ('a'+shift);
    }
}
