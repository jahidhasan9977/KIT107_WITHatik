//KIT107 Assignment 3
/**
 * Symbol ADT
 * 
 * This class represents a Symbol placed on the board, typically a Queen in the N-Queens problem.
 * Each Symbol has an associated icon (image) and a location on the grid.
 * 
 * @author Jahid Hasan
 * @studentID 720521
 * @version 11/05/2025
 */

 import java.awt.*;
 import java.awt.image.*;
 
 public class Symbol implements SymbolInterface, Cloneable {
	 // Constants
	 protected final boolean TRACING = false; // Enable debug tracing output
 
	 // Instance variables
	 protected Image icon;      // Graphical representation (can be null if uninitialized)
	 protected Location loc;    // Location of the Symbol in the grid
 
	 /**
	  * Default constructor: initializes the symbol as empty (no icon, no location).
	  */
	 public Symbol() {
		 trace("Constructor starts");
 
		 setIcon(null);      // No image/icon
		 setLocation(null);  // No location assigned
 
		 trace("Constructor ends");
	 }
 
	 /**
	  * Constructor with location only.
	  * @param l the location to assign the symbol to
	  */
	 public Symbol(Location l) {
		 trace("Constructor starts");
 
		 setIcon(null);     // Still no icon/image
		 setLocation(l);    // Assign location
 
		 trace("Constructor ends");
	 }
 
	 /**
	  * Constructor with icon and location.
	  * @param i the icon/image to display
	  * @param l the location of the symbol
	  */
	 protected Symbol(Image i, Location l) {
		 trace("Constructor starts");
 
		 setIcon(i);       // Assign image/icon
		 setLocation(l);   // Assign location
 
		 trace("Constructor ends");
	 }
 
	 /**
	  * Check whether this Symbol is empty (i.e. has no icon).
	  * @return true if the icon is null, false otherwise
	  */
	 public boolean isEmpty() {
		 trace("isEmpty starts and ends");
 
		 return (icon == null); // A symbol is considered empty if it has no icon
	 }
 
	 /**
	  * Set the icon (image) of this Symbol.
	  * @param i the new icon image
	  */
	 public void setIcon(Image i) {
		 trace("setIcon starts");
 
		 this.icon = i; // Assign the icon
 
		 trace("setIcon ends");
	 }
 
	 /**
	  * Set the location of this Symbol.
	  * @param l the new location
	  */
	 public void setLocation(Location l) {
		 trace("setLocation starts");
 
		 this.loc = l; // Assign the location
 
		 trace("setLocation ends");
	 }
 
	 /**
	  * Get the icon of this Symbol.
	  * @return the icon image
	  */
	 public Image getIcon() {
		 trace("getIcon starts and ends");
 
		 return this.icon;
	 }
 
	 /**
	  * Get the location of this Symbol.
	  * @return the current location
	  */
	 public Location getLocation() {
		 trace("getLocation starts and ends");
 
		 return this.loc;
	 }
 
	 /**
	  * Clone this Symbol.
	  * @return a deep copy of the Symbol
	  */
	 public Object clone() {
		 Symbol s;
 
		 trace("clone starts");
 
		 // Create a new Symbol with the same icon and a cloned location
		 Location newLoc = (Location) this.loc.clone();
		 s = new Symbol(this.icon, newLoc);
 
		 trace("clone ends");
		 return s;
	 }
 
	 /**
	  * Display the Symbol using its icon (if not empty) on the provided Display object.
	  * @param s the Display to show the Symbol on
	  */
	 public void showSymbol(Display s) {
		 int r = getLocation().getRow();       // Get row of symbol
		 int c = getLocation().getColumn();    // Get column of symbol
		 Graphics g = s.getGraphics();         // Get graphics context
 
		 trace("showSymbol: symbol is " + toString());
 
		 if (!isEmpty()) {
			 // Draw the icon if it exists
			 g.drawImage(icon, (c + 1) * 32 + 110, (r + 1) * 32 + 50, null);
		 }
 
		 trace("showSymbol ends");
	 }
 
	 /**
	  * Convert Symbol to a human-readable string.
	  * @return " Q " if a symbol is placed, otherwise blank spaces
	  */
	 public String toString() {
		 trace("toString starts");
 
		 if (isEmpty()) {
			 trace("toString ends (empty)");
			 return "   "; // No symbol on square
		 } else {
			 trace("toString ends (non-empty)");
			 return " Q "; // Queen symbol displayed
		 }
	 }
 
	 /**
	  * Debug trace method.
	  * @param s the message to be printed if tracing is on
	  */
	 protected void trace(String s) {
		 if (TRACING) {
			 System.out.println("Symbol: " + s);
		 }
	 }
 }
 