public class Owner {
    String name;
    String address;
    String phone;
    int age;
    Dog dog;

    public Owner(String n, String ad, int a, String p){
        this.name = n;
        this.address = ad;
        this.age = a;
        this.phone = p;
    }

    public String toString(){
        return "\nOWNER" + "\nName: " + this.name + "\nAge: " + this.age + "\nAddress: "
                + this.address + "\nPhone Number: " + this.phone + "\n\nDOG " + this.dog.toString();
    }
    public void birthDay() {
        age = age + 1;
    }
    public void phone(String p) {
        this.phone = p;
    }
    public void address(String ad) {
        this.address = ad;
    }
    public void changeDog(Dog d) {
        this.dog = d;
    }


}
