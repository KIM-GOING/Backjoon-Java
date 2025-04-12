import java.util.Scanner;

class Main{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int wantExerciseMinute = sc.nextInt(),
                defaultPurse = sc.nextInt(),
                limitePurse = sc.nextInt(),
                incresePurse = sc.nextInt(),
                decresePurse = sc.nextInt(),
                result = 0, purse = defaultPurse;

        loop:
        while(wantExerciseMinute != 0) {

            while(true) {

                if(limitePurse < purse + incresePurse) break;
                purse += incresePurse;
                result++;
                wantExerciseMinute--;
                if(wantExerciseMinute == 0) break loop;

            }

            purse -= decresePurse;
            if(purse < defaultPurse) purse = defaultPurse;
            result++;

            if(limitePurse < purse + incresePurse && purse == defaultPurse) {
                result = -1;
                break;
            }

        }

        System.out.println(result);

    }

}