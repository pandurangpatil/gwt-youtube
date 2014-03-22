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
	 * Pauses the currently playing video. The final player state after this function executes will be paused (2) unless
	 * the player is in the ended (0) state when the function is called, in which case the player state will not change.
	 */
	public final native void pauseVideo()/*-{
		this.pauseVideo();
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
	 * Returns the state of the player. Possible values are unstarted (-1), ended (0), playing (1), paused (2),
	 * buffering (3), video cued (5).
	 */
	public final native int getPlayerState() /*-{
		return this.getPlayerState();
	}-*/;

	/*
	 * Removes the <iframe> containing the player.
	 */
	public final native void destroy()/*-{
		this.destroy();
	}-*/;
}
