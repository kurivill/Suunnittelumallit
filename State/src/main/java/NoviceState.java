public class NoviceState extends State{
    public String levelName = "Novice";

    public NoviceState(Hahmo hahmo) {
        super(hahmo);
        this.levelName = "Novice";
    }

    @Override
    public void action() {
        String[] options = {"Basic Training"};
        switch (this.getHahmo().userChoice(options)) {
            case 1:
                getHahmo().setExperiencePoints(20);
                if (getHahmo().getExperiencePoints() >= getHahmo().getBreakPoints()[0]) {
                    getHahmo().setState(new IntermediateState(this.getHahmo()));
                    getHahmo().setLevel();
                }
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
