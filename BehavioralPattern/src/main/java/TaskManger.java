public class TaskManger {
    public static void main(String[] args) {
        Developer juniorDev = new JuniorDeveloper(Level.JUNIOR_LEVEL);
        Developer middleDev = new MiddleDeveloper(Level.MIDDLE_LEVEL);
        Developer seniorDev = new SeniorDeveloper(Level.SENIOR_LEVEL);

        juniorDev.setNextDeveloper(middleDev);
        middleDev.setNextDeveloper(seniorDev);

        juniorDev.taskManager("Check SQL", 1);
        juniorDev.taskManager("Refactor DB", 3);

    }
}
