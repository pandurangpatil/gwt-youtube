/**
 * Copyright (c) 2014 Pandurang Patil
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), 
 * to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, 
 * and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, 
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, 
 * WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */
package open.pandurang.gwt.youtube.client;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * @author Pandurang Patil 22-Mar-2014
 * 
 */
public class PlayerVariables extends JavaScriptObject {
	protected PlayerVariables() {
	}

	public final native int getAutoHide() /*-{
		return this.autohide;
	}-*/;

	/*
	 * (supported players: AS3, AS2, HTML5)
	 * 
	 * Values: 2 (default), 1, and 0. This parameter indicates whether the video controls will automatically hide after
	 * a video begins playing. The default behavior (autohide=2) is for the video progress bar to fade out while the
	 * player controls (play button, volume control, etc.) remain visible.
	 * 
	 * If this parameter is set to 1, then the video progress bar and the player controls will slide out of view a
	 * couple of seconds after the video starts playing. They will only reappear if the user moves her mouse over the
	 * video player or presses a key on her keyboard. If this parameter is set to 0, the video progress bar and the
	 * video player controls will be visible throughout the video and in fullscreen.
	 */
	public final native void setAutoHide(int autohide) /*-{
		this.autohide = autohide;
	}-*/;

	public final native int getAutoPlay() /*-{
		return this.autoplay;
	}-*/;

	/*
	 * (supported players: AS3, AS2, HTML5)
	 * 
	 * Values: 0 or 1. Default is 0. Sets whether or not the initial video will autoplay when the player loads.
	 */
	public final native void setAutoPlay(int autoplay) /*-{
		this.autoplay = autoplay;
	}-*/;

	public final native int getCcLoadPolicy() /*-{
		return this.cc_load_policy;
	}-*/;

	/*
	 * (supported players: AS3, AS2)
	 * 
	 * Values: 1. Default is based on user preference. Setting to 1 will cause closed captions to be shown by default,
	 * even if the user has turned captions off.
	 */
	public final native void setCcLoadPolicy(int cc_load_policy) /*-{
		this.cc_load_policy = cc_load_policy;
	}-*/;

	public final native String getColor() /*-{
		return this.color;
	}-*/;

	/*
	 * (supported players: AS3, HTML5)
	 * 
	 * This parameter specifies the color that will be used in the player's video progress bar to highlight the amount
	 * of the video that the viewer has already seen. Valid parameter values are red and white, and, by default, the
	 * player will use the color red in the video progress bar. See the YouTube API blog for more information about
	 * color options.
	 * 
	 * Note: Setting the color parameter to white will disable the modestbranding option.
	 */
	public final native void setColor(String color) /*-{
		this.color = color;
	}-*/;

	public final native int getControls() /*-{
		return this.controls;
	}-*/;

	/*
	 * (supported players: AS3, HTML5)
	 * 
	 * Values: 0, 1, or 2. Default is 1. This parameter indicates whether the video player controls will display. For
	 * IFrame embeds that load a Flash player, it also defines when the controls display in the player as well as when
	 * the player will load: controls=0 – Player controls do not display in the player. For IFrame embeds, the Flash
	 * player loads immediately. controls=1 – Player controls display in the player. For IFrame embeds, the controls
	 * display immediately and the Flash player also loads immediately. controls=2 – Player controls display in the
	 * player. For IFrame embeds, the controls display and the Flash player loads after the user initiates the video
	 * playback. Note: The parameter values 1 and 2 are intended to provide an identical user experience, but controls=2
	 * provides a performance improvement over controls=1 for IFrame embeds. Currently, the two values still produce
	 * some visual differences in the player, such as the video title's font size. However, when the difference between
	 * the two values becomes completely transparent to the user, the default parameter value may change from 1 to 2.
	 */
	public final native void setControls(int controls) /*-{
		this.controls = controls;
	}-*/;

	public final native int getDisableKeyboard() /*-{
		return this.disablekb;
	}-*/;

	/*
	 * (supported players: AS3, AS2)
	 * 
	 * Values: 0 or 1. Default is 0. Setting to 1 will disable the player keyboard controls. Keyboard controls are as
	 * follows: Spacebar: Play / Pause Arrow Left: Jump back 10% in the current video Arrow Right: Jump ahead 10% in the
	 * current video Arrow Up: Volume up Arrow Down: Volume Down
	 */
	public final native void setDisableKeyboard(int disablekb) /*-{
		this.disablekb = disablekb;
	}-*/;

