package controller;

/* Using the Singleton Pattern */
public class SerialNumberGenerator {
    private static SerialNumberGenerator generate;
    private String modelNumber;
    private int start;

    public static synchronized SerialNumberGenerator getInstance() {
        if(generate == null) {
            generate = new SerialNumberGenerator();
        }
        return generate;
    }
    private SerialNumberGenerator() {}

    public synchronized void startGeneration(String model, int startNumber) {
        modelNumber = model;
        start = startNumber;
    }

    public synchronized String getNextSerial() {
        return modelNumber +  (++start);
    }

    public synchronized int getRecentNumber() {return start;}

}
