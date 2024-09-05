public class Main {
    public static void main(String[] args) {

                CylinderTank cylinderTank = new CylinderTank("Zylindrischer Tank", 1.5, 2.0, 35.0, 10.0);
                System.out.println(cylinderTank + "\n");

                SquareTank squareTank = new SquareTank("Quadratischer Tank", 1.5, 2.0, 35.0, 10.0);
                System.out.println(squareTank + "\n");

                GeneralTank generalTank = new GeneralTank("Generischer Tank", 1.5,  35.0, 10.0);
                System.out.println(generalTank);
            }
        }
