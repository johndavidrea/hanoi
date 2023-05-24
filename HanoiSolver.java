// This class will solve the Towers of Hanoi problem for any given stack size
// The three rods are represented by the integers 1, 2, and 3
// The solve method can move the stack of disks from any of the three rods to any of the other two rods

// This program assumes that the starting and destination rods are integers from 1-3, and are different values
// It also assumes that the stack size is a positive integer

public class HanoiSolver {
    // Calls the solve method with a stack size of 4, a starting rod of 1, and a destination rod of 3
    public static void main(String[] args) {
        solve(4, 1, 3);
    }

    // This method solves the Towers of Hanoi problem using recursion. It takes in three integers:
    // stackSize represents the number of disks on the starting rod
    // startingRod takes in an integer from 1-3 representing which of the 3 pegs the stack is currently on
    // destinationRod takes in an integer from 1-3 representing which of the 3 pegs the stack should be moved to
    private static void solve(int stackSize, int startingRod, int destinationRod) {
        if(stackSize <= 1) {
            printMove(startingRod, destinationRod);
        } else {
            int otherRod = 6 - (startingRod + destinationRod);
            solve(stackSize - 1, startingRod, otherRod);
            printMove(startingRod, destinationRod);
            solve(stackSize - 1, otherRod, destinationRod);
        }
    }

    // Prints out an instruction to move the top disk from the location passed in, to the destination rod passed in
    private static void printMove(int location, int destination) {
        System.out.println("Move the top disk from rod #" + location + " to rod #" + destination);
    }
}
