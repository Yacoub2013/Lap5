package lab51;


import java.util.Objects;

public class PhoneNumber {
    private String cod;
    private String num;
    private String name;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public PhoneNumber(String name,String cod, String num) {
        this.cod = cod;
        this.num = num;
        this.name=name;
    }

    public PhoneNumber(String cod, String num) {
        this.cod = cod;
        this.num = num;
    }

    @Override
    public String toString() {
        if (cod.length() == 3 && num.length() == 7) {
            StringBuilder sb = new StringBuilder();
            sb.append(num.substring(0, 3)).append("-");
            sb.append(num.substring(3, 5)).append("-");
            sb.append(num.substring(5, 7));
            return "(" + cod + ")" + sb.toString();
        } else if (cod.length() == 4 && num.length() == 6) {
            StringBuilder sb = new StringBuilder();
            sb.append(num.substring(0, 2)).append("-");
            sb.append(num.substring(2, 4)).append("-");
            sb.append(num.substring(4, 6));
            return "(" + cod + ")" + sb.toString();
        }

        return "Неверный формат кода";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PhoneNumber that = (PhoneNumber) o;
        return Objects.equals(cod, that.cod) && Objects.equals(num, that.num) && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cod, num, name);
    }
}


