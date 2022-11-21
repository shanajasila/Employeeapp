import java.util.ArrayList;
import java.util.Scanner;
public class employee {
    int code;
    String name,designation,cmpname;
    long phone;
    double salary;

    public employee(int code, String name, String designation, String cmpname, long phone,double salary) {
        this.code = code;
        this.name = name;
        this.designation = designation;
        this.cmpname = cmpname;
        this.phone = phone;
        this.salary = salary;
    }

    public static void main(String args[]){
        ArrayList<employee> emplist=new ArrayList<employee>();
        while (true){
            System.out.println("Select the options\n");
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

                    employee emp=new employee(code,name,desig,cmpname,ph,salary);
                    emplist.add(emp);
                    break;
                case 2:
                    for (employee e :emplist) {
                        System.out.println(e.code);
                        System.out.println(e.name);
                        System.out.println(e.designation);
                        System.out.println(e.cmpname);
                        System.out.println(e.salary);
                        System.out.println(e.phone);
                    }
                    break;
                case 3:
                    System.out.println("Enter employee code");
                    int c= sc.nextInt();
                    int flag=0;
                    for(employee e2 :emplist) {
                        if (e2.code == c) {
                            System.out.println("\nEmployee found\n");
                            System.out.println(e2.code);
                            System.out.println(e2.name);
                            System.out.println(e2.designation);
                            System.out.println(e2.cmpname);
                            System.out.println(e2.salary);
                            System.out.println(e2.phone);
                            flag = 1;
                        }
                    }
                    if(flag==0){
                            System.out.println("Employee not found");
                        }
                    break;
                case 4:
                    System.out.println("Enter employee code");
                    int a= sc.nextInt();
                    for (employee e1 :emplist){
                        if(a==e1.code){
                            emplist.remove(e1);
                        }
                    }
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("please select from options");
                    break;





            }
        }
    }


}
