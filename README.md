# Gym-Management-Softwater
A software to manage different batches and particiants of a gym


Technical Writeup for BatchParticipantRelation Project:

Introduction:
The BatchParticipantRelation project is a Java program that manages the participants in two batches (Morning and Evening) and schedules a reminder for them to hit the gym at the specified time. The project uses Object-Oriented Programming (OOP) principles to create classes and objects to store and manipulate data.

Code Explanation:

Batch Class:
The Batch class contains two ArrayLists, one for participants in the morning batch and the other for participants in the evening batch. The class has two methods, addParticipantMorning() and addParticipantEvening(), to add participants to their respective batches. The getparticipantsMorning() and getparticipantsEvening() methods return the ArrayLists of participants in the morning and evening batches, respectively.

Participant Class:
The Participant class defines the properties of a participant, such as their name, age, and ID. It has a constructor to initialize these properties, and a get() method to return a string containing the participant's information.

MyScheduler Class:
The MyScheduler class schedules a reminder for the participants to hit the gym at the specified time. It uses the Timer class to schedule tasks at specific times. The class has two inner classes, MyTaskMorning and MyTaskEvening, which extend TimerTask and implement the run() method to print a reminder message for each participant in the morning and evening batches, respectively. The getDelay() method calculates the delay in milliseconds from the current time to the specified time of the day, and getTime() method converts the specified time to milliseconds.

mainClass:
The mainClass class is the entry point for the program. It creates objects of the Batch class and prompts the user to enter the details of the participants. It then adds the participants to their respective batches using the addParticipantMorning() and addParticipantEvening() methods. Finally, it creates an object of the MyScheduler class to schedule the reminder tasks for the participants.

Conclusion:
In conclusion, the BatchParticipantRelation project is a Java program that manages the participants in two batches and schedules a reminder for them to hit the gym. The project uses Object-Oriented Programming principles to create classes and objects to store and manipulate data. The program can be extended to include additional features, such as a database to store participant information or a GUI interface for user interaction.
