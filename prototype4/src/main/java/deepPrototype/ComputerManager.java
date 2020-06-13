package deepPrototype;

import deepPrototype.enums.ComputerType;
import deepPrototype.enums.ProcessorType;
import deepPrototype.enums.RamType;

public class ComputerManager {

    public Computer createComputer() {
        Ram ram = new Ram(16, RamType.DDR2);
        Processor processor = new Processor(ProcessorType.i5, 2.4);
        return new Computer(
                ComputerType.ULTRABOOK,
                ram,
                processor,
                15
        );
    }

}
