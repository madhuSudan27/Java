package IPA;

import java.sql.SQLOutput;
import java.sql.Struct;
import java.util.Scanner;

class HeadSets {
    private String headSetName;
    private String brand;
    private int price;
    private boolean available;

    public HeadSets(String headSetName , String brand, int price, boolean available){
        this.headSetName = headSetName;
        this.brand = brand;
        this.price = price;
        this.available = available;
    }
    // getter and setters
    public void setHeadSetName(String setName){
        headSetName = setName;
    }

    public String getHeadSetName() {
        return headSetName;
    }
    public void setBrandName(String brandName){
        brand = brandName;
    }

    public String getBrand() {
        return brand;
    }

    public int getPrice(){
        return price;
    }
    public void setPrice(int price){
        this.price =price;
    }

    public boolean isAvailable(){
        return available;
    }
    public void setAvailable(boolean input){
        available = input;
    }
}

public class Solution{

    public static void main(String[] args) {

        HeadSets[] hs = new HeadSets[4];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the details");
        for(int i = 0; i < 4; i ++){
//            System.out.println("Enter "+ i + "th product information");
//            // have to take all input
//            String headsetName = sc.nextLine();
//            String brand = sc.nextLine();
//            int price = sc.nextInt();
//            boolean available = sc.nextBoolean();
//            sc.nextLine();
//            hs[i] = new HeadSets(headsetName, brand, price, available);

            hs[0] = new HeadSets("boat wired", "boat", 800, true);
            hs[1] = new HeadSets("Boat earbuds", "boat", 1200, true);
            hs[2] = new HeadSets("boat micro phone", "boat", 400, true);
            hs[3] = new HeadSets("oppo eco dubs", "oppo", 600, true);
        }

        System.out.println("Enter brand name");
        String newBrand = sc.nextLine();
        int totalPrice = findTotalPriceForGivenBrand(hs,newBrand);
        if(totalPrice > 0){
            System.out.println(totalPrice);
        }
        else{
            System.out.println("Not headset available");
        }

        HeadSets lowestPrice = findAvailableHeadsetWithSecondMinPrice(hs);
        if(lowestPrice == null){
            System.out.println(".....");
        }
        else{
            System.out.println(lowestPrice.getHeadSetName());
            System.out.println(lowestPrice.getPrice());
        }
    }

    public static int findTotalPriceForGivenBrand(HeadSets []hs ,String brandName){
        int res = 0;
        for(int i = 0; i < hs.length; i++){
            if(hs[i].getBrand().equalsIgnoreCase(brandName)){
                System.out.println(hs[i].getHeadSetName());
                res+= hs[i].getPrice();
            }
        }
        return res;
    }

    public static HeadSets findAvailableHeadsetWithSecondMinPrice(HeadSets[] hs){
        // lets count number of availabe items
        int count = 0;
        HeadSets res = null;
        for(int index = 0; index < hs.length; index ++){
            if(hs[index].isAvailable()){
                count ++;
            }
        }
        if(count < 2) return  res;

        // else we have at least two product available
        // lest sort the array
        HeadSets[] newHeadSets = new HeadSets[count];
        int ij = 0;
        for(int index = 0; index < hs.length; index ++){
            if(hs[index].isAvailable()){
                newHeadSets[ij++] = hs[index];
            }
        }

        for(int i = 0; i < newHeadSets.length; i++){
            for( int j = i + 1; j < newHeadSets.length; j ++){
                if(newHeadSets[i].getPrice() > newHeadSets[j].getPrice()){
                    // need to swap
                    HeadSets temp = newHeadSets[i];
                    newHeadSets[i] = newHeadSets[j];
                    newHeadSets[j] = temp;
                }
            }
        }
        for(int i = 0; i < newHeadSets.length; i++) {
            System.out.println(newHeadSets[i].getPrice());
        }


        return newHeadSets[1];
    }

}
