package enumeration;


import java.util.Random;

import static enumeration.PossibleAnswers.*;

enum PossibleAnswers{
    NO, YES, LATER , SOON ,NEVER
}

 class Questions {
    Random rand = new Random();
    int prob = (int) (100 * rand.nextDouble());

    PossibleAnswers ask() {
        if (prob < 15)
            return PossibleAnswers.YES;
        else if (prob < 30)
            return PossibleAnswers.SOON;
        else if (prob < 50)
            return PossibleAnswers.LATER;
        else if (prob < 75)
            return PossibleAnswers.NO;
        else
            return PossibleAnswers.NEVER;
    }


}

    class AskMe {

        static void answer(PossibleAnswers result) {
            switch (result) {
                case NO:
                    System.out.println("NO");
                    break;
                case YES:
                    System.out.println("YES");
                    break;
                case NEVER:
                    System.out.println("NEVER");
                    break;
                case LATER:
                    System.out.println("LATER");
                    break;
                case SOON:
                    System.out.println("SOON");
            }
        }


        public static void main(String[] args) {
            Questions a = new Questions();
            Questions b = new Questions();
            Questions c = new Questions();
            Questions d = new Questions();
            answer(a.ask());
            answer(b.ask());
            answer(c.ask());
            answer(d.ask());
            answer(a.ask());
            answer(b.ask());
        }
    }