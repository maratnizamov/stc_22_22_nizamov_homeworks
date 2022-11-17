public class EvenNumbersPrintTask extends AbstractNumbersPrintTask {
    public EvenNumbersPrintTask(int from, int to) {
        super(from, to);
    }
    @Override
    public void complete() {
        for (int i = from; i <= to; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}