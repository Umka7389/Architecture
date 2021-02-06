public class SeniorDeveloper extends Developer{

    public SeniorDeveloper(int level) {
        super(level);
    }

    @Override
    public void takeTask(String task) {
        System.out.println("Senior developer need to help to middle developer with task: " + task);
    }
}
