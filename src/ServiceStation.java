public class ServiceStation {
    public void check(Vehicle car) {

        System.out.println("Обслуживаем " + car.getModelName());
        for (int i = 0; i < car.getWheelsCount(); i++) {
            car.updateTyre();
        }
        car.checkEngine();
        car.checkTrailer();
        System.out.println();
    }
}
