package in.aryan.core;

import com.lcwd.core.couple.Animal;
import org.springframework.stereotype.Component;

@Component("mouse")
public class Mouse implements Animal {
    @Override
    public void play() {
        System.out.println("Mouse is playing...");
    }
}