	public final native int getEnablejsapi() /*-{
		return this.enablejsapi;
	}-*/;

	/*
	 * (supported players: AS3, AS2, HTML5)
	 * 
	 * Values: 0 or 1. Default is 0. Setting this to 1 will enable the Javascript API. For more information on the
	 * Javascript API and how to use it, see the JavaScript API documentation.
	 */
	public final native void setEnablejsapi(int enablejsapi) /*-{
		this.enablejsapi = enablejsapi;
	}-*/;

	public final native int getEnd() /*-{
		return this.end;
	}-*/;

	/*
	 * (supported players: AS3)
	 * 
	 * Values: A positive integer. This parameter specifies the time, measured in seconds from the start of the video,
	 * when the player should stop playing the video. Note that the time is measured from the beginning of the video and
	 * not from either the value of the start player parameter or the startSeconds parameter, which is used in YouTube
	 * Player API functions for loading or queueing a video.
	 */
	public final native void setEnd(int end) /*-{
		this.end = end;
	}-*/;

	public final native int getFs() /*-{
		return this.fs;
	}-*/;

	public final native void setfs(int fs) /*-{
		this.fs = fs;
	}-*/;

	public final native int getIvLoadPolicy() /*-{
		return this.iv_load_policy;
	}-*/;

	/*
	 * (supported players: AS3, AS2, HTML5)
	 * 
	 * Values: 1 or 3. Default is 1. Setting to 1 will cause video annotations to be shown by default, whereas setting
	 * to 3 will cause video annotations to not be shown by default.
	 */
	public final native void setIvLoadPolicy(int iv_load_policy) /*-{
		this.iv_load_policy = iv_load_policy;
	}-*/;

	public final native String getList() /*-{
		return this.list;
	}-*/;

	/*
	 * (supported players: AS3)
	 * 
	 * The list parameter, in conjunction with the listType parameter, identifies the content that will load in the
	 * player. If the listType parameter value is search, then the list parameter value specifies the search query. If
	 * the listType parameter value is user_uploads, then the list parameter value identifies the YouTube channel whose
	 * uploaded videos will be loaded. If the listType parameter value is playlist, then the list parameter value
	 * specifies a YouTube playlist ID. In the parameter value, you need to prepend the playlist ID with the letters PL
	 * as shown in the example below. http://www.youtube.com/embed?listType=playlist&list=PLC77007E23FF423C6 Note: If
	 * you specify values for the list and listType parameters, the IFrame embed URL does not need to specify a video
	 * ID.
	 */
	public final native void setList(String list) /*-{
		this.list = list;
	}-*/;

	public final native String getListType() /*-{
		return this.listType;
	}-*/;

	/*
	 * (supported players: AS3)
	 * 
	 * The listType parameter, in conjunction with the list parameter, identifies the content that will load in the
	 * player. Valid parameter values are playlist, search, and user_uploads.
	 * 
	 * If you specify values for the list and listType parameters, the IFrame embed URL does not need to specify a video
	 * ID.
	 */
	public final native void setListType(String listType) /*-{
		this.listType = listType;
	}-*/;

	public final native int getLoop() /*-{
		return this.loop;
	}-*/;

	/*
	 * (supported players: AS3, HTML5)
	 * 
	 * Values: 0 or 1. Default is 0. In the case of a single video player, a setting of 1 will cause the player to play
	 * the initial video again and again. In the case of a playlist player (or custom player), the player will play the
	 * entire playlist and then start again at the first video.
	 * 
	 * Note: This parameter has limited support in the AS3 player and in IFrame embeds, which could load either the AS3
	 * or HTML5 player. Currently, the loop parameter only works in the AS3 player when used in conjunction with the
	 * playlist parameter. To loop a single video, set the loop parameter value to 1 and set the playlist parameter
	 * value to the same video ID already specified in the Player API URL:
	 * 
	 * http://www.youtube.com/v/VIDEO_ID?version=3&loop=1&playlist=VIDEO_ID
	 */

	public final native void setLoop(int loop) /*-{
		this.loop = loop;
	}-*/;

	public final native int getModestBranding() /*-{
		return this.modestbranding;
	}-*/;

