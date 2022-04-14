
import java.util.ArrayList;
import java.util.HashSet;

/**
 * @author Steven Dao
 * @version 1.0
 *
 * Date: October 10, 2021
 * Purpose: To test the results received from the StudentSolver class.
 */
public class Main {

    /**
     * Tests the StudentSolver function using the provided test cases.
     * To add additional test cases, add to the provided containers as necessary.
     *
     * @param args the command-line arguments of the application
     */
    public static void main(String[] args) {

        int numOfTests = 0;
        int numOfTestsPassed = 0;
        ArrayList<boolean[][]> inputGrids = new ArrayList<>();
        ArrayList<int[]> inputValuesOfK = new ArrayList<>();
        ArrayList<HashSet<Integer>> expectedSets = new ArrayList<>();


        // test case 1 -------------------------------------------------------------------------------------------------
        ++numOfTests;
        inputGrids.add(new boolean[][] {
                {false, false, true,  true,  true},
                {false, true,  true,  true,  true},
                {true,  true,  false, true,  true},
                {true,  true,  true,  false, false},
                {true,  true,  true,  false, false}
        });
        inputValuesOfK.add(new int[] {2, 1});
        expectedSets.add(new HashSet<>() {
            {
                add(0);
                add(1);
                add(3);
                add(4);
            }
        });

        // test case 2 -------------------------------------------------------------------------------------------------
        ++numOfTests;
        inputGrids.add(new boolean[][] {
                {false, true,  true,  true,  true,  true,  true,  false, true,  true,  true,  true,  true,  true,  true,  true},
                {true,  false, true,  false, true,  true,  true,  true,  true,  true,  false, true,  true,  true,  true,  true},
                {true,  true,  false, true,  true,  true,  true,  true,  true,  true,  true,  true,  false, true,  true,  true},
                {true,  false, true,  false, true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true},
                {true,  true,  true,  true,  false, true,  false, true,  true,  true,  true,  true,  true,  true,  true,  true},
                {true,  true,  true,  true,  true,  false, true,  true,  true,  true,  true,  true,  true,  true,  false, true},
                {true,  true,  true,  true,  false, true,  false, true,  true,  true,  true,  true,  true,  true,  true,  true},
                {false, true,  true,  true,  true,  true,  true,  false, true,  false, true,  true,  true,  true,  true,  true},
                {true,  true,  true,  true,  true,  true,  true,  true,  false, true,  true,  true,  true,  true,  true,  true},
                {true,  true,  true,  true,  true,  true,  true,  false, true,  false, true,  false, true,  true,  true,  true},
                {true,  false, true,  true,  true,  true,  true,  true,  true,  true,  false, true,  true,  true,  true,  true},
                {true,  true,  true,  true,  true,  true,  true,  true,  true,  false, true,  false, true,  false, false, true},
                {true,  true,  false, true,  true,  true,  true,  true,  true,  true,  true,  true,  false, true,  true,  true},
                {true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  false, true,  false, true,  true},
                {true,  true,  true,  true,  true,  false, true,  true,  true,  true,  true,  false, true,  true,  false, true},
                {true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  false},
        });
        inputValuesOfK.add(new int[]{1, 1});
        expectedSets.add(new HashSet<>() {
            {
                add(0);
                add(1);
                add(2);
                add(3);
                add(4);
                add(5);
                add(6);
                add(7);
                add(9);
                add(10);
                add(11);
                add(12);
                add(13);
                add(14);
            }
        });

        // test case 3 -------------------------------------------------------------------------------------------------
        ++numOfTests;
        inputGrids.add(new boolean[][] {
                {false, false, true,  true,  true,  false, false, false, true,  true,  true,  true,  true,  true,  false, false, false, true,  true,  true,  true,  false, true,  true,  true},
                {false, false, false, false, false, false, false, false, true,  true,  true,  true,  true,  true,  false, false, false, true,  true,  true,  true,  false, true,  true,  true},
                {true,  false, false, true,  true,  false, false, false, true,  true,  true,  true,  true,  true,  false, false, false, true,  true,  true,  true,  false, true,  true,  true},
                {true,  false, true,  false, true,  false, false, false, true,  true,  true,  true,  true,  true,  false, false, false, true,  true,  true,  true,  false, true,  true,  true},
                {true,  false, true,  true,  false, false, false, false, true,  true,  true,  true,  true,  true,  false, false, false, true,  true,  true,  true,  false, true,  true,  true},
                {false, false, false, false, false, false, false, false, true,  true,  true,  true,  true,  true,  false, false, false, true,  true,  true,  true,  false, true,  true,  true},
                {false, false, false, false, false, false, false, false, true,  true,  true,  true,  true,  true,  false, false, false, true,  true,  true,  true,  false, true,  true,  true},
                {false, false, false, false, false, false, false, false, true,  true,  true,  true,  true,  true,  false, false, false, true,  true,  true,  true,  false, true,  true,  true},
                {true,  true,  true,  true,  true,  true,  true,  true,  false, true,  true,  true,  true,  true,  false, false, false, true,  true,  true,  true,  false, true,  true,  true},
                {true,  true,  true,  true,  true,  true,  true,  true,  true,  false, true,  true,  true,  true,  false, false, false, true,  true,  true,  true,  false, true,  true,  true},
                {true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  false, true,  true,  true,  false, false, false, true,  true,  true,  true,  false, true,  true,  true},
                {true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  false, true,  true,  false, false, false, true,  true,  true,  true,  false, true,  true,  true},
                {true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  false, true,  false, false, false, true,  true,  true,  true,  false, true,  true,  true},
                {true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  false, false, false, false, true,  true,  true,  true,  false, true,  true,  true},
                {false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true,  true,  true,  true,  false, true,  true,  true},
                {false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true,  true,  true,  true,  false, true,  true,  true},
                {false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true,  true,  true,  true,  false, true,  true,  true},
                {true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  false, true,  true,  true,  false, true,  true,  true},
                {true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  false, true,  true,  false, true,  true,  true},
                {true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  false, true,  false, true,  true,  true},
                {true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  false, false, true,  true,  true},
                {false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true,  true,  true},
                {true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  false, true,  true},
                {true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  false, true},
                {true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  false},
        });
        inputValuesOfK.add(new int[] {1, 1});
        expectedSets.add(new HashSet<>() {
            {
                add(0);
                add(2);
                add(3);
                add(4);
            }
        });

        // test case 4 -------------------------------------------------------------------------------------------------
        ++numOfTests;
        inputGrids.add(new boolean[][] {
                {false, true,  false, false, true,  true,  true,  false, true,  false, true,  false, false, true,  false, true,  true,  true,  true,  false, true,  false, false, false, false, true,  true,  true,  false, false, true},
                {true,  false, true,  false, false, false, false, true,  false, true,  false, false, true,  true,  false, true,  true,  true,  true,  false, true,  false, false, false, false, true,  true,  true,  false, false, true},
                {false, true,  false, true,  true,  true,  false, true,  false, false, true,  false, true,  true,  false, true,  true,  true,  true,  false, true,  false, false, false, false, true,  true,  true,  false, false, true},
                {false, false, true,  false, false, false, false, true,  true,  false, true,  false, true,  true,  false, true,  true,  true,  true,  false, true,  false, false, false, false, true,  true,  true,  false, false, true},
                {true,  false, true,  false, false, false, false, true,  false, false, false, true,  true,  true,  false, true,  true,  true,  true,  false, true,  false, false, false, false, true,  true,  true,  false, false, true},
                {true,  false, true,  false, false, false, false, false, true,  true,  true,  true,  true,  true,  false, true,  true,  true,  true,  false, true,  false, false, false, false, true,  true,  true,  false, false, true},
                {true,  false, false, false, false, false, false, true,  false, false, false, false, false, true,  false, true,  true,  true,  true,  false, true,  false, false, false, false, true,  true,  true,  false, false, true},
                {false, true,  true,  true,  true,  false, true,  false, true,  true,  false, false, true,  true,  false, true,  true,  true,  true,  false, true,  false, false, false, false, true,  true,  true,  false, false, true},
                {true,  false, false, true,  false, true,  false, true,  false, true,  true,  true,  true,  true,  false, true,  true,  true,  true,  false, true,  false, false, false, false, true,  true,  true,  false, false, true},
                {false, true,  false, false, false, true,  false, true,  true,  false, true,  true,  false, true,  false, true,  true,  true,  true,  false, true,  false, false, false, false, true,  true,  true,  false, false, true},
                {true,  false, true,  true,  false, true,  false, false, true,  true,  false, true,  false, true,  false, true,  true,  true,  true,  false, true,  false, false, false, false, true,  true,  true,  false, false, true},
                {false, false, false, false, true,  true,  false, false, true,  true,  true,  false, false, true,  false, true,  true,  true,  true,  false, true,  false, false, false, false, true,  true,  true,  false, false, true},
                {false, true,  true,  true,  true,  true,  false, true,  true,  false, false, false, false, true,  false, true,  true,  true,  true,  false, true,  false, false, false, false, true,  true,  true,  false, false, true},
                {true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  false, false, true,  true,  true,  true,  false, true,  false, false, false, false, true,  true,  true,  false, false, true},
                {false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true,  true,  true,  true,  false, true,  false, false, false, false, true,  true,  true,  false, false, true},
                {true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  false, true,  true,  true,  false, true,  false, false, false, false, true,  true,  true,  false, false, true},
                {true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  false, true,  true,  false, true,  false, false, false, false, true,  true,  true,  false, false, true},
                {true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  false, true,  false, true,  false, false, false, false, true,  true,  true,  false, false, true},
                {true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  false, false, true,  false, false, false, false, true,  true,  true,  false, false, true},
                {false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true,  false, false, false, false, true,  true,  true,  false, false, true},
                {true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  false, false, false, false, false, true,  true,  true,  false, false, true},
                {false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true,  true,  true,  false, false, true},
                {false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true,  true,  true,  false, false, true},
                {false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true,  true,  true,  false, false, true},
                {false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true,  true,  true,  false, false, true},
                {true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  false, true,  true,  false, false, true},
                {true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  false, true,  false, false, true},
                {true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  false, false, false, true},
                {false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true},
                {false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true},
                {true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  false},
        });
        inputValuesOfK.add(new int[]{1, 1});
        expectedSets.add(new HashSet<>() {
            {
                add(0);
                add(1);
                add(2);
                add(3);
                add(4);
                add(5);
                add(6);
                add(7);
                add(8);
                add(9);
                add(10);
                add(11);
                add(12);
            }
        });

        // test case 5 -------------------------------------------------------------------------------------------------
        ++numOfTests;
        inputGrids.add(new boolean[][] {
                {false, true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  false, true,  true,  true,  false, false, true,  false, false, false, false, true,  true,  true,  true,  false, true,  true,  true,  true,  false, false, false, false, true,  false, false, false, false, true,  false},
                {true,  false, true,  true,  true,  true,  true,  true,  false, true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  false, true,  true,  true,  false, false, true,  false, false, false, false, true,  true,  true,  true,  false, true,  true,  true,  true,  false, false, false, false, true,  false, false, false, false, true,  false},
                {true,  true,  false, true,  true,  true,  false, true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  false, true,  true,  true,  false, false, true,  false, false, false, false, true,  true,  true,  true,  false, true,  true,  true,  true,  false, false, false, false, true,  false, false, false, false, true,  false},
                {true,  true,  true,  false, true,  true,  true,  false, true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  false, true,  true,  true,  false, false, true,  false, false, false, false, true,  true,  true,  true,  false, true,  true,  true,  true,  false, false, false, false, true,  false, false, false, false, true,  false},
                {true,  true,  true,  true,  false, true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  false, true,  true,  true,  false, false, true,  false, false, false, false, true,  true,  true,  true,  false, true,  true,  true,  true,  false, false, false, false, true,  false, false, false, false, true,  false},
                {true,  true,  true,  true,  true,  false, true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  false, true,  true,  true,  false, false, true,  false, true,  false, false, true,  true,  true,  true,  false, true,  true,  true,  true,  false, false, false, false, true,  false, false, false, false, true,  false},
                {true,  true,  false, true,  true,  true,  false, true,  true,  true,  true,  false, true,  true,  true,  true,  true,  true,  true,  false, true,  true,  true,  false, false, true,  false, false, false, false, true,  true,  true,  true,  false, true,  true,  true,  true,  false, false, false, false, true,  false, false, false, false, true,  false},
                {true,  true,  true,  false, true,  true,  true,  false, true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  false, true,  true,  true,  false, false, true,  false, false, false, false, true,  true,  true,  true,  false, true,  true,  true,  true,  false, false, false, false, true,  false, false, false, false, true,  false},
                {true,  false, true,  true,  true,  true,  true,  true,  false, true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  false, true,  true,  true,  false, false, true,  false, false, false, false, true,  true,  true,  true,  false, true,  true,  true,  true,  false, false, false, false, true,  false, false, false, false, true,  false},
                {true,  true,  true,  true,  true,  true,  true,  true,  true,  false, true,  false, true,  true,  true,  true,  true,  true,  true,  false, true,  true,  true,  false, true,  true,  false, false, false, false, true,  true,  true,  true,  false, true,  true,  true,  true,  false, false, false, false, true,  false, false, false, false, true,  false},
                {true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  false, true,  true,  true,  true,  true,  true,  true,  true,  false, true,  true,  true,  false, false, true,  false, false, false, false, true,  true,  true,  true,  false, true,  true,  true,  true,  false, false, false, false, true,  false, false, false, false, true,  false},
                {true,  true,  true,  true,  true,  true,  false, true,  true,  false, true,  false, false, true,  true,  true,  true,  true,  true,  false, true,  true,  true,  false, false, true,  false, false, false, false, true,  true,  true,  true,  false, true,  true,  true,  true,  false, false, false, false, true,  false, false, false, false, true,  false},
                {true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  false, false, true,  true,  true,  true,  true,  true,  false, true,  true,  true,  false, false, true,  false, false, false, false, true,  true,  true,  true,  false, true,  true,  true,  true,  false, false, false, false, true,  false, false, false, false, true,  false},
                {true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  false, true,  true,  true,  true,  true,  false, true,  true,  true,  false, false, true,  false, false, true,  false, true,  true,  true,  true,  false, true,  true,  true,  true,  false, false, false, false, true,  false, false, false, false, true,  false},
                {true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  false, true,  true,  true,  true,  false, true,  true,  true,  false, false, true,  false, false, false, false, true,  true,  true,  true,  false, true,  true,  true,  true,  false, false, false, false, true,  false, false, false, false, true,  false},
                {true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  false, true,  true,  true,  false, true,  true,  true,  false, false, true,  false, false, false, false, true,  true,  true,  true,  false, true,  true,  true,  true,  false, false, false, false, true,  false, false, false, false, true,  false},
                {true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  false, true,  true,  false, true,  true,  true,  false, false, true,  false, false, false, false, true,  true,  true,  true,  false, true,  true,  true,  true,  false, false, false, false, true,  false, false, false, false, true,  false},
                {true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  false, true,  false, true,  true,  true,  false, false, true,  false, false, false, false, true,  true,  true,  true,  false, true,  true,  true,  true,  false, false, false, false, true,  false, false, false, false, true,  false},
                {true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  false, false, true,  true,  true,  false, false, true,  false, false, false, false, true,  true,  true,  true,  false, true,  true,  true,  true,  false, false, false, false, true,  false, false, false, false, true,  false},
                {false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true,  true,  true,  false, false, true,  false, false, false, false, true,  true,  true,  true,  false, true,  true,  true,  true,  false, false, false, false, true,  false, false, false, false, true,  false},
                {true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  false, true,  true,  false, false, true,  false, false, false, false, true,  true,  true,  true,  false, true,  true,  true,  true,  false, false, false, false, true,  false, false, false, false, true,  false},
                {true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  false, true,  false, false, true,  false, false, false, false, true,  true,  true,  true,  false, true,  true,  true,  true,  false, false, false, false, true,  false, false, false, false, true,  false},
                {true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  false, false, false, true,  false, false, false, false, true,  true,  true,  true,  false, true,  true,  true,  true,  false, false, false, false, true,  false, false, false, false, true,  false},
                {false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true,  false, false, false, false, true,  true,  true,  true,  false, true,  true,  true,  true,  false, false, false, false, true,  false, false, false, false, true,  false},
                {false, false, false, false, false, false, false, false, false, true,  false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true,  false, false, false, false, true,  true,  true,  true,  false, true,  true,  true,  true,  false, false, false, false, true,  false, false, false, false, true,  false},
                {true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  false, false, false, false, false, true,  true,  true,  true,  false, true,  true,  true,  true,  false, false, false, false, true,  false, false, false, false, true,  false},
                {false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true,  true,  true,  true,  false, true,  true,  true,  true,  false, true,  true,  false, true,  false, false, false, false, true,  false},
                {false, false, false, false, false, true,  false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true,  true,  true,  true,  false, true,  true,  true,  true,  false, false, false, true,  true,  false, false, false, false, true,  false},
                {false, false, false, false, false, false, false, false, false, false, false, false, false, true,  false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true,  true,  true,  true,  false, true,  true,  true,  true,  false, false, false, false, true,  false, false, false, false, true,  false},
                {false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true,  true,  true,  true,  false, true,  true,  true,  true,  false, false, false, false, true,  false, false, false, false, true,  false},
                {true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  false, true,  true,  true,  false, true,  true,  true,  true,  false, false, false, false, true,  false, false, false, false, true,  false},
                {true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  false, true,  true,  false, true,  true,  true,  true,  false, false, false, false, true,  false, true,  false, false, true,  false},
                {true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  false, true,  false, true,  true,  true,  true,  false, false, false, false, true,  false, false, false, false, true,  false},
                {true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  false, false, true,  true,  true,  true,  false, false, false, false, true,  false, false, false, false, true,  false},
                {false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true,  true,  true,  true,  false, false, false, false, true,  false, false, false, false, true,  false},
                {true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  false, true,  true,  true,  false, false, false, false, true,  false, false, false, false, true,  false},
                {true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  false, true,  true,  false, false, false, false, true,  false, false, false, false, true,  false},
                {true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  false, true,  false, false, false, false, true,  false, false, false, false, true,  false},
                {true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  false, false, false, false, false, true,  false, false, false, false, true,  false},
                {false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true,  false, false, false, false, true,  false},
                {false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true,  false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true,  false, false, false, false, true,  false},
                {false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true,  false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true,  false, false, false, false, true,  false},
                {false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true,  false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true,  false, false, false, false, true,  false},
                {true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  false, false, false, false, false, true,  false},
                {false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true,  false},
                {false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true,  false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true,  false},
                {false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true,  false},
                {false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true,  false},
                {true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  true,  false, false},
                {false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false},
        });
        inputValuesOfK.add(new int[]{2, 1});
        expectedSets.add(new HashSet<>() {
            {
                add(1);
                add(2);
                add(3);
                add(6);
                add(7);
                add(8);
                add(9);
                add(11);
                add(12);
            }
        });


        boolean[] inputsPassed = new boolean[numOfTests];
        double[] testTimes = new double[numOfTests];


        System.out.println("""
                
                =======================================================================================
                                                Testing Logician ...
                =======================================================================================""");


        for (int currentIndex = 0; currentIndex < numOfTests; ++currentIndex) {
            int testNumber = currentIndex + 1;
            boolean[][] inputGrid = inputGrids.get(currentIndex);
            int[] inputPairOfKs = inputValuesOfK.get(currentIndex);
            HashSet<Integer> expectedSet = expectedSets.get(currentIndex);

            String inputsAsString = getGridAsString(inputGrid) +
                    "\nValues of k: " + inputPairOfKs[0] + ", " + inputPairOfKs[1];

            System.out.printf("""
                    
                    -------------------------------
                             Input Parameters %s
                    -------------------------------
                    %s
                    """, testNumber, inputsAsString);

            long startTime = System.nanoTime();

            HashSet<Integer> resultSet = StudentSolver.solve(inputGrid, inputPairOfKs[0], inputPairOfKs[1]);

            long endTime = System.nanoTime();
            testTimes[currentIndex] = (double) (endTime - startTime) / 1_000_000_000;

            System.out.printf("""
                    
                    -------------------------------
                          Simulated Results %s
                    -------------------------------
                    %s
                    """, testNumber, resultSet);

            System.out.printf("""
                    
                    ------------------------------
                          Expected Results %s
                    ------------------------------
                    %s
                    """, testNumber, expectedSet);

            if (resultSet.containsAll(expectedSet) && resultSet.size() == expectedSet.size()) {
                inputsPassed[currentIndex] = true;
                ++numOfTestsPassed;
            }

            System.out.println("\n=======================================================================================");
        }

        StringBuilder testLog = new StringBuilder();

        for (int i = 0; i < numOfTests; ++i)
            testLog.append("\nTest ").append(i + 1).append(":\t ").append(inputsPassed[i] ? "+ Passed" : "- Failed");
        testLog.append("\n\nTests passed:\t").append(numOfTestsPassed).append(" / ").append(numOfTests);

        System.out.println(testLog);

        System.out.println("\n=======================================================================================");

        StringBuilder timeLog = new StringBuilder();
        double elapsedTime = 0;

        for (double time : testTimes)
            elapsedTime += time;

        for (int i = 0; i < numOfTests; ++i)
            timeLog.append("\nTest ").append(i + 1).append(" time:\t").append(testTimes[i]).append(" seconds");
        timeLog.append("\n\nTotal execution time:\t").append(elapsedTime).append(" seconds");

        System.out.println(timeLog);

        System.out.println("\n=======================================================================================");
    }

    /**
     * Returns the boolean grid as a String.
     *
     * @param inputGrid the provided 2D array of boolean values
     * @return the 2D array as a String
     */
    public static String getGridAsString(boolean[][] inputGrid) {

        StringBuilder gridToString = new StringBuilder();

        // add each boolean value from the grid to the string
        for (boolean[] row : inputGrid) {
            for (boolean column : row)
                // convert true/false to 1/0 for readability
                gridToString.append(String.format("%s", column ? "1" : "0")).append("  ");
            gridToString.append("\n");
        }

        return gridToString.toString();
    }
}
