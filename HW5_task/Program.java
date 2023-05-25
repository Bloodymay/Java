package HW5_task;

import java.util.HashSet;

public class Program {
    public static void main(String[] args) {
        Laptops laptop1 = new Laptops("ASUS", "Vivobook", 16, 512, "discrete", 16.0, "black");
        Laptops laptop2 = new Laptops("HP", "240 G8", 4, 1024, "integrate", 14.0, "silver");
        Laptops laptop3 = new Laptops("Acer", "Aspire", 8, 1024, "discrete", 15.0, "black/red");
        Laptops laptop4 = new Laptops("ASUS", "230VX", 2, 256, "integrate", 14.0, "silver");
        Laptops laptop5 = new Laptops("Acer", "Aspire460", 16, 1024, "discrete", 16.0, "black/silver");
        HashSet<Laptops> laptopsSet = new HashSet<>();
        laptopsSet.add(laptop1);
        laptopsSet.add(laptop2);
        laptopsSet.add(laptop3);
        laptopsSet.add(laptop4);
        laptopsSet.add(laptop5);

        
        Laptops userData = Laptops.getUserLaptop(null, null, null, null, null, null, null);
        requestCheck(laptopsSet, userData);
        
    }


    public static void requestCheck(HashSet<Laptops> laptopsSet, Laptops userData) {

        for (Laptops nextLaptop : laptopsSet) {
          
                if (nextLaptop.getRAM().intValue() == userData.getRAM().intValue()
                        && nextLaptop.getHardDiskCapacity().intValue() == userData.getHardDiskCapacity().intValue()
                        && nextLaptop.getVideoCardType() == userData.getVideoCardType().intern() &&
                        nextLaptop.getScreenDiagonal().doubleValue() == userData.getScreenDiagonal().doubleValue()
                        && nextLaptop.getColor() == userData.getColor().intern()) {
                    //System.out.println(nextLaptop.toString());
                    System.out.println("Подходящая по критериям модель - Производитель: "+ nextLaptop.nameBrand + ", модель: " + nextLaptop.model);
                 
                    

                }
                else{
              
                System.out.println("Модель  " + nextLaptop.nameBrand + " " + nextLaptop.model +  "  не соответствует указанным критериям.");
            }
                
            

        }
        

    }

}
