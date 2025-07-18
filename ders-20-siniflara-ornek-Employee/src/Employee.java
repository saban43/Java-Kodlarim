public class Employee {
    private String name;
    public double salary;      // salary = maas
    private int workHours, hireYear;        //calisma saati ve ise alma yili

        Employee(int hireYear,int workHours,double salary,String name){
            this.name = name;
            this.salary = salary;
            this.workHours = workHours;
            this.hireYear = hireYear;
        }

        public double tax(){            //tax = vergi
            if (salary >= 1000)
                return salary * 0.03 ;      //eger maasi 1000 liradan buyukse %3 vergi uygula

                return 0.0;      // degilse vergi uygulama
        }

        public double bonus(){
            int extraHours = workHours - 40 ;
            if (extraHours > 0 )
            return 30 * workHours;     //extra calisma saati basina 30 lira bonus para

            else return 0.0;
        }

        public double incrase(){           // incrase = artıs
            int year = 2024 - hireYear;
                if ( year < 10 )
                    return salary * 0*05;

                else if ( year >= 10 && year < 20 )
                    return salary * 0*10;

                else
                    return salary * 0.15;
        }

        public void toString(Employee emp){
            System.out.println(emp.name);
            System.out.println("Tax: "+ emp.tax());
            System.out.println("Bonus: "+ emp.bonus());
            System.out.println("Increase Salary: "+ emp.incrase());
            double totalSalary = emp.salary - emp.tax() + emp.bonus();
            System.out.println("Total salary with tax and bonus: " + totalSalary);
            System.out.println("Total salary with the raise of salary " + (emp.salary + emp.incrase())
                                                        +"\n************************************************\n" );
        }
}
