package pract12;

import java.util.StringTokenizer;

public class Address {
    private String country, region, city, street, house, block, flat;

    public Address(String address, String regex) throws Exception {
        String[] words = address.split(regex);
        if (words.length == 7) {
            country = words[0];
            region = words[1];
            city = words[2];
            street = words[3];
            house = words[4];
            block = words[5];
            flat = words[6];
        }
        else throw new Exception("Error!");
    }

    public Address(String address) throws Exception {
        StringTokenizer st = new StringTokenizer(address, ",.;-");
        if (st.countTokens() == 7) {
            country = st.nextToken();
            region = st.nextToken();
            city = st.nextToken();
            street = st.nextToken();
            house = st.nextToken();
            block = st.nextToken();
            flat = st.nextToken();
        } else throw new Exception("Error!");
    }

    @Override
    public String toString() {
        return country + ", " + region + ", " + city + ", " + street + ", " + house + ", " + block + ", " + flat;
    }

}