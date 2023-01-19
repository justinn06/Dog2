public class Driver {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Alex", 2, "Dalmatian", "male");
        //System.out.println(dog1.toString());

        Dog dog2 = new Dog("Mary", 1, "Bulldog", "female");
        //System.out.println(dog2.toString());

        dog1.birthDay();dog1.birthDay();
        dog1.gettingHungry();

        Owner owner1 = new Owner("Justin", "house", 16, "123");
        owner1.dog = dog1;
        System.out.println(owner1.toString());

        owner1.birthDay();
        owner1.phone("456");
        owner1.address("apartment");
        owner1.changeDog(dog2);
        System.out.println(owner1.toString());

        // (1) Allow owner to have multiple dogs. 
        // (2) Allow owner to change dogs.
        // (3) Allow owner to change phone number and address.
        // (4) Allow owner to get older.

    }
}
