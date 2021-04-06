class Racer implements Runnable {
    public void hare() {
        for (int i = 0; i < 100; i = i + 2) {
            System.out.println("Hare ran for " + i + "m");
            if (i == 60) {
                System.out.println("Hare slept");
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
        }
        System.out.println("Hare reached the finish line");
    }

    public void tortoise() {
        for (int i = 0; i < 100; i++) {
            System.out.println("Tortoise ran for " + i + "m");
        }
        System.out.println("Tortoise reached the finish line");
    }

    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        if (name.equals("Hare"))
            hare();
        else if (name.equals("Tortoise"))
            tortoise();
    }
}