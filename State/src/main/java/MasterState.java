public class MasterState extends State{

    public String levelName = "Master";

    public MasterState(Hahmo hahmo) {
        super(hahmo);
        this.levelName = "Master";
    }

    @Override
    public void action() {
        System.out.println("You won");
    }

    @Override
    public String getLevelName() {
        return levelName;
    }
}
