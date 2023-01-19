public class Dog {
   String name;
   int age;
   String breed;
   String sex;
   boolean hungry;

   public Dog(String n, int a, String b, String s) {
       this.name = n;
       this.age = a;
       this.breed = b;
       this.sex = s;
       this.hungry = false;
   }

   public String toString() {

       String h;
       if (this.hungry == false)
            h = "Is not hungry.";
       else
           h = "Is hungry.";

       return "\nName: " + this.name + "\nAge: " + this.age + "\nSex: " + this.sex + "\nBreed: " + this.breed + "\n" + h;
   }

   public void birthDay() {
       age = age + 1;
   }
   public void gettingHungry() {
       hungry = true;
   }
   public void full() {
       hungry = false;
   }



}
