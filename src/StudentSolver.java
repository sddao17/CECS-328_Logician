
import java.util.HashSet;

/**
 * @author Steven Dao
 * @version 1.0
 *
 * Date: October 10, 2021
 * Purpose: To create the class StudentSolver adhering to the logician's algorithm, which finds the largest subset
 *          of statements such that each statement within the subset has at least k1 other statements within the
 *          subset that are non-contradictory and k2 other statements that are contradictory.
 */
public class StudentSolver {

    /**
     * Returns the largest subset of statements such that each statement within the subset has at least k1x other
     * statements within the subset that are non-contradictory and k2x other statements that are contradictory.
     *
     * @param m the input boolean matrix
     * @param k1x the minimum number of non-contradictory statements within the largest subset
     * @param k2x the minimum number of contradictory statements within the largest subset
     * @return the largest set of statements adhering to the restrictions
     */
    public static HashSet<Integer> solve(boolean[][] m, int k1x, int k2x) {

        // get the largest set of statements that fulfills the restrictions in the x direction
        HashSet<Integer> xLargestSet = new HashSet<>();
        // get the largest set of statements that fulfills the restrictions in the y direction
        HashSet<Integer> yLargestSet = new HashSet<>();
        // get the dimensions of the 2d array
        int gridLength = m.length;
        // to omit all outer layers of the boolean matrix that doesn't adhere to the rules, store the inner grid length
        int innerGridLength = 0;

        // get the largest inner grid that follows the restrictions by trimming the outside layers from our search
        for (int i = gridLength - 1; i >= 0; --i) {
            // keep track of the number of non-contradictory statements
            int xNonContraCount = 0;
            int yNonContraCount = 0;
            // keep track of the number of contradictory statements
            int xContraCount = 0;
            int yContraCount = 0;

            // start checking each individual row/column to see if it adheres to the logician's restrictions
            for (int j = i; j >= 0; --j) {
                // it's given that we can ignore diagonal matrices
                if (i != j) {
                    // if the current grid value is true, then statement `i` is non-contradictory to statement `j`
                    if (m[i][j])
                        ++xNonContraCount;
                    // else, statement `i` contradicts statement `j`
                    else
                        ++xContraCount;

                    // if the current grid value is true, then statement `j` is non-contradictory to statement `i`
                    if (m[j][i])
                        ++yNonContraCount;
                    // else, statement j contradicts statement i
                    else
                        ++yContraCount;
                }
            }

            // look for the first layer which starts to adhere to the logician's restrictions
            if ((xNonContraCount >= k1x && xContraCount >= k2x) ||
                    (yNonContraCount >= k1x && yContraCount >= k2x)) {
                // store the new inner grid length to begin traversing and look for the largest subset
                innerGridLength = i;
                // we can break out immediately once we've set the flag
                break;
            }
        }

        // traverse the grid in each direction to account for non-symmetrical matrices
        for (int i = 0; i <= innerGridLength; ++i) {
            // keep track of the number of non-contradictory statements
            int xNonContraCount = 0;
            int yNonContraCount = 0;
            // keep track of the number of contradictory statements
            int xContraCount = 0;
            int yContraCount = 0;

            // check the value of each column/row within the given row/column
            for (int j = 0; j <= innerGridLength; ++j) {
                // it's given that we can ignore diagonal matrices
                if (i != j) {
                    // if the current grid value is true, then statement `i` is non-contradictory to statement `j`
                    if (m[i][j])
                        ++xNonContraCount;
                    // else, statement `i` contradicts statement `j`
                    else
                        ++xContraCount;

                    // if the current grid value is true, then statement `j` is non-contradictory to statement `i`
                    if (m[j][i])
                        ++yNonContraCount;
                    // else, statement j contradicts statement i
                    else
                        ++yContraCount;
                }
            }

            // if the current subset of statements matches the requirements, we can add it to our x-largest subset
            if (xNonContraCount >= k1x && xContraCount >= k2x)
                xLargestSet.add(i);

            // if the current subset of statements matches the requirements, we can add it to our y-largest subset
            if (yNonContraCount >= k1x && yContraCount >= k2x)
                yLargestSet.add(i);
        }

        // return the elements that match the non/contradictory requirements across all subsets of the grid
        return new HashSet<>(getCommonElements(xLargestSet, yLargestSet));
    }

    /**
     * Returns the common elements within the provided sets as a new set.
     *
     * @param set1 the first input set to check against the second set
     * @param set2 the second input set to check against the first set
     * @return the common elements between the two sets within a new set.
     */
    private static HashSet<Integer> getCommonElements(HashSet<Integer> set1, HashSet<Integer> set2) {

        // store the common elements between the sets
        HashSet<Integer> commonElements = new HashSet<>();

        // traverse all elements in any one of the sets
        for (int element : set1)
            // add any elements that exist in both set1 and set2 to our commonElements set
            if (set2.contains(element))
                commonElements.add(element);

        return commonElements;
    }
}
