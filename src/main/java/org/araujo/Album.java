package org.araujo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Album implements Iterable<Figurinha>{

    private List<Figurinha> figurinhas = new ArrayList<Figurinha>();

    public Album(Figurinha... figurinhas) {
        this.figurinhas = Arrays.asList(figurinhas);
    }

    @Override
    public Iterator<Figurinha> iterator() {
        return figurinhas.iterator();
    }

}


