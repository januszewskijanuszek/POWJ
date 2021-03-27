package pl.edu.pjwstk.zadanie3;

public class TV {
    private int channel;
    private int volume;
    private boolean on;
    private Channels channels;

    public TV() {
        this.channel = 1;
        this.volume = 1;
        this.on = false;
    }

    public int getChannel() {
        return channel;
    }

    public int getVolume() {
        return volume;
    }

    public boolean isOn() {
        return on;
    }

    public void setChannel(int channel) {
        if(this.on){
            if (channel > Channels.values().length || channel <= 0){
                System.out.println("Nie można zmienić kanału!");
                interFace();
            }
            else{
                this.channel = channel;
                interFace();
            }
        }
        else{
            System.out.println("Telewizor jest wyłączony!");
        }
    }

    public void setVolume(int volume) {
        if(this.on){
            if(volume > 10 || volume < 0){
                System.out.println("Nie można zmienić głośności!");
                interFace();
            }
            else {
                this.volume = volume;
                interFace();
            }
        }
        else{
            System.out.println("Telewizor jest wyłączony!");
        }
    }

    public void setOn(boolean on) {
        if(on){
            System.out.println("Telewizor jest włączony!");
            this.on = on;
        }
        else {
            System.out.println("Telewizor jest wyłączony!");
            this.on = on;
        }
    }

    private void soundBarr(int volume){
        System.out.print("[");
        for(int i = 0 ; i < getVolume() ; i++){
            System.out.print("|||");
        }
        for(int i = 0 ; i < 10 - getVolume() ; i++) {
            System.out.print("   ");
        }
        System.out.println("]");
    }
    public void interFace(){
        System.out.println("Aktualny kanał: " + getChannel() + "  " + Channels.values()[this.channel - 1]);
        System.out.println("Głośność wynosi: " + getVolume());
        soundBarr(this.volume);
    }
}
