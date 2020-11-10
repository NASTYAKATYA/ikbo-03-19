package pract12;

public class Person {
private String lastName,firstName, middleName;
public Person(String lastName){
    this.lastName=lastName;
}
public Person(String lastName, String firstName, String middleName){
    this.lastName=lastName;
    this.firstName=firstName;
    this.middleName=middleName;
}

    @Override
    public String toString() {
    if(firstName==null&&middleName==null)
        return lastName;
    else
        return lastName+" "+firstName.charAt(0)+"."+middleName.charAt(0)+".";
    }
}
