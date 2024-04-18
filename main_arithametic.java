import arithametic_package.Arithmetic;

class main_arithametic {
    public static void main(String []args){
        Arithmetic testObj = new Arithmetic();
        System.out.println("Addition: "+testObj.add(1,2));
        System.out.println("subtraction: "+testObj.substract(1,2));
        System.out.println("multiplication: "+testObj.multiple(1,2));
        System.out.println("multiplication: "+testObj.divide(5,2));
        System.out.println("remainder: "+testObj.remainder(11,2));
    }
}
