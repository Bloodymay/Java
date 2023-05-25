package HW5_task;

import java.util.Objects;
import java.util.Scanner;

public class Laptops {
    public String nameBrand;
    public String model;
    public Integer RAM;
    public Integer hardDiskCapacity;
    public String videoCardType;
    public double screenDiagonal;
    public String color;

    public Laptops(String nameBrand, String model, Integer RAM, Integer hardDiskCapacity, String videoCardType,
            double d, String color) {
        this.nameBrand = nameBrand;
        this.model = model;
        this.RAM = RAM;
        this.hardDiskCapacity = hardDiskCapacity;
        this.videoCardType = videoCardType;
        this.screenDiagonal = d;
        this.color = color;
    }

    public String getName() {
        return nameBrand;
    }

    public String getModel() {
        return model;
    }

    public Integer getRAM() {
        return RAM;
    }

    public Integer getHardDiskCapacity() {
        return hardDiskCapacity;
    }

    public String getVideoCardType() {
        return videoCardType;
    }

    public Double getScreenDiagonal() {
        return screenDiagonal;
    }

    public String getColor() {
        return color;
    }

    public String setName() {
        return nameBrand;
    }

    public String setModel() {
        return model;
    }

    public int setRAM() {
        return RAM;
    }

    public int setHardDiskCapacity() {
        return hardDiskCapacity;
    }

    public String setVideoCardType() {
        return videoCardType;
    }

    public Double setScreenDiagonal() {
        return screenDiagonal;
    }

    public String setColor() {
        return color;
    }

    public String toString() {
        return " Имя бренда: " + getName() + ", Модель: " + getModel() + ", Объем оперативной памяти: " + getRAM()
                + "гб, Объем памяти жесткого диска: " + getHardDiskCapacity() +
                "гб, Тип видеокарты: " + getVideoCardType() + ", Диагональ экрана: " + getScreenDiagonal()
                + " дюймов, Цвет: " + getColor();

    }
   
    public static Laptops getUserLaptop(String nameBrand, String model, Integer RAM, Integer hardDiskCapacity,
            String videoCardType, Double screenDiagonal, String color) throws NumberFormatException{
                

        Laptops userLaptop = new Laptops(null, null, 0, 0, null, 0, null);
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите необходимый объем памяти: ");
        try {
            userLaptop.RAM = Integer.parseInt(scan.nextLine());
        } catch (NumberFormatException e) {
            System.err.println("Введите корректное значение!(число)");
            System.exit(0);
        }
        
        System.out.println("Введите необходимый объем жесткого диска: ");
        try {
          userLaptop.hardDiskCapacity = Integer.parseInt(scan.nextLine());  
        } catch (NumberFormatException e1) {
            System.err.println("Введите корректное значение(число)!");
            System.exit(0);
        }
        
        System.out.println("Введите необходимый тип видеокарты(discrete или integrate): ");
        userLaptop.videoCardType = scan.nextLine();
        System.out.println("Введите необходимую диагональ экрана: ");
        try {
            userLaptop.screenDiagonal = Double.parseDouble(scan.nextLine());  
          } catch (NumberFormatException e2) {
              System.err.println("Введите корректное значение!(число)");
              System.exit(0);
              
          }
          
        System.out.println("Введите необходимый цвет ноутбука: ");
        userLaptop.color = scan.nextLine();
        scan.close();
        return userLaptop;
    } 
        
    
    
 
    

    public int hashCode() {
        return Objects.hash(nameBrand, model, RAM, hardDiskCapacity, videoCardType, screenDiagonal, color);

    }

    public boolean equals(Object obj) {
        if (obj instanceof Laptops p) {
            return Objects.equals(RAM, p.RAM) && hardDiskCapacity == p.hardDiskCapacity
                    && videoCardType == p.videoCardType && screenDiagonal == p.screenDiagonal && color == p.color;
        }
        return false;
    }
}
