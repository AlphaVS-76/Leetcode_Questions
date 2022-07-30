//Question Link: https://leetcode.com/problems/encode-and-decode-tinyurl/

public class Codec {
    Map<String, String> codeDB = new HashMap<>(), urlDB = new HashMap<>();
    static final String chars = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";

    private String input() {
        char[] code = new char[6];
        
        for (int i = 0; i < 6; i++) {
            code[i] = chars.charAt((int)Math.random() * 62);
        }
        
        return "http://tinyurl.com/" + String.valueOf(code);
    }
    
    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        if (urlDB.containsKey(longUrl)) {
            return urlDB.get(longUrl);
        }
        
        String code = input();
        
        while (codeDB.containsKey(code)) {
            code = input();
        }
        
        codeDB.put(code, longUrl);
        urlDB.put(longUrl, code);
        
        return code;
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        return codeDB.get(shortUrl);
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(url));
