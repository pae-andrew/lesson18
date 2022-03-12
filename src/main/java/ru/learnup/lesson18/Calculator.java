package ru.learnup.lesson18;

public class Calculator {

    MultiplyProcessor multiplyProcessor;
    SumProcessor sumProcessor;
    DivideProcessor divideProcessor;
    SubtractProcessor subtractProcessor;

    public Calculator (MultiplyProcessor multiplyProcessor, SumProcessor sumProcessor, DivideProcessor divideProcessor, SubtractProcessor subtractProcessor) {
        this.sumProcessor = sumProcessor;
        this.subtractProcessor = subtractProcessor;
        this.divideProcessor = divideProcessor;
        this.multiplyProcessor = multiplyProcessor;
    }

    public int sum(int arg1, int arg2) {
        return sumProcessor.process(arg1, arg2);
    }

    public int subtract(int arg1, int arg2) {
        return subtractProcessor.process(arg1, arg2);
    }

    public int divide(int arg1, int arg2) {
        return divideProcessor.process(arg1, arg2);
    }

    public int multiply(int arg1, int arg2) {
        return multiplyProcessor.process(arg1, arg2);
    }
}
