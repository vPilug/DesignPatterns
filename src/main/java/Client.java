import lombok.Getter;

@Getter
public class Client {
    private final String furColor;
    private final String eyeColor;
    private final Integer maxMonthsFromBirth;
    private final Boolean female;
    private final Boolean active;
    private final Boolean sortHair;
    private final Boolean bigCat;
    private final String catType;

    public Client(String furColor, String eyeColor, Integer maxMonthsFromBirth, Boolean female, Boolean active, Boolean sortHair, Boolean bigCat, String catType) {
        this.furColor = furColor;
        this.eyeColor = eyeColor;
        this.maxMonthsFromBirth = maxMonthsFromBirth;
        this.female = female;
        this.active = active;
        this.sortHair = sortHair;
        this.bigCat = bigCat;
        this.catType = catType;
    }

    public static class ClientBuilder{
        private String furColor;
        private String eyeColor;
        private Integer maxMonthsFromBirth;
        private Boolean female;
        private Boolean active;
        private Boolean sortHair;
        private Boolean bigCat;
        private String catType;

        public ClientBuilder(){
        }

        public ClientBuilder withFurColor(String furColor){
            this.furColor = furColor;
            return this;
        }

        public ClientBuilder withEyeColor(String eyeColor){
            this.eyeColor = eyeColor;
            return this;
        }
        public ClientBuilder withMaxMonthFromBirth(Integer maxMonthsFromBirth){
            this.maxMonthsFromBirth = maxMonthsFromBirth;
            return this;
        }

        public ClientBuilder isFemale(Boolean female){
            this.female = female;
            return this;
        }

        public ClientBuilder isActive(Boolean active){
            this.active = active;
            return this;
        }

        public ClientBuilder withShortHair(Boolean shortHair){
            this.sortHair = shortHair;
            return this;
        }

        public ClientBuilder isBigCat(Boolean bigCat){
            this.bigCat = bigCat;
            return this;
        }

        public ClientBuilder withCatType(String catType){
            this.catType = catType;
            return this;
        }

        public Client build() {
            return new Client(furColor, eyeColor, maxMonthsFromBirth, female, active, sortHair, bigCat, catType);
        }
    }

    @Override
    public String toString() {
        return "Client{" +
                "furColor='" + furColor + '\'' +
                ", eyeColor='" + eyeColor + '\'' +
                ", maxMonthsFromBirth=" + maxMonthsFromBirth +
                ", female=" + female +
                ", active=" + active +
                ", sortHair=" + sortHair +
                ", bigCat=" + bigCat +
                ", catType='" + catType + '\'' +
                '}';
    }
}
