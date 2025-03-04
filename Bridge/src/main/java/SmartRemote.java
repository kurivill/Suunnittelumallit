public class SmartRemote extends AdvancedRemote {
    public SmartRemote(Device device) {
        super(device);
    }

    public void netflix() {
        System.out.println("Remote: netflix");
        device.setChannel(100);
        device.setSmartFeature(true);
    }

    public void amazonPrime() {
        System.out.println("Remote: amazon prime");
        device.setChannel(200);
        device.setSmartFeature(true);
    }

    public void youtube() {
        System.out.println("Remote: youtube");
        device.setChannel(300);
        device.setSmartFeature(true);
    }

    public void voiceCOntrol() {
        System.out.println("Remote: voice control");
    }
}
