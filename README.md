gwt-youtube
===========

   GWT wrapper over Google's YouTube Iframe api. 
   
**Usage**
--------
Inherit GWT module ```	<inherits name="open.pandurang.gwt.youtube.YouTube" /> ```

Before you start using YouTube iframe library one need to load them first, so as to load the library first you need make call to ```YouTubePlayer.loadYouTubeIframeApi();```. This will ensure library is loaded, you can register to recieve event when library is loaded completely by using ``` ApiReadyEventHandler ``` for more details on the same refer YouTube documentation's [geting started](https://developers.google.com/youtube/iframe_api_reference#Requirements) section. This ApiReadyEvent is equivalent to ```onYouTubeIframeAPIReady``` javascript callback.

```
  // 3. This function creates an <iframe> (and YouTube player)
  //    after the API code downloads.
      var player;
      function onYouTubeIframeAPIReady(){}
```
```
	YouTubePlayer.addApiReadyHandler(new ApiReadyEventHandler() {

			public void onApiReady(ApiReadyEvent event) {
			  // Action you want take after api is loaded.
			}
	}
```
Note: Please make sure you load iframe library well in advance before using YouTube Player.

**Simple usage**

```
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
				PlayerVariables playerVars = (PlayerVariables) PlayerVariables.createObject();

				playerVars.setControls(0);
				playerVars.setRel(0);
				playerVars.setShowInfo(0);
				playerVars.setShowInfo(0);
				config.setPlayerVars(playerVars);
				final YouTubePlayer player1 = new YouTubePlayer(config);
				RootPanel.get().add(player1);

				Button btnCue = new Button("Cue");
				btnCue.addClickHandler(new ClickHandler() {

					public void onClick(ClickEvent event) {
						JsArrayString list = (JsArrayString) JsArrayString.createArray();
						list.push("tQIBhsDlTxU");
						list.push("4jGFreAGRI4");
						player1.getPlayer().cuePlaylist(list);
					}
				});
				RootPanel.get().add(btnCue);

			}
		});
	}
```
Fore more details refer [test sample project](https://github.com/pandurangpatil/gwt-youtube/tree/master/gwt-youtube-test)

**Maven Dependency**
```
		<dependency>
			<groupId>open.pandurang.gwt</groupId>
			<artifactId>gwt-youtube-player</artifactId>
			<version>0.1</version>
			<scope>provided</scope>
		</dependency>
```

**Maven Repository**

```
   <repositories>
      <repository>
         <id>Pandurang repo</id>
         <url>https://github.com/pandurangpatil/pandurang-mvn-repo/raw/master/releases</url>
      </repository>
   </repositories>
```

**Important Note:** 
------
I have not tested all methods of player, there is possibility of some human errors. So if you come across some issues please file a bug. And if you can fix that then please feel free to do so.
