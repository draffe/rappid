package Models;

import android.graphics.Bitmap;

import java.util.ArrayList;

import io.realm.RealmObject;
import io.realm.annotations.Ignore;

/**
 * Created by draffe on 14/12/2016.
 */
public class Data extends RealmObject {
    private String banner_img;

    public String getBannerImg() { return this.banner_img; }

    public void setBannerImg(String banner_img) { if(this.banner_img!=null)this.banner_img = banner_img;else {this.banner_img="";} }

    private boolean user_sr_theme_enabled;

    public boolean getUserSrThemeEnabled() { return this.user_sr_theme_enabled; }

    public void setUserSrThemeEnabled(boolean user_sr_theme_enabled) { this.user_sr_theme_enabled = user_sr_theme_enabled; }

    private String submit_text_html;

    public String getSubmitTextHtml() { return this.submit_text_html; }

    public void setSubmitTextHtml(String submit_text_html) { this.submit_text_html = submit_text_html; }

    @Ignore
    private Object user_is_banned;


    public Object getUserIsBanned() { return this.user_is_banned; }

    public void setUserIsBanned(Object user_is_banned) { this.user_is_banned = user_is_banned; }

    private boolean wiki_enabled;

    public boolean getWikiEnabled() { return this.wiki_enabled; }

    public void setWikiEnabled(boolean wiki_enabled) { this.wiki_enabled = wiki_enabled; }

    private boolean show_media;

    public boolean getShowMedia() { return this.show_media; }

    public void setShowMedia(boolean show_media) { this.show_media = show_media; }




    private String id;
    public String getId() { return this.id; }

    public void setId(String id) { this.id = id; }

    private String submit_text;

    public String getSubmitText() { return this.submit_text; }

    public void setSubmitText(String submit_text) { this.submit_text = submit_text; }

    private String display_name;

    public String getDisplayName() { return this.display_name; }

    public void setDisplayName(String display_name) { this.display_name = display_name; }

    private String header_img;

    public String getHeaderImg() { return this.header_img; }

    public void setHeaderImg(String header_img) { this.header_img = header_img; }

    private String description_html;

    public String getDescriptionHtml() { return this.description_html; }

    public void setDescriptionHtml(String description_html) { this.description_html = description_html; }

    private String title;

    public String getTitle() { return this.title; }

    public void setTitle(String title) { this.title = title; }

    private boolean collapse_deleted_comments;

    public boolean getCollapseDeletedComments() { return this.collapse_deleted_comments; }

    public void setCollapseDeletedComments(boolean collapse_deleted_comments) { this.collapse_deleted_comments = collapse_deleted_comments; }

    private boolean over18;

    public boolean getOver18() { return this.over18; }

    public void setOver18(boolean over18) { this.over18 = over18; }

    private String public_description_html;

    public String getPublicDescriptionHtml() { return this.public_description_html; }

    public void setPublicDescriptionHtml(String public_description_html) { this.public_description_html = public_description_html; }

    @Ignore
    private ArrayList<Integer> icon_size;

    public ArrayList<Integer> getIconSize() { return this.icon_size; }

    public void setIconSize(ArrayList<Integer> icon_size) { this.icon_size = icon_size; }

    private String suggested_comment_sort;

    public String getSuggestedCommentSort() { return this.suggested_comment_sort; }

    public void setSuggestedCommentSort(String suggested_comment_sort) { this.suggested_comment_sort = suggested_comment_sort; }

    private String icon_img;

    public String getIconImg() { return this.icon_img; }

    public void setIconImg(String icon_img) { this.icon_img = icon_img; }

    private String header_title;

    public String getHeaderTitle() { return this.header_title; }

    public void setHeaderTitle(String header_title) { this.header_title = header_title; }

    private String description;

    public String getDescription() { return this.description; }

    public void setDescription(String description) { this.description = description; }

    @Ignore
    private Object user_is_muted;

    public Object getUserIsMuted() { return this.user_is_muted; }

    public void setUserIsMuted(Object user_is_muted) { this.user_is_muted = user_is_muted; }

    private String submit_link_label;

