public class OddNumbersPrintTask extends AbstractNumbersPrintTask {

    public OddNumbersPrintTask(int from, int to) {
        super(from, to);
    }

    @Override
    public void complete() {
        for (int i = from; i <= to; i++) {
            if (i % 2 == 1) {
                System.out.println(i);
            }
        }
    }
}