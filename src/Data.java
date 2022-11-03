import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class Data {
    private String name;
    private String surname;
    private int num;  //Choosing worker's position
    private int workerID; //
    private int salary;
    private int sum = 0;
    private String position;

    //---------- Local Variables---------//

    ArrayList<String> arr = new ArrayList<String>(); //Container for Days.

    public Data(){

    }

    public void setDays() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Worker Name: ");
        this.name = scanner.nextLine();

        System.out.println("Enter Worker Surname: ");
        this.surname = scanner.nextLine();

        System.out.println("Enter Worker Class Level: \n 1-Intern \n 2-Junior \n 3-Senior \n 4-Manager");
        this.num = scanner.nextInt();

        // All positions and their daily salaries
        if(num==1){
            position="Intern";
            salary=50; // Leva a day
        }
        else if (num==2) {
            position="Junior";
            salary=100; // Leva a day
        }
        else if (num==3) {
            position="Senior";
            salary=500;  // Leva a day
        }
        else if (num==4) {
            position="Manager";
            salary=1000; //Leva a day
        }
        setID();
        System.out.println(name + " " + surname + " " + position +" ID: "+workerID);

    }
    //Generates ID
    private int setID() {
        Random random = new Random();
        int x = random.nextInt(0,1000000);
        this.workerID=x;
      return workerID;
    }
    //Writing working days and calculating salary per day
    public void setSchedule(){
        do {
            System.out.println("Enter working days of the employee (Press Q to quit)");
            Scanner scanner = new Scanner(System.in);

            String days = scanner.nextLine();
            if (!days.equals("Q")) {
                sum = sum + salary;
                arr.add(days);
            }
            else {
                break;
            }

        } while(true);

    }
    //Show info
    public String toString(){
        return "Name: "+name+" "+surname+
                "\nWork position: "+position+
                "\nEmployee ID: "+workerID+
                "\nWorking days: "+arr+
                "\nMonthly salary: "+sum*4+" bgn"+"\n";
    }



}
