package com.mndlli.iterator;

import java.util.ArrayList;
import java.util.List;

public class CountryCollectionImpl implements CountryCollection {
	
    List<Country> countries;
    
    public CountryCollectionImpl() {
        this.countries = new ArrayList<Country>();
    }



    /**
     * {@inheritDoc}
     */
    @Override
    public void add(Country country) {
        this.countries.add(country);
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public void remove(Country country) {
        this.countries.remove(country);
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public CountryIterator iterator(ContinentEnum continent) {
        return new CountryIteratorImpl(this.countries, continent);
    }
    
    
    
    /**
     * Inner class is a implementation of CountryIterator Interface. 
     * This makes this class not reusable by other collections, which is defined by the Iterator design pattern.
     * 
     * According to the Gang of Four (GoF), authors of the book “Design Patterns: Elements of Reusable Object-Oriented Software”:
     * "Iterator design pattern intent is to provide a way to access the elements of an aggregate object without exposing its underlying representation."
     * 
     * @author fmandelli
     *
     */
    private class CountryIteratorImpl implements CountryIterator {
        
        private ContinentEnum continent;
        private List<Country> countries;
        private int position = -1;
        
        public CountryIteratorImpl(List<Country> countriesList, ContinentEnum continent) {
            this.countries = countriesList;
            this.continent = continent;
            
            //if NOT ALL then filters only countries from specific continent
            if (!this.continent.equals(ContinentEnum.ALL)) {
                
                this.countries = new ArrayList<Country>();

                //uses stream() and filter() to add only countries 
                //from the specified continent to the List
                countriesList.stream()
                             .filter(c1 -> c1.getCONTINENT().equals(continent))
                             .forEach(c2 -> {
                                 this.countries.add(c2);
                             });
            }
        }
        
        
        /**
         * {@inheritDoc}
         */
        @Override
        public Country next() {
            this.position++;
            return this.position < this.countries.size() ? this.countries.get(position) : null; 
        }
        
        
        /**
         * {@inheritDoc}
         */
        @Override
        public boolean hasNext() {
            return this.position + 1 < this.countries.size() ? true : false;
        }		
    }
}
