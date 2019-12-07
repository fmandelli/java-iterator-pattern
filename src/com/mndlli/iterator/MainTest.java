package com.mndlli.iterator;

/**
 * Main class created to demonstrate how to use Iterator Design Pattern in Java.
 * 
 * According to the Gang of Four (GoF), authors of the book “Design Patterns: Elements of Reusable Object-Oriented Software”:
 * "Iterator design pattern intent is to provide a way to access the elements of an aggregate object without exposing its underlying representation."
 * 
 * @author fmandelli
 * @version 1.0
 *
 */
public class MainTest {
	
    /**
     * Iterator used across this class
     */
    private static CountryCollection countries = new CountryCollectionImpl();
    
    
    public static void main(String[] args) {
        
        Country country;
        
        //populates our countries collection
        bootstrap();
        
        //iterates through all countries previously added to the collection
        System.out.println("Iterating through ALL continents");
        CountryIterator all = countries.iterator(ContinentEnum.ALL);
        while (all.hasNext()) {
            country = all.next();
            System.out.println(country.toString());
        }		
        System.out.println("+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-\n");
        
        
        //iterates through countries from a specific continent
        System.out.println("Iterating through NORTH AMERICA only");
        CountryIterator northAmerica = countries.iterator(ContinentEnum.NORTH_AMERICA);
        while (northAmerica.hasNext()) {
            country = northAmerica.next();
            System.out.println(country.toString());
        }
        System.out.println("+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-");
    }
    
    
    /**
     * Populates our collection with several countries and their continents
     */
    private static void bootstrap() {
        countries.add(new Country("ALGERIA", ContinentEnum.AFRICA));
        countries.add(new Country("ANGOLA", ContinentEnum.AFRICA));
        countries.add(new Country("CHINA", ContinentEnum.ASIA));
        countries.add(new Country("JAPAN", ContinentEnum.ASIA));
        countries.add(new Country("ITALY", ContinentEnum.EUROPE));
        countries.add(new Country("GERMANY", ContinentEnum.EUROPE));
        countries.add(new Country("CANADA", ContinentEnum.NORTH_AMERICA));
        countries.add(new Country("USA", ContinentEnum.NORTH_AMERICA));
        countries.add(new Country("BRAZIL", ContinentEnum.SOUTH_AMERICA));
        countries.add(new Country("ARGENTINA", ContinentEnum.SOUTH_AMERICA));
        countries.add(new Country("AUSTRALIA", ContinentEnum.OCEANIA));
        countries.add(new Country("NEW ZEALAND", ContinentEnum.OCEANIA));
        
        countries.remove(new Country("a", ContinentEnum.SOUTH_AMERICA));
    }
}
