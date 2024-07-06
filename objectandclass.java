class c{
    int age =10; String name = "Uttam";

    void disp()
    {
        System.out.println(age+" "+name);
    }
}
class objectandclass{
    public static void main(String[] args) {
        c myObj = new c();
        myObj.disp();
    }
}