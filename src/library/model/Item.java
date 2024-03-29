/*
 *  Item.java
 */

package library.model;

import java.util.TreeMap;

/** Abstract base class for the various types of item in the library
 * 
 * @author  Russell C. Bjork
 * 
 * THIS CLASS IS FULLY IMPLEMENTED AND NEED NOT BE MODIFIED BY STUDENTS 
 */
public abstract class Item implements java.io.Serializable {
    
    /** Constructor
     * 
     *  @param callNumber the call number for this item
     *  @param title the title of this item;
     */
    protected Item(String callNumber, String title)
    {
        this.callNumber = callNumber;
        this.title = title;
        copies = new TreeMap<Integer, Copy>();
    }
    
    /** Create a copy of this item
     * 
      *  @return the copy
     */
    public Copy makeCopy()
    {
        int copyNumber;
        if (copies.size() == 0)
            copyNumber = 1;
        else
            copyNumber= copies.lastKey() + 1;
        Copy copy = new Copy(this, copyNumber);
        copies.put(copyNumber, copy);
        return copy;
    }
    
    /** Accessor for getting an individual copy by copy number
     * 
     *  @param copyNumber the desire copy nuber
     *  @return the desired copy
     *  @exception IllegalArgumentException if this copy does not exist
     */
    public Copy getCopy(int copyNumber) throws IllegalArgumentException
    {
        if (copies.containsKey(copyNumber))
            return copies.get(copyNumber);
        else
            throw new IllegalArgumentException("Copy does not exist");
    }
    
    /** Accessor for the call number of this item
     * 
     *  @return the call number
     */
    public String getCallNumber()
    {
        return callNumber;
    }
    
    /** Accessor for the title of this item
     * 
     *  @return the title;
     */
    public String getTitle()
    {
        return title;
    }
    
    /** Get a description of this item.  Each subclass will implement this
     *  to include the call number plus information appropriate to the item
     *
     *  #return the description
     */
    public abstract String getDescription();
    
    /** Get the checkout period (in days) for copies of this item. Different
     *  subclasses will return different values
     */
    public abstract int getCheckoutPeriod();

    
    /** Get the number of times a copy of this item can be renewed.  Different
     *  subclasses will return different values
     */
    public abstract int getAllowedNumberOfRenewals();
    
    private String callNumber, title;
    private TreeMap<Integer, Copy> copies;
	static final long serialVersionUID = 1;
}
