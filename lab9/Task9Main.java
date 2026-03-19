// Переименовали базовый класс, чтобы не конфликтовать с другими заданиями
class ComponentTask9 {
    String model;

    ComponentTask9(String model) {
        this.model = model;
    }

    void showInfo() {
        System.out.println("Component model: " + model);
    }
}

class CPU extends ComponentTask9 {
    CPU(String model) {
        super(model);
    }

    @Override
    void showInfo() {
        System.out.println("CPU model: " + model + ", 8 cores, 3.6 GHz");
    }
}

class RAM extends ComponentTask9 {
    RAM(String model) {
        super(model);
    }

    @Override
    void showInfo() {
        System.out.println("RAM model: " + model + ", 16 GB, DDR4");
    }
}

class GPU extends ComponentTask9 {
    GPU(String model) {
        super(model);
    }

    @Override
    void showInfo() {
        System.out.println("GPU model: " + model + ", 6 GB VRAM");
    }
}

public class Task9Main {
    public static void main(String[] args) {
        ComponentTask9 cpu = new CPU("Intel i7-9700K");
        ComponentTask9 ram = new RAM("Corsair Vengeance");
        ComponentTask9 gpu = new GPU("NVIDIA GTX 1660");

        cpu.showInfo();
        ram.showInfo();
        gpu.showInfo();
    }
}