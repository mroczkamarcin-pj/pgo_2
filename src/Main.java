public class Main {

    public static void main(String[] args) {

//        Telephone iPhone = new Telephone("iPhone", 4, 500500500);
//        String message= Telephone.sendMessage(iPhone.getNumber());

        Car whiteAudi = new Car("white", "Audi", 2);
        Car whiteAudi2 = new Car("white", "Audi", 1);

        whiteAudi.isHighSpeed();
        whiteAudi2.isHighSpeed();

        whiteAudi.modifyCapacity();
    }
}
