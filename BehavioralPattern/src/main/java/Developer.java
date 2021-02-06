public abstract class Developer {
    private int level;
    private Developer nextDeveloper;

    public Developer(int level) {
        this.level = level;
    }

    public void setNextDeveloper(Developer nextDeveloper) {
        this.nextDeveloper = nextDeveloper;
    }

    public void taskManager(String task, int complexity) {
        if (complexity >= level) {
            takeTask(task);
        }
        if (nextDeveloper != null) {
            nextDeveloper.taskManager(task, complexity);
        }
    }

    public abstract void takeTask(String task);
}
