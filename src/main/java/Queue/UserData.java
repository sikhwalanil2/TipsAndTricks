package Queue;

public class UserData {

    int capacity;
    FixedSizeQueue<String> songs;

    public int getCapacity() {
        return capacity;
    }

    public FixedSizeQueue<String> getSongs() {
        return songs;
    }

    public void setSongs(FixedSizeQueue<String> songs) {
        this.songs = songs;
    }


    public void setCapacity(int capacity){
        this.capacity=capacity;
    }


}
