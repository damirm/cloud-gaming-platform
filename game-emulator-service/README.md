# Game Emulator Service

The service listens for new allocations and when it got new allocation:
- Starts container with requested game
- Configures remote screen service (maybe remote game service should do that, but I will go like this for now):
    - emulator service starts container for remote screen and passes connection between game and remote screen
    - emulator service starts container for input handling and passes connection between game and remote control
    - emulator service reports endpoints to remote game service when all the containers started (with their healthchecks)
- Configures remote control service
