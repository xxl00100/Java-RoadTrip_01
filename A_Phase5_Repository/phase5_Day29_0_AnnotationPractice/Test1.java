package com.phase5_Day29_0_AnnotationPractice;

/**
 * @Auther: XXL00100
 * @Date: 2021/7/28 - 07 - 28 - 22:39
 * @Description: com.phase5_Day29_0_AnnotationPractice
 * @version: 1.0
 */

@myAnnotation1(value = {"abc","def","hjh"})
@myAnnotation2
public class Test1 {
}


@myAnnotation1({"ab","ab"})
@myAnnotation2
class Test2{

}