package org.example;
//12345
public class Main {

    public static void main(String[] args)
    {

       employee[] list=new employee[5];
        list[0]=new employee("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30);
        list[1]=new employee("Vasil'ev ivan", "Engineer", "ivivan@mailbox1.com", "892312313", 30000, 20);
        list[2]=new employee("Petrov Nikolay", "Engineer", "ivivan@mailbox2.com", "892312314", 30000, 40);
        list[3]=new employee("Stepochkin Petr", "Engineer", "ivivan@mailbox3.com", "892312315", 30000, 50);
        list[4]=new employee("Rasputin Grisha", "Engineer", "ivivan@mailbox4.com", "892312316", 30000, 50);
        System.out.println("older than 40:");
        for(int i=0;i<5;i++)
        {
            if(list[i].age>=40)
            {
               list[i].print_employee_info();
                System.out.println("_________________________");
            }
        }
    }
}