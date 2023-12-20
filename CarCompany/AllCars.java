package CarCompany;

public class AllCars {
    int num;
    Car[] cars;
    public AllCars(int max){
        this.cars = new Car[max];
        this.num = 0;
    }
    public boolean addCar(Car car){
        if (num > cars.length) {
            return false;
        }
        cars[num] = car;
        return true;
    }
    public void print(int min,int max){
        for(int i = 0;i < num;i++){
            if (cars[i].isHadAccident()) {
                if (cars[i].range(min, max)) {
                    System.out.println(cars[i].getLicenseNum());
                }
            }
        }
    }
}