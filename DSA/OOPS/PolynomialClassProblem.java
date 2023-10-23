package DSA.OOPS;

import java.util.Scanner;

//------------------------ DynamicArray Class ------------------------
class DynamicArray {
    private int data[];
    private int nextElementIndex;

    public DynamicArray(){
        data = new int[5];
        nextElementIndex = 0;
    }

    /**
     * To get Array Size
     * @return int - length of array
     */
    public int size(){
        return nextElementIndex;
    }

    /**
     * Check is array is empty or not
     * @return boolean - status of empty array
     */
    public  boolean isEmpty(){
        return nextElementIndex == 0;
    }

    /**
     * Get the value of provided index
     * @param index - int - index
     * @return - int - value of the index
     */
    public int get(int index){
        if(index >= nextElementIndex || index < 0){
            //Error
            return -1;
        }
        return data[index];
    }

    /**
     * update existing value of the array
     * @param index - int index
     * @param value - int value
     */
    public void set(int index,int value){
        if(index >= nextElementIndex || index < 0){
            //Error
            return;
        }
        data[index] = value;
    }

    /**
     * set value forcefully the index if more then array size
     * @param index - int index
     * @param value - int value
     */
    public void forceSet(int index,int value){
        if(index>=nextElementIndex){
            while (index>=data.length){
                doubleCapacity();
            }
            data[index] = value;
            nextElementIndex = index + 1;
            return;
        }
        this.set(index,value);
    }

    /**
     * Add new element end of the array
     * @param value - int - value
     */
    public void add(int value){
        if(nextElementIndex==data.length)
            doubleCapacity();
        data[nextElementIndex] = value;
        nextElementIndex++;
    }

    /**
     * increment the array when it's full
     */
    private void doubleCapacity(){
        int[] temp = data;
        data = new int[temp.length*2];
        for(int i =0;i<temp.length;i++){
            data[i] = temp[i];
        }
    }

    /**
     * remove the last item from array
     * @return - int - value of deleted index
     */
    public int removeLast(){
        if (nextElementIndex==0){
            //Error
            return -1;
        }
        return data[--nextElementIndex];
    }

    /**
     * print the array
     */
    public void print(){
        System.out.print("[");
        for (int i = 0;i<nextElementIndex;i++){
            if(i!=nextElementIndex-1)
                System.out.print(data[i]+", ");
            else
                System.out.print(data[i]);
        }
        System.out.println("]");
    }
}

/**
 * Class for handel polynomial Equation
 */
class Polynomial {

    // to store the polynomial value . array index consider as degree and value is coefficient.
    private DynamicArray coefficient;

    public Polynomial(){
        this.coefficient = new DynamicArray();
    }

    /**
     * store the coeff and degree
     * @param degree - int - degree of polynomial eq
     * @param coefficient - int - coefficient of polynomial
     */
    public void setCoefficient(int degree,int coefficient){
        this.coefficient.forceSet(degree,coefficient);
    }

    /**
     * to get the degree
     * @return - int -
     */
    public int degree(){
        return coefficient.size();
    }

    /**
     * Get the coefficient of the degree
     * @param degree - int - degree of polynomial
     * @return - int - coefficient of polynomial
     */
    public int getCoefficient(int degree){
        return this.coefficient.get(degree);
    }

    /**
     * print the polynomial format
     */
    public void print(){
        for(int i = 0;i<coefficient.size();i++){
            int value = getCoefficient(i);
            if(value!=0){
                System.out.print(value+"x"+i+" ");
            }
        }
        System.out.println();
    }

    /**
     * Add two polynomial and store it to called one
     * @param p2 - polynomial - 2nd Polynomial object which will be added to called one
     * @return Polynomial - object of polynomial
     */
    public Polynomial add(Polynomial p2){
        int p1Size = coefficient.size();
        int p2Size = p2.coefficient.size();
        int max = Math.max(p1Size,p2Size);

        for(int i = 0;i<max;i++){
            int p1Value = 0;
            if(i<p1Size){
                p1Value = this.getCoefficient(i);
            }
            int p2Value = 0;
            if(i<p2Size){
                p2Value = p2.getCoefficient(i);
            }
            setCoefficient(i,p1Value + p2Value);
        }
        return this;
    }

    /**
     * subtract of two polynomial and stored from which its called
     * @param p2 - 2nd Polynomial object which will be to subtract to called one
     * @return Polynomial - object of Polynomial updated
     */
    public Polynomial subtract(Polynomial p2){
        int p1Size = coefficient.size();
        int p2Size = p2.coefficient.size();
        int max = Math.max(p1Size,p2Size);

        for(int i = 0;i<max;i++){
            int p1Value = 0;
            if(i<p1Size){
                p1Value = this.getCoefficient(i);
            }
            int p2Value = 0;
            if(i<p2Size){
                p2Value = p2.getCoefficient(i);
            }
            setCoefficient(i,p1Value - p2Value);
        }
        return this;
    }

    /**
     * multiply 2nd polynomial with called one
     * @param p2 - 2nd Polynomial object which will be multiplied to called one
     * @return - polynomial - object of Polynomial updated
     */
    public Polynomial multiply(Polynomial p2){
        int p1Size = coefficient.size();
        int p2Size = p2.coefficient.size();
        Polynomial finalP = new Polynomial();
        for (int i = 0;i<p1Size;i++){
            for(int j = 0;j<p2Size;j++){
                Polynomial tempP = new Polynomial();
                tempP.setCoefficient(i+j,this.getCoefficient(i)*p2.getCoefficient(j));
                finalP.add(tempP);

            }
        }
        this.coefficient = finalP.coefficient;
        return this;
    }

}
public class PolynomialClassProblem {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int degree1[] = new int[n];
        for(int i = 0; i < n; i++){
            degree1[i] = s.nextInt();
        }
        int coeff1[] = new int[n];
        for(int i = 0; i < n; i++){
            coeff1[i] = s.nextInt();
        }
        Polynomial first = new Polynomial();
        for(int i = 0; i < n; i++){
            first.setCoefficient(degree1[i],coeff1[i]);
        }
        n = s.nextInt();
        int degree2[] = new int[n];
        for(int i = 0; i < n; i++){
            degree2[i] = s.nextInt();
        }
        int coeff2[] = new int[n];
        for(int i = 0; i < n; i++){
            coeff2[i] = s.nextInt();
        }
        Polynomial second = new Polynomial();
        for(int i = 0; i < n; i++){
            second.setCoefficient(degree2[i],coeff2[i]);
        }
        int choice = s.nextInt();
        Polynomial result;
        switch(choice){
            // Add
            case 1:
                result = first.add(second);
                result.print();
                break;
            // Subtract
            case 2 :
                result = first.subtract(second);
                result.print();
                break;
            // Multiply
            case 3 :
                result = first.multiply(second);
                result.print();
                break;
        }
    }
}
