package dev.verosampedro;

public class Person {

    public String name;
    
    public String surname;

    public Number idNumber;

    public Number yearOfBirth;

    public String countryOfBirth;

    public char gender;

    public Person(String name, String sur, Number id, Number year, String country, char gender) {
        this.name = name;
        this.surname = sur;
        this.idNumber = id;
        this.yearOfBirth = year;
        this.countryOfBirth = country;
        this.gender = gender;
    }

    public void printPersonInfo() {
        System.out.println("Name: " + this.name + "\n" + "Surname: " + this.surname + "\n" + "ID Number: " + this.idNumber + "\n" + "Year of birth: " + this.yearOfBirth + "\n" + "Country of birth: " + this.countryOfBirth + "\n" + "Gender: " + this.gender);
    }
}
