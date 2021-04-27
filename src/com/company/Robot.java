/*simple exercise regarding (sequential, conditional,repetitive and simple I/O
        Your task:
            simulate a simple robot named Robby
            Robby is a robot that could move based on a given direction (N,E,W,S) and distance (n>0)
            Create a menu driven program that instructs Robby to move
            
            [1] Location
            [2] Move
            [3] Reset
            [4] Quit
        
            Enter your choice >> 1
            Robby is located at the origin (0,0)
            Enter your choice >> 2
            Enter direction (N,E,W,S) >> N
            Enter distance (n>0) >> 10
            Robby moved North, 10 units
            Enter your choice >> 1
            Robby is located at (0,10)
            Enter your choice >> 2
            Enter direction (N,E,W,S) >> E
            Enter distance (n>0) >> 10
            Robby is located at (10,10)
            Enter your choice >> 3
            Robby reset at (0,0)
            Enter your choice >> 1
            Robby is located at the origin (0,0)
            Enter your choice >> 4
            Program Terminated. Goodbye!       
        */
package com.company;
import java.util.Scanner;
public class Robot{
    public static void main(String[] args){
        System.out.println("Hello, my name is Robby. I'm a robot that can move.\n What do you want me to do?");
        String option;
        int x = 0, y = 0;
        do {
            System.out.println("[1] Location\n[2] Move\n[3] Reset\n[4] Quit\n");
            Scanner scanner = new Scanner(System.in);
            option = scanner.nextLine();
            if(option.equals("1")){
                if(x == 0 && y == 0) System.out.println("Robby is located at the origin (0, 0)");
                else System.out.printf("Robby is located at (%d, %d)\n", x, y);
            }
            else if(option.equals("2")){
                String N = "North", S = "South", E = "East", W = "West";
                System.out.println("Enter direction (N, S, E, W)");
                char dir = scanner.next().charAt(0);
                System.out.println("Enter distance");
                int dist = scanner.nextInt();
                if(dir == 'N') y += dist;
                else if(dir == 'S') y -= dist;
                else if(dir == 'E') x += dist;
                else if(dir == 'W') x -= dist;
                String direction = dir == 'N' ? N : dir == 'S' ? S : dir == 'E' ? E : W;
                System.out.printf("Robby moved %s, %d units\n", direction, dist);
            }
            else if(option.equals("3")){
                x = 0; y = 0;
                System.out.println("Robby reset at (0, 0)");
            }
            else if(option.equals("4")){
                java.lang.System.exit(0);
            }
        } while(option.equals("1")  || option.equals("2")  || option.equals("3"));
    }
}
