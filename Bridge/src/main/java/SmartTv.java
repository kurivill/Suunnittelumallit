public class SmartTv extends Tv{

    private boolean smartFeature;

    public SmartTv() {
        super();
        smartFeature = false;
    }

    @Override
    public void printStatus() {
        System.out.println("------------------------------------");
        System.out.println("| I'm Smart TV set.");
        System.out.println("| I'm " + (isEnabled() ? "enabled" : "disabled"));
        System.out.println("| Current volume is " + getVolume() + "%");
        System.out.println("| Current channel is " + getChannel());
        System.out.println("| " + (smartFeature ? "Browsing smart tv exclusive content" : "Smart feature is not being used"));
        System.out.println("------------------------------------\n");
    }


    public boolean isSmartFeature() {
        return smartFeature;
    }

    public void setSmartFeature(boolean smartFeature) {
        this.smartFeature = smartFeature;
    }
}
