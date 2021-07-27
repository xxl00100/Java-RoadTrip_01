package Day28_0_Review;

/**
 * @Auther: XXL00100
 * @Date: 2021/7/27 - 07 - 27 - 21:14
 * @Description: Day28_0_Review
 * @version: 1.0
 */
public enum Season1 implements TestInterface{
    SPRING{
        @Override
        public void show() {

        }


    },
    SUMMER{
        @Override
        public void show() {
            System.out.println("woshi  SUmmer");
        }
    },
    AUTTUM{
        @Override
        public void show() {
            System.out.println("woshi  Auttum");
        }
    },
    WINTER{
        @Override
        public void show() {
            System.out.println("woshi  Winter");
        }
    };

    @Override
    public void show() {
        System.out.println("我是一个枚举类,包含一年四季");
    }
}
