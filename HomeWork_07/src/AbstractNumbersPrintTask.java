public abstract class AbstractNumbersPrintTask implements Task {
    protected int from, to;
    public AbstractNumbersPrintTask(int from, int to) {
        this.from = from;
        this.to = to;
    }
}