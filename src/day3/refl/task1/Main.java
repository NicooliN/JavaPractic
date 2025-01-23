package day3.refl.task1;
/*
Написать метод, который рефлексивно проверит наличие аннотации @IsLike на любом переданном классе
и выведет значение, хранящееся в аннотации, на экран
 */

public class Main {
    public static void main(String[] args) {
check(LikeClass.class);
check(NotLikeClass.class);
    }
    public static void check(Class<?> cls){
        if (!cls.isAnnotationPresent(IsLike.class)) {
            System.out.println("Not Like annotation");
            return;
        }
        IsLike isLike = cls.getAnnotation(IsLike.class);
        System.out.println("islike value:" + isLike.value());
    }
}
