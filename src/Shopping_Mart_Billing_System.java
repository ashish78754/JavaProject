import java.util.*;

public class Shopping_Mart_Billing_System {
    public static void main(String[] args) {
        String name1 = "ashish";
        int b = 123;
        System.out.println("Welcome To Shopping Mart");
        System.out.println("Login your id");
        System.out.println("please enter your userid");
        Scanner sc = new Scanner(System.in);
        String name2 = sc.next();
        if (name2.equals(name1)) {
            System.out.println("enter your password");
            int pass = sc.nextInt();
            if (pass == b) {
                int x = 0;
                int y = 0;
                int z = 0;
                System.out.println("choose your shopping area\n 1.mens shopping area\n 2.Ladies shopping area\n 3.Kids shopping area\n");
                while (true) {
                    System.out.println("enter your choice for which type shopping area otherwise enter 111 for log out from shopping mart:");
                    int ch = sc.nextInt();
                    switch (ch) {
                        case 1:
                            x += men();
                            break;
                        case 2:
                            y += women();
                            break;
                        case 3:
                            z += kids();
                            break;
                        default:
                            System.out.println("you log out");
                            int sum = x + y + z;
                            if (sum > 2000) {
                                int v = (sum * 90) / 100;
                                System.out.println("congrats you get 10% discount for more than 2000rs shopping");
                                System.out.println("your final price:" + v);
                            } else {
                                System.out.println("your final price:" + sum);
                            }
                    }
                    if (ch == 111)
                        break;
                }
            } else {
                System.out.println("password is wrong");
            }
        } else {
            System.out.println("user id is wrong");
        }
    }

    static int men() {
        System.out.println("Mens product collection\nitems\t\t\trs.\n1.shirt\t\t\t350\n2.jeans\t\t\t650\n3.Watches\t\t450\nenter 11 after buy you all men product\n");
        Scanner sc = new Scanner(System.in);
        int a = 0;
        while (true) {
            System.out.println("enter choice for buy product");
            int ch = sc.nextInt();
            {
                if (ch == 11)
                    break;
                System.out.println("enter quantity");
                int no = sc.nextInt();
                switch (ch) {
                    case 1:
                        a = a + (no * 350);
                        break;
                    case 2:
                        a = a + (no * 650);
                        break;
                    case 3:
                        a = a + (no * 450);
                        break;
                    default:
                        System.out.println("choice is wrong");
                        break;
                }
            }
        }
        return a;
    }

    static int women() {
        System.out.println("Women product collection\nitems\t\t\t\trs.\n1.suit-salwar\t\t\t750\n2.jeans-top\t\t\t550\n3.glasses\t\t\t150\nenter 11 after buy you all women product\n");
        Scanner sc = new Scanner(System.in);
        int b = 0;
        while (true) {
            System.out.println("enter choice for buy product");
            int ch = sc.nextInt();
            {
                if (ch == 11)
                    break;
                System.out.println("enter quantity");
                int no = sc.nextInt();
                switch (ch) {
                    case 1:
                        b = b + (no * 550);
                        break;
                    case 2:
                        b = b + (no * 750);
                        break;
                    case 3:
                        b = b + (no * 150);
                        break;
                    default:
                        System.out.println("choice is wrong");
                        break;
                }
            }
        }
        return b;
    }

    static int kids() {
        System.out.println("Kids product collection\nitems\t\t\trs.\n1.T-shirt\t\t\t350\n2.jeans\t\t\t500\n3.Toys\t\t300\nenter 11 after buy you all kids product\n");
        Scanner sc = new Scanner(System.in);
        int c = 0;
        while (true) {
            System.out.println("enter choice for buy product");
            int ch = sc.nextInt();
            {
                if (ch == 11)
                    break;
                System.out.println("enter quantity");
                int no = sc.nextInt();
                switch (ch) {
                    default:
                        System.out.println("choice is wrong");
                        break;
                    case 1:
                        c = c + (no * 350);
                    break;
                    case 2:
                        c = c + (no * 500);
                    break;
                    case 3:
                        c = c + (no * 300);
                    break;
                }
            }
        }
        return c;
    }
}
