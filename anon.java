import java.io.*;
import java.util.*;
class anon{

interface Iface{

void method();
}

public static void main(String args[]){

Iface i=new Iface(){

public void method(){

System.out.println("Interface anon");

}
};

i.method();
}

}