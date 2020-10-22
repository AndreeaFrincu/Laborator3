package ro.mta.facc.selab;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Biblioteca {
    private ArrayList<Carte> carti;

    public void sort()
    {
        Collections.sort(carti);
    }

    public Biblioteca() {

        carti = new ArrayList<>();
    }

    public void removeBook(Carte carte)
    {
        carti.remove(carte);
    }

    public void addCarte(Carte c)
    {
        carti.add(c);
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Biblioteca contine:\n");

        for(Carte c : carti)
        {
            builder.append(c.toString());
            builder.append("\n");
        }

        return builder.toString();
    }
}
