package by.tr.mod10;

import java.util.Objects;

public class Customer {
    private int id;
    private String name;
    private String surname;
    private String middleName;
    private String address;
    private int accountNumber;
    private int creditCardNumber;
    public Customer( int _id, String _name, String _surname, String _middleName, String _address, int _accountNumber, int _creditCardNumber){
        id = _id;
        name = _name;
        surname = _surname;
        middleName = _middleName;
        address = _address;
        accountNumber = _accountNumber;
        creditCardNumber = _creditCardNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return id == customer.id &&
                accountNumber == customer.accountNumber &&
                creditCardNumber == customer.creditCardNumber &&
                Objects.equals(name, customer.name) &&
                Objects.equals(surname, customer.surname) &&
                Objects.equals(middleName, customer.middleName) &&
                Objects.equals(address, customer.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, surname, middleName, address, accountNumber, creditCardNumber);
    }
}
