package pl.edu.pjwstk.zadanie4;

public class Pc {
    private final PcSystem pcSystem;
    private final Kind kind;
    private final boolean on;
    private final int cores;

    public Pc(PcSystem pcSystem, Kind kind, boolean on, int cores) {
        this.pcSystem = pcSystem;
        this.kind = kind;
        this.on = on;
        this.cores = cores;
    }

    public Pc(){
        this.pcSystem = PcSystem.LINUX;
        this.kind = Kind.DESKTOP;
        this.on = true;
        this.cores = 4;
    }
}
