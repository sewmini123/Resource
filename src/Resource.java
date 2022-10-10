 class Resource {
    static int sum(int x) {
        System.out.println(12345);
        return x;
    }
    static void sum(int y ,String z){
        System.out.println(y + "and" + z);
    }
    static void sum(String a){
        System.out.println("54abcd");
    }
    static void sum(double b){
        System.out.println(3.89);
    }

    public static void main(String[] args) {
        sum(12);
        sum(123,"abc");
        sum("uhuihd");
        sum(3.45);
    }
}
