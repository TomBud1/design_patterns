import deepPrototype.Computer;
import deepPrototype.ComputerManager;
import deepPrototype.Processor;
import deepPrototype.Ram;
import deepPrototype.enums.ComputerType;
import deepPrototype.enums.ProcessorType;
import deepPrototype.enums.RamType;
import org.junit.Before;
import org.junit.Test;

public class DeepPrototypeTest {

    ComputerManager computerManager;

    @Before
    public void createComputerManager() {
        this.computerManager = new ComputerManager();
    }

    @Test
    public void createDeepPrototype() {

        Computer computer = computerManager.createComputer();

        Computer computerCopy = computer.clone();
        Computer computerCopy2 = computer.clone();

        computer.setScreenSize(13);

        computerCopy.setComputerType(ComputerType.GAMING);
        computerCopy.setProcessor(new Processor(ProcessorType.i7, 2.4));

        computerCopy2.setRam(new Ram(8, RamType.DDR3));

        System.out.println(computer.toString());
        System.out.println(computerCopy.toString());
        System.out.println(computerCopy2.toString());

    }
}
