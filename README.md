# Cloud Gaming Platform (CGP) experiment

NOTE: This is self-education purposes project, don't use it in production.
NOTE 2: The project is under development, nothing is done for now.

# Components

- Remote IO Service - to handle user input, to stream game output to user. It contains encoder/decoder and rtp stream implementations.
  As idea - OBS (or actually any similar software) can stream video/audio as well
- Game Emulator Service - to run game
- Remote Game Service - main coordinator service, which is runs the game, configures remote control and remote screen services, and provides all the information to the client. It also contains scheduling logic, it knows about game requirements, and all connected emulators

# Drafts
- Game emulator has to run games via proton in docker container, also it has to be able to run android games

# Schema
```d2
vm {
	style.multiple: true

	remote-io-service

	game-emulator-service

	game

	remote-io-service -> game-emulator-service
	game-emulator-service -> remote-io-service
	game-emulator-service -> game : "Starts" {
		style.stroke-dash: 3
	}
}

client {
	browser
	desktop-app
	mobile-app
}

client -> vm.remote-io-service: "input grpc/websocket stream"
client <- vm.remote-io-service: "output rtp/webrtc stream"
```
