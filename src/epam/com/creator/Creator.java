package epam.com.creator;
import epam.com.coffee.*;
import java.util.Random;
/**
 * Created by Юыќур on 27.05.2015.
 */
public class Creator {
    public enum NameCoffee{
        ESPRESSO,
        MACCHIATO,
        LATTE,
        CAPPUCCINO,
        MOCHA,
        FRAPPE,
        ICED,
        BICERIN
    }
    public enum NameAdditive{
        CINNAMON,
        CHOCOLATE,
        MILK,
        NUTMEG,
        WHIPPED_CREAM
    }
    public enum NameAdditiveSyrup{
        GRENADINE,
        CARAMEL_SYRUP,
        VANILLA_SYRUP,
    }

    Random numRandom = new Random();

    private String randomNameCoffee() {
        switch (new Random().nextInt(8)) {
            case 0:
                return String.valueOf(NameCoffee.CAPPUCCINO);
            case 1:
                return String.valueOf(NameCoffee.MACCHIATO);
            case 2:
                return String.valueOf(NameCoffee.LATTE);
            case 3:
                return String.valueOf(NameCoffee.ESPRESSO);
            case 4:
                return String.valueOf(NameCoffee.BICERIN);
            case 5:
                return String.valueOf(NameCoffee.MOCHA);
            case 6:
                return String.valueOf(NameCoffee.FRAPPE);
            case 7:
                return String.valueOf(NameCoffee.ICED);
            default:
                throw new IllegalArgumentException();
        }
            }
    private String randomNameAdditive(){
        switch (new Random().nextInt(5)){
            case 0:
                return String.valueOf(NameAdditive.CHOCOLATE);
            case 1:
                return String.valueOf(NameAdditive.CINNAMON);
            case 2:
                return String.valueOf(NameAdditive.MILK);
            case 3:
                return String.valueOf(NameAdditive.NUTMEG);
            case 4:
                return String.valueOf(NameAdditive.WHIPPED_CREAM);
            default:
                throw new IllegalArgumentException();
        }
    }
    private String randomNameAdditiveSyrup(){
        switch (new Random().nextInt(3)){
            case 0:
                return String.valueOf(NameAdditiveSyrup.CARAMEL_SYRUP);
            case 1:
                return String.valueOf(NameAdditiveSyrup.GRENADINE);
            case 2:
                return String.valueOf(NameAdditiveSyrup.VANILLA_SYRUP);
            default:
                throw new IllegalArgumentException();
        }
    }
}
