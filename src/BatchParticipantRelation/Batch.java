package BatchParticipantRelation;

import java.util.ArrayList;

public class Batch {
    public static ArrayList<Participant> participantsMorning;
    public static ArrayList<Participant> participantsEvening;

    public Batch(String batch) {
        Batch.participantsMorning = new ArrayList<Participant>();
        Batch.participantsEvening = new ArrayList<Participant>();
    }

    public String addParticipantMorning(Participant participant) {
        if (participantsMorning.contains(participant)) {
            return ("Participant already exists in Morning batch.");
        }
        else if (participantsEvening.contains(participant)) {
            return ("Participant already exists in Evening batch.");
        }
        else {
            participantsMorning.add(participant);
            return "Participant added";
        }

    }
    
    public String addParticipantEvening(Participant participant) {
        if (participantsEvening.contains(participant)) {
            return ("Participant already exists in Evening batch.");
        }
        else if (participantsMorning.contains(participant)) {
            return ("Participant already exists in Morning batch.");
        }
        else {
            participantsEvening.add(participant);
            return "Participant added";
        }
    }

    public static ArrayList<Participant> getparticipantsMorning() {
        // return "Batch is " + this.batch + ".";
        return participantsMorning; 

    }
    public static ArrayList<Participant> getparticipantsEvening() {
        // return "Batch is " + this.batch + ".";
        return participantsEvening; 

    }



    

    

    
}