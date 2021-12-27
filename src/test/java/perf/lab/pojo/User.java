package perf.lab.pojo;

import java.util.List;

public class User {
    public String email;
    public String name;
    public List<Integer> tasks;
    public List<Integer> companies;
    public String hobby;
    public String adres;
    public String name1;
    public String phone;

    public User(String email, String name, List<Integer> tasks, List<Integer> companies, String hobby, String adres, String name1, String phone) {
        this.email = email;
        this.name = name;
        this.tasks = tasks;
        this.companies = companies;
        this.hobby = hobby;
        this.adres = adres;
        this.name1 = name1;
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Integer> getTasks() {
        return tasks;
    }

    public void setTasks(List<Integer> tasks) {
        this.tasks = tasks;
    }

    public List<Integer> getCompanies() {
        return companies;
    }

    public void setCompanies(List<Integer> companies) {
        this.companies = companies;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public String getName1() {
        return name1;
    }

    public void setName1(String name1) {
        this.name1 = name1;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
