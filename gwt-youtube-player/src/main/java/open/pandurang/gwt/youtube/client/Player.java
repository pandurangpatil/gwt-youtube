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
import com.google.gwt.core.client.JsArrayNumber;
import com.google.gwt.core.client.JsArrayString;

/**
 * This will act as GWT wrapper on top of YouTube's player Java Script Object.
 * 
 * Note: I have not tested all the apis, There is high possibility of human error while copy pasting methods. If there
 * is any issue requested to report the issue, and if you are willing to contribute and change the code you are most
 * welcome to do so. Also note that java document you see is direct copy of javascript api document provided by YouTube
 * official documentation page.
 * 
 * If there is any issue refer YouTube Apis official document
 * 
 * https://developers.google.com/youtube/iframe_api_reference
 * 
 * Following two methods has been not added
 * 
 * player.addEventListener(event:String, listener:String):Void
 * 
 * player.getIframe():Object
 * 
 * @author Pandurang Patil 22-Mar-2014
 * 
 */
public class Player extends JavaScriptObject {
	protected Player() {
	}

	public static native Player createPlayer(String divId, PlayerConfiguration config) /*-{
		if ($wnd.player_ready) {
			return new $wnd.YT.Player(divId, config);
		}
		alert('YouTube Iframeplayer api has not loaded for some reason');
	}-*/;

	/**
	 * 
	 * @param videoId
	 *            The required videoId parameter specifies the YouTube Video ID of the video to be played. In YouTube
	 *            Data API video feeds, the <yt:videoid> tag specifies the ID.
	 */
	public final void cueVideoById(String videoId) {
		cueVideoById(videoId, 0, null);
	}

	/**
	 * 
	 * @param videoId
	 *            The required videoId parameter specifies the YouTube Video ID of the video to be played. In YouTube
	 *            Data API video feeds, the <yt:videoid> tag specifies the ID.
	 * @param suggestedQuality
	 *            The optional suggestedQuality parameter specifies the suggested playback quality for the video. Please
	 *            see the definition of the setPlaybackQuality function for more information about playback quality.
	 */
	public final void cueVideoById(String videoId, String suggestedQuality) {
		cueVideoById(videoId, 0, suggestedQuality);
	}

	/**
	 * 
	 * @param videoId
	 *            The required videoId parameter specifies the YouTube Video ID of the video to be played. In YouTube
	 *            Data API video feeds, the <yt:videoid> tag specifies the ID.
	 * @param startSeconds
	 *            The optional startSeconds parameter accepts a float/integer. If it is specified, then the video will
	 *            start from the closest keyframe to the specified time.
	 */
	public final void cueVideoById(String videoId, float startSeconds) {
		cueVideoById(videoId, startSeconds, null);
	}

	/**
	 * This function loads the specified video's thumbnail and prepares the player to play the video. The player does
	 * not request the FLV until playVideo() or seekTo() is called.
	 * 
	 * @param videoId
	 *            The required videoId parameter specifies the YouTube Video ID of the video to be played. In YouTube
	 *            Data API video feeds, the <yt:videoid> tag specifies the ID.
	 * @param startSeconds
	 *            The optional startSeconds parameter accepts a float/integer. If it is specified, then the video will
	 *            start from the closest keyframe to the specified time.
	 * @param suggestedQuality
	 *            The optional suggestedQuality parameter specifies the suggested playback quality for the video. Please
	 *            see the definition of the setPlaybackQuality function for more information about playback quality.
	 */
	public final native void cueVideoById(String videoId, float startSeconds, String suggestedQuality)/*-{
		this.cueVideoById(videoId, startSeconds, suggestedQuality);
	}-*/;

	/**
	 * 
	 * @param videoId
	 *            The required videoId parameter specifies the YouTube Video ID of the video to be played. In YouTube
	 *            Data API video feeds, the <yt:videoid> tag specifies the ID.
	 */
	public final void loadVideoById(String videoId) {
		loadVideoById(videoId, 0, null);
	}

