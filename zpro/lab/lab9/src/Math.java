public class Math {

    double dividing(int a, int b) throws RangeEx, DividingEx{
        try{
            if(b == 0) throw new DividingEx();
            if(a/b < -100 || a/b > 100) throw new RangeEx();
            return a/b;
        } catch(ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        return -404;
    }
}