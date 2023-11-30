public class Main {
    public static void main(String[] args) {

        Client client1 = new Client.ClientBuilder()
                .withFurColor("orange")
                .withEyeColor("green")
                .withMaxMonthFromBirth(4)
                .isFemale(false)
                .isActive(false)
                .isBigCat(true)
                .withCatType("Abyssinian")
                .withShortHair(false)
                .build();
        Client client2 = new Client.ClientBuilder()
                .withFurColor("white")
                .build();

        Client client3 = new Client.ClientBuilder().build();


        CatShelter catShelter = new CatShelter();
        catShelter.findMyCat(client1);
        catShelter.findMyCat(client2);
        catShelter.findMyCat(client3);


    }
}
