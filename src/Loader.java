
public class Loader {

    public void startLoading() {
        System.out.print("Connecting to server [");

        for (int i = 0; i < 10; i++) {
            System.out.print("█");
            try {
                Thread.sleep(250);
            } catch (InterruptedException e) {

                Thread.currentThread().interrupt();
            }
        }

        System.out.println("] SUCCESS!\n");
    }
}

