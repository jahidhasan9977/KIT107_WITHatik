//KIT107 Assignment 3
/**
 * Location ADT
 * 
 * This class represents a Location in the grid with a row and column value.
 * 
 * @author Jahid Hasan
 * @studentID 720521
 * @version 11/05/2025
 */

 public class Location implements LocationInterface, Cloneable {
    // Constants
    protected final boolean TRACING = false; // Enable tracing output if true

    // Instance variables
    protected int row;    // Vertical coordinate of the grid
    protected int column; // Horizontal coordinate of the grid

    /**
     * Constructor to initialize a location with given row and column.
     * @param r The row number (1-based indexing)
     * @param c The column number (1-based indexing)
     */
    public Location(int r, int c) {
        trace("Constructor starts");

        this.row = r;       // Assign row
        this.column = c;    // Assign column

        trace("Constructor ends");
    }

    /**
     * Set the row value.
     * @param r The new row number
     */
    public void setRow(int r) {
        trace("setRow starts");

        this.row = r; // Update row value

        trace("setRow ends");
    }

    /**
     * Set the column value.
     * @param c The new column number
     */
    public void setColumn(int c) {
        trace("setColumn starts");

        this.column = c; // Update column value

        trace("setColumn ends");
    }

    /**
     * Get the row number.
     * @return the current row value
     */
    public int getRow() {
        trace("getRow starts and ends");

        return this.row; // Return row
    }

    /**
     * Get the column number.
     * @return the current column value
     */
    public int getColumn() {
        trace("getColumn starts and ends");

        return this.column; // Return column
    }

    /**
     * Clone this location object.
     * @return a new Location object with the same row and column
     */
    public Object clone() {
        Location l;

        trace("clone starts");

        l = new Location(this.row, this.column); // Create copy of location

        trace("clone ends");
        return l; // Return cloned location
    }

    /**
     * Convert location to a string format.
     * @return a string representation like "row 2 and column 3"
     */
    public String toString() {
        trace("toString starts and ends");

        return ("row " + getRow() + " and column " + getColumn());
    }

    /**
     * Optional debug trace output to console.
     * @param s the message to be printed if tracing is enabled
     */
    protected void trace(String s) {
        if (TRACING) {
            System.out.println("Location: " + s);
        }
    }
}
