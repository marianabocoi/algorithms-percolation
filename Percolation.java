import edu.princeton.cs.algs4.StdRandom;
import edu.princeton.cs.algs4.StdStats;
import edu.princeton.cs.algs4.WeightedQuickUnionUF;

public class Percolation {
    private boolean[][] surface;
    private int openSites = 0;

    public Percolation(int n) {
        // create n-by-n grid, with all sites blocked
        if (n <= 0) {
            throw new IllegalArgumentException();
        }
        surface = new boolean[n][n];
    }


    public void open(int row, int col) {
        // open site (row, col) if it is not open already
        if (surface[row][col])
            return;
        surface[row][col] = true;
        openSites++;
    }

    public boolean isOpen(int row, int col) {
        // is site (row, col) open?
        return surface[row][col];
    }

    public boolean isFull(int row, int col) {
        // is site (row, col) full?
        return true;
    }

    public int numberOfOpenSites() {
        // number of open sites
        return openSites;
    }

    public boolean percolates() {
        // does the system percolate?
        return true;
    }
}