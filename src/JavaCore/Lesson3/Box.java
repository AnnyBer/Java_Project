package JavaCore.Lesson3;

import java.util.ArrayList;

public class Box<T extends Fruit> {

    ArrayList<T> boxFruitList;


    public Box(ArrayList<T> boxFruitList) {
        this.boxFruitList = boxFruitList;
    }

    public ArrayList<T> getBoxFruitList() {
        return boxFruitList;
    }

    public void setBoxFruitList(ArrayList<T> boxFruitList) {
        this.boxFruitList = boxFruitList;
    }

    public float getWeight(){
       float sumWeight = 0.0f;
       for (Fruit fruit : boxFruitList) {
           sumWeight += fruit.getWeight();
       }
       return sumWeight;
    }


    public boolean compare(Box<?> box) {
       return this.getWeight() == box.getWeight();
    }


    public void moveTo(Box box, String className) {
        int i = this.boxFruitList.size() - 1;
        while (i > -1) {
            Fruit fruit = this.boxFruitList.get(i);
            if (fruit.getClass().getName() == className) {
                this.boxFruitList.remove(fruit);
                box.getBoxFruitList().add((T) fruit);
            }
            i --;
        }
    }
}
