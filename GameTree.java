//KIT107 Assignment 3
/**
 * GameTree ADT
 * 
 * This class represents a tree of game states (Grids) for solving the N-Queens problem.
 * Each node contains a grid and tracks its children and siblings in the tree.
 * 
 * @author Jahid Hasan
 * @studentID 720521
 * @version 11/05/2025
 */

 public class GameTree implements GameTreeInterface {
    // Constants
    protected final boolean TRACING = false; // Enables trace output

    // Properties
    protected TNode root; // The root node of the game tree

    /**
     * Default constructor — creates an empty GameTree (null root).
     */
    public GameTree() {
        trace("GameTree: constructor starts");
        root = null;
        trace("GameTree: constructor ends");
    }

    /**
     * Constructor with data and level to initialize root node.
     */
    public GameTree(Object o, int l) {
        trace("GameTree: constructor starts");
        root = new TNode(o, l);
        trace("GameTree: constructor ends");
    }

    /**
     * Check if the game tree is empty (no root).
     */
    public boolean isEmpty() {
        trace("isEmpty: isEmpty starts and ends");
        return (root == null);
    }

    /**
     * Get the data stored in the root node.
     */
    public Object getData() throws EmptyGameTreeException {
        trace("getData: getData starts");
        if (isEmpty()) {
            trace("getData: empty game tree");
            throw new EmptyGameTreeException();
        }
        trace("getData: getData ends");
        return root.getData();
    }

    /**
     * Get the level of the root node.
     */
    public int getLevel() throws EmptyGameTreeException {
        trace("getLevel: getLevel starts");
        if (isEmpty()) {
            trace("getLevel: empty game tree");
            throw new EmptyGameTreeException();
        }
        trace("getLevel: getLevel ends");
        return root.getLevel();
    }

    /**
     * Get the eldest child node of the root as a new GameTree.
     */
    public GameTree getChild() throws EmptyGameTreeException {
        trace("getChild: getChild starts");
        if (isEmpty()) {
            trace("getChild: empty game tree");
            throw new EmptyGameTreeException();
        }
        GameTree r = new GameTree();
        r.root = root.getChild();
        trace("getChild: getChild ends");
        return r;
    }

    /**
     * Get the next sibling of the root as a new GameTree.
     */
    public GameTree getSibling() throws EmptyGameTreeException {
        trace("getSibling: getSibling starts");
        if (isEmpty()) {
            trace("getSibling: empty game tree");
            throw new EmptyGameTreeException();
        }
        GameTree r = new GameTree();
        r.root = root.getSibling();
        trace("getSibling: getSibling ends");
        return r;
    }

    /**
     * Set the data value in the root node.
     */
    public void setData(Object o) throws EmptyGameTreeException {
        trace("setData: setData starts");
        if (isEmpty()) {
            trace("setData: empty game tree");
            throw new EmptyGameTreeException();
        }
        root.setData(o);
        trace("setData: setData ends");
    }

    /**
     * Set the level value in the root node.
     */
    public void setLevel(int l) throws EmptyGameTreeException {
        trace("setLevel: setLevel starts");
        if (isEmpty()) {
            trace("setLevel: empty game tree");
            throw new EmptyGameTreeException();
        }
        root.setLevel(l);
        trace("setLevel: setLevel ends");
    }

    /**
     * Set the child pointer of the root node.
     */
    public void setChild(GameTree t) throws EmptyGameTreeException {
        trace("setChild: setChild starts");
        if (isEmpty()) {
            trace("setChild: empty game tree");
            throw new EmptyGameTreeException();
        }
        root.setChild(t.root);
        trace("setChild: setChild ends");
    }

    /**
     * Set the sibling pointer of the root node.
     */
    public void setSibling(GameTree t) throws EmptyGameTreeException {
        trace("setSibling: setSibling starts");
        if (isEmpty()) {
            trace("setSibling: empty game tree");
            throw new EmptyGameTreeException();
        }
        root.setSibling(t.root);
        trace("setSibling: setSibling ends");
    }

    // Note: Methods for generateLevelDF/BF and buildGameDF/BF will be implemented after Stack/Queue

    /**
     * Trace utility method.
     */
    protected void trace(String s) {
        if (TRACING) {
            System.out.println("GameTree: " + s);
        }
    }

	@Override
	public void generateLevelDF(Stack s, Symbol m) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'generateLevelDF'");
	}

	@Override
	public void generateLevelBF(Queue q, Symbol m) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'generateLevelBF'");
	}

	@Override
	public GameTree buildGameDF(Stack s, Symbol m, int l) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'buildGameDF'");
	}

	@Override
	public GameTree buildGameBF(Queue q, Symbol m, int l) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'buildGameBF'");
	}
}
