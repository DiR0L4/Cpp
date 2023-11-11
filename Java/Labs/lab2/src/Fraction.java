public class Fraction {
    public int n, m;
    public Fraction()
    {
        n = 0;
        m = 1;
    }
    public Fraction(int n, int m)
    {
        this.n = n;
        this.m = m;
    }
    public static Fraction sum(Fraction... arr)
    {
        Fraction a = new Fraction();
        for(Fraction x : arr) {
            a.m *= x.m;
        }
        for(Fraction x : arr)
        {
            a.n += x.n *  a.m / x.m;
        }
        return reduct(a);
    }
    public static Fraction mult(Fraction... arr)
    {
        Fraction a = new Fraction(1, 1);
        for(Fraction x : arr) {
            a.m *= x.m;
            a.n *= x.n;
        }
        return reduct(a);
        //return a;
    }

    public static Fraction diff(Fraction f1, Fraction f2)
    {
        Fraction rez = new Fraction(1, 1);
        rez.m = f1.m * f2.m;
        rez.n = f1.n * rez.m / f1.m - f2.n * rez.m / f2.m;
        return reduct(rez);
    }

    public static Fraction div(Fraction f1, Fraction f2)
    {
        Fraction rez = new Fraction();
        rez.m = f1.m * f2.n;
        rez.n = f1.n * f2.m;
        return reduct(rez);
    }

    public static Fraction reduct(Fraction f)
    {
        int n1 = f.n, n2 = f.m, buff = 0;
        if(n2 > n1)
        {
            buff = n1;
            n1 = n2;
            n2 = buff;
        }
        while(true)
        {
            if(n2 == 0) break;
            buff = n1;
            n1 = n2;
            n2 = buff % n2;
        }
        f.n /= n1;
        f.m /= n1;
        return f;
    }

    public void show()
    {
        System.out.println(this.n + " / " + this.m);
    }

    public static Fraction[] task(Fraction[] arr)
    {
        for(int i = 0; i < arr.length - 1; i = i + 2)
        {
            arr[i] = sum(arr[i], arr[i + 2]);
        }
        for(Fraction x : arr)
        {
            x.show();
        }
        return arr;
    }
}
