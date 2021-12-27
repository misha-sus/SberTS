package perf.lab.pojo;

import java.util.List;

public class UserResponse {
    public String email;
    public String name;
    public String name1;
    public String hobby;
    public String surname1;
    public String fathername1;
    public String cat;
    public String dog;
    public String parrot;
    public String cavy;
    public String hamster;
    public String squirrel;
    public String phone;
    public String adres;
    public String gender;
    public DateStart date_start;
    public DateUpdated date_updated;
    public Birthday birthday;
    public List<String> role;
    public DateRegister date_register;
    public String date;
    public String by_user;
    public List<Company> companies;
    public List<Task> tasks;

    public static class DateUpdated{
        public int sec;
        public int usec;
    }

    public static class DateStart{
        public int sec;
        public int usec;
    }

    public static class DateRegister{
        public int sec;
        public int usec;
    }

    public static class Company{
        public String name;
        public int id;
    }

    public static class Birthday{
        public int sec;
        public int usec;
    }

    public static class Task{
        public String name;
        public int id;
    }
}








