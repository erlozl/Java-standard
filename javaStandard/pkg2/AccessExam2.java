package javaStandard.pkg2;

import javaStandard.pkg1.MyParent;

class MyChild extends MyParent {
    public void printMembers() {
        // System.out.println(prv); 에러, 같은 클래스 안에서 써야하는데 클래스 벗어남
        // System.out.println(dft); 에러, 같은 패키지 안에서 써야하는데 패키지 벗어남
        System.out.println(prt);
        System.out.println(pub);
    }
}

class AccessExam2 {
    public static void main(String[] args) {
        MyParent parent = new MyParent();
        // System.out.println(parent.prv); 에러, 같은 클래스가 아니기 때문에
        // System.out.println(parent.dft); 에러, 같은 패키지가 아니기 때문에
        // System.out.println(parent.prt); 에라, 다른 패키지에 다른 클래스기 때문에
        System.out.println(parent.pub);
    }
}
