public class IntermediateState extends State {
    public String levelName = "Intermediate";
    public IntermediateState(Hahmo hahmo) {
        super(hahmo);
        this.levelName = "Intermediate";
    }

    @Override
    public void action() {
        String[] options = {"Advanced Training", "Meditate"};
        switch (this.getHahmo().userChoice(options)) {
            case 1:
                getHahmo().setExperiencePoints(40);
                getHahmo().checkTrainingFail();
                if (getHahmo().getExperiencePoints() >= getHahmo().getBreakPoints()[1]) {
                    getHahmo().setState(new ExpertState(this.getHahmo()));
                }
                break;
            case 2:
                getHahmo().meditate();
            default:
                System.out.println("Invalid choice");
        }
    }

    @Override
    public String getLevelName() {
        return levelName;
    }

}
