//KIT107 Assignment 3
/**
 * Square ADT
 * 
 * This class represents a square on the N-Queens board with a location, symbol, and background color.
 * 
 * @author Jahid Hasan
 * @studentID 720521
 * @version 11/05/2025
 */

 import java.awt.*;

 public class Square implements SquareInterface, Cloneable {
	 // Constants
	 protected final boolean TRACING = false; // Enables tracing
 
	 // Instance variables
	 protected Location loc;      // Location of this square on the grid
	 protected Symbol symbol;     // The symbol (queen or empty)
	 protected Color background;  // The background color (white or black)
 
	 /**
	  * Constructor with location only. Initializes an empty square.
	  * @param l Location of the square
	  */
	 public Square(Location l) {
		 trace("Constructor starts");
		 initialiseSquare(l, new Symbol()); // Use default empty symbol
		 trace("Constructor ends");
	 }
 
	 /**
	  * Constructor with location and symbol.
	  * @param l Location of the square
	  * @param s Symbol to place on the square
	  */
	 public Square(Location l, Symbol s) {
		 trace("Constructor starts");
		 initialiseSquare(l, s); // Initialize square with given symbol
		 trace("Constructor ends");
	 }
 
	 /**
	  * Helper method to initialize square with location and symbol.
	  * Sets color based on (row + column) parity.
	  */
	 protected void initialiseSquare(Location l, Symbol s) {
		 trace("initialiseSquare starts");
		 setLocation(l);
		 setSymbol(s);
 
		 // Alternate color based on (row + column) even/odd
		 if ((l.getRow() + l.getColumn()) % 2 == 0) {
			 setBackground(Color.WHITE);
		 } else {
			 setBackground(Color.BLACK);
		 }
 
		 trace("initialiseSquare ends");
	 }
 
	 /**
	  * Check if the square is empty (i.e., has no symbol).
	  * @return true if square has no symbol
	  */
	 public boolean isEmpty() {
		 trace("isEmpty starts and ends");
		 return symbol == null || symbol.isEmpty();
	 }
 
	 /**
	  * Get the location of the square.
	  * @return Location object
	  */
	 public Location getLocation() {
		 trace("getLocation starts and ends");
		 return loc;
	 }
 
	 /**
	  * Set the location of the square.
	  * @param l Location object
	  */
	 public void setLocation(Location l) {
		 trace("setLocation starts");
		 loc = l;
		 trace("setLocation ends");
	 }
 
	 /**
	  * Get the symbol stored in this square.
	  * @return Symbol object
	  */
	 public Symbol getSymbol() {
		 trace("getSymbol starts and ends");
		 return symbol;
	 }
 
	 /**
	  * Set the symbol for this square.
	  * @param s Symbol object
	  */
	 public void setSymbol(Symbol s) {
		 trace("setSymbol starts");
		 symbol = s;
		 trace("setSymbol ends");
	 }
 
	 /**
	  * Get the background color of the square.
	  * @return Color of background
	  */
	 public Color getBackground() {
		 trace("getBackground starts and ends");
		 return background;
	 }
 
	 /**
	  * Set the background color of the square.
	  * @param b Color to assign
	  */
	 public void setBackground(Color b) {
		 trace("setBackground starts");
		 background = b;
		 trace("setBackground ends");
	 }
 
	 /**
	  * Clone the square including symbol and location.
	  * @return Cloned Square object
	  */
	 public Object clone() {
		 trace("clone starts");
		 Square s = new Square((Location) loc.clone(), (Symbol) symbol.clone());
		 trace("clone ends");
		 return s;
	 }
 
	 /**
	  * Show this square on a graphical display.
	  * @param d Display object
	  * @param w Width of square in pixels
	  */
	 public void showSquare(Display d, int w) {
		 trace("showSquare starts");
		 int r = getLocation().getRow();
		 int c = getLocation().getColumn();
		 Graphics g = d.getGraphics();
 
		 // Draw background
		 g.setColor(getBackground());
		 g.fillRect((c+1) * 32 + 110, (r+1) * 32 + 50, w, w);
 
		 // Draw symbol if present
		 getSymbol().showSymbol(d);
 
		 // Reset color
		 g.setColor(Color.BLACK);
		 trace("showSquare ends");
	 }
 
	 /**
	  * Return string representation of the square.
	  * @return " Q " or "   " depending on occupancy
	  */
	 public String toString() {
		 trace("toString starts");
		 String s = isEmpty() ? "   " : getSymbol().toString();
		 trace("toString ends");
		 return s;
	 }
 
	 /**
	  * Print trace output if enabled.
	  * @param s Message to print
	  */
	 protected void trace(String s) {
		 if (TRACING) {
			 System.out.println("Square: " + s);
		 }
	 }
 }
 