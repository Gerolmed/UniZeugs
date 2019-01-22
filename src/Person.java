public abstract class Person {
    private String firstName, surName, birthday;

    public Person(String firstName, String surName, String birthday) {
        this.firstName = firstName;
        this.surName = surName;
        this.birthday = birthday;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSurName() {
        return surName;
    }

    public String getBirthday() {
        return birthday;
    }

    public abstract int getIdentifier();
}
