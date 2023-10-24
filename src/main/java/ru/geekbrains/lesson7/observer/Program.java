package ru.geekbrains.lesson7.observer;

public class Program {

    public static void main(String[] args) {
        Publisher jobAgency = new JobAgency();
        Company google = new Company("Google", jobAgency, 120000, new Vacancy("Internship"));
        Company yandex = new Company("Yandex", jobAgency, 95000, new Vacancy("Recruiter"));
        Company geekBrains = new Company("GeekBrains", jobAgency, 98000, new Vacancy("Director"));

        Student student1 = new Student("Student #1","Internship");
        Student student2 = new Student("Student #1", "President");
        Master master1 = new Master("Master #1", "Developer");
        Master master2 = new Master("Master #2", "Teamlead");
        MiddleDeveloper developer1 = new MiddleDeveloper("Middle #1", "Backend developer");

        jobAgency.registerObserver(student1);
        jobAgency.registerObserver(master1);
        jobAgency.registerObserver(master2);
        jobAgency.registerObserver(student2);
        jobAgency.registerObserver(developer1);

        for (int i = 0; i < 3; i++){
            google.needEmployee();
            yandex.needEmployee();
            geekBrains.needEmployee();
        }
    }

}
