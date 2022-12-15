package org.araujo;

import java.util.Iterator;

public class AlbumUtils {

    public static Integer contarFigurinhasPremium(Album album) {
        int quantidade = 0;
        for (Figurinha figurinha : album) {
            if (figurinha.isPremium()) {
                quantidade++;
            }
        }
        return quantidade;
    }

    public static Integer contarTotalFigurinhas(Album album) {
        int quantidade = 0;
        for (Iterator a = album.iterator(); a.hasNext(); ) {
            quantidade++;
            a.next();
        }
        return quantidade;
    }

}
