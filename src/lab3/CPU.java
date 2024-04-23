package lab3;

class CPU {
    String name;
    int RAM;
    double frequency;

    CPU() {

    }

    CPU(String name, int RAM, double frequency) {
        this.name = name;
        this.RAM = RAM;
        this.frequency = frequency;
    }

    String getCPUData() {
        return name + RAM + frequency;
    }
}

class Laptop {
    String name;
    int HDDMemory;
    CPU processor;

    Laptop() {

    }

    Laptop(String name, int HDDMemory, CPU processor) {
        this.name = name;
        this.HDDMemory = HDDMemory;
        this.processor = processor;
    }

    void printLaptopData() {
        System.out.println(name);
        System.out.println(HDDMemory);
        System.out.println(processor.getCPUData());
    }

    void execute() {
        if(processor.RAM > 4096 && processor.frequency > 2.5) {
            System.out.println("Laptop is started and executing");
        } else {
            System.out.println("Cannot start computer");
        }
    }
}
