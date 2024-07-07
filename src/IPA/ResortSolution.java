package IPA;

import java.util.Scanner;

class Resort {
    private int resortId;
    private String resortName;
    private String category;
    private double price;
    private double rating;

    Resort(int resortId, String resortName, String category, double price , double rating){
        this.resortId = resortId;
        this.resortName = resortName;
        this.category = category;
        this.price = price;
        this.rating = rating;
    }

    // resortid
    public void setResortId(int id){
        resortId = id;
    }
    public int getResortId(){
     return resortId;
    }
    // resort name

    public  void setResortName(String name){
        resortName = name;
    }
    public  String getResortName(){
        return resortName;
    }

    // category
    public  void setCategory(String category){
        this.category =category;
    }
    public  String getCategory(){
        return  category;
    }

    // price
    public  void setPrice(int price){
        this.price = price;
    }
    public double getPrice(){
        return  price;
    }
    // rating
    public double getRating(){
        return  rating;
    }

}

public class ResortSolution{
    public static void main(String[] args) {
        Resort []myResort = new Resort[4];

        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < myResort.length; i++){
            int id = sc.nextInt();
            sc.nextLine();
            String name = sc.nextLine();
            String category = sc.nextLine();
            double price = sc.nextDouble();
            double rating = sc.nextDouble();
            sc.nextLine();
            myResort[i]= new Resort(id, name, category, price, rating);
        }
        // resort created


        String inp_category = sc.nextLine();

        int avgPrice = findAveragePriceByCategory(myResort, inp_category);
        if(avgPrice > 0){
            System.out.println(avgPrice);
        }
        else{
            System.out.println("There is no such resort available");
        }


        // now i have to call the function to calculate
    }

    public  static  int findAveragePriceByCategory(Resort [] myResort , String newCategory){
        // find the average price of resort category with the rating greater than 4
        int price = 0;
        int count = 0;
        for(int index = 0; index < myResort.length ; index ++){
            if(myResort[index].getCategory().equalsIgnoreCase(newCategory) && myResort[index].getRating() > 4){
                price += myResort[index].getPrice();
                count ++;
            }
        }
        if(count > 0) return price/count;
        return  0;
    }

}
