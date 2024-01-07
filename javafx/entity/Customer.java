package javafx.entity;

import java.time.LocalDate;

public class Customer {
    private Integer id ;
    private String fullName;
    private String carName;
    private LocalDate dob;
    private LocalDate dateStart;
    private String address;
    private String day;

    public Customer(Integer id,String fullName, String carName, LocalDate dob, LocalDate dateStart, String address, String day) {
        this.id = id;
        this.fullName = fullName;
        this.carName = carName;
        this.dob = dob;
        this.dateStart = dateStart;
        this.address = address;
        this.day = day;
    }

    public Customer(Integer id, String fullname, LocalDate dob, String carName, LocalDate dateStart, String day, String address) {
    }

    public Customer(String fullname, String carName, LocalDate dob, LocalDate dateStart, String address, String day) {
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public LocalDate getDateStart() {
        return dateStart;
    }

    public void setDateStart(LocalDate dateStart) {
        this.dateStart = dateStart;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }
    public String toString(){
        return fullName+"\n"+carName+"\n"+dob+"\n"+dateStart+"\n"+address+"\n"+day;
    }
}