package Object.Exercise2;

import java.util.Objects;

public class Address {
    private String city;
    private String street;
    private String postalCode;
    private String homeNo;
    private String flatNo;

    public Address(String city, String street, String postalCode, String homeNo, String flatNo) {
        this.city = city;
        this.street = street;
        this.postalCode = postalCode;
        this.homeNo = homeNo;
        this.flatNo = flatNo;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getHomeNo() {
        return homeNo;
    }

    public void setHomeNo(String homeNo) {
        this.homeNo = homeNo;
    }

    public String getFlatNo() {
        return flatNo;
    }

    public void setFlatNo(String flatNo) {
        this.flatNo = flatNo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Address address = (Address) o;
        return Objects.equals(getCity(), address.getCity()) && Objects.equals(getStreet(), address.getStreet()) && Objects.equals(getPostalCode(), address.getPostalCode()) && Objects.equals(getHomeNo(), address.getHomeNo()) && Objects.equals(getFlatNo(), address.getFlatNo());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCity(), getStreet(), getPostalCode(), getHomeNo(), getFlatNo());
    }
}
