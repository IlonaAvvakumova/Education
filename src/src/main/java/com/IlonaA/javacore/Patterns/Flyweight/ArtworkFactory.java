package src.main.java.com.IlonaA.javacore.Patterns.Flyweight;

import java.util.HashMap;
import java.util.Map;

public class ArtworkFactory {

    private static final Map<Character, Base> map = new HashMap<>();

    public Base getArtwork(Character ch){
        Base artwork = map.get(ch);
if(artwork == null){
    switch (ch) {
        case 'A':
            artwork = new Picture();
            break;
        case 'B':
            artwork = new Sculpture();
            break;
    }
    map.put(ch, artwork);
}
        return artwork;
    }

}
