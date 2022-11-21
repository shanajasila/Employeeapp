import java.util.ArrayList;
import java.util.Scanner;
public class employee {

    public static void main(String args[]){
        ArrayList emplist=new ArrayList<>();
        while (true){
            System.out.println("Select the options");
            Scanner sc=new Scanner(System.in);
            System.out.println("1.Add Employee\n2.View Employee\n3.Search Employee\n4.Delete Employee\n5.Exit");
            int men= sc.nextInt();
            switch (men){
                case 1:
                    System.out.println("Enter Employee code");
                    int code= sc.nextInt();
                    System.out.println("Enter Employee name");
                    String name=sc.next();
                    System.out.println("Enter salary");
                    double salary=sc.nextDouble();
                    System.out.println("Enter Designation");
                    String desig=sc.next();
                    System.out.println("Enter Company name");
                    String cmpname=sc.next();
                    System.out.println("Enter Phone number");
                    long ph=sc.nextLong();

                    emplist.add(code);
                    emplist.add(name);
                    emplist.add(salary);
                    emplist.add(desig);
                    emplist.add(cmpname);
                    emplist.add(ph);

                    break;
                case 2:
                    System.out.println(emplist);
                    break;
                case 3:
                    System.out.println("Enter employee code");
                    int c= sc.nextInt();
                    if(emplist.contains(c)) {
                        System.out.println("Employee found");
                    }
                    else{
                        System.out.println("Employee not found");
                    }
            }
        }
    }


}
