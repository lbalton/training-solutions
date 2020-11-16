package Attributes.person;

public class Address {

    public Address addressToString;
    private String country;
    private String city;
    private String streetAndNumber;
    private String zipCode;

    public String addressToString(){
        return zipCode + country + city + streetAndNumber;
    }

    public Address(String country, String city, String streetAndNumber , String zipCode){
        this.country = country;
        this.city = city;
        this.streetAndNumber = streetAndNumber;
        this.zipCode = zipCode;

    }

    public String getCountry() {
        return country;
    }

    public String getCity() {
        return city;
    }

    public String getStreetAndNumber() {
        return streetAndNumber;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void correctData(String country,String zipCode,String streetAndNumbet,String city){
        this.city = city;
        this.zipCode = zipCode;
        this.streetAndNumber = streetAndNumbet;
        this.country = country;
    }

}
