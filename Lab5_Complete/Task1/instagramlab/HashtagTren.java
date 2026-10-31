package instagramlab;

public class HashtagTren {
    private final String code;
    private String hashtag;
    private int useCount;

    public HashtagTren(String code, String hashtag) {
        this.code = code;
        this.hashtag = hashtag;
        this.useCount = 0;
    }

    public String getCode() {
        return code;
    }

    public String getHashtag() {
        return hashtag;
    }

    public int getUseCount() {
        return useCount;
    }

    public void setHashtag(String hashtag) {
        this.hashtag = hashtag;
    }

    public void recordUse() {
        useCount++;
    }

    public void displayTrend() {
        System.out.println(getCode() + " |  " + getHashtag() + " | " + getUseCount());
    }

}
