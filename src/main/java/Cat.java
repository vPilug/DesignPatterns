import static java.util.Objects.isNull;

public class Cat extends DonationHandler {
    private final String name;
    private final String furColor;
    private final String eyeColor;
    private final int monthsFromBirth;
    private final boolean female;
    private final boolean active;
    private final boolean sortHair;
    private final boolean bigCat;
    private final String catType;
    private static boolean isMatched;

    public Cat(String name, String furColor, String eyeColor, int monthsFromBirth, boolean female, boolean active, boolean sortHair, boolean bigCat, String catType) {
        this.name = name;
        this.furColor = furColor;
        this.eyeColor = eyeColor;
        this.monthsFromBirth = monthsFromBirth;
        this.female = female;
        this.active = active;
        this.sortHair = sortHair;
        this.bigCat = bigCat;
        this.catType = catType;
        isMatched = false;
    }
    public static boolean isMatched() {
        return isMatched;
    }

    public void setMatched(boolean matched) {
        isMatched = matched;
    }


    @Override
    public void match(Client client) {
        System.out.println("Checking match with " + name);
        if ((isNull(client.getFurColor()) || client.getFurColor().equalsIgnoreCase(this.furColor))
                && (isNull(client.getEyeColor()) || client.getEyeColor().equalsIgnoreCase(this.eyeColor))
                && (isNull(client.getMaxMonthsFromBirth()) || client.getMaxMonthsFromBirth() >= this.monthsFromBirth)
                && (isNull(client.getFemale()) || Boolean.compare(client.getFemale(), this.female) == 0)
                && (isNull(client.getActive()) || Boolean.compare(client.getActive(), this.active) == 0)
                && (isNull(client.getBigCat()) || Boolean.compare(client.getBigCat(), this.bigCat) == 0)
                && (isNull(client.getSortHair()) || Boolean.compare(client.getSortHair(), this.sortHair) == 0)
                && (isNull(client.getCatType()) || client.getCatType().equalsIgnoreCase(this.catType))) {
            System.out.println("We find a cat for you. The cat's name is " + name);
            setMatched(true);
        } else {
            System.out.println("You didn't match with " + name);
            setMatched(false);
            super.match(client);
        }
    }

    public static class CatBuilder {
        private final String name;
        private String furColor;
        private String eyeColor;
        private int monthsFromBirth;
        private boolean female;
        private boolean active;
        private boolean sortHair;
        private boolean bigCat;
        private String catType;

        public CatBuilder(String name) {
            this.name = name;
        }

        public CatBuilder withFurColor(String furColor) {
            this.furColor = furColor;
            return this;
        }

        public CatBuilder withEyeColor(String eyeColor) {
            this.eyeColor = eyeColor;
            return this;
        }

        public CatBuilder withMonthFromBirth(int monthsFromBirth) {
            this.monthsFromBirth = monthsFromBirth;
            return this;
        }

        public CatBuilder isFemale(boolean female) {
            this.female = female;
            return this;
        }

        public CatBuilder isActive(boolean active) {
            this.active = active;
            return this;
        }

        public CatBuilder withShortHair(boolean shortHair) {
            this.sortHair = shortHair;
            return this;
        }

        public CatBuilder isBigCat(boolean bigCat) {
            this.bigCat = bigCat;
            return this;
        }

        public CatBuilder withCatType(String catType) {
            this.catType = catType;
            return this;
        }

        public Cat build() {
            return new Cat(name, furColor, eyeColor, monthsFromBirth, female, active, sortHair, bigCat, catType);
        }
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                "furColor='" + furColor + '\'' +
                ", eyeColor='" + eyeColor + '\'' +
                ", monthsFromBirth=" + monthsFromBirth +
                ", female=" + female +
                ", active=" + active +
                ", sortHair=" + sortHair +
                ", bigCat=" + bigCat +
                ", catType='" + catType + '\'' +
                '}';
    }
}
