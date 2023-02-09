public class Radio {
    private int volume;
    private int station;
    private int maxStation;

    private int maxVolume = 100;
    private int minVolume = 0;

    public Radio (){
        maxStation = 9;
    }

    public Radio (int stationAmount){
        maxStation = stationAmount - 1;

    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        if (volume < minVolume ) {
            return;
        }
        if (volume > maxVolume) {
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
        if (station > maxStation){
            return;
        }

        this.station = station;
    }
    public void nextStation (){
        if (station != maxStation) {
            station ++;
        } else {
            station = 0;
        }
    }
    public void prevStation() {
        if (station != 0){
            station --;
        } else {
            station = maxStation;
        }
    }

    public void increaseVolume() {
        if (volume < maxVolume) {
            volume = volume +1;
        }
    }

    public void decreaseVolume() {
        if (volume > minVolume) {
            volume = volume - 1;
        }
    }


}
