package org.ozgurucar.singleton;

public class Singleton {
    private static Singleton singleton;

    private static int counter = 0;

    private Singleton() {
        System.out.println("ben oluşturuldum");

    }

    public static Singleton getSingleton() {
        if (singleton == null) {
        /*
        synchronized tagi multithread check yapar ama methodu yavaşlatır
        bu sebeple tekrardan if kontrolü ile sadece null ise çalışmasını kontrol ederiz
         */
            synchronized (Singleton.class) {
                if (singleton == null) {
                    singleton = new Singleton();
                }
            }
        }
        counter++;
        System.out.println(counter);

        return singleton;
    }

}
