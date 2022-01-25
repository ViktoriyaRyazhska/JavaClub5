package main.classes.task14;

import main.InterfaceTestClass;

public class Fraction implements InterfaceTestClass {
    public static void Fraction() {

    }
    @Override
    public void execute() {
        System.out.println("You are provided with a skeleton of the class"+"" +
                " 'Fraction', which accepts two arguments (numerator, denominator).");
        System.out.println("public class Fraction implements Comparable<Fraction>\n" +
                "{\n" +
                "    private final long top;\n" +
                "    private final long bottom;\n" +
                "\n" +
                "    public Fraction(long numerator, long denominator) {\n" +
                "        top = numerator;\n" +
                "        bottom = denominator;\n" +
                "    }\n" +
                "\n" +
                "    @Override\n" +
                "    public int hashCode() { return 17 * Long.hashCode(top) + Long.hashCode(bottom); }    \n" +
                "    @Override\n" +
                "    public boolean equals(Object o) { return compareTo((Fraction)o) == 0; }    \n" +
                "    @Override\n" +
                "    public int compareTo(Fraction f2){ return Long.compare(top * f2.bottom, f2.top * bottom); }\n" +
                "    \n" +
                "    // Your work here!\n" +
                "\n" +
                "private Fraction reduce(Fraction f) {\n" +
                "    long reducer = f.gcd();\n" +
                "    long num=top/reducer;\n" +
                "    long denom=bottom/reducer;\n" +
                "  return new Fraction(num, denom);\n" +
                "  }\n" +
                "  \n" +
                "  private long gcd() {\n" +
                "    long max=Math.max(top,bottom);\n" +
                "    long i;\n" +
                "    for (i=max;i>1;i--){\n" +
                "      long rem1=top%i;\n" +
                "      long rem2=bottom%i;\n" +
                "      if (rem1==0 && rem2==0){\n" +
                "        return i;\n" +
                "      }\n" +
                "    }\n" +
                "    return 1;\n" +
                "  }\n" +
                "\n" +
                "    //Add two fractions\n" +
                "    public Fraction add(Fraction f2) {    \n" +
                "      long num   = this.top * f2.bottom + f2.top * this.bottom;\n" +
                "      long denom = this.bottom * f2.bottom;\n" +
                "      long max=Math.max(num,denom);\n" +
                "      long i;\n" +
                "      long i_res=1;\n" +
                "      for (i=max;i>1;i--){\n" +
                "      long rem1=num%i;\n" +
                "      long rem2=denom%i;\n" +
                "      if (rem1==0 && rem2==0){\n" +
                "         i_res=i; break;\n" +
                "      }\n" +
                "    }\n" +
                "  \n" +
                "    long reducer = i_res;\n" +
                "    num=num/reducer;\n" +
                "    denom=denom/reducer;\n" +
                "  return new Fraction(num, denom);   \n" +
                "  \n" +
                "\n" +
                "    }\n" +
                "    \n" +
                "    public String toString(){\n" +
                "    return \"\"+top+\"/\"+bottom;\n" +
                "    }\n" +
                "    \n" +
                "    //...and make this class string representable\n" +
                "}");
    }
}
