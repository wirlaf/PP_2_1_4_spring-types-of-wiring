package koschei.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


public class Duck5 {
    @Autowired
<<<<<<< Updated upstream
    private Egg6 egg6;

    public Duck5(Egg6 egg6) {
        this.egg6 = egg6;
    }
=======
    private  Egg6 egg;

>>>>>>> Stashed changes

    @Override
    public String toString() {
        return ", в утке яйцо " +
                egg6.toString();
    }
}
