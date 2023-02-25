package CollectionAssignment;

import java.util.*;

public class QueueTester1 {

    public static List<Deque<Patient>> splitQueue(Deque<Patient> patientsQueue) {

        List<Deque<Patient>> res = new LinkedList<>();
        Deque<Patient> seniorQueue = new LinkedList<>();
        Deque<Patient> normalQueue = new LinkedList<>();

        for (Patient patient : patientsQueue) {

            if (patient.getAge() >= 60) {
                seniorQueue.add(patient);
            }else {
                normalQueue.add(patient);
            }
        }

        res.add(seniorQueue);
        res.add(normalQueue);

        return res;
    }

    public static void main(String[] args) {

        Patient patient1 = new Patient("Jack","Male",25);
        Patient patient2 = new Patient("Tom","Male",64);
        Patient patient3 = new Patient("Simona","Female",24);

        Deque<Patient> patientsQueue = new ArrayDeque<Patient>();
        patientsQueue.add(patient1);
        patientsQueue.add(patient2);
        patientsQueue.add(patient3);

        List<Deque<Patient>> queuesList = splitQueue(patientsQueue);

        int counter=0;
        for (Deque<Patient> queue : queuesList) {
            if(counter==0)
                System.out.println("Patients in the senior queue\n============================");
            else
                System.out.println("Patients in the normal queue\n============================");

            for (Patient patient : queue) {
                System.out.println("Name : "+patient.getName());
                System.out.println("Age : "+patient.getAge());
                System.out.println();
            }
            counter++;
        }
    }
}
