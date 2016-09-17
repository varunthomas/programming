class innerclass{
 private int data=30;
 class Inner{
  void msg(){System.out.println("data is "+data);}
 }
 

 public static void main(String args[]){
  innerclass obj=new innerclass();
  innerclass.Inner in=obj.new Inner();
  in.msg();
 }
}