	/**
	 * 
	 * @param videoId
	 *            The required videoId parameter specifies the YouTube Video ID of the video to be played. In YouTube
	 *            Data API video feeds, the <yt:videoid> tag specifies the ID.
	 * @param suggestedQuality
	 *            The optional suggestedQuality parameter specifies the suggested playback quality for the video. Please
	 *            see the definition of the setPlaybackQuality function for more information about playback quality.
	 */
	public final void loadVideoById(String videoId, String suggestedQuality) {
		loadVideoById(videoId, 0, suggestedQuality);
	}

	/**
	 * 
	 * @param videoId
	 *            The required videoId parameter specifies the YouTube Video ID of the video to be played. In YouTube
	 *            Data API video feeds, the <yt:videoid> tag specifies the ID.
	 * @param startSeconds
	 *            The optional startSeconds parameter accepts a float/integer. If it is specified, then the video will
	 *            start from the closest keyframe to the specified time.
	 */
	public final void loadVideoById(String videoId, float startSeconds) {
		loadVideoById(videoId, startSeconds, null);
	}

	/**
	 * This function loads and plays the specified video.
	 * 
	 * @param videoId
	 *            The required videoId parameter specifies the YouTube Video ID of the video to be played. In YouTube
	 *            Data API video feeds, the <yt:videoid> tag specifies the ID.
	 * @param startSeconds
	 *            The optional startSeconds parameter accepts a float/integer. If it is specified, then the video will
	 *            start from the closest keyframe to the specified time.
	 * @param suggestedQuality
	 *            The optional suggestedQuality parameter specifies the suggested playback quality for the video. Please
	 *            see the definition of the setPlaybackQuality function for more information about playback quality.
	 */

	public final native void loadVideoById(String videoId, float startSeconds, String suggestedQuality)/*-{
		this.loadVideoById(videoId, startSeconds, suggestedQuality);
	}-*/;

	/**
	 * 
	 * @param playlist
	 *            The required playlist parameter specifies an array of YouTube video IDs. In YouTube Data API feeds,
	 *            the <yt:videoid> tag specifies a video ID.
	 * @param index
	 *            The optional index parameter specifies the index of the first video in the playlist that will play.
	 *            The parameter uses a zero-based index, and the default parameter value is 0, so the default behavior
	 *            is to load and play the first video in the playlist.
	 */
	public final void cuePlaylist(JsArrayString playlist, int index) {
		cuePlaylist(playlist, index, 0, null);
	}

	/**
	 * 
	 * @param playlist
	 *            The required playlist parameter specifies an array of YouTube video IDs. In YouTube Data API feeds,
	 *            the <yt:videoid> tag specifies a video ID.
	 * @param index
	 *            The optional index parameter specifies the index of the first video in the playlist that will play.
	 *            The parameter uses a zero-based index, and the default parameter value is 0, so the default behavior
	 *            is to load and play the first video in the playlist.
	 * @param startSeconds
	 *            The optional startSeconds parameter accepts a float/integer and specifies the time from which the
	 *            first video in the playlist should start playing when the playVideo() function is called. If you
	 *            specify a startSeconds value and then call seekTo(), then the player plays from the time specified in
	 *            the seekTo() call. If you cue a playlist and then call the playVideoAt() function, the player will
	 *            start playing at the beginning of the specified video.
	 */
	public final void cuePlaylist(JsArrayString playlist, int index, float startSeconds) {
		cuePlaylist(playlist, index, startSeconds, null);
	}

	/**
	 * 
	 * @param playlist
	 *            The required playlist parameter specifies an array of YouTube video IDs. In YouTube Data API feeds,
	 *            the <yt:videoid> tag specifies a video ID.
	 */
	public final void cuePlaylist(JsArrayString playlist) {
		cuePlaylist(playlist, 0, 0, null);
	}

