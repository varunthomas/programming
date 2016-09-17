public class thread2{

public static void main(String args[]){

Thread t1=new Thread(new thread1("one"));
Thread t2=new Thread(new thread1("two"));
Thread t3=new Thread(new thread1("three"));
Thread t4=new Thread(new thread1("four"));

t1.start();
t2.start();
t3.start();
t4.start();
}
}