package methods;

import java.util.Scanner;

public class Gangadhar {

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        Gangadhar g = new Gangadhar();

        g.welcome();

        g.name();

        g.age();

        g.college();

        g.branch();
  

        g.hobby();

        g.language();

        g.weeklyHours();
 
        g.friend();

        g.project();
        g.profile();
    }

    void welcome() {
        System.out.println("Welcome Gangadhar");
    }

    String name() {
        System.out.println("Enter name:");
        String n = sc.nextLine();
        return n;
    }


    int age() {
        System.out.println("Enter age:");
        int a = sc.nextInt();
        return a;
    }

    void college() {
        System.out.println("College: Kalasalingam University");
    }

    String branch() {
        System.out.println("Enter branch:");
        String b = sc.next();
        return b;
    }

    String hobby() {
        System.out.println("Enter hobby:");
        String h = sc.next();
        return h;
    }
    String language() {
        System.out.println("Enter programming language:");
        String l = sc.next();
        return l;
    }
    int hours() {
        System.out.println("Enter daily study hours:");
        int h = sc.nextInt();
        return h;
    }

    int weeklyHours() {
        int h = hours();
        int k = h * 7;
        System.out.println("weekly hours = " + k);
        return k;
    }

    String friend() {
        System.out.println("Enter friend name:");
        String f = sc.next();
        return f;
    }
    String project() {
        System.out.println("Enter project name:");
        String p = sc.next();
        return p;
    }
    void profile() {
        System.out.println("Profile completed");
    }
}