    public String getSubmitLinkLabel() { return this.submit_link_label; }

    public void setSubmitLinkLabel(String submit_link_label) { this.submit_link_label = submit_link_label; }


    @Ignore
    private Object accounts_active;

    public Object getAccountsActive() { return this.accounts_active; }

    public void setAccountsActive(Object accounts_active) { this.accounts_active = accounts_active; }

    private boolean public_traffic;

    public boolean getPublicTraffic() { return this.public_traffic; }

    public void setPublicTraffic(boolean public_traffic) { this.public_traffic = public_traffic; }


    @Ignore
    private ArrayList<Integer> header_size;

    public ArrayList<Integer> getHeaderSize() { return this.header_size; }

    public void setHeaderSize(ArrayList<Integer> header_size) { this.header_size = header_size; }

    private int subscribers;

    public int getSubscribers() { return this.subscribers; }

    public void setSubscribers(int subscribers) { this.subscribers = subscribers; }

    private String submit_text_label;

    public String getSubmitTextLabel() { return this.submit_text_label; }

    public void setSubmitTextLabel(String submit_text_label) { this.submit_text_label = submit_text_label; }

    private String lang;

    public String getLang() { return this.lang; }

    public void setLang(String lang) { this.lang = lang; }


    @Ignore
    private Object user_is_moderator;

    public Object getUserIsModerator() { return this.user_is_moderator; }

    public void setUserIsModerator(Object user_is_moderator) { this.user_is_moderator = user_is_moderator; }

    private String key_color;

    public String getKeyColor() { return this.key_color; }

    public void setKeyColor(String key_color) { this.key_color = key_color; }

    private String name;

    public String getName() { return this.name; }

    public void setName(String name) { this.name = name; }

    private double created;

    public double getCreated() { return this.created; }

    public void setCreated(double created) { this.created = created; }

    private String url;

    public String getUrl() { return this.url; }

    public void setUrl(String url) { this.url = url; }

    private boolean quarantine;

    public boolean getQuarantine() { return this.quarantine; }

    public void setQuarantine(boolean quarantine) { this.quarantine = quarantine; }

    private boolean hide_ads;

    public boolean getHideAds() { return this.hide_ads; }

    public void setHideAds(boolean hide_ads) { this.hide_ads = hide_ads; }

    private double created_utc;

    public double getCreatedUtc() { return this.created_utc; }

    public void setCreatedUtc(double created_utc) { this.created_utc = created_utc; }

    @Ignore
    private ArrayList<Integer> banner_size;

    public ArrayList<Integer> getBannerSize() { return this.banner_size; }

    public void setBannerSize(ArrayList<Integer> banner_size) { this.banner_size = banner_size; }


    @Ignore
    private Object user_is_contributor;

    public Object getUserIsContributor() { return this.user_is_contributor; }

    public void setUserIsContributor(Object user_is_contributor) { this.user_is_contributor = user_is_contributor; }

    private String public_description;

    public String getPublicDescription() { return this.public_description; }

    public void setPublicDescription(String public_description) { this.public_description = public_description; }

    private boolean show_media_preview;

    public boolean getShowMediaPreview() { return this.show_media_preview; }

    public void setShowMediaPreview(boolean show_media_preview) { this.show_media_preview = show_media_preview; }

    private int comment_score_hide_mins;

    public int getCommentScoreHideMins() { return this.comment_score_hide_mins; }

    public void setCommentScoreHideMins(int comment_score_hide_mins) { this.comment_score_hide_mins = comment_score_hide_mins; }

    private String subreddit_type;

    public String getSubredditType() { return this.subreddit_type; }

    public void setSubredditType(String subreddit_type) { this.subreddit_type = subreddit_type; }

    private String submission_type;

    public String getSubmissionType() { return this.submission_type; }

    public void setSubmissionType(String submission_type) { this.submission_type = submission_type; }

    @Ignore
    private Object user_is_subscriber;

    public Object getUserIsSubscriber() { return this.user_is_subscriber; }

    public void setUserIsSubscriber(Object user_is_subscriber) { this.user_is_subscriber = user_is_subscriber; }
}
