import java.util.*;
import java.io.*;

class Project1 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String data[][] = { { "1001", "Ashish", "01/04/2009", "e", "R&D", "20000", "8000", "3000" },
                { "1002", "Sushma", "23/08/2012", "c", "P&M", "30000", "12000", "9000" },
                { "1003", "Rahul", "12/11/2008", "k", "Acct", "10000", "8000", "1000" },
                { "1004", "Chahat", "29/01/2013", "r", "Front Desk", "12000", "6000", "2000" },
                { "1005", "Ranjan", "16/01/2015", "m", "Engg", "50000", "20000", "20000" },
                { "1006", "Suman", "1/1/2000", "e", "Manufacturing", "23000", "9000", "4400" },
                { "1007", "Tanmay", "12/06/2006", "c", "PM", "29000", "12000", "10000" } };
        String designation[][] = { { "e", "Engineer", "20000" }, { "c", "Consultant", "32000" },
                { "k", "Clerk", "12000" }, { "r", "Receptionist", "15000" }, { "m", "Manager", "40000" } };

        int id = in.nextInt();
        int position = -1;
        for (int i = 0; i < 7; i++) {
            if (Integer.parseInt(data[i][0]) == id) {
                position = i;
            }
        }
        if (position == -1)
            System.out.println("There is no employee with empid : " + id);
        else {
            int desigPosition = -1;
            for (int i = 0; i < 5; i++) {
                if (designation[i][0].equalsIgnoreCase(data[position][3])) {
                    desigPosition = i;
                }
            }
            int salary = Integer.parseInt(data[position][5]) + Integer.parseInt(data[position][6])
                    - Integer.parseInt(data[position][7]) + Integer.parseInt(designation[desigPosition][2]);
            System.out.println("EmpNo.\tEmpName\tDepartment\tDesignation\tSalary");
            System.out.println(data[position][0] + "\t" + data[position][1] + "\t" + data[position][4] + "\t"
                    + designation[desigPosition][1] + "\t" + salary);
        }

    }
}