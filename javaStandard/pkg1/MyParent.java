package javaStandard.pkg1;

// 접근 제어자 (access modifier)
// private 같은 클래스 내에서만 접근이 가능하다 // 기본 파일
// default 같은 패키지 내에서만 접근이 가능하다 // 기본 폴더
// protected 같은 패키지 내에서, 그리고 다른 패키지의 자손 클래스에서 접근 가능
// public 접근 제한이 전혀 없다

// class 앞에 붙일 수 있는 건 public, default 만 

public class MyParent {
    private int prv; // 같은 클래스
    int dft; // (default) 같은 패키지
    protected int prt; // 같은 패키지, 다른 패키지 자손
    public int pub; // 접근 제한 없음

    public void printMembers() {
        System.out.println(prv);
        System.out.println(dft);
        System.out.println(prt);
        System.out.println(pub);
    }
}

class AccessExam {
    public static void main(String[] args) {
        MyParent parent = new MyParent();
        // System.out.println(parent.prv); 에러, 같은 클래스가 아니기 때문에
        System.out.println(parent.dft);
        System.out.println(parent.prt);
        System.out.println(parent.pub);
    }
}