	/**
	 * 
	 * @param playlist
	 *            The required playlist parameter specifies an array of YouTube video IDs. In YouTube Data API feeds,
	 *            the <yt:videoid> tag specifies a video ID.
	 * @param index
	 *            The optional index parameter specifies the index of the first video in the playlist that will play.
	 *            The parameter uses a zero-based index, and the default parameter value is 0, so the default behavior
	 *            is to load and play the first video in the playlist.
	 * @param startSeconds
	 *            The optional startSeconds parameter accepts a float/integer and specifies the time from which the
	 *            first video in the playlist should start playing when the playVideo() function is called. If you
	 *            specify a startSeconds value and then call seekTo(), then the player plays from the time specified in
	 *            the seekTo() call. If you cue a playlist and then call the playVideoAt() function, the player will
	 *            start playing at the beginning of the specified video.
	 * @param suggestedQuality
	 *            The optional suggestedQuality parameter specifies the suggested playback quality for the video. Please
	 *            see the definition of the setPlaybackQuality function for more information about playback quality.
	 */
	public final native void cuePlaylist(JsArrayString playlist, int index, float startSeconds, String suggestedQuality)/*-{
		this.cuePlaylist(playlist, index, startSeconds, suggestedQuality);
	}-*/;

	/**
	 * 
	 * @param playlist
	 *            The required playlist parameter specifies an array of YouTube video IDs. In YouTube Data API feeds,
	 *            the <yt:videoid> tag specifies a video ID.
	 * @param index
	 *            The optional index parameter specifies the index of the first video in the playlist that will play.
	 *            The parameter uses a zero-based index, and the default parameter value is 0, so the default behavior
	 *            is to load and play the first video in the playlist.
	 */
	public final void loadPlaylist(JsArrayString playlist, int index) {
		loadPlaylist(playlist, index, 0, null);
	}

	/**
	 * 
	 * @param playlist
	 *            The required playlist parameter specifies an array of YouTube video IDs. In YouTube Data API feeds,
	 *            the <yt:videoid> tag specifies a video ID.
	 * @param index
	 *            The optional index parameter specifies the index of the first video in the playlist that will play.
	 *            The parameter uses a zero-based index, and the default parameter value is 0, so the default behavior
	 *            is to load and play the first video in the playlist.
	 * @param startSeconds
	 *            The optional startSeconds parameter accepts a float/integer and specifies the time from which the
	 *            first video in the playlist should start playing when the playVideo() function is called. If you
	 *            specify a startSeconds value and then call seekTo(), then the player plays from the time specified in
	 *            the seekTo() call. If you cue a playlist and then call the playVideoAt() function, the player will
	 *            start playing at the beginning of the specified video.
	 */
	public final void loadPlaylist(JsArrayString playlist, int index, float startSeconds) {
		loadPlaylist(playlist, index, startSeconds, null);
	}

	/**
	 * 
	 * @param playlist
	 *            The required playlist parameter specifies an array of YouTube video IDs. In YouTube Data API feeds,
	 *            the <yt:videoid> tag specifies a video ID.
	 */
	public final void loadPlaylist(JsArrayString playlist) {
		loadPlaylist(playlist, 0, 0, null);
	}

	/**
	 * 
	 * @param playlist
	 *            The required playlist parameter specifies an array of YouTube video IDs. In YouTube Data API feeds,
	 *            the <yt:videoid> tag specifies a video ID.
	 * @param index
	 *            The optional index parameter specifies the index of the first video in the playlist that will play.
	 *            The parameter uses a zero-based index, and the default parameter value is 0, so the default behavior
	 *            is to load and play the first video in the playlist.
	 * @param startSeconds
	 *            The optional startSeconds parameter accepts a float/integer and specifies the time from which the
	 *            first video in the playlist should start playing when the playVideo() function is called. If you
	 *            specify a startSeconds value and then call seekTo(), then the player plays from the time specified in
	 *            the seekTo() call. If you cue a playlist and then call the playVideoAt() function, the player will
	 *            start playing at the beginning of the specified video.
	 * @param suggestedQuality
	 *            The optional suggestedQuality parameter specifies the suggested playback quality for the video. Please
	 *            see the definition of the setPlaybackQuality function for more information about playback quality.
	 */
	public final native void loadPlaylist(JsArrayString playlist, int index, float startSeconds, String suggestedQuality)/*-{
		this.loadPlaylist(playlist, index, startSeconds, suggestedQuality);
	}-*/;

	/*
	 * Plays the currently cued/loaded video. The final player state after this function executes will be playing (1).
	 * 
	 * Note: A playback only counts toward a video's official view count if it is initiated via a native play button in
	 * the player.
	 */
	public final native void playVideo() /*-{
		this.playVideo();
	}-*/;

