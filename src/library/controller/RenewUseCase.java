/*
 * RenewUseCase.java
 */
package library.controller;

import library.model.Copy;
import library.model.Patron;

/**
 *
 * @author Sofi Stonehouse, Jason Asonye, Daniel Lovelace, and Mya Randolph
 */
public class RenewUseCase {
    public static void perform(Copy copy) {
        copy.renew();
    }
    
    // Private constructor prevents instantiation
    private RenewUseCase()
    { }   
}
