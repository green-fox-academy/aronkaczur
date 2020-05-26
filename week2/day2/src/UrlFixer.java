public class UrlFixer {
    public static void main(String[] args) {
        String url="https//www.reddit.com/r/nevertellmethebots";
        System.out.println(url.replace("bots","odds"));
        String separ = url.substring(5);
        url="https:" + separ;
        System.out.println(url.replace("bots","odds"));
    }
}
