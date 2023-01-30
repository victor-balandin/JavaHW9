public class Radio {
    private int volume;
    private int station;

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        if (volume < 0 ) {
            return;
        }
        if (volume > 10) {
            return;
        }
        this.volume = volume;
    }

    public int getStation() {
        return station;
    }

    public void setStation(int station) {
        if (station < 0 ){
            return;
        }
        if (station > 9){
            return;
        }

        this.station = station;
    }
    public void nextStation (){
        if (station != 9) {
            station ++;
        } else {
            station = 0;
        }
    }
    public void prevStation() {
        if (station != 0){
            station --;
        } else {
            station = 9;
        }
    }

    public void increaseVolume() {
        if (volume < 10) {
            volume = volume +1;
        }
    }

    public void decreaseVolume() {
        if (volume > 0) {
            volume = volume - 1;
        }
    }


}
