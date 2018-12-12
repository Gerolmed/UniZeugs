public class Student extends Person implements Mailable {

    private int matriculationNumber;

    public Student(String firstName, String surName, String birthday, int matriculationNumber) {
        super(firstName, surName, birthday);
        this.matriculationNumber = matriculationNumber;
    }

    @Override
    public String getMailAddress() {
        return String.format("%s.%s@stud.uni-fictitious.de", getFirstName(), getSurName());
    }

    @Override
    public int getIdentifier() {
        return matriculationNumber;
    }
}
