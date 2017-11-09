/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java8lamdabasics;

/**
 *
 * @author User
 */
public class ThisReferenceLambdaExample {

    public static void doProcess(int i, Process p) {
        p.process(i);

    }

    public void excute() {
        doProcess(10, i -> {
            System.err.println("Value of i is " + i);
            System.err.println(this);
        });
    }

    public static void main(String[] args) {
        ThisReferenceLambdaExample thisReference = new ThisReferenceLambdaExample();

        thisReference.doProcess(10, i -> {
            System.err.println("Value of i is " + i);
            //System.err.println(this); this is not work
        });
        /*
      thisReference.doProcess(10, new Process() {
          @Override
          public void process(int i) {
              System.err.println("Value of i is " + i);
              System.err.println(this);
          }

          @Override
          public String toString() {
              return "This is the anoymous inner class" ;
          }
          
      });
    
         */
        thisReference.excute();
    }

    @Override
    public String toString() {
        return "This is the anoymous inner class";
    }
}
