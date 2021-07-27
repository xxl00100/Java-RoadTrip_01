package Day28_0_Review;

/**
 * @Auther: XXL00100
 * @Date: 2021/7/27 - 07 - 27 - 21:16
 * @Description: Day28_0_Review
 * @version: 1.0
 */
public class TestSeason1 {
    //这是main方法,是程序的入口
    public static void main(String[] args) {
        Season1 spring = Season1.SPRING;
        System.out.println(spring);
        Season1[] values = Season1.values();
        for(Season1 s : values){
            System.out.println(s);
        }

        Season1 spring1 = Season1.valueOf("SUMMER");
        System.out.println(spring1);
        Season1.SPRING.show();
        Season1.SUMMER.show();
        Season1.AUTTUM.show();
        Season1.WINTER.show();


    }
}