	/*
	 * Pauses the currently playing video. The final player state after this function executes will be paused (2) unless
	 * the player is in the ended (0) state when the function is called, in which case the player state will not change.
	 */
	public final native void pauseVideo()/*-{
		this.pauseVideo();
	}-*/;

	/*
	 * Stops and cancels loading of the current video. This function should be reserved for rare situations when you
	 * know that the user will not be watching additional video in the player. If your intent is to pause the video, you
	 * should just call the pauseVideo function. If you want to change the video that the player is playing, you can
	 * call one of the queueing functions without calling stopVideo first.
	 * 
	 * Important: Unlike the pauseVideo function, which leaves the player in the paused (2) state, the stopVideo
	 * function could put the player into any not-playing state, including ended (0), paused (2), video cued (5) or
	 * unstarted (-1).
	 */
	public final native void stopVideo() /*-{
		this.stopVideo();
	}-*/;

	/*
	 * Seeks to a specified time in the video. If the player is paused when the function is called, it will remain
	 * paused. If the function is called from another state (playing, video cued, etc.), the player will play the video.
	 * The seconds parameter identifies the time to which the player should advance.
	 * 
	 * The player will advance to the closest keyframe before that time unless the player has already downloaded the
	 * portion of the video to which the user is seeking. In that case, the player will advance to the closest keyframe
	 * before or after the specified time as dictated by the seek() method of the Flash player's NetStream object. (See
	 * Adobe's documentation for more information.)
	 * 
	 * The allowSeekAhead parameter determines whether the player will make a new request to the server if the seconds
	 * parameter specifies a time outside of the currently buffered video data.
	 * 
	 * We recommend that you set this parameter to false while the user drags the mouse along a video progress bar and
	 * then set it to true when the user releases the mouse. This approach lets a user scroll to different points of a
	 * video without requesting new video streams by scrolling past unbuffered points in the video. When the user
	 * releases the mouse button, the player advances to the desired point in the video and requests a new video stream
	 * if necessary.
	 */
	public final native void seekTo(int seconds, boolean allowSeekAhead) /*-{
		this.seekTo(seconds, allowSeekAhead);
	}-*/;

	/*
	 * Clears the video display. This function is useful if you want to clear the video remnant after calling
	 * stopVideo(). Note that this function has been deprecated in the ActionScript 3.0 Player API.
	 */
	public final native void clearVideo() /*-{
		this.clearVideo();
	}-*/;

	/*
	 * This function loads and plays the next video in the playlist.
	 * 
	 * If player.nextVideo() is called while the last video in the playlist is being watched, and the playlist is set to
	 * play continuously (loop), then the player will load and play the first video in the list.
	 * 
	 * If player.nextVideo() is called while the last video in the playlist is being watched, and the playlist is not
	 * set to play continuously, then playback will end.
	 */
	public final native void nextVideo() /*-{
		this.nextVideo();
	}-*/;

	/*
	 * This function loads and plays the previous video in the playlist.
	 * 
	 * If player.previousVideo() is called while the first video in the playlist is being watched, and the playlist is
	 * set to play continuously (loop), then the player will load and play the last video in the list.
	 * 
	 * If player.previousVideo() is called while the first video in the playlist is being watched, and the playlist is
	 * not set to play continuously, then the player will restart the first playlist video from the beginning.
	 */
	public final native void previousVideo() /*-{
		this.previousVideo();
	}-*/;

	/**
	 * This function loads and plays the specified video in the playlist.
	 * 
	 * @param index
	 *            The required index parameter specifies the index of the video that you want to play in the playlist.
	 *            The parameter uses a zero-based index, so a value of 0 identifies the first video in the list. If you
	 *            have shuffled the playlist, this function will play the video at the specified position in the
	 *            shuffled playlist.
	 */

	public final native void playVideoAt(int index) /*-{
		this.playVideoAt(index);
	}-*/;

	/*
	 * Mutes the player.
	 */
	public final native void mute() /*-{
		this.mute();
	}-*/;

	/*
	 * Unmutes the player.
	 */
	public final native void unMute() /*-{
		this.unMute();
	}-*/;

