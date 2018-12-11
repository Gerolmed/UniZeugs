public class ResearchAssistent extends Person implements Mailable {

    private int researchAsssistantId;

    public ResearchAssistent(String firstName, String surName, String birthday, int researchAsssistantId) {
        super(firstName, surName, birthday);
        this.researchAsssistantId = researchAsssistantId;
    }

    @Override
    public String getEmailAddress() {
        return String.format("%s.%s@uni-fictitious.de", getFirstName(), getSurName());
    }

    @Override
    public int getIdentifier() {
        return researchAsssistantId;
    }
}
