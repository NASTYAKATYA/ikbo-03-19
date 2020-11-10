package pract12;

public class Phone {
    private String string;
    public Phone(String phone)
    {
        string = format(phone);
    }
    public String format(String phone)
    {
        String number;
        String code;
        number = phone.substring(phone.length()-10,phone.length()-7) + "-" + phone.substring(phone.length()-7,phone.length()-4) + "-" + phone.substring(phone.length()-4,phone.length());
        code = phone.substring(0,phone.length()-10);
        if (code.charAt(0) == '8')
            code = "+7 ";
        return code + number;
    }
    @Override
    public String toString() {
        return string;
    }
}
