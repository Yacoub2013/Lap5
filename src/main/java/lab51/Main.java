package lab51;



import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;


public class Main {
    public static void main(String[] args) {
        PhoneNumber[] num = new PhoneNumber[5];
        num[0] = new PhoneNumber( "965", "7552402");
        num[1] = new PhoneNumber( "921", "5601253");
        num[2] = new PhoneNumber( "7905", "212668");
        num[3] = new PhoneNumber( "981", "7089913");
        num[4] = new PhoneNumber( "8922", "492214");
        for (int i = 0; i < 5; i++) {
            System.out.println(num[i]);
        }
        System.out.println();


        PhoneNumber num1 = new PhoneNumber("Basil", "965", "7552402");
        PhoneNumber num2 = new PhoneNumber("Petr", "921", "5601253");
        PhoneNumber num3 = new PhoneNumber("Cathrine", "7905", "212668");
        PhoneNumber num4 = new PhoneNumber("Masha", "981", "7089913");
        PhoneNumber num5 = new PhoneNumber("Stepan", "8922", "492214"); // 5 и 6 дублируют друг друга
        PhoneNumber num6 = new PhoneNumber("Stepan", "8922", "492214");
        PhoneNumber num7 = new PhoneNumber("Ivan", "906", "2492241");

//            ассоциативный массив
        Map<String, PhoneNumber> person = new HashMap<>();
        person.put(num1.getName(), num1);
        person.put(num2.getName(), num2);
        person.put(num3.getName(), num3);
        person.put(num4.getName(), num4);
        person.put(num5.getName(), num5);
        person.put(num6.getName(), num6);
        person.put(num7.getName(), num7);
        person.forEach((getName, value) -> System.out.println(getName+":"+value));
        System.out.println();


//        Множества

        Set<PhoneNumber> phoneNum = new HashSet<>();
        phoneNum.add(num1);
        phoneNum.add(num2);
        phoneNum.add(num3);
        phoneNum.add(num4);
        phoneNum.add(num5);
        phoneNum.add(num6);
        phoneNum.add(num7);
        phoneNum.forEach( PhoneNumber -> System.out.println(PhoneNumber));
    }
    }

