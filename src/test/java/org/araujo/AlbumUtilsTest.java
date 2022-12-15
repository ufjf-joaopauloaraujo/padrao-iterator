package org.araujo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlbumUtilsTest {

    @Test
    void deveContarFigurinhasPremiumAlbum() {
        Album album = new Album(
                new Figurinha(105, "Lionel Messi", "Argentina", true),
                new Figurinha(223, "Cristiano Ronaldo", "Portugal", true),
                new Figurinha(300, "Danilo", "Brasil", false),
                new Figurinha(444, "Kylian Mbappé", "França", true)
        );
        assertEquals(3, AlbumUtils.contarFigurinhasPremium(album));
    }

    @Test
    void deveContarTotalFigurinhasAlbum() {
        Album album = new Album(
                new Figurinha(105, "Lionel Messi", "Argentina", true),
                new Figurinha(223, "Cristiano Ronaldo", "Portugal", true),
                new Figurinha(300, "Danilo", "Brasil", false),
                new Figurinha(444, "Kylian Mbappé", "França", true)
        );
        assertEquals(4, AlbumUtils.contarTotalFigurinhas(album));
    }

}