package machine;
import java.util.Scanner;

class Machine {
    
     Scanner sc = new Scanner(System.in);
     int water = 400;
     int milk = 540;
     int beans = 120;
     int cups = 9;
     int money = 550;
    
    public void start() {
        
        while (true) {
            System.out.println("Write action (buy, fill, take, remaining, exit):");
            String action = sc.nextLine();
            if (action.equals("buy")) {
                buy();
            } else if (action.equals("take")) {
                take(money);
            } else if (action.equals("remaining")) {
                remaining();
            } else if (action.equals("fill")) {
                fill();
            } else if (action.equals("exit")) {
                break;
            }
        }
    }
    
    public void print() {
        String initial = "The coffee machine has: ";
        System.out.println(initial);
        String swater = String.format("%d ml of water", water);
        System.out.println(swater);
        String smilk = String.format("%d ml of milk", milk);
        System.out.println(smilk);
        String sbeans = String.format("%d g of beans", beans);
        System.out.println(sbeans);
        String scups = String.format("%d disposable cups", cups);
        System.out.println(scups);
        String smoney = String.format("$%d of money", money);
        System.out.println(smoney);
    }
    
    public void buy() {
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu: ");
        String buy = sc.nextLine();
        if (buy.equals("1")) {
            if (water < 250 || beans < 16 || cups < 1) {
                check1();
            } else {
                water -= 250;
                // milk -= 16;
                beans -= 16;
                cups -= 1;
                money += 4;
                System.out.println("I have enough resources, making you a coffee!");

            }
        } else if (buy.equals("2")) {
            if (water < 350 || milk < 75 || beans < 20 || cups < 1) {
                check2();
            } else {
                water -= 350;
                milk -= 75;
                beans -= 20;
                cups -= 1;
                money += 7;
                System.out.println("I have enough resources, making you a coffee!");
            }
        } else if (buy.equals("3")) {
            if (water < 200 || milk < 100 || beans < 12 || cups < 1) {
                check3();
            } else {
                water -= 200;
                milk -= 100;
                beans -= 12;
                cups -= 1;
                money += 6;
                System.out.println();
                System.out.println("I have enough resources, making you a coffee!");
            }
        }
    }
    
    public void check1() {
        if (water < 250) {
            System.out.println("Sorry, not enough water!");
        } else if (beans < 16) {
            System.out.println("Sorry, not enough beans!");
        } else if (cups < 1) {
            System.out.println("Sorry, not enough cups!");
        }
    } 
    public void check2() {
        if (water < 350) {
            System.out.println("Sorry, not enough water!");
        } else if (milk < 75) {
            System.out.println("Sorry, not enough milk!");
        } else if (beans < 20) {
            System.out.println("Sorry, not enough beans!");
        } else if (cups < 1) {
            System.out.println("Sorry, not enough cups!");
        }
    }
    public void check3() {
        if (water < 200) {
            System.out.println("Sorry, not enough water!");
        } else if (milk < 100) {
            System.out.println("Sorry, not enough milk!");
        } else if (beans < 12) {
            System.out.println("Sorry, not enough beans!");
        } else if (cups < 1) {
            System.out.println("Sorry, not enough cups!");
        }
    }
    
    public void fill() {
        System.out.printf("Write how many ml of water you want to add: ");
        int addwater = sc.nextInt();
        System.out.printf("Write how many ml of milk you want to add: ");
        int addmilk = sc.nextInt();
        System.out.printf("Write how many grams of coffee beans you want to add: ");
        int addbeans = sc.nextInt();
        System.out.printf("Write how many disposable cups of coffee you want to add: ");
        int addcups = sc.nextInt();
        water += addwater;
        milk += addmilk;
        beans += addbeans;
        cups += addcups;
        System.out.println();
        // print();
    }
    
    public void take(int moneyy) {
        System.out.println();
        System.out.printf("I gave you $%d", moneyy);
        money -= moneyy;
    }
    
    public void remaining() {
        print();
    }
}
 
