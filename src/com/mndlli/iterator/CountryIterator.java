package com.mndlli.iterator;

/**
 * Interface that defines methods for a Country Iterator
 * 
 * @author fmandelli
 * @version 1.0
 *
 */
public interface CountryIterator {

    /**
     * Returns the next country from a Country Iterator
     * 
     * @return a instance of a Country.java
     */
    public Country next();
    
    
    /**
     * Tells whether there are more elements to be read from the Country Iterator.
     * 
     * @return true if there is a next element, otherwise false
     */
    public boolean hasNext();
}
