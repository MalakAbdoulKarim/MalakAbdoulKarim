public class CalculatorWithMemory extends Calculator {
public void save() {
memory = accumulator;
}
public void recall() {
accumulator = memory;
}
public void clearMemory() {
memory = 0;
}
public double getMemory() {
return memory;
}
private double memory;
}
