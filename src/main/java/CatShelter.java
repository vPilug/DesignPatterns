
public class CatShelter {

    DonationHandler cat1 = new Cat.CatBuilder("Mara")
            .withFurColor("black")
            .withEyeColor("blue")
            .withMonthFromBirth(2)
            .isFemale(true)
            .isActive(true)
            .isBigCat(false)
            .withCatType("British")
            .withShortHair(true)
            .build();


    DonationHandler cat2 = new Cat.CatBuilder("Alma")
            .withFurColor("white")
            .withEyeColor("blue")
            .withMonthFromBirth(24)
            .isFemale(true)
            .isActive(true)
            .isBigCat(true)
            .withCatType("alley cat")
            .withShortHair(true)
            .build();
    DonationHandler cat3 = new Cat.CatBuilder("Snoopy")
            .withFurColor("orange")
            .withEyeColor("green")
            .withMonthFromBirth(4)
            .isFemale(false)
            .isActive(false)
            .isBigCat(true)
            .withCatType("Abyssinian")
            .withShortHair(false)
            .build();

    DonationHandler donationHandler = new DonationHandler();

    public CatShelter() {
        donationHandler.setNext(cat1)
                .setNext(cat2)
                .setNext(cat3);
    }

    public void findMyCat(Client client) {
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("--    Stay tuned we are searching for a cat that matches your expectations    --");
        System.out.println("--------------------------------------------------------------------------------");
        donationHandler.match(client);
    }

}
