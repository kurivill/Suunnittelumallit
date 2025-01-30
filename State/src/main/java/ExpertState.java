public class ExpertState extends State{

    public String levelName = "Expert";
    public ExpertState(Hahmo hahmo) {
        super(hahmo);
        this.levelName = "Expert";
    }

    @Override
    public void action() {
        String[] options = {"Advanced Training", "Meditate", "Fight"};
        switch (this.getHahmo().userChoice(options)) {
            case 1:
                getHahmo().setExperiencePoints(40);
                getHahmo().checkTrainingFail();
                if (getHahmo().getExperiencePoints() >= getHahmo().getBreakPoints()[2]) {
                    getHahmo().setState(new MasterState(this.getHahmo()));
                    getHahmo().setLevel();
                }
                break;
            case 2:
                getHahmo().meditate();
                break;
            case 3:
                getHahmo().fight();
                break;
            default:
                System.out.println("Invalid choice");
        }

    }

    @Override
    public String getLevelName() {
        return levelName;
    }
}
