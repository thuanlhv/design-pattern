package factory;

public interface StampingEquipment {
    default void stampBodyPart() {
        System.out.println("stamping equipment");
    }
}
