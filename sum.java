class sum{
    int a,b,c;
    sum(int x,int y){
        a=x;
        b=y;
    }
    sum(int x,int y,int z){
        a=x;
        b=y;
        c=z;
    }
    void display(){
        System.out.println("sum is "+(a+b+c));
    }
    public static void main(String[] args) {
         sum s1 =new sum(10,11);
         sum s2 =new sum(10,11,20);
         s1.display();
         s2.display();
    }
   
}
