import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class PercolationTest {

    @Test
    void open() {
        Percolation percolation =  new Percolation(2);
        percolation.open(1,1);
        assertTrue(percolation.isOpen(1,1));
        assertFalse(percolation.isOpen(1,2));
    }

    @Test
    void percolates() {
        Percolation percolation =  new Percolation(2);
        percolation.open(1,1);
        percolation.open(2,1);
        assertTrue(percolation.percolates());
    }

    @Test
    void doesNotpercolate() {
        Percolation percolation =  new Percolation(2);
        percolation.open(1,1);
        assertFalse(percolation.percolates());
    }

}