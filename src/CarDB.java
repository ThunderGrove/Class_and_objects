import java.util.ArrayList;//import the ArrayList class

public class CarDB{
    private ArrayList<ArrayList<String>> car = new ArrayList<ArrayList<String>>();//init 2d array with no fixed size;

    public void addCar(String brand, String model, String maxSpeed){

        ArrayList<String> temp = new ArrayList<>();//init 1d array with no fixed size;

        temp.add(brand);
        temp.add(model);
        temp.add(maxSpeed);

        car.add(temp);//adds the 1d array to the 2d array
    }

    public int returnCarDBSize(){
        return car.size();
    }

    public String returnBrand(int index){
        return car.get(index).get(0);
    }

    public String returnModel(int index){
        return car.get(index).get(1);
    }

    public String returnMaxSpeed(int index){
        return car.get(index).get(2);
    }
}