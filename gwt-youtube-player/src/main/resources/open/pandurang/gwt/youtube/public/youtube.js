var player_ready = false;

function onYouTubeIframeAPIReady() {
	// alert('api got loaded');
	player_ready = true;
	// It is expected to have below method exported from
	// YouTubePlayer.loadYouTubeIframeApi();
	window.youtube_api_ready();
}