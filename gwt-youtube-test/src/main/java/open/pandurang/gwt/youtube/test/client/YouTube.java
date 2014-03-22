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
package open.pandurang.gwt.youtube.test.client;

import open.pandurang.gwt.youtube.client.ApiReadyEvent;
import open.pandurang.gwt.youtube.client.ApiReadyEventHandler;
import open.pandurang.gwt.youtube.client.PlayerConfiguration;
import open.pandurang.gwt.youtube.client.PlayerReadyEvent;
import open.pandurang.gwt.youtube.client.PlayerReadyEventHandler;
import open.pandurang.gwt.youtube.client.StateChangeEvent;
import open.pandurang.gwt.youtube.client.StateChangeEventHandler;
import open.pandurang.gwt.youtube.client.YouTubePlayer;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.shared.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.RootPanel;

/**
 * @author Pandurang Patil 22-Mar-2014
 * 
 */
public class YouTube implements EntryPoint {
	YouTubePlayer	player;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.google.gwt.core.client.EntryPoint#onModuleLoad()
	 */
	public void onModuleLoad() {
		YouTubePlayer.loadYouTubeIframeApi();
		YouTubePlayer.addApiReadyHandler(new ApiReadyEventHandler() {

			public void onApiReady(ApiReadyEvent event) {
				PlayerConfiguration config = (PlayerConfiguration) PlayerConfiguration.createObject();
				config.setVideoId("M7lc1UVf-VE");
				config.setHeight("562.5");
				config.setWidth("1000");
				final YouTubePlayer player = new YouTubePlayer(config);
				player.addPlayerReadyHandler(new PlayerReadyEventHandler() {

					public void onPlayerReady(PlayerReadyEvent event) {
						GWT.log("First player is ready.");
						GWT.log("First player state -> " + player.getPlayer().getPlayerState());
					}
				});
				player.addStateChangedHandler(new StateChangeEventHandler() {

					public void onStateChange(StateChangeEvent event) {
						GWT.log("First player state changed => " + event.getPlayerEvent().getData());
					}
				});
				RootPanel.get().add(player);
				Button btn = new Button("Stop");
				btn.addClickHandler(new ClickHandler() {

					public void onClick(ClickEvent event) {
						player.getPlayer().stopVideo();
						GWT.log("First player state -> " + player.getPlayer().getPlayerState());
					}
				});
				RootPanel.get().add(btn);
				config = (PlayerConfiguration) PlayerConfiguration.createObject();
				config.setVideoId("4biVZcgCn9A");
				YouTubePlayer player1 = new YouTubePlayer(config);
				RootPanel.get().add(player1);

			}
		});
	}
}
