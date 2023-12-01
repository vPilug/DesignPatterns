import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;

public class CatTest {
@Test
    public void whenMatched(){
    DonationHandler cat1 = new Cat.CatBuilder("Snoopy")
            .withFurColor("orange")
            .withEyeColor("green")
            .withMonthFromBirth(4)
            .isFemale(false)
            .isActive(false)
            .isBigCat(true)
            .withCatType("Abyssinian")
            .withShortHair(false)
            .build();

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

        cat1.match(client1);
        assertTrue(Cat.isMatched());
    }

    @Test
    public void whenNotMatched(){
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

        Client client2 = new Client.ClientBuilder()
                .withFurColor("orange")
                .withEyeColor("green")
                .withMaxMonthFromBirth(4)
                .isFemale(false)
                .isActive(false)
                .isBigCat(true)
                .withCatType("Abyssinian")
                .withShortHair(false)
                .build();

        cat2.match(client2);
        assertFalse(Cat.isMatched());
    }
}
