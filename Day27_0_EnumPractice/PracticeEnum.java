package Day27_0_EnumPractice;

import javax.swing.*;

/**
 * @Auther: XXL00100
 * @Date: 2021/7/26 - 07 - 26 - 23:33
 * @Description: Day27_0_EnumPractice
 * @version: 1.0
 */
public class PracticeEnum {
    //这是main方法,是程序的入口
    public static void main(String[] args) {
        Season autumn = Season.Autumn;
        Season winter = Season.Winter;
        Season spring = Season.Spring;
        Season summer = Season.Summer;
        System.out.println(autumn);
    }

}

class Season{
    private final String seasonName;
    private final String seasonDesc;

     private Season(String seasonName, String seasonDesc) {
        this.seasonName = seasonName;
        this.seasonDesc = seasonDesc;
    }

    public static Season Spring = new Season("春天","春暖花开");
    public static Season Summer = new Season("夏天","夏日炎炎");
    public static Season Autumn = new Season("秋天","硕果累累");
    public static Season Winter = new Season("冬天","冰天雪地");

    public String getSeasonName() {
        return seasonName;
    }

    public String getSeasonDesc() {
        return seasonDesc;
    }

    @Override
    public String toString() {
        return "Season{" +
                "seasonName='" + seasonName + '\'' +
                ", seasonDesc='" + seasonDesc + '\'' +
                '}';
    }
}