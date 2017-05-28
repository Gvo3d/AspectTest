package services;

/**
 * Created by Gvozd on 28.05.2017.
 */

public class CustomerService {
    private String name;
    private String url;

    public void setName(String name) {
        this.name = name;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void printName() {
        System.out.println("Customer name : " + this.name);
    }

    public String printURL() {
        System.out.println("Customer website : " + this.url);
        return url;
    }

    public void printThrowException() {
        throw new IllegalArgumentException();
    }

}