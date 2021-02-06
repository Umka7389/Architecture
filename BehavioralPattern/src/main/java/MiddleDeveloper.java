public class MiddleDeveloper extends Developer{
    public MiddleDeveloper(int level) {
        super(level);
    }

    @Override
    public void takeTask(String task) {
        System.out.println("Middle developer need to help to junior developer with task: " + task);
    }
}
