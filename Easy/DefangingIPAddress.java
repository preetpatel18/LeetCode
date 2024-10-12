package Easy;

public class DefangingIPAddress {
    public String defangIPaddr(String a) {
        a = a.replace(".", "[.]");
        return a;
    }
}
