package OOP_HW_01;

public class Main {
    public static void main(String[] args) {
        VendingMachine vm = new VendingMachine();
        vm.addProduct(new Product("Яблоко", 15));
        vm.addProduct(new Product("Груша", 25));
        vm.addProduct(new Drink("Lipton", 35, 0.7, TypesOfDrink.COLDTEA));
        vm.addProduct(new Chocolate("Аленка", 45, 60));

        System.out.println(vm);

    }
}