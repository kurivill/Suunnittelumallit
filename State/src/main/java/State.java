public abstract class State {

    private Hahmo hahmo;

    public State(Hahmo hahmo) {
        this.hahmo = hahmo;
    }

    public Hahmo getHahmo() {
        return hahmo;
    }

    abstract void action();

    abstract String getLevelName();
}
