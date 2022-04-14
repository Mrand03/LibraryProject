/*
 * ReturnUseCase.java
 */


package library.controller;


import library.model.Copy;
import library.model.Patron;
import library.model.LibraryDatabase;

/**
 *
 * @author Sofi Stonehouse, Jason Asonye, Daniel Lovelace, and Mya Randolph
 */

public class ReturnUseCase {
    public static void perform(Copy copy) {
        
        Patron checkedOutTo = copy.getCheckedOutTo();
        if (checkedOutTo == null)
            throw new IllegalArgumentException("Copy is not checked out");
        else
        {
            checkedOutTo.returnCopy(copy);
            copy.recordReturn();
        }
        
    }
    
    // Private constructor prevents instantiation
    private ReturnUseCase()
    { }   
}
