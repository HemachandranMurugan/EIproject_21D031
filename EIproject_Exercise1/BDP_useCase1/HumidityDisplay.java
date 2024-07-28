package BDP_useCase1;
// Concrete Observer
class HumidityDisplay implements WeatherObserver {
    @Override
    public void update(float temperature, float humidity) {
        System.out.println("Humidity Display: Humidity = " + humidity);
    }
}