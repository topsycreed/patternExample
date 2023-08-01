package decorator;

public class TeamLead extends DeveloperDecorator {
    public TeamLead(Developer developer) {
        super(developer);
    }

    private String makeCodeReview() {
        return " Code review.";
    }

    @Override
    public String makeCode() {
        return super.makeCode() + makeCodeReview();
    }
}
