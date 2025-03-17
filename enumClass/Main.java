package enumClass;

public class Main {
        public static void main(String[] args) {

            Colour c1 = Colour.RED; // 👈 Geting one constant value in a colour variable

            System.out.println("RED Enum name : "+ c1.name()); //👈 Print the Constant term
            System.out.println("Red Enum Value : "+ c1.getValue()); // 👈 Print the Constant Value by getValue()

            // 👇 Print the whole Values ->  Using enum_name.values()
            for(Colour colour : Colour.values())
            {
                System.out.println("Enum value : "+colour.getValue());
            }
    }
}