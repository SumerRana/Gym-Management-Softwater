package BatchParticipantRelation;

import java.util.Scanner;

public class mainClass {

    public static void main(String[] args) {
        Batch participantsMorning = new Batch("Morning");
        Batch participantsEvening = new Batch("Evening");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number of participants:");
        int num = scanner.nextInt();
        scanner.nextLine();

        for (int i = 1; i < num + 1; i++) {
            System.out.println("Enter the name of participant no. " + i);
            String name = scanner.nextLine();
            // scanner.nextLine();

            System.out.println("Enter the age of participant no. " + i);
            int age = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Enter the ID of participant no. " + i);
            int Id = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Enter the name of Batch for participant no. " + i);
            String batch = scanner.nextLine();
            // scanner.nextLine();
            if (batch.equals("Morning")) {
                Participant participant = new Participant(name, age, Id);
                participantsMorning.addParticipantMorning(participant);
            }
            else if (batch.equals("Evening")) {
                Participant participant = new Participant(name, age, Id);
                participantsEvening.addParticipantEvening(participant);
            }
            else {
                System.out.println("Invalid batch");
            }

        }

        scanner.close();

        MyScheduler myScheduler = new MyScheduler();

        



        


    }
    
}