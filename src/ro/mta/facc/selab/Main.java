package ro.mta.facc.selab;

public class Main {
    public static void main(String[] args)
    {
        /*Carte c = new Carte("Book1", "author1", 1990, 500);
        Biblioteca b = new Biblioteca();
        b.addCarte(c);
        b.addCarte(new Carte("Silmarillion", "J R Tolkien", 1234, 700));
        b.addCarte(new Carte("Far from the madding crowd", "Thomas Hardy", 2222, 200));

        b.sort();
        System.out.println(b);*/

        Thread thread1 = new MyThread();
        Thread thread2 = new MyThread();
        Thread thread3 = new MyThread();

        thread1.start();
        thread2.start();
        thread3.start();

        //thread1.join(); //apare eroare pt ca trebuie sa tratam exceptia
        try {
            thread1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        try {
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        try {
            thread3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
