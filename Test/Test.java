public class Test {
    public static void main(String[] args) {
        String address = "chamin@gmail.com";
        String myUserName = address.substring(0, address.indexOf("@"));
        String myHostName = address.substring(address.indexOf("@") + 1, address.indexOf("."));
        String myExtension = address.substring(address.indexOf(".") + 1);
        System.out.println(myUserName);
        System.out.println(myHostName);
        System.out.println(myExtension);
    }
}
