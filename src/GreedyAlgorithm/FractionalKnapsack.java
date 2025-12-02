package GreedyAlgorithm;


import java.util.Arrays;
import java.util.Comparator;

class Item{
    int value, weight;
    Item(int x, int y){
        this.value = x;
        this.weight = y;

}
}

public class FractionalKnapsack {
    public static void main(String[] args) {
        Item item[] = new Item[3];
        item[0] = new Item(60,10);
        item[1] = new Item(100,20);
        item[2] = new Item(120,30);
        FractionalKnapsack fk = new FractionalKnapsack();
        System.out.println(fk.fractionalKnapsack(50,item,3));
    }


    double fractionalKnapsack(int w, Item arr[], int n) {
        Arrays.sort(arr, new itemComparator());

        int  curWeight = 0;
        double finalValue = 0.0;


        for (int i = 0; i < n; i++) {
            if(curWeight + arr[i].weight <= w){
                curWeight += arr[i].weight;
                finalValue += arr[i].value;
            }
            else{
                int  remain = w - curWeight;
                finalValue += ((double) arr[i].value/(double)arr[i].weight * (double)remain);
                break;

            }
        }
        return finalValue;
    }
    static class itemComparator implements Comparator<Item>{
        @Override
        public int compare(Item a, Item b) {
            double r1 = (double) a.value/a.weight;
            double r2 = (double) b.value/b.weight;

            return Double.compare(r2, r1);

        }
    }
}
