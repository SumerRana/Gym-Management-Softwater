package BatchParticipantRelation;

import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

public class MyScheduler {
    public static final String MyTask = null;

    public MyScheduler() {
        Timer timer = new Timer();
        MyTaskMorning morningTask = new MyTaskMorning();
        MyTaskEvening EveningTask = new MyTaskEvening();

        //run at 9:00 AM
        timer.schedule(morningTask, getDelay(9, 20), 24 * 60 * 60 * 1000);

        //run at 6:00 PM
        timer.schedule(EveningTask, getDelay(18, 0), 24 * 60 * 60 * 1000);
    }

    static class MyTaskMorning extends TimerTask {
        public void run() {
            ArrayList<Participant> MorningArray = Batch.participantsMorning;

            for (Participant i : MorningArray) {
                System.out.println("Time for Gym, " + i.name);
            }
        }
    }

    static class MyTaskEvening extends TimerTask {
        public void run() {
            ArrayList<Participant> EveningArray = Batch.participantsEvening;

            for (Participant i : EveningArray) {
                System.out.println("Time for Gym, " + i.name);
            }
        }
    }

    private static long getDelay(int hour, int minute) {
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        calendar.set(java.util.Calendar.HOUR_OF_DAY, hour);
        calendar.set(java.util.Calendar.MINUTE, minute);
        calendar.set(java.util.Calendar.SECOND, 0);
        calendar.set(java.util.Calendar.MILLISECOND, 0);
    
        long delay = calendar.getTimeInMillis() - System.currentTimeMillis();
        if (delay < 0) {
            delay += 24 * 60 * 60 * 1000;
        }
        return delay;
    }

    

    private static long getTime(int hour, int minute) {
        long time = 0;
        long now = System.currentTimeMillis();
        long offset = java.util.TimeZone.getDefault().getOffset(now);

        time = ((hour * 60 + minute) * 60 * 1000) - offset;

        return time;
    }


    
}
