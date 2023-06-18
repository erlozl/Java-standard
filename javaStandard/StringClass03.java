package javaStandard;

public class StringClass03 {
    public static void main(String[] args) {
        // String(char[] strArr)
        // char[]배열을 string으로 바꾸는 방법
        // ㅡ> String을 char[]배열로 바꾸려면 toCharArray()

        // String(StringBuffer buf)
        // : StringBuffer를 String으로 바꿀 때

        // char charAt(int index)
        // : 지정된 위치(index)에 있는 문자 하나를 반환

        // int compareTo(String str) : 문자열과 사전순서로 비교
        // 같으면 0, 왼쪽이 작으면 -1(음수) , 오른쪽이 작으면 1(양수)
        // ex) int i = "aaa".compareTo("aaa"); i = 0;
        // int i2 = "aaa".compareTo("bbb"); i2 = -1;
        // int i3 = "aaa".compareTo("aaa"); i3 = 1;

        // String concat(String str) : 문자열(str)을 붙인다

        // boolean contains(CharSequence s)
        // CharSequence -> 인터페이스
        // : 지정된 문자열(s)이 포함되었는지 검사한다

        // boolean endWidth(String suffix) :
        // 지정된 문자열(suffix)로 끝나는지 검사

        // boolean equalsIgnoreCase(String str) :
        // 문자열과 String인스턴스의 문자열을 대소문자구분없이 비교

        // int indexOf(int ch)
        // : 주어진 문자가 문자열에 존재하는지 확인하여 index를 알려줌
        // 못 찾으면 -

        // int indexOf(int ch, int pos)
        // : 주어진 문자(ch)가 문자열에 존재하는지
        // 지정된 위치(pos)로부터 확인하여 위치를 알려준다

        // int indexOf(String str)
        // : 주어진 문자열이 존재하는지 확인하여 그 시작 위치를 알려준다

        // int lastIndexOf(int ch)
        // : 지정된 문자 또는 문자코드를 문자열의 오른쪽 끝에서부터 찾아서
        // 위치를 알려준다

        // int lastIndexOf(String str)
        // 지정된 문자열을 일스턴스의 문자열 끝에서부터 찾아서 알려준다

        // int length()
        // : 문자열의 길이를 알려준다

        // String[] split(String regex(정규식))
        // : 문자열을 지정된 분리자로 나누어 문자열 배열에 담아 반환

        // String[] split(String regex(정규식), int limit-몇개까지 자를건가)
        // : 문자열 전체를 지정된 수로 자른다
        // ex) String animals = "dog,cat,bear";
        // String[] arr = animals.split(","2);
        // arr[0] = "dog"
        // arr[1] = "cat,bear"

        // boolean startWith(String prefix)
        // : 주어진 문자열로 시작하는지 검사

        // String substring(int begin)
        // : 주어진 시작위치(begin)부터 끝 위치(end)범위에 포함된 문자열을 얻는다
        // String substring(int begin, int end)
        // : 시작 위치의 문자는 범위 포함, 끝 위치는 문자 포함 X

        // String toLoswerCase()
        // : 소문자로 바꾸기

        // String toUpperCase()
        // : 대문자로 바꾸기

        // String trim()
        // : 문자열의 왼쪽 끝과 오른쪽 끝에 있는 공백을 없앤 결과
        // 문자열 중간에 있는 공백 제거 X

        // static String valueOf(boolean b)
        // 지정된 값을 문자열로 변환

    }
}
