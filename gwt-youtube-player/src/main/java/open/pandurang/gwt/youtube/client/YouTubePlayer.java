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

import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.dom.client.DivElement;
import com.google.gwt.event.shared.SimpleEventBus;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.Widget;
import com.google.web.bindery.event.shared.HandlerRegistration;

/**
 * YouTube Iframe Player container.
 * 
 * @author Pandurang Patil 22-Mar-2014
 * 
 */
public class YouTubePlayer extends Composite {
	interface MyUiBinder extends UiBinder<Widget, YouTubePlayer> {
	}

	private static MyUiBinder			uiBinder		= GWT.create(MyUiBinder.class);

	// Div element which will be replaced by iframe player
	@UiField
	DivElement							pl;

	HTMLPanel							container;

	// Event bus to handl events
	static SimpleEventBus				eventBus		= new SimpleEventBus();
	private SimpleEventBus				privateEventBus	= new SimpleEventBus();
	// Unique divid generated while creating new player.
	private final String				divId;
	// Player
	private Player						player;
	// Player configuration
	private final PlayerConfiguration	playerConfiguration;

	static {
		loadYouTubeIframeApi();
	}

	/**
	 * Load Youtube api. It is expected by end user of this library to invoke this static method well before player is
	 * getting used may be as a first statement inside entry module.
	 */
	public static native void loadYouTubeIframeApi()/*-{
		$wnd.youtube_api_ready = function() {
			@open.pandurang.gwt.youtube.client.YouTubePlayer::apiReady()();
		};
		// 2. This code loads the IFrame Player API code asynchronously.
		var tag = $doc.createElement('script');

		tag.src = "https://www.youtube.com/iframe_api";
		var firstScriptTag = $doc.getElementsByTagName('script')[0];
		firstScriptTag.parentNode.insertBefore(tag, firstScriptTag);
	}-*/;

	/**
	 * GWT wrapper which will be called when YouTube api gets loaded.
	 */
	public static void apiReady() {
		eventBus.fireEvent(new ApiReadyEvent());
	}

	/**
	 * Subscribe for ApiReadyEvent.
	 * 
	 * @param handler
	 *            Handler to be called when ApiReadyEvent occurs.
	 * @return
	 */
	public static HandlerRegistration addApiReadyHandler(ApiReadyEventHandler handler) {
		return eventBus.addHandler(ApiReadyEvent.TYPE, handler);
	}

	public YouTubePlayer(PlayerConfiguration playerConfiguration) {
		this.divId = "youtube-" + System.currentTimeMillis();
		this.playerConfiguration = playerConfiguration;
		Events events = (Events) Events.createObject();
		events.setOnReady(divId + "or");
		events.setOnStateChangey(divId + "osc");
		events.setOnPlaybackQualityChange(divId + "opqc");
		events.setOnPlaybackRateChange(divId + "oprc");
		events.setOnError(divId + "oe");
		events.setOnApiChange(divId + "oac");

		this.playerConfiguration.setEvents(events);
		container = (HTMLPanel) uiBinder.createAndBindUi(this);
		initWidget(container);
		pl.setId(divId);
		exportOnHandlers(divId, this);
	}

	/**
	 * Subscribe for PlayerReadyEvent.
	 * 
	 * @param handler
	 *            Handler to be called when PlayerReadyEvent occurs.
	 * @return
	 */
	public HandlerRegistration addPlayerReadyHandler(PlayerReadyEventHandler handler) {
		return privateEventBus.addHandler(PlayerReadyEvent.TYPE, handler);
	}

	public HandlerRegistration addStateChangedHandler(StateChangeEventHandler handler) {
		return privateEventBus.addHandler(StateChangeEvent.TYPE, handler);
	}

	public HandlerRegistration addPlaybackQualityChangeHandler(QualityChangeEventHandler handler) {
		return privateEventBus.addHandler(QualityChangeEvent.TYPE, handler);
	}