	/**
	 * 
	 * @return Returns true if the player is muted, false if not.
	 */
	public final native boolean isMuted() /*-{
		return this.isMuted();
	}-*/;

	/**
	 * 
	 * @param volume
	 *            Sets the volume. Accepts an integer between 0 and 100.
	 */
	public final native void setVolume(int volume) /*-{
		this.setVolume(volume);
	}-*/;

	/**
	 * 
	 * @return Returns the player's current volume, an integer between 0 and 100. Note that getVolume() will return the
	 *         volume even if the player is muted.
	 */
	public final native int getVolume() /*-{
		return this.getVolume();
	}-*/;

	/**
	 * Sets the size in pixels of the <iframe> that contains the player.
	 * 
	 * @param width
	 * @param height
	 * @return
	 */
	public final native JavaScriptObject setSize(int width, int height) /*-{
		return this.setSize(width, height);
	}-*/;

	/**
	 * This function retrieves the playback rate of the currently playing video. The default playback rate is 1, which
	 * indicates that the video is playing at normal speed. Playback rates may include values like 0.25, 0.5, 1, 1.5,
	 * and 2.
	 * 
	 * @return
	 */
	public final native float getPlaybackRate() /*-{
		return this.getPlaybackRate();
	}-*/;

	/*
	 * This function sets the suggested playback rate for the current video. If the playback rate changes, it will only
	 * change for the video that is already cued or being played. If you set the playback rate for a cued video, that
	 * rate will still be in effect when the playVideo function is called or the user initiates playback directly
	 * through the player controls. In addition, calling functions to cue or load videos or playlists (cueVideoById,
	 * loadVideoById, etc.) will reset the playback rate to 1.
	 * 
	 * Calling this function does not guarantee that the playback rate will actually change. However, if the playback
	 * rate does change, the onPlaybackRateChange event will fire, and your code should respond to the event rather than
	 * the fact that it called the setPlaybackRate function.
	 * 
	 * The getAvailablePlaybackRates method will return the possible playback rates for the currently playing video.
	 * However, if you set the suggestedRate parameter to a non-supported integer or float value, the player will round
	 * that value down to the nearest supported value in the direction of
	 * 
	 * 1. Note: Even though the AS3 player supports playback rate controls, variable speeds are currently only supported
	 * in the HTML5 player.
	 */
	public final native void setPlaybackRate(Float suggestedRate) /*-{
		this.setPlaybackRate(suggestedRate);
	}-*/;

	/*
	 * This function returns the set of playback rates in which the current video is available. The default value is 1,
	 * which indicates that the video is playing in normal speed. The function returns an array of numbers ordered from
	 * slowest to fastest playback speed. Even if the player does not support variable playback speeds, the array should
	 * always contain at least one value (1).
	 */
	public final native JsArrayNumber getAvailablePlaybackRates() /*-{
		return this.getAvailablePlaybackRates();
	}-*/;

	/**
	 * This function indicates whether the video player should continuously play a playlist or if it should stop playing
	 * after the last video in the playlist ends. The default behavior is that playlists do not loop.
	 * 
	 * This setting will persist even if you load or cue a different playlist, which means that if you load a playlist,
	 * call the setLoop function with a value of true, and then load a second playlist, the second playlist will also
	 * loop.
	 * 
	 * @param loopPlaylists
	 *            The required loopPlaylists parameter identifies the looping behavior.
	 * 
	 *            If the parameter value is true, then the video player will continuously play playlists. After playing
	 *            the last video in a playlist, the video player will go back to the beginning of the playlist and play
	 *            it again.
	 * 
	 *            If the parameter value is false, then playbacks will end after the video player plays the last video
	 *            in a playlist.
	 */
	public final native void setLoop(boolean loopPlaylists) /*-{
		this.setLoop(loopPlaylists);
	}-*/;

