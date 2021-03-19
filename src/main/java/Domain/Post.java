package Domain;

public class Post {
    private String text;
    private int commentsInfo;
    private int likesInfo;
    private int views;
    private int repostInfo;
    private int geo;

    public String getText() { return text; }
    public void setText(String text) {
        this.text = text;
    }

    public int getCommentsInfo() {
        return commentsInfo;
    }
    public void setCommentsInfo(int commentsInfo) {
        this.commentsInfo = commentsInfo;
    }

    public int getLikesInfo() {
        return likesInfo;
    }
    public void setLikesInfo(int likesInfo) {
        this.likesInfo = likesInfo;
    }

    public int getViews() {
        return views;
    }
    public void setViews(int views) {
        this.views = views;
    }

    public int getRepostInfo() {
        return repostInfo;
    }
    public void setRepostInfo(int repostInfo) {
        this.repostInfo = repostInfo;
    }

    public int getGeo() {
        return geo;
    }

    public void setGeo(int geo) {
        this.geo = geo;
    }




}
