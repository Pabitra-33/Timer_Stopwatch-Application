import java.util.Scanner; //used this package for taking user input

public class TimerStopwatch{
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        System.out.println("Timer and Stopwatch");
        System.out.println("1. Timer");
        System.out.println("2. Stopwatch");
        System.out.println("Enter your choice: 1 or 2");

        int choice = sc.nextInt();//storing the user input in choice variable

        if(choice == 1)
        {
            System.out.println("Enter the time duration in seconds:");
            int duration = sc.nextInt();
            timer(duration);
        }
        else if(choice == 2){
            Stopwatch();
        }
        else{
            System.out.println("Invalid Choice!");
        }
        sc.close();
    }

    public static void timer(int duration){
        System.out.println("Timer started for" + duration + "seconds.");

        for(int i = duration;i>=0;i--){
            System.out.println("Time remaining:" + i + "seconds");

            try{
                Thread.sleep( 1000);//sleep for 1 second
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
        }
        System.out.println("Timer finished .");
    }

    public static void Stopwatch(){
        System.out.println("Stopwatch started..Press enter to stop.");
        long startTime = System.currentTimeMillis();

        Scanner scanner = new Scanner(System.in);
        scanner.nextLine(); //wait till enter key was pressed

        long endTime = System.currentTimeMillis();
        long elapsedTime = endTime - startTime;

        System.out.println("Stopwatch Stopped.");
        System.out.println("Elapsed time:" + elapsedTime + "millisecond");

        scanner.close();
        
    }
}