public class Fish {
    private String typeOfFish;
    private int friendliness;

    // Konstruktor
    public Fish() {
        typeOfFish = "";
        friendliness = 0;
    }

    // konstruktor
    public Fish(String t, int f) {
        typeOfFish = t;
        friendliness = f;
    }

    // set
    public void settypeOfFish(String t) {
        typeOfFish = t;
    }

    public void setfriendliness(int f) {
        friendliness = f;
    }

    // get
    public String gettypeOfFish() {
        return typeOfFish;
    }

    public int getFriendliness() {
        return friendliness;
    }

    // Metode
    public static Fish nicestFish(Fish fish1, Fish fish2) {
        if (fish1.getFriendliness() > fish2.getFriendliness()) {
            return fish1;
        } else {
            return fish2;
        }
    }

    public String getFriendlinessSkala() {
        String skala = "";
        switch (friendliness) {
            case 1:
                skala = "Galak";
                break;
            case 2:
                skala = "Tidak ramah";
                break;
            case 3:
                skala = "Netral";
                break;
            case 4:
                skala = "Ramah";
                break;
            case 5:
                skala = "Sangat ramah";
                break;
            default:
                skala = "Tingkat keramahan tidak valid";
                break;
        }
        return skala;
    }
}
