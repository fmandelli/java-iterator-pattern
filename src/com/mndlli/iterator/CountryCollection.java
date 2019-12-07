package com.mndlli.iterator;

/**
 * Interface that defines methods required for a Country Collection
 * @author fmandelli
 * @version 1.0
 *
 */
public interface CountryCollection {
	
    /**
     * Adds a country to the Collection
     * 
     * @param country is an instance of Country.java
     */
    public void add(Country country);
    
    
    /**
     * Removes a country from the Collection
     * 
     * @param country is an instance of Country.java
     */
    public void remove(Country country);

    
    /**
     * Returns an Iterator containing all countries when continent parameter is equals to ContinentEnum.ALL. 
     * When a specific continent is specified, an Iterator of countries from that continent is returned.
     *  
     * @param continent is a ContinentEnum.java
     * @return an CountryIterator containing countries from either a specific continent or all over the world.
     */
    public CountryIterator iterator(ContinentEnum continent);
}
