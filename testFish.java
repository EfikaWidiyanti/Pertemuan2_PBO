public class testFish {
    public static void main(String[] args) {
        Fish fish1 = new Fish();
        fish1.settypeOfFish("Nemo");
        fish1.setfriendliness(5);

        Fish fish2 = new Fish();
        fish2.settypeOfFish("Piranha");
        fish2.setfriendliness(1);

        String fish1tipe = fish1.gettypeOfFish();
        String fish2tipe = fish2.gettypeOfFish();

        String fish1Friendlinessskala = fish1.getFriendlinessSkala();
        String fish2Friendlinessskala = fish2.getFriendlinessSkala();

        System.out.println("ikan 1 = " + fish1tipe);
        System.out.println("ikan 2 = " + fish2tipe);

        Fish nicest = Fish.nicestFish(fish1, fish2);
        System.out.println("Ikan dengan tingkat keramahan tertinggi: " + nicest.gettypeOfFish()
                + ", dengan tingkat keramahan: " + nicest.getFriendlinessSkala());

    }
}