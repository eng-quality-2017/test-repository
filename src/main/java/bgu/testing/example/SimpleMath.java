/*
 * Created by IntelliJ IDEA.
 * User: Aviram Dayan
 * Date: 28/11/2017
 * Time: 09:52
 */
package bgu.testing.example;

public class SimpleMath {

    public int multiplyBy2(int i) {
        int result = i << 1;
        System.out.println(i + " multiplied by 2 is " + result);
        return result;
    }
}