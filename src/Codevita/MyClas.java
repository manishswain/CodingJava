package Codevita;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.util.stream.Stream;

public class MyClas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Engine engine[] = new Engine[4];
        for (int i = 0; i < 4; i++) {

            int engineId = sc.nextInt();
            String engineName = sc.next();
            String engineType = sc.next();
            double enginePrice = sc.nextDouble();

            engine[i] = new Engine(engineId, engineName, engineType, enginePrice);
        }
        String engType = sc.next();
        String engName = sc.next();

        int average = findAvgEnginePriceByType(engine, engType);
        if (average > 0)
            System.out.println(average);
        else
            System.out.println("There are no engine with given type");

        Engine[] ansEngine = searchEngineByName(engine, engName);
        if (ansEngine != null) {
            for (Engine eng : ansEngine) {
                System.out.println(eng.getEngineId());
            }
        } else
            System.out.println("There are no engine with the given name");
        sc.close();

    }

    private static int findAvgEnginePriceByType(Engine[] engine, String engType) {
        Stream<Engine> stream = Arrays.stream(engine);
        long no = stream.filter(x -> x.getEngineType().equals(engType)).count();
        stream = Arrays.stream(engine);
        Double sum = stream.filter(x -> x.getEngineType().equals(engType)).map(x -> x.getEnginePrice())
                .mapToDouble(x -> x).average().getAsDouble();
        return (int)(sum / no);
    }

    private static Engine[] searchEngineByName(Engine[] engine, String engName) {
        Stream<Engine> stream = Arrays.stream(engine);
        Engine[] ansEngine = stream.filter(x -> x.getEngineName().equals(engName))
                .sorted(Comparator.comparing(Engine::getEngineId)).toArray(Engine[]::new);
        if (ansEngine.length != 0)
            return ansEngine;
        else
            return null;
    }
    
}

class Engine {
    private int engineId;
    private String engineName;
    private String engineType;
    private double enginePrice;

    public Engine(int engineId, String engineName, String engineType, double enginePrice) {
        this.engineId = engineId;
        this.engineName = engineName;
        this.engineType = engineType;
        this.enginePrice = enginePrice;
    }

    public int getEngineId() {
        return engineId;
    }

    public void setEngineId(int engineId) {
        this.engineId = engineId;
    }

    public String getEngineName() {
        return engineName;
    }

    public void setEngineName(String engineName) {
        this.engineName = engineName;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public double getEnginePrice() {
        return enginePrice;
    }

    public void setEnginePrice(double enginePrice) {
        this.enginePrice = enginePrice;
    }
}
