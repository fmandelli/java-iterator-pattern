package com.mndlli.iterator;

/**
 * Country is a simple POJO that contains some attributes of a country
 *  
 * @author fmandelli
 * @version 1.0
 *
 */
public class Country {
	
    private String name;
    private ContinentEnum CONTINENT;
    
    public Country (String name, ContinentEnum continent) {
        this.name = name;
        this.CONTINENT = continent;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public ContinentEnum getCONTINENT() {
        return CONTINENT;
    }

    public void setCONTINENT(ContinentEnum CONTINENT) {
        this.CONTINENT = CONTINENT;
    }
    
    @Override
    public String toString() {
        return "Country [name=" + this.name + ", CONTINENT=" + this.CONTINENT + "]";
    }
}