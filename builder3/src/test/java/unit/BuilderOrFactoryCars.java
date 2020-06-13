package unit;

import builderOrFactory.cars.Car;
import builderOrFactory.cars.CarType;
import builderOrFactory.cars.builder.BmwCar;
import builderOrFactory.cars.builder.BmwCarBuilder;
import builderOrFactory.cars.factory.SimpleBmwFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BuilderOrFactoryCars {

    private SimpleBmwFactory SimpleBmwFactory;
    private BmwCarBuilder BmwCarBuilder;

    @Before
    public void prepare_factory_and_builder() {
        this.SimpleBmwFactory = SimpleBmwFactory.getInstance();
        this.BmwCarBuilder = new BmwCarBuilder();
    }

    @Test
    public void create_kombi_car_with_simple_factory() {

        Car kombiBmwCar = SimpleBmwFactory.createCar(CarType.KOMBI);

        System.out.println(kombiBmwCar.toString());

        Assert.assertEquals("BMW", kombiBmwCar.name);
        Assert.assertEquals("F11", kombiBmwCar.model);
        Assert.assertEquals(2018, kombiBmwCar.productionYear);
        Assert.assertEquals("automatic", kombiBmwCar.gearBoxType);
    }

    @Test
    public void create_sedan_car_with_simple_factory() {

        Car sedanBmwCar = SimpleBmwFactory.createCar(CarType.SEDAN);

        System.out.println(sedanBmwCar.toString());

        Assert.assertEquals("BMW", sedanBmwCar.name);
        Assert.assertEquals("F10", sedanBmwCar.model);
        Assert.assertEquals(2017, sedanBmwCar.productionYear);
        Assert.assertEquals("automatic", sedanBmwCar.gearBoxType);
    }

    @Test
    public void create_suv_car_with_simple_factory() {

        Car suvBmwCar = SimpleBmwFactory.createCar(CarType.SUV);

        System.out.println(suvBmwCar.toString());

        Assert.assertEquals("BMW", suvBmwCar.name);
        Assert.assertEquals("X5", suvBmwCar.model);
        Assert.assertEquals(2019, suvBmwCar.productionYear);
        Assert.assertEquals("automatic", suvBmwCar.gearBoxType);
    }

    @Test
    public void build_kombi_car_with_builder() {
        BmwCar kombiBmwCar = BmwCarBuilder
                .withName("BMW")
                .withModel("F11")
                .withProductionYear(2018)
                .withGearboxType("automatic")
                .buildBmwCar();

        System.out.println(kombiBmwCar.toString());

        Assert.assertEquals("BMW", kombiBmwCar.name);
        Assert.assertEquals("F11", kombiBmwCar.model);
        Assert.assertEquals(2018, kombiBmwCar.productionYear);
        Assert.assertEquals("automatic", kombiBmwCar.gearBoxType);

    }

    @Test
    public void build_sedan_car_with_builder() {
        BmwCar sedanBmwCar = BmwCarBuilder
                .withName("BMW")
                .withModel("F10")
                .withProductionYear(2017)
                .withGearboxType("automatic")
                .buildBmwCar();

        System.out.println(sedanBmwCar.toString());

        Assert.assertEquals("BMW", sedanBmwCar.name);
        Assert.assertEquals("F10", sedanBmwCar.model);
        Assert.assertEquals(2017, sedanBmwCar.productionYear);
        Assert.assertEquals("automatic", sedanBmwCar.gearBoxType);
    }

    @Test
    public void build_suv_car_with_builder() {
        BmwCar suvBmwCar = BmwCarBuilder
                .withName("BMW")
                .withModel("X5")
                .withProductionYear(2019)
                .withGearboxType("automatic")
                .buildBmwCar();

        System.out.println(suvBmwCar.toString());

        Assert.assertEquals("BMW", suvBmwCar.name);
        Assert.assertEquals("X5", suvBmwCar.model);
        Assert.assertEquals(2019, suvBmwCar.productionYear);
        Assert.assertEquals("automatic", suvBmwCar.gearBoxType);

    }

}
