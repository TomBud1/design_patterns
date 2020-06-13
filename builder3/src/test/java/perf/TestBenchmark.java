package perf;

import builderOrFactory.cars.Car;
import builderOrFactory.cars.CarType;
import builderOrFactory.cars.builder.BmwCar;
import builderOrFactory.cars.builder.BmwCarBuilder;
import builderOrFactory.cars.factory.SimpleBmwFactory;

import java.util.concurrent.TimeUnit;
import org.junit.Test;
import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.options.*;

@State(Scope.Benchmark)
public class TestBenchmark {
    private SimpleBmwFactory simpleBmwFactory;
    private BmwCarBuilder bmwCarBuilder;

    @Test public void
    launchBenchmark() throws Exception {

        Options opt = new OptionsBuilder()
                .include(this.getClass().getName() + ".*")
                .mode (Mode.AverageTime)
                .timeUnit(TimeUnit.MICROSECONDS)
                .warmupTime(TimeValue.seconds(1))
                .warmupIterations(5)
                .measurementTime(TimeValue.seconds(1))
                .measurementIterations(10)
                .threads(2)
                .forks(1)
                .shouldFailOnError(true)
                .shouldDoGC(true)
                .build();

        new Runner(opt).run();
    }

    @Benchmark
    @BenchmarkMode(Mode.AverageTime)
    public void create_sedan_car_with_simple_factory() {

        this.simpleBmwFactory = new SimpleBmwFactory();

        Car suvAudiCar = simpleBmwFactory.createCar(CarType.SEDAN);

        suvAudiCar.toString();
    }

    @Benchmark
    @BenchmarkMode(Mode.AverageTime)
    public void build_sedan_car_with_builder() {
        this.bmwCarBuilder = new BmwCarBuilder();
        BmwCar sedanBmwCar = bmwCarBuilder
                .withName("BMW")
                .withModel("F10")
                .withProductionYear(2017)
                .withGearboxType("automatic")
                .buildBmwCar();

        sedanBmwCar.toString();

    }
}
