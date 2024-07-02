import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

       // List<Integer> num=Arrays.asList(123,126,33,24,35,36);
        //System.out.println(num.stream().mapToInt(e->e).average());
        /*System.out.println("Square , Filter and Average is "+ num.stream()
                                                                .mapToInt(a->a*a)
                                                                .filter(a->a>4)
                                                                .average()
                                                                .getAsDouble()
                                                            +"");*/
        //System.out.println(num.stream().filter(e->e%2==0).collect(Collectors.toList()));
        //System.out.println(num.stream().map(e->e.toString()).filter(e->e.startsWith("2")).collect(Collectors.toList()));
        // System.out.println(num.stream().filter(e-> Collections.frequency(num,e)>1).collect(Collectors.toList()));

        //System.out.println(num.stream(). max((e1,e2) -> e1-e2).get());
         //System.out.println(num.stream().reduce(Integer::max).get());
        //System.out.println(num.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList()));
        //System.out.println(num.stream().limit(2).reduce((a,b)->a+b).get());
        //System.out.println(num.stream().skip(2).collect(Collectors.toUnmodifiableList()));

        //System.out.println(num.stream().sorted(Collections.reverseOrder()).distinct().skip(1).findFirst().get());
        //Integer i = num.stream().sorted().distinct().skip(1).findFirst().

        List<Employee> e =new ArrayList<>();
        e.add(new Employee("priya",1,"Kuniyamuthur"));
        e.add(new Employee("Devi",2,"BKPudhur"));
        e.add(new Employee("Nishanth",3,"Kunisai"));
    //    Map<String,List<Employee>>map = e.stream().collect(Collectors.groupingBy(Employee::getCity))
        // map.forEach((key,value)-> System.out.println(key +"=="+ value.toString()));


      // e.sort(Comparator.comparing(Employee::getName));
       // e.forEach(a-> System.out.println(a.getName()));
//
//        String[] s = {"Nishanth","Nishanth","Priya","Priya","adcd"};
//        Map<String,Integer> count = new HashMap<>();
//        int map=1;
//        for(String str: s)
//        {
//            if(count.containsKey(s))
//            {
//                map=count.get(str);
//                map++;
//                count.put(str,map);
//            }
//            else {
//                count.put(str, map);
//            }
//        }
//        System.out.println(count);
//
//




        //String[] s ={"AB","CD","EF"};
        //Arrays.stream(s).distinct().forEach(x-> System.out.println(x));

