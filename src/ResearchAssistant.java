public class ResearchAssistant extends Person implements Mailable {

    private int researchAssistantId;

    public ResearchAssistant(String firstName, String surName, String birthday, int researchAssistantId) {
        super(firstName, surName, birthday);
        this.researchAssistantId = researchAssistantId;
    }

    @Override
    public String getMailAddress() {
        return String.format("%s.%s@uni-fictitious.de", getFirstName(), getSurName());
    }

    @Override
    public int getIdentifier() {
        return researchAssistantId;
    }
}
