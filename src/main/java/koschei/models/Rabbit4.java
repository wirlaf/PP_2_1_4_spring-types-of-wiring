package koschei.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

<<<<<<< Updated upstream
@Component
public class Rabbit4 {
    private  Duck5 duck5;
    @Autowired
    public void setDuck5(Duck5 duck5) {
        this.duck5 = duck5;
    }

=======


@Component
public class Rabbit4 {
    private Duck5 duck;
    @Autowired
    public void setO(Duck5 duck) {
        this.duck = duck;
    }



>>>>>>> Stashed changes
    @Override
    public String toString() {
        return ", в зайце утка " +  duck5.toString();
    }
<<<<<<< Updated upstream
=======



>>>>>>> Stashed changes
}
