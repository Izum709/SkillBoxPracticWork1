package boleans;

public class MinMiddleMax {
    public static void main(String[] args) {
        int vasyaAge = 112;
        int katyaAge = 11;
        int mishaAge = 109;

        int min = -1; // минимальный возраст
        int middle = -1; // средний возраст
        int max = -1; // максимальный возраст

         boolean isVasyaAge = vasyaAge >= 0 && vasyaAge <= 120;
         boolean isKatyaAge = vasyaAge >= 0 && vasyaAge <= 120;
         boolean isMishaAge = vasyaAge >= 0 && vasyaAge <= 120;

         if(isVasyaAge && isKatyaAge && isMishaAge){
             min = vasyaAge <= katyaAge && vasyaAge <= mishaAge ? vasyaAge :
                     katyaAge <= vasyaAge && katyaAge <= mishaAge ? katyaAge : mishaAge;

             max = vasyaAge >= katyaAge && vasyaAge >= mishaAge ? vasyaAge :
                     katyaAge >= vasyaAge && katyaAge >= mishaAge ? katyaAge : mishaAge;
             middle = (vasyaAge == min || vasyaAge == max) ? (katyaAge == min || katyaAge == max) ?
                     mishaAge : katyaAge : vasyaAge;
             System.out.println("Minimal age: "+min);
             System.out.println("Middle age: "+middle);
             System.out.println("Maximal age: "+max);
         }else {
             System.out.println("Inputted incorrect data");
         }
    }
}
