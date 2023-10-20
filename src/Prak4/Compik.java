package Prak4;

public class Compik
{
    enum ComputerBrand
    {
        ACER,
        HP,
        DELL,
        ASUS,
        LENOVO
    }

    static class Processor
    {
        private String brand;
        private String model;
        private double clockSpeed;

        public Processor(String brand, String model, double clockSpeed)
        {
            this.brand = brand;
            this.model = model;
            this.clockSpeed = clockSpeed;
        }

        @Override
        public String toString()
        {
            return brand + " " + model + " (" + clockSpeed + " GHz)";
        }
    }

    static class Memory
    {
        private int capacity;
        private String memoryType;

        public Memory(int capacity, String memoryType)
        {
            this.capacity = capacity;
            this.memoryType = memoryType;
        }

        @Override
        public String toString()
        {
            return capacity + " GB " + memoryType + " RAM";
        }
    }

    static class Monitor
    {
        private String brand;
        private double size;

        public Monitor(String brand, double size)
        {
            this.brand = brand;
            this.size = size;
        }

        @Override
        public String toString()
        {
            return brand + " " + size + " inch monitor";
        }
    }

    static class Computer
    {
        private ComputerBrand brand;
        private Processor processor;
        private Memory memory;
        private Monitor monitor;

        public Computer(ComputerBrand brand, Processor processor, Memory memory, Monitor monitor)
        {
            this.brand = brand;
            this.processor = processor;
            this.memory = memory;
            this.monitor = monitor;
        }

        @Override
        public String toString()
        {
            return "Computer: " + brand + "\nProcessor: " + processor + "\nMemory: " + memory + "\nMonitor: " + monitor;
        }
    }

    public static void main(String[] args)
    {
        Processor processor = new Processor("Intel", "Core i5", 3.7);
        Memory memory = new Memory(32, "DDR4");
        Monitor monitor = new Monitor("ACER", 27);
        Computer myComputer = new Computer(ComputerBrand.ACER, processor, memory, monitor);

        System.out.println(myComputer);
    }
}