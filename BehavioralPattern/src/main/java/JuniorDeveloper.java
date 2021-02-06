public class JuniorDeveloper extends Developer {

    public JuniorDeveloper(int level) {
        super(level);
    }

    @Override
    public void takeTask(String task) {
        System.out.println("Junior developer started for task: " + task);
    }
}
