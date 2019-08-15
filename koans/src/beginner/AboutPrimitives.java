package beginner;

import com.sandwich.koan.Koan;

import static com.sandwich.koan.constant.KoanConstants.__;
import static com.sandwich.util.Assert.assertEquals;

public class AboutPrimitives {

    @Koan
    public void wholeNumbersAreOfTypeInt() {
        assertEquals(getType(1), int.class); // hint: int.class
    }

    @Koan
    public void primitivesOfTypeIntHaveAnObjectTypeInteger() {
        Object number = 1;
        assertEquals(getType(number), getType(number));

        // Primitives can be automatically changed into their object type via a process called auto-boxing
        // We will explore this in more detail in intermediate.AboutAutoboxing
    }

    @Koan
    public void integersHaveAFairlyLargeRange() {
        assertEquals(Integer.MIN_VALUE, Integer.MIN_VALUE);
        assertEquals(Integer.MAX_VALUE, Integer.MAX_VALUE);
    }

    @Koan
    public void integerSize() {
        assertEquals(Integer.SIZE, 32);  // This is the amount of bits used to store an int
    }

    @Koan
    public void wholeNumbersCanAlsoBeOfTypeLong() {
        assertEquals(getType(1L), getType(1L));
    }

    @Koan
    public void primitivesOfTypeLongHaveAnObjectTypeLong() {
        Object number = 1L;
        assertEquals(getType(number), getType(number));
    }

    @Koan
    public void longsHaveALargerRangeThanInts() {
        assertEquals(Long.MIN_VALUE, Long.MIN_VALUE);
        assertEquals(Long.MAX_VALUE, Long.MAX_VALUE);
    }

    @Koan
    public void longSize() {
        assertEquals(Long.SIZE, Long.SIZE);
    }

    @Koan
    public void wholeNumbersCanAlsoBeOfTypeShort() {
        assertEquals(getType((short) 1), getType((short) 1)); // The '(short)' is called an explicit cast - to type 'short'
    }

    @Koan
    public void primitivesOfTypeShortHaveAnObjectTypeShort() {
        Object number = (short) 1;
        assertEquals(getType(number), getType(number));
    }

    @Koan
    public void shortsHaveASmallerRangeThanInts() {
        assertEquals(Short.MIN_VALUE, Short.MIN_VALUE);  // hint: You'll need an explicit cast
        assertEquals(Short.MAX_VALUE, Short.MAX_VALUE);
    }

    @Koan
    public void shortSize() {
        assertEquals(Short.SIZE, Short.SIZE);
    }

    @Koan
    public void wholeNumbersCanAlsoBeOfTypeByte() {
        assertEquals(getType((byte) 1), getType((byte) 1));
    }

    @Koan
    public void primitivesOfTypeByteHaveAnObjectTypeByte() {
        Object number = (byte) 1;
        assertEquals(getType(number), getType(number));
    }

    @Koan
    public void bytesHaveASmallerRangeThanShorts() {
        assertEquals(Byte.MIN_VALUE, Byte.MIN_VALUE);
        assertEquals(Byte.MAX_VALUE, Byte.MAX_VALUE);

        // Why would you use short or byte considering that you need to do explicit casts?
    }

    @Koan
    public void byteSize() {
        assertEquals(Byte.SIZE, Byte.SIZE);
    }

    @Koan
    public void wholeNumbersCanAlsoBeOfTypeChar() {
        assertEquals(getType((char) 1), getType((char) 1));
    }

    @Koan
    public void singleCharactersAreOfTypeChar() {
        assertEquals(getType('a'), getType('a'));
    }

    @Koan
    public void primitivesOfTypeCharHaveAnObjectTypeCharacter() {
        Object number = (char) 1;
        assertEquals(getType(number), getType(number));
    }

    @Koan
    public void charsCanOnlyBePositive() {
        assertEquals((int) Character.MIN_VALUE, 0);
        assertEquals((int) Character.MAX_VALUE, (int) Character.MAX_VALUE);

        // Why did we cast MIN_VALUE and MAX_VALUE to int? Try it without the cast.
    }

    @Koan
    public void charSize() {
        assertEquals(Character.SIZE, 16);
    }

    @Koan
    public void decimalNumbersAreOfTypeDouble() {
        assertEquals(getType(1.0), getType(1.0));
    }

    @Koan
    public void primitivesOfTypeDoubleCanBeDeclaredWithoutTheDecimalPoint() {
        assertEquals(getType(1d), getType(1d));
    }

    @Koan
    public void primitivesOfTypeDoubleCanBeDeclaredWithExponents() {
        assertEquals(getType(1e3), getType(1e3));
        assertEquals(1.0e3, 1.0e3);
        assertEquals(1E3, 1.0e3);
    }

    @Koan
    public void primitivesOfTypeDoubleHaveAnObjectTypeDouble() {
        Object number = 1.0;
        assertEquals(getType(number), getType(number));
    }

    @Koan
    public void doublesHaveALargeRange() {
        assertEquals(Double.MIN_VALUE, Double.MIN_VALUE);
        assertEquals(Double.MAX_VALUE, Double.MAX_VALUE);
    }

    @Koan
    public void doubleSize() {
        assertEquals(Double.SIZE, Double.SIZE);
    }

    @Koan
    public void decimalNumbersCanAlsoBeOfTypeFloat() {
        assertEquals(getType(1f), getType(1f));
    }

    @Koan
    public void primitivesOfTypeFloatCanBeDeclaredWithExponents() {
        assertEquals(getType(1e3f), getType(1e3f));
        assertEquals(1.0e3f, 1.0e3f);
        assertEquals(1E3f, 1E3f);
    }

    @Koan
    public void primitivesOfTypeFloatHaveAnObjectTypeFloat() {
        Object number = 1f;
        assertEquals(getType(number), getType(number));
    }

    @Koan
    public void floatsHaveASmallerRangeThanDoubles() {
        assertEquals(Float.MIN_VALUE, Float.MIN_VALUE);
        assertEquals(Float.MAX_VALUE, Float.MAX_VALUE);
    }

    @Koan
    public void floatSize() {
        assertEquals(Float.SIZE, Float.SIZE);
    }

    private Class<?> getType(int value) {
        return int.class;
    }

    private Class<?> getType(long value) {
        return long.class;
    }

    private Class<?> getType(float value) {
        return float.class;
    }

    private Class<?> getType(double value) {
        return double.class;
    }

    private Class<?> getType(byte value) {
        return byte.class;
    }

    private Class<?> getType(char value) {
        return char.class;
    }

    private Class<?> getType(short value) {
        return short.class;
    }

    private Class<?> getType(Object value) {
        return value.getClass();
    }

}
