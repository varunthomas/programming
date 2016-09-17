import java.util.*;

public class thread1 implements Runnable{

String x;
int time;
Random r=new Random();


public thread1(String name){
x=name;
time=r.nextInt(999);
}

synchronized public void run(){

try{

System.out.printf("Thread %s is sleeping for %d millis\n",x,time);
Thread.sleep(time);
System.out.printf("Thread %s Woke up\n",x);
}catch(Exception e){}
}

}