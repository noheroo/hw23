package ru.skypro;

public class ServiceStationImpl implements ServiceStation {

    @Override
    public void check(Bicycle[] bicycles) {
        for (int j = 0; j < bicycles.length; j++) {
            System.out.println("Обслуживаем " + bicycles[j].getModelName());
            updTyres(bicycles, j);
            System.out.println();
        }
    }

    @Override
    public void check(Car[] cars) {
        for (int j = 0; j < cars.length; j++) {
            System.out.println("Обслуживаем " + cars[j].getModelName());
            updTyres(cars, j);
            System.out.println();
            cars[j].checkEngine();
            System.out.println();
        }
    }

    @Override
    public void check(Truck[] trucks) {
        for (int j = 0; j < trucks.length; j++) {
            System.out.println("Обслуживаем " + trucks[j].getModelName());
            updTyres(trucks, j);
            trucks[j].checkEngine();
            trucks[j].checkTrailer();
            System.out.println();
        }
    }

    private void updTyres(Transport[] transports, int j) {
        for (int i = 0; i < transports[j].getWheelsCount(); i++) {
            transports[j].updateTyre();
        }
    }
}