	public HandlerRegistration addPlaybackRateChangeHandler(RateChangeEventHandler handler) {
		return privateEventBus.addHandler(RateChangeEvent.TYPE, handler);
	}

	public HandlerRegistration addErrorHandler(ErrorEventHandler handler) {
		return privateEventBus.addHandler(ErrorEvent.TYPE, handler);
	}

	public HandlerRegistration addApiChangeHandler(ApiChangeEventHandler handler) {
		return privateEventBus.addHandler(ApiChangeEvent.TYPE, handler);
	}

	/**
	 * GWT wrapper which will be subscribed to native player ready event.
	 * 
	 * @param event
	 */
	void playerRead(JavaScriptObject event) {
		PlayerEvent plEvent = (PlayerEvent) event;
		GWT.log("Player " + divId + " is ready...");
		privateEventBus.fireEvent(new PlayerReadyEvent(plEvent));
	}

	void stateChanged(JavaScriptObject event) {
		PlayerEvent plEvent = (PlayerEvent) event;
		GWT.log("Player " + divId + " state changed...");
		privateEventBus.fireEvent(new StateChangeEvent(plEvent));
	}

	void playbackQualityChanged(JavaScriptObject event) {
		PlayerEvent plEvent = (PlayerEvent) event;
		GWT.log("Player " + divId + " Quality changed...");
		privateEventBus.fireEvent(new QualityChangeEvent(plEvent));
	}

	void playbackRateChanged(JavaScriptObject event) {
		PlayerEvent plEvent = (PlayerEvent) event;
		GWT.log("Player " + divId + " Rate changed...");
		privateEventBus.fireEvent(new RateChangeEvent(plEvent));
	}

	void error(JavaScriptObject event) {
		PlayerEvent plEvent = (PlayerEvent) event;
		GWT.log("Player " + divId + " error...");
		privateEventBus.fireEvent(new ErrorEvent(plEvent));
	}

	void apiChanged(JavaScriptObject event) {
		PlayerEvent plEvent = (PlayerEvent) event;
		GWT.log("Player " + divId + " api changed...");
		privateEventBus.fireEvent(new ApiChangeEvent(plEvent));
	}

	/**
	 * Subscribe GWT wrapper playerRead() to PlayerReadyEvent.
	 * 
	 * @param divId
	 *            unique identifier of player, callback function will be created with the same name
	 * @param player
	 *            player on which playerReady() method should be called.
	 */
	private static native void exportOnHandlers(String divId, YouTubePlayer player) /*-{
		$wnd[divId + 'or'] = function(event) {
			player.@open.pandurang.gwt.youtube.client.YouTubePlayer::playerRead(Lcom/google/gwt/core/client/JavaScriptObject;)(event);
		}
		$wnd[divId + 'osc'] = function(event) {
			player.@open.pandurang.gwt.youtube.client.YouTubePlayer::stateChanged(Lcom/google/gwt/core/client/JavaScriptObject;)(event);
		}
		$wnd[divId + 'opqc'] = function(event) {
			player.@open.pandurang.gwt.youtube.client.YouTubePlayer::playbackQualityChanged(Lcom/google/gwt/core/client/JavaScriptObject;)(event);
		}
		$wnd[divId + 'oprc'] = function(event) {
			player.@open.pandurang.gwt.youtube.client.YouTubePlayer::playbackRateChanged(Lcom/google/gwt/core/client/JavaScriptObject;)(event);
		}
		$wnd[divId + 'oe'] = function(event) {
			player.@open.pandurang.gwt.youtube.client.YouTubePlayer::error(Lcom/google/gwt/core/client/JavaScriptObject;)(event);
		}
		$wnd[divId + 'oac'] = function(event) {
			player.@open.pandurang.gwt.youtube.client.YouTubePlayer::apiChanged(Lcom/google/gwt/core/client/JavaScriptObject;)(event);
		}
	}-*/;

	@Override
	protected void onLoad() {
		super.onLoad();
		player = Player.createPlayer(divId, playerConfiguration);
	}

	public Player getPlayer() {
		return player;
	}

}