//        String in="Nishanth";
//        long count=in.chars().filter((s)->{
//            return (s=='a'||s=='e'||s=='i'||s=='o'||s=='u');
//        }).count();
//
//        in.chars().
//
//        System.out.println(count);





        //##Java TECHIE##//

       /* List<EmployJavaTechie> ej=new ArrayList<>();
        ej.add(new EmployJavaTechie(111,"Nishanth",32,"Male","Developer",2000,1000));
        ej.add(new EmployJavaTechie(121,"Nishanth",31,"Male","Security and transport",2001,2000));
        ej.add(new EmployJavaTechie(131,"Nishanth",33,"Male","Devops",2002,3000));
        ej.add(new EmployJavaTechie(141,"Nishanth",34,"Male","Accounts and finance",2003,4000));
        ej.add(new EmployJavaTechie(151,"Nishanth",23,"Male","Developer",2004,5000));
        ej.add(new EmployJavaTechie(161,"Nishanth",36,"FeMale","HR",2005,6000));
        ej.add(new EmployJavaTechie(171,"Nishanth",37,"Male","Developer",2006,7000));
        ej.add(new EmployJavaTechie(181,"Nishanth",38,"Male","Human Resource",2007,8000));
        ej.add(new EmployJavaTechie(191,"Nishanth",39,"FeMale","Testing",2008,9000));
        ej.add(new EmployJavaTechie(101,"Nishanth",30,"Male","Developer",2009,10000));
        ej.add(new EmployJavaTechie(125,"Nishanth",24,"FeMale","HR",2010,11000));
        //ej.add(new EmployJavaTechie(140,"Nishanth",3,"FeMale","Accounts and finance",1999,9000));


        Map<String,Long> noOfPeoples= ej.stream()
                .collect(Collectors.groupingBy(EmployJavaTechie::getGender, Collectors.counting()));
        System.out.println("noOfPeoples : "+noOfPeoples);

        List<String> departmentNames = ej.stream().map(EmployJavaTechie::getDepartment).distinct().toList();
        System.out.println("departmentNames : "+departmentNames);

        Map<String,Double> avgAge = ej.stream().
                collect(Collectors.groupingBy(EmployJavaTechie::getGender,Collectors.averagingInt(EmployJavaTechie::getAge)));
        System.out.println("avgAge : "+avgAge);

        Optional<EmployJavaTechie> highestPaidEmployee= ej.stream()
                .collect(Collectors.maxBy(Comparator.comparing(EmployJavaTechie::getSalary)));
        System.out.println("highestPaidEmployee : "+highestPaidEmployee);

        List<String> empNameAfter2015 = ej.stream().filter(y-> y.getYoe()>2015)
                .map(EmployJavaTechie::getName).collect(Collectors.toList());
        System.out.println("empNameAfter2015 : "+empNameAfter2015);

        Map<String,Long> noOfEmpoyeesInEachDept = ej.stream()
                .collect(Collectors.groupingBy(EmployJavaTechie::getDepartment,Collectors.counting()));
        System.out.println("noOfEmpoyeesInEachDept : "+noOfEmpoyeesInEachDept);

        Map<String,Double> avgSalOfEachDepartmnt = ej.stream().collect(Collectors.groupingBy(EmployJavaTechie::getDepartment,
                Collectors.averagingInt(EmployJavaTechie::getSalary)));
        System.out.println("avgSalOfEachDepartmnt : "+avgSalOfEachDepartmnt);

        for(Map.Entry s : avgSalOfEachDepartmnt.entrySet())
        {
            System.out.println(s.getKey()+": "+s.getValue());
        }

        Optional<EmployJavaTechie> findOldEmp = ej.stream()
                .filter(d-> (d.getGender() == "Male") &&  (d.getDepartment() == "Developer"))
                .collect(Collectors.minBy(Comparator.comparing(EmployJavaTechie::getAge)));
        System.out.println("findOldEmp : "+findOldEmp);

        Optional<EmployJavaTechie> mostExperience = ej.stream().min(Comparator.comparingInt(EmployJavaTechie::getYoe));
        System.out.println("mostExperience : "+mostExperience);

        Map<String,Long> cntOfGendersInAccountsAndFinance = ej.stream().filter(af->af.getDepartment()=="Accounts and finance")
                .collect(Collectors.groupingBy(EmployJavaTechie::getGender,Collectors.counting()));
        System.out.println("cntOfGendersInAccountsAndFinance : "+cntOfGendersInAccountsAndFinance);

        Map<String,Double> avgsalaryOfMaleAndFemale = ej.stream().
                collect(Collectors.groupingBy(EmployJavaTechie::getGender,Collectors.averagingDouble(EmployJavaTechie::getSalary)));
        System.out.println("avgsalaryOfMaleAndFemale : "+avgsalaryOfMaleAndFemale);


        Map<String,List<EmployJavaTechie>> empNamesOfEachDep = ej.stream()
                .collect(Collectors.groupingBy(EmployJavaTechie::getDepartment));
        System.out.println("empNamesOfEachDep : "+empNamesOfEachDep);


        Optional<EmployJavaTechie> oldestEmployee = ej.stream().max(Comparator.comparing(EmployJavaTechie::getAge));
        System.out.println(oldestEmployee.get().getDepartment());
        System.out.println(oldestEmployee.get().getName());
        System.out.println(oldestEmployee.get().getAge());
*/
        List<Integer> i = Arrays.asList(1,2,2,3,4,3,4,5,6,7,8,9);
        List<String> s = Arrays.asList("Nisha","Nishanbthu","Priya","Nisha","Dharshini","PD");
        String sp= "Java is programming language, Java is versatile";
        List<Float> f = Arrays.asList(10.1f,10.2f);
        String[] cs = {"Alice","Bob","Anandh","baby","charlie","level"};
        System.out.println("Sum of each elements : "+i.stream().reduce((a,b)->a+b).get());
        System.out.println("Max of list : "+i.stream().mapToInt(Integer::intValue).max().getAsInt());
        System.out.println("String starts with N : "+s.stream().filter(S->S.startsWith("N")).count());
        System.out.println("To UpperCase : "+s.stream().map(To->To.toUpperCase()).toList());
        System.out.println("Even nos count : "+i.stream().filter(ev->ev%2==0).count());
        System.out.println("avgOfDouble : "+f.stream().mapToDouble(Float::doubleValue).average().getAsDouble());
        System.out.println("concateString : "+s.stream().collect(Collectors.joining()));
        System.out.println("frequencyOfWords : "+Arrays.stream(sp.split("\\s")).
                collect(Collectors.groupingBy(String::toLowerCase,Collectors.counting())));
        System.out.println("groupByFirstLetters : "+ Arrays.stream(cs)
                .collect(Collectors.groupingBy(csn->csn.charAt(0),Collectors.counting())));
        System.out.println(i.stream().collect(Collectors.groupingBy(esf->esf,Collectors.counting()))
                .entrySet().stream().filter(k->k.getValue()>1)
                .map(Map.Entry::getKey).toList());
        System.out.println("Palindrome : "+ Arrays.stream(cs).filter(p->p.equals(new StringBuffer(p).reverse().toString())).toList());

        }
    }
