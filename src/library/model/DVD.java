/*
 *  DVD.java
 */

package library.model;

/** Representation for a DVD
 * 
 * @author  Russell C. Bjork
 * 
 * MODIFIED BY: Sofi Stonehouse, Jason Asonye, Daniel Lovelace, and Mya Randolph
 */
public class DVD extends Item implements java.io.Serializable {
    
    /** Constructor
     * 
     *  @param callNumber the call number of this DVD
     *  @param title the title of this DVD
     *  @param leadActor the lead actor of this DVD
     *	@param rating the rating of this DVD
     */
    public DVD(String callNumber, String title, String leadActor, String rating)
    {
        super(callNumber, title);
        this.title = title;
        this.leadActor = leadActor;
        this.rating = rating;        
    }
    
    // Implementation of abstract methods of base class
    
    public String getDescription()
    {
        return title + " (DVD) " + leadActor + ", rated: " + rating;
    }
    
    public int getCheckoutPeriod()
    {
       return 7;
    }
      
    public int getAllowedNumberOfRenewals()
    {
       return 0;
    }
    
        private String title;
        private String leadActor;
        private String rating;
        
        static final long serialVersionUID = 1;    
}
