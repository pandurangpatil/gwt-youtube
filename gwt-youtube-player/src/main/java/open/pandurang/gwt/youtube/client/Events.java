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
public class Events extends JavaScriptObject {

	protected Events() {

	}

	public final native void setOnReady(String onReady) /*-{
		this.onReady = onReady;
	}-*/;

	public final native int getOnReady() /*-{
		return this.onReady;
	}-*/;

	public final native void setOnStateChangey(String onStateChange) /*-{
		this.onStateChange = onStateChange;
	}-*/;

	public final native int getOnStateChange() /*-{
		return this.onStateChange;
	}-*/;

	public final native void setOnPlaybackQualityChange(String onPlaybackQualityChange) /*-{
		this.onPlaybackQualityChange = onPlaybackQualityChange;
	}-*/;

	public final native int getOnPlaybackQualityChange() /*-{
		return this.onPlaybackQualityChange;
	}-*/;

	public final native void setOnPlaybackRateChange(String onPlaybackRateChange) /*-{
		this.onPlaybackRateChange = onPlaybackRateChange;
	}-*/;

	public final native int getOnPlaybackRateChange() /*-{
		return this.onPlaybackRateChange;
	}-*/;

	public final native void setOnError(String onError) /*-{
		this.onError = onError;
	}-*/;

	public final native int getOnError() /*-{
		return this.onError;
	}-*/;

	public final native void setOnApiChange(String onApiChange) /*-{
		this.onApiChange = onApiChange;
	}-*/;

	public final native int getOnApiChange() /*-{
		return this.onApiChange;
	}-*/;

}
