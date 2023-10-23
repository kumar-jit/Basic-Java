package DSA.OOPS.Support;
public class Polynomial {

    private DynamicArray coefficient;

    public Polynomial(){
        this.coefficient = new DynamicArray();
    }
    public void setCoefficient(int degree,int coefficient){
        this.coefficient.forceSet(degree,coefficient);
    }

    public int degree(){
        return coefficient.size();
    }

    public int getCoefficient(int degree){
        return this.coefficient.get(degree);
    }

    public void print(){
        for(int i = 0;i<coefficient.size();i++){
            int value = getCoefficient(i);
            if(value!=0){
                System.out.print(value+"x^"+i+" + ");
            }
        }
        System.out.println();
    }

    public void add(Polynomial p2){
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
    }

    public void subtract(Polynomial p2){
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
    }

    public void multiply(Polynomial p2){
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

    }


}
