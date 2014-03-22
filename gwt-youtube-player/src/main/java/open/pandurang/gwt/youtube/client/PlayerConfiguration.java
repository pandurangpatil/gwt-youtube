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
 * Overlay Type for corresponding Configuration Json expected by YT.create method.
 * 
 * @author Pandurang Patil 22-Mar-2014
 * 
 */
public class PlayerConfiguration extends JavaScriptObject {
	protected PlayerConfiguration() {
	}

	public final native String getVideoId() /*-{
		return this.videoId;
	}-*/;

	/*
	 * The YouTube video ID that identifies the video that the player will load.
	 */
	public final native void setVideoId(String videoId) /*-{
		this.videoId = videoId;
	}-*/;

	public final native String getWidth() /*-{
		return this.width;
	}-*/;

	/*
	 * The width of the video player. The default value is 640.
	 */
	public final native void setWidth(String width) /*-{
		this.width = width;
	}-*/;

	public final native String getHeight() /*-{
		return this.height;
	}-*/;

	/*
	 * The height of the video player. The default value is 390.
	 */
	public final native void setHeight(String height) /*-{
		this.height = height;
	}-*/;

	public final native PlayerVariables getPlayerVars()/*-{
		return this.playerVars;
	}-*/;

	/*
	 * The object's properties identify player parameters that can be used to customize the player.
	 */
	public final native void setPlayerVars(PlayerVariables playerVars)/*-{
		this.playerVars = playerVars;
	}-*/;

	final native Events getEvents()/*-{
		return this.events;
	}-*/;

	/*
	 * The object's properties identify the events that the API fires and the functions (event listeners) that the API
	 * will call when those events occur.
	 * 
	 * Note: Note that end developer is not allowed to set events directly. Instead one should respective add event
	 * handlers on YouTubePlayer.
	 */
	final native void setEvents(Events events)/*-{
		this.events = events;
	}-*/;
}
