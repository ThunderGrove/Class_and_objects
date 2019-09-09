public class Main{
    public static void main(String[] args){
        CarDB cars = new CarDB();

        cars.addCar("Volvo","440  ","200 km/t");
        cars.addCar("Volvo","440GL","220 km/t");
        cars.addCar("Volvo","460  ","240 km/t");
        cars.addCar("Tesla","S    ","249 km/t");
        cars.addCar("Tesla","X    ","210 km/t");

        System.out.println("Brand:\tModel:\tMax speed:");
        for(int i = 0;i < cars.returnCarDBSize();i++){
            System.out.print(cars.returnBrand(i));
            System.out.print("\t");
            System.out.print(cars.returnModel(i));
            System.out.print("\t");
            System.out.println(cars.returnMaxSpeed(i));
        }
    }
}