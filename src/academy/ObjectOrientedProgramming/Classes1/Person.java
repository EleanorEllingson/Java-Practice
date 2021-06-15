package academy.ObjectOrientedProgramming.Classes1;

public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public boolean isTeen(){
        return age < 20 && age > 12;
    }

    public String getFullName(){
        String name = getFirstName() + " " + getLastName();
        if (getFirstName().equals("") && getLastName().equals("")){
            name = "";
        }
        else if(getLastName().equals("")){
            name = getFirstName();
        }
        else if(getFirstName().equals("")){
            name = getLastName();
        }
        return name;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age < 0 || age > 100){
            age = 0;
        }
        this.age = age;
    }
}
