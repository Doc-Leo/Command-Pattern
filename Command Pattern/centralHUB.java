import java.util.Scanner;
public class centralHUB {
    public static void main(String[] args) {

        Light livingRoomLight = new Light();
        Thermostat thermostat = new Thermostat();
        MusicPlayer musicPlayer = new MusicPlayer();


        Controler controler = new Controler();

        Scanner scanner = new Scanner(System.in);
        int deviceChoice;
        int actionChoice;

        do {
            System.out.println("\nSmart Home:");
            System.out.println("1. Lights");
            System.out.println("2. Thermostat");
            System.out.println("3. Music Player");
            System.out.println("0. Exit");
            System.out.print("\nSelect a device: ");
            deviceChoice = scanner.nextInt();

            switch (deviceChoice) {
                case 1:

                    do {
                        System.out.println("\nLight Controls:");
                        System.out.println("1. Turn on ");
                        System.out.println("2. Turn off ");
                        System.out.println("3. Show Light Status");
                        System.out.println("0. Return");
                        System.out.print("\nSelect an action: ");
                        actionChoice = scanner.nextInt();

                        switch (actionChoice) {
                            case 1:
                                livingRoomLight.turnOn();
                                break;
                            case 2:
                                livingRoomLight.turnOff();
                                break;
                            case 3:
                                livingRoomLight.showStatus();
                                break;
                            case 0:
                                System.out.println("Returning to the main menu.");
                                break;
                            default:
                                System.out.println("Invalid choice for lights.");
                                break;
                        }
                    } while (actionChoice != 0);
                    break;

                case 2:

                    do {
                        System.out.println("\nThermostat Controls:");
                        System.out.println("1. Increase temperature");
                        System.out.println("2. Decrease temperature");
                        System.out.println("3. Show Thermostat Status");
                        System.out.println("0. RETURN");
                        System.out.print("\nSelect an action: ");
                        actionChoice = scanner.nextInt();

                        switch (actionChoice) {
                            case 1:
                                thermostat.increaseTemperature();
                                break;
                            case 2:
                                thermostat.decreaseTemperature();
                                break;
                            case 3:
                                thermostat.showStatus();
                                break;
                            case 0:
                                System.out.println("Returning to the main menu.");
                                break;
                            default:
                                System.out.println("Invalid choice for thermostat.");
                                break;
                        }
                    } while (actionChoice != 0);
                    break;

                case 3:

                    do {
                        System.out.println("\nMusic Player Controls:");
                        System.out.println("1. Play Music");
                        System.out.println("2. Stop Music");
                        System.out.println("3. Increase Volume");
                        System.out.println("4. Decrease Volume");
                        System.out.println("5. Show Music Status");
                        System.out.println("0. RETURN");
                        System.out.print("\nSelect an action: ");
                        actionChoice = scanner.nextInt();

                        switch (actionChoice) {
                            case 1:
                                musicPlayer.playMusic();
                                break;
                            case 2:
                                musicPlayer.stopMusic();
                                break;
                            case 3:
                                musicPlayer.increaseVolume();
                                break;
                            case 4:
                                musicPlayer.decreaseVolume();
                                break;
                            case 5:
                                musicPlayer.showStatus();
                                break;
                            case 0:
                                System.out.println("Returning to the main menu.");
                                break;
                            default:
                                System.out.println("Invalid choice for music player.");
                                break;
                        }
                    } while (actionChoice != 0);
                    break;

                case 0:
                    System.out.println("Exiting Smart Home...");
                    break;

                default:
                    System.out.println("Invalid device selection.");
                    break;
            }
        } while (deviceChoice != 0);

        scanner.close();

    }
    }
