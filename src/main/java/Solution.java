public class Solution {
  public boolean mergeTriplets(int[][] triplets, int[] target) {
    boolean[] possibles = new boolean[3];
    for (int[] triplet : triplets) {
      if (triplet[0] <= target[0] && triplet[1] <= target[1] && triplet[2] <= target[2]) {
        for (int idx = 0; idx < 3; idx++) {
          if (!possibles[idx] && triplet[idx] == target[idx]) {
            possibles[idx] = true;
          }
        }
        if (possibles[0] && possibles[1] && possibles[2]) {
          return true;
        }
      }
    }
    return false;
  }
}
