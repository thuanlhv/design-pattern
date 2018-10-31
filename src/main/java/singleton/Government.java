package singleton;

import java.util.Objects;

public class Government {
    private static Government instance;

    public static Government election() {
        if(Objects.isNull(instance)) {
            instance = new Government();
        }
        return instance;
    }
}
