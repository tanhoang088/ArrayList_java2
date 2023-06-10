import java.util.ArrayList;
import java.util.Scanner;

public class MainStudent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student student = new Student();
        ArrayList<Student> studentList = new ArrayList<>();
        int inputNumber = 0;
        while (inputNumber != 4) {
            printMenu();
            inputNumber = sc.nextInt();
            switch (inputNumber) {
                case 1: {
                    student = new Student();
                    System.out.print("Input ID: ");
                    student.setId(sc.next());
                    sc.nextLine();
                    System.out.print("Input Name: ");
                    student.setName(sc.next());
                    sc.nextLine();
                    System.out.print("Input Age: ");
                    student.setAge(sc.nextInt());
                    sc.nextLine();
                    break;
                }
                case 2: {
                    System.out.printf("Student: %s | %s | %d \n", student.getId(), student.getName(), student.getAge());
                    System.out.println("1. Save this Student to the list: ");
                    System.out.println("2. Cancel.");
                    int status = 0;
                    while ((status != 1) && (status != 2)) {
                        System.out.print("\nChoose: ");
                        status = sc.nextInt();
                    }

                    switch (status) {
                        case 1: {
                            studentList.add(student);
                            System.out.println("Student saved!");
                            break;
                        }
                        case 2: {
                            student = new Student();
                            break;
                        }
                    }
                    break;
                }
                case 3: {
                    if (studentList.isEmpty()) System.out.println("Empty list!");
                    else {
                        System.out.println("List Student: ");
                        for (int i = 0; i < studentList.size(); i++) {
                            System.out.printf("%d: %s | %s | %d \n", i + 1, studentList.get(i).getId(), studentList.get(i).getName(), studentList.get(i).getAge());
                        }
                    }
                    break;
                }
                case 4:
                    System.exit(0);
                default:
                    System.out.print("Invalid Input! Choose again: ");
            }
        }

    }

    public static void printMenu() {
        System.out.println("\nMENU: ");
        System.out.println("1. Input Student: ");
        System.out.println("2. Display detail of a Student: ");
        System.out.println("3. Show all list Student: ");
        System.out.println("4. Exit program: ");
        System.out.print("\nInput your choice: ");
    }
}
