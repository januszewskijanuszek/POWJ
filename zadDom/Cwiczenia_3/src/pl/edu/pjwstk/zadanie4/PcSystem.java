package pl.edu.pjwstk.zadanie4;

public enum PcSystem {
    MAC_OS("Big siur"),
    WINDOWS("10"),
    LINUX("Kali");

    private final String version;

    PcSystem(String version){
        this.version = version;
    }

    public String getVersion(){
        return version;
    }
}
