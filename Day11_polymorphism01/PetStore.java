package com.Day11_polymorphism01;

/**
 * @Auther: XXL00100
 * @Date: 2021/7/2 - 07 - 02 - 17:46
 * @Description: com.Day11_polymorphism01
 * @version: 1.0
 */
public class PetStore {

    public  static  Animal getPet(String petType){
        Animal an1=null;
        if("猫".equals(petType)){
            an1=new Cat();
        }
        if("狗".equals(petType)){
            an1=new Dog();
        }
        if("猪".equals(petType)){
            an1=new Pig();
        }
/*        else {
            an1=new Animal();
        }*/

        return  an1;
    }
}
