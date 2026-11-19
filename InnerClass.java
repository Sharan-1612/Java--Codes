class OuterClass{
    void print(){
        System.out.println("Sharan");
    }
}
class Main{
    static OuterClass outer = new OuterClass(){
        void print(){
            super.print();
            System.out.println("Annamalai");
        }
    };
    public static void main(String[] args){
        outer.print();
    }
}
