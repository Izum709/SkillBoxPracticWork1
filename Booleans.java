package boleans;

public class Booleans {
    public static void main(String[] args) {
        int milkAmount = 2000; // ml
        int powderAmount = 400; // g
        int eggsCount = 30; // items
        int sugarAmount = 500; // g
        int oilAmount = 300; // ml
        int appleCount = 4; // items

        boolean isPancakes = powderAmount >= 400 && sugarAmount >= 10 && milkAmount >= 1000
                && oilAmount >= 30;
        boolean isOmelette = milkAmount >= 30 && powderAmount >= 5 && eggsCount >= 5;
        boolean isApplePie = appleCount >= 3 && milkAmount >= 100 && powderAmount >= 300
                && eggsCount >= 4;
        boolean isAppleJuice = appleCount >= 5;
        boolean isCanCook = false;

        if (isAppleJuice) {
            System.out.println("Apple juice");
            isCanCook = true;
        } if(isPancakes){
            System.out.println("Pancakes");
            isCanCook = true;
        }if (isOmelette) {
            System.out.println("Omelette");
            isCanCook = true;
        } if (isApplePie){
            System.out.println("Apple pie");
            isCanCook = true;
        } if (!isCanCook){
            System.out.println("You don't have enough ingredients to cook the dishes");
        }

    }
}
