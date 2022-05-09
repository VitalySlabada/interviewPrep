package DSA.P5_dishAnimalNames;

public class AnimalFeast {


    public static boolean animalFeast(String dish, String animal) {
        char[] dishArr = dish.toCharArray();
        char[] animalArr = animal.toCharArray();
        if (dishArr[0] == animalArr[0]
                && dishArr[dishArr.length - 1] == animalArr[animalArr.length - 1]) return true;
        return false;
    }
}
