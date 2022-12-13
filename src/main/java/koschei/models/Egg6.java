package koschei.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Egg6 {
    public Needle7 neddle;

    @Autowired
    public Egg6(Needle7 neddle) {
        this.neddle = neddle;
    }

    @Override
    public String toString() {
        return ", в яйце иголка " +neddle.toString() ;
    }
}
