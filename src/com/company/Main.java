package com.company;

public class Main {

    public static void main(String[] args) {
	   int a = 14;
	   int b = 16;
	   int c = 12;
	   int d = 20;
	   System.out.println(ExclusionAlternative(Between13than19(a), Between13than19(b)));
	   System.out.println(ExclusionAlternative(Between13than19(c), Between13than19(b)));

	   System.out.println(WhateverIsTeen(Between13than19(a), Between13than19(b)));
	   System.out.println(WhateverIsTeen(Between13than19(c), Between13than19(b)));
	   System.out.println(WhateverIsTeen(Between13than19(c), Between13than19(d)));
    }

    static boolean Between13than19(int number){
        return number > 13 && number < 19;
    }

    static boolean ExclusionAlternative(boolean a , boolean b){
        boolean alternative = a || b;
        boolean conjunction = a && b;
        return alternative && !conjunction;
    }

    static String WhateverIsTeen(boolean a , boolean b) {
        return a || b ? "Teen" : "Both not Teen";
    }
}
