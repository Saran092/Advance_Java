package enumClass;
enum Colour{ // 👈 When you are try to create a enum class use KEYWORD enum
    RED("red"),GREEN("green"),BLUE("blue"); // 👈 RED("red") --> RED -> what we see "red" -> What used by Code
    // ☝️ We can use Abrivation for this to WHO("World Health Organisation")       ☝️ Constant         ☝️ Value 
    // When we want to use the enum constant we can use Colour.RED
    // When we want to get the value we use getValue();
    String value;
    Colour(String value)
    {
        this.value =value;
    }

    public String getValue()
    {
        return value;
    }
}