	/*
	 * (supported players: AS3, HTML5)
	 * 
	 * This parameter lets you use a YouTube player that does not show a YouTube logo. Set the parameter value to 1 to
	 * prevent the YouTube logo from displaying in the control bar. Note that a small YouTube text label will still
	 * display in the upper-right corner of a paused video when the user's mouse pointer hovers over the player.
	 */
	public final native void setModestBranding(int modestbranding) /*-{
		this.modestbranding = modestbranding;
	}-*/;

	public final native String getOrigin() /*-{
		return this.origin;
	}-*/;

	/*
	 * (supported players: AS3, HTML5)
	 * 
	 * This parameter provides an extra security measure for the IFrame API and is only supported for IFrame embeds. If
	 * you are using the IFrame API, which means you are setting the enablejsapi parameter value to 1, you should always
	 * specify your domain as the origin parameter value.
	 */
	public final native void setOrigin(String origin) /*-{
		this.origin = origin;
	}-*/;

	public final native String getPlayerapiid() /*-{
		return this.playerapiid;
	}-*/;

	/*
	 * (supported players: AS3, AS2)
	 * 
	 * This parameter provides an extra security measure for the IFrame API and is only supported for IFrame embeds. If
	 * you are using the IFrame API, which means you are setting the enablejsapi parameter value to 1, you should always
	 * specify your domain as the origin parameter value.
	 */
	public final native void setPlayerapiid(String playerapiid) /*-{
		this.playerapiid = playerapiid;
	}-*/;

	public final native String getPlayList() /*-{
		return this.playlist;
	}-*/;

	/*
	 * (supported players: AS3, HTML5)
	 * 
	 * Value is a comma-separated list of video IDs to play. If you specify a value, the first video that plays will be
	 * the VIDEO_ID specified in the URL path, and the videos specified in the playlist parameter will play thereafter.
	 */
	public final native void setPlayList(String playlist) /*-{
		this.playlist = playlist;
	}-*/;

	public final native int getPlaysInline() /*-{
		return this.playsinline;
	}-*/;

	/*
	 * (supported players: HTML5)
	 * 
	 * his parameter controls whether videos play inline or fullscreen in an HTML5 player on iOS. Valid values are: 0:
	 * This value causes fullscreen playback. This is currently the default value, though the default is subject to
	 * change. 1: This value causes inline playback.
	 */
	public final native void setPlaysInline(int playsinline) /*-{
		this.playsinline = playsinline;
	}-*/;

	public final native int getRel() /*-{
		return this.rel;
	}-*/;

	/*
	 * (supported players: AS3, AS2, HTML5)
	 * 
	 * Values: 0 or 1. Default is 1. This parameter indicates whether the player should show related videos when
	 * playback of the initial video ends.
	 */
	public final native void setRel(int rel) /*-{
		this.rel = rel;
	}-*/;

	public final native int getShowInfo() /*-{
		return this.showinfo;
	}-*/;

	/*
	 * (supported players: AS3, AS2, HTML5)
	 * 
	 * Values: 0 or 1. The parameter's default value is 1. If you set the parameter value to 0, then the player will not
	 * display information like the video title and uploader before the video starts playing.
	 * 
	 * If the player is loading a playlist, and you explicitly set the parameter value to 1, then, upon loading, the
	 * player will also display thumbnail images for the videos in the playlist. Note that this functionality is only
	 * supported for the AS3 player since that is the only player that can load a playlist.
	 */
	public final native void setShowInfo(int showinfo) /*-{
		this.showinfo = showinfo;
	}-*/;

	public final native int getStart() /*-{
		return this.start;
	}-*/;

	/*
	 * (supported players: AS3, AS2, HTML5)
	 * 
	 * Values: A positive integer. This parameter causes the player to begin playing the video at the given number of
	 * seconds from the start of the video. Note that similar to the seekTo function, the player will look for the
	 * closest keyframe to the time you specify. This means that sometimes the play head may seek to just before the
	 * requested time, usually no more than around two seconds.
	 */
	public final native void setStart(int start) /*-{
		this.start = start;
	}-*/;

	public final native String getTheme() /*-{
		return this.theme;
	}-*/;

	/*
	 * (supported players: AS3, AS2, HTML5)
	 * 
	 * This parameter indicates whether the embedded player will display player controls (like a play button or volume
	 * control) within a dark or light control bar. Valid parameter values are dark and light, and, by default, the
	 * player will display player controls using the dark theme. See the YouTube API blog for more information about the
	 * dark and light themes.
	 */
	public final native void setTheme(String theme) /*-{
		this.theme = theme;
	}-*/;
}