	/**
	 * This function indicates whether a playlist's videos should be shuffled so that they play back in an order
	 * different from the one that the playlist creator designated. If you shuffle a playlist after it has already
	 * started playing, the list will be reordered while the video that is playing continues to play. The next video
	 * that plays will then be selected based on the reordered list.
	 * 
	 * This setting will not persist if you load or cue a different playlist, which means that if you load a playlist,
	 * call the setShuffle function, and then load a second playlist, the second playlist will not be shuffled.
	 * 
	 * @param shufflePlaylist
	 *            The required shufflePlaylist parameter indicates whether YouTube should shuffle the playlist.
	 * 
	 *            If the parameter value is true, then YouTube will shuffle the playlist order. If you instruct the
	 *            function to shuffle a playlist that has already been shuffled, YouTube will shuffle the order again.
	 * 
	 *            If the parameter value is false, then YouTube will change the playlist order back to its original
	 *            order.
	 */
	public final native void setShuffle(boolean shufflePlaylist) /*-{
		this.setShuffle(shufflePlaylist);
	}-*/;

	/**
	 * 
	 * @return Returns a number between 0 and 1 that specifies the percentage of the video that the player shows as
	 *         buffered. This method returns a more reliable number than the now-deprecated getVideoBytesLoaded and
	 *         getVideoBytesTotal methods.
	 */
	public final native float getVideoLoadedFraction() /*-{
		return this.getVideoLoadedFraction();
	}-*/;

	/*
	 * Returns the state of the player. Possible values are unstarted (-1), ended (0), playing (1), paused (2),
	 * buffering (3), video cued (5).
	 */
	public final native int getPlayerState() /*-{
		return this.getPlayerState();
	}-*/;

	/**
	 * 
	 * @return Returns the elapsed time in seconds since the video started playing.
	 */
	public final native float getCurrentTime() /*-{
		return this.getCurrentTime();
	}-*/;

	/**
	 * 
	 * @return This function retrieves the actual video quality of the current video. It returns undefined if there is
	 *         no current video. Possible return values are highres, hd1080, hd720, large, medium and small.
	 */
	public final native String getPlaybackQuality() /*-{
		return this.getPlaybackQuality();
	}-*/;

	/**
	 * This function sets the suggested video quality for the current video. The function causes the video to reload at
	 * its current position in the new quality. If the playback quality does change, it will only change for the video
	 * being played. Calling this function does not guarantee that the playback quality will actually change. However,
	 * if the playback quality does change, the onPlaybackQualityChange event will fire, and your code should respond to
	 * the event rather than the fact that it called the setPlaybackQuality function.
	 * 
	 * The suggestedQuality parameter value can be small, medium, large, hd720, hd1080, highres or default. We recommend
	 * that you set the parameter value to default, which instructs YouTube to select the most appropriate playback
	 * quality, which will vary for different users, videos, systems and other playback conditions.
	 * 
	 * When you suggest a playback quality for a video, the suggested quality will only be in effect for that video. You
	 * should select a playback quality that corresponds to the size of your video player. For example, if your page
	 * displays a 1280px by 720px video player, a hd720 quality video will actually look better than an hd1080 quality
	 * video. We recommend calling the getAvailableQualityLevels() function to determine which quality levels are
	 * available for a video.
	 * 
	 * The list below shows the playback quality levels that correspond to different standard player sizes. We recommend
	 * that you set the height of your video player to one of the values listed below and that you size your player to
	 * use 16:9 aspect ratio. As stated above, even if you choose a standard player size, we also recommend that you set
	 * the suggestedQuality parameter value to default to enable YouTube to select the most appropriate playback
	 * quality.
	 * 
	 * Quality level small: Player height is 240px, and player dimensions are at least 320px by 240px for 4:3 aspect
	 * ratio.
	 * 
	 * Quality level medium: Player height is 360px, and player dimensions are 640px by 360px (for 16:9 aspect ratio) or
	 * 480px by 360px (for 4:3 aspect ratio).
	 * 
	 * Quality level large: Player height is 480px, and player dimensions are 853px by 480px (for 16:9 aspect ratio) or
	 * 640px by 480px (for 4:3 aspect ratio).
	 * 
	 * Quality level hd720: Player height is 720px, and player dimensions are 1280px by 720px (for 16:9 aspect ratio) or
	 * 960px by 720px (for 4:3 aspect ratio).
	 * 
	 * Quality level hd1080: Player height is 1080px, and player dimensions are 1920px by 1080px (for 16:9 aspect ratio)
	 * or 1440px by 1080px (for 4:3 aspect ratio).
	 * 
	 * Quality level highres: Player height is greater than 1080px, which means that the player's aspect ratio is
	 * greater than 1920px by 1080px.
	 * 
	 * Quality level default: YouTube selects the appropriate playback quality. This setting effectively reverts the
	 * quality level to the default state and nullifies any previous efforts to set playback quality using the
	 * cueVideoById, loadVideoById or setPlaybackQuality functions.
	 * 
	 * If you call the setPlaybackQuality function with a suggestedQuality level that is not available for the video,
	 * then the quality will be set to the next lowest level that is available. For example, if you request a quality
	 * level of large, and that is unavailable, then the playback quality will be set to medium (as long as that quality
	 * level is available).
	 * 
	 * In addition, setting suggestedQuality to a value that is not a recognized quality level is equivalent to setting
	 * suggestedQuality to default.
	 * 
	 * @param suggestedQuality
	 */
	public final native void setPlaybackQuality(String suggestedQuality) /*-{
		this.setShuffle(suggestedQuality);
	}-*/;

