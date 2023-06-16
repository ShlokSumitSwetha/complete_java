package consume;

public class Main {



public static void main(String[] args) { 

Person person1 = new Person("Sumit","Ksherasagar", 9.5);

person1 = PredicateConsumerDemo.updateStudentFee(person1,Person -> Person.grade > 8.5,Person -> Person.feeDiscount = 30.0);

person1.printFee();

 

Person student2 = new Person("Sumit","Ksherasagar", 8.0);

student2 = PredicateConsumerDemo.updateStudentFee(student2,student -> student.grade >= 8,student -> student.feeDiscount = 20.0);

student2.printFee();

}


}