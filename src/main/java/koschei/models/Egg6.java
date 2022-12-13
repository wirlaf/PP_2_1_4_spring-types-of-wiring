package koschei.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


public class Egg6 {
<<<<<<< Updated upstream
    public Needle7 neddle;

    @Autowired
    public Egg6(Needle7 neddle) {
        this.neddle = neddle;
=======
    private Needle7 needle;

    public Egg6(Needle7 needle) {
        this.needle = needle;
>>>>>>> Stashed changes
    }

    @Override
    public String toString() {
        return ", в яйце иголка " +neddle.toString() ;
    }
}
