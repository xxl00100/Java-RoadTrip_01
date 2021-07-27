package Day28_0_Review;

/**
 * @Auther: XXL00100
 * @Date: 2021/7/27 - 07 - 27 - 21:04
 * @Description: Day28_0_Review
 * @version: 1.0
 */
public enum Season {
    SPRING("春天","穿暖花开"),
    SUMMER("夏天","夏日炎炎"),
    AUTTUM("秋天","硕果累累"),
    WINTER("冬天","冰天雪地");

    private final  String seasonName;
    private final  String seasonDesc;

   private Season(String seasonName, String seasonDesc) {
        this.seasonName = seasonName;
        this.seasonDesc = seasonDesc;
    }

    public String getSeasonName() {
        return seasonName;
    }

    public String getSeasonDesc() {
        return seasonDesc;
    }

/*    @Override
    public String toString() {
        return "EnumeratePractice{" +
                "seasonName='" + seasonName + '\'' +
                ", seasonDesc='" + seasonDesc + '\'' +
                '}';
    }*/
}
