package CollectionAssignment;

import java.util.*;

public class TesterArrL1 {

    public static List<ParticipantArrL1> generateListOfFinalists(ParticipantArrL1[] finalists) {

        /*List<ParticipantArrL1> list = Arrays.asList(finalists);

        List<ParticipantArrL1> listOfFinal = new ArrayList<>(list);

        return listOfFinal;*/

        List<ParticipantArrL1> list = new ArrayList<>();

        for (ParticipantArrL1 p : finalists){
            list.add(p);
        }

        return list;
     }

    public static List<ParticipantArrL1> getFinalistsByTalent(List<ParticipantArrL1> finalists, String talent) {

        List<ParticipantArrL1> list = new ArrayList<>();

        for (ParticipantArrL1 l : finalists){
            if (l.getParticipantTalent().equals(talent)){
               list.add(l);
            }
        }
        return list;

}

    public static void main(String[] args) {
        ParticipantArrL1 finalist1 = new ParticipantArrL1("Hazel", "Singing", 91.2);
        ParticipantArrL1 finalist2 = new ParticipantArrL1("Ben", "Instrumental", 95.7);
        ParticipantArrL1 finalist3 = new ParticipantArrL1("John", "Singing", 94.5);
        ParticipantArrL1 finalist4 = new ParticipantArrL1("Bravo", "Singing", 97.6);

        ParticipantArrL1[] finalists = { finalist1, finalist2, finalist3, finalist4 };

        List<ParticipantArrL1> finalistsList = generateListOfFinalists(finalists);

        System.out.println("Finalists");
        for (ParticipantArrL1 finalist : finalistsList)
            System.out.println(finalist);

        String talent = "Singing";
        System.out.println("Finalists in " + talent + " category");

        List<ParticipantArrL1> finalistsCategoryList = getFinalistsByTalent(finalistsList, talent);
        for (ParticipantArrL1 finalist : finalistsCategoryList)
            System.out.println(finalist);
    }

}

