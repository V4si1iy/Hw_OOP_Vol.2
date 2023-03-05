public interface Vehicle {
    default void updateTyre()
    {
        System.out.println("Меняем покрышку");
    }
    default void checkEngine(){
        System.out.println("Двигатель: отсуттсвует");
    }
    default void checkTrailer()
    {
        System.out.println("Прицеп: отсутствует");
    }
    String getModelName();
    int getWheelsCount();

}