	/**
	 * This function returns the set of quality formats in which the current video is available. You could use this
	 * function to determine whether the video is available in a higher quality than the user is viewing, and your
	 * player could display a button or other element to let the user adjust the quality.
	 * 
	 * The function returns an array of strings ordered from highest to lowest quality. Possible array element values
	 * are highres, hd1080, hd720, large, medium and small. This function returns an empty array if there is no current
	 * video.
	 * 
	 * Your client should not automatically switch to use the highest (or lowest) quality video or to any unknown format
	 * name. YouTube could expand the list of quality levels to include formats that may not be appropriate in your
	 * player context. Similarly, YouTube could remove quality options that would be detrimental to the user experience.
	 * By ensuring that your client only switches to known, available formats, you can ensure that your client's
	 * performance will not be affected by either the introduction of new quality levels or the removal of quality
	 * levels that are not appropriate for your player context.
	 * 
	 * @return
	 */
	public final native JsArrayString getAvailableQualityLevels()/*-{
		return this.getAvailableQualityLevels();
	}-*/;

	/**
	 * Returns the duration in seconds of the currently playing video. Note that getDuration() will return 0 until the
	 * video's metadata is loaded, which normally happens just after the video starts playing.
	 * 
	 * If the currently playing video is a live event, the getDuration() function will return the elapsed time since the
	 * live video stream began. Specifically, this is the amount of time that the video has streamed without being reset
	 * or interrupted. In addition, this duration is commonly longer than the actual event time since streaming may
	 * begin before the event's start time.
	 * 
	 * @return
	 */
	public final native int getDuration() /*-{
		return this.getDuration();
	}-*/;

	/**
	 * 
	 * @return Returns the YouTube.com URL for the currently loaded/playing video.
	 */
	public final native String getVideoUrl() /*-{
		return this.getVideoUrl();
	}-*/;

	/**
	 * 
	 * @return Returns the embed code for the currently loaded/playing video.
	 */
	public final native String getVideoEmbedCode() /*-{
		return this.getVideoEmbedCode();
	}-*/;

	/**
	 * 
	 * @return This function returns an array of the video IDs in the playlist as they are currently ordered. By
	 *         default, this function will return video IDs in the order designated by the playlist owner. However, if
	 *         you have called the setShuffle function to shuffle the playlist order, then the getPlaylist() function's
	 *         return value will reflect the shuffled order.
	 */
	public final native JsArrayString getPlaylist()/*-{
		return this.getPlaylist();
	}-*/;

	/**
	 * This function returns the index of the playlist video that is currently playing.
	 * 
	 * If you have not shuffled the playlist, the return value will identify the position where the playlist creator
	 * placed the video. The return value uses a zero-based index, so a value of 0 identifies the first video in the
	 * playlist.
	 * 
	 * If you have shuffled the playlist, the return value will identify the video's order within the shuffled playlist.
	 * 
	 * @return
	 */
	public final native int getPlaylistIndex() /*-{
		return this.getPlaylistIndex();
	}-*/;

	/*
	 * Removes the <iframe> containing the player.
	 */
	public final native void destroy()/*-{
		this.destroy();
	}-*/;
}
