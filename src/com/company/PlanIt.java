package com.company;

<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
/*Team Planit:
   Adaku Uchendu
   Buban Ndeta
   Steven Sommers
   Yeabi Demissie
   Tony Smith
   Akhil Naraparaju
  THIS IS THE MAIN CLASS THAT CONTAINS THE LOOPS, SWITCHES, AND INPUTS REQUIRES TO NAVIGATE THE PROGRAM
*/


import java.util.*;
import java.io.*;
=======
=======
>>>>>>> 3ef4a9920bd6768d0a533ca2c727e6ab9b67af29
=======
>>>>>>> 3ef4a9920bd6768d0a533ca2c727e6ab9b67af29
=======
>>>>>>> 3ef4a9920bd6768d0a533ca2c727e6ab9b67af29
/**
 * Created by adakuuchendu on 12/5/17.
 */

import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;
import java.util.Calendar;
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 3ef4a9920bd6768d0a533ca2c727e6ab9b67af29
=======
>>>>>>> 3ef4a9920bd6768d0a533ca2c727e6ab9b67af29
=======
>>>>>>> 3ef4a9920bd6768d0a533ca2c727e6ab9b67af29
=======
>>>>>>> 3ef4a9920bd6768d0a533ca2c727e6ab9b67af29

public class PlanIt {
    public static void main(String[] args) {

        Introduction intro = new Introduction();
        System.out.println(intro.Message(5, intro.Message()));
        System.out.println(" ");

        do {
            //Bring in classes
            Scanner input = new Scanner(System.in);
            Search fileSearch = new Search();
            InputChecker verifyInput = new InputChecker();
            WriteToFile write = new WriteToFile();
            User currentUser = new User();
            Calendar today = Calendar.getInstance();

            //Create directory and files
            write.startUp();

            //Get today's date
            final int currentDay = today.get(Calendar.DATE),
                    currentMonth = 1 + today.get(Calendar.MONTH),
                    currentYear = today.get(Calendar.YEAR);

            //LOGIN ATTEMPT LOOP
            boolean failed;
            do {
                failed = false;
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
                System.out.print("\nEnter LoginID: " );
=======
                System.out.print("\nEnter LoginID: ");
>>>>>>> 3ef4a9920bd6768d0a533ca2c727e6ab9b67af29
=======
                System.out.print("\nEnter LoginID: ");
>>>>>>> 3ef4a9920bd6768d0a533ca2c727e6ab9b67af29
=======
                System.out.print("\nEnter LoginID: ");
>>>>>>> 3ef4a9920bd6768d0a533ca2c727e6ab9b67af29
=======
                System.out.print("\nEnter LoginID: ");
>>>>>>> 3ef4a9920bd6768d0a533ca2c727e6ab9b67af29
                String iD = input.nextLine();
                //Search for an existing ID
                try {
                    Scanner iDFile = new Scanner(new File("C:\\PlanIt\\Users\\" +
                            iD + ".txt."));
                    String userFile = "C:\\PlanIt\\Users\\" + iD + ".txt.";
                    //If valid, obtain password from file
                    String filePassword = iDFile.nextLine();
                    filePassword = filePassword.substring(10);
                    //User enter password
                    System.out.print("Enter password: ");
                    String userPassword = input.next();
                    //Compare passwords
                    if (filePassword.equals(userPassword)) {
                        currentUser.setUserFile(userFile);
                        currentUser.setUserID(iD);

                    }
                    //If password does not match, loop again
                    else {
                        System.out.println("Incorrect password.");
                        input.nextLine();
                        failed = true;
                    }
                } catch (FileNotFoundException a) {
                    System.out.println("Invalid ID.");
                    failed = true;
                }
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
            }while (failed); //END OF LOGIN ATTEMPT LOOP
=======
            } while (failed); //END OF LOGIN ATTEMPT LOOP
>>>>>>> 3ef4a9920bd6768d0a533ca2c727e6ab9b67af29
=======
            } while (failed); //END OF LOGIN ATTEMPT LOOP
>>>>>>> 3ef4a9920bd6768d0a533ca2c727e6ab9b67af29
=======
            } while (failed); //END OF LOGIN ATTEMPT LOOP
>>>>>>> 3ef4a9920bd6768d0a533ca2c727e6ab9b67af29
=======
            } while (failed); //END OF LOGIN ATTEMPT LOOP
>>>>>>> 3ef4a9920bd6768d0a533ca2c727e6ab9b67af29

            String user = currentUser.getUserID();
            String name = fileSearch.getUserName(user);

            boolean mainMenu = true;
            //Collect today's date for scheduling
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD

            do {
                //Display main menu
                ArrayList<java.lang.String> myList = new ArrayList<String>();
=======
            do {
                //Display main menu
                ArrayList<String> myList = new ArrayList<String>();
>>>>>>> 3ef4a9920bd6768d0a533ca2c727e6ab9b67af29
=======
            do {
                //Display main menu
                ArrayList<String> myList = new ArrayList<String>();
>>>>>>> 3ef4a9920bd6768d0a533ca2c727e6ab9b67af29
=======
            do {
                //Display main menu
                ArrayList<String> myList = new ArrayList<String>();
>>>>>>> 3ef4a9920bd6768d0a533ca2c727e6ab9b67af29
=======
            do {
                //Display main menu
                ArrayList<String> myList = new ArrayList<String>();
>>>>>>> 3ef4a9920bd6768d0a533ca2c727e6ab9b67af29

                myList.add("\n1. View appointments");
                myList.add("\n2. New appointment");
                myList.add(("\n3. Delete appointment"));
                myList.add(("\n4. Change password"));
                myList.add(("\n5. Add new user"));
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
                myList.add(("\n6. Log off"));;
=======
                myList.add(("\n6. Log off:"));
                ;
>>>>>>> 3ef4a9920bd6768d0a533ca2c727e6ab9b67af29
=======
                myList.add(("\n6. Log off:"));
                ;
>>>>>>> 3ef4a9920bd6768d0a533ca2c727e6ab9b67af29
=======
                myList.add(("\n6. Log off:"));
                ;
>>>>>>> 3ef4a9920bd6768d0a533ca2c727e6ab9b67af29
=======
                myList.add(("\n6. Log off:"));
                ;
>>>>>>> 3ef4a9920bd6768d0a533ca2c727e6ab9b67af29
                String result = myList.toString().replaceAll("[\\[\\]]", "").replaceAll(",", " ");


                System.out.println("\n"
                        + "\nChoose an option: " + result);
                try {
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
                    int choice	 = input.nextInt();
=======
                    int choice = input.nextInt();
>>>>>>> 3ef4a9920bd6768d0a533ca2c727e6ab9b67af29
=======
                    int choice = input.nextInt();
>>>>>>> 3ef4a9920bd6768d0a533ca2c727e6ab9b67af29
=======
                    int choice = input.nextInt();
>>>>>>> 3ef4a9920bd6768d0a533ca2c727e6ab9b67af29
=======
                    int choice = input.nextInt();
>>>>>>> 3ef4a9920bd6768d0a533ca2c727e6ab9b67af29
                    //MAIN SWITCH

                    switch (choice) {


<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD

                        //APPOINTMENT MENU
                        case 1:
                            if (choice == 1){
=======
                        //APPOINTMENT MENU
                        case 1:
                            if (choice == 1) {
>>>>>>> 3ef4a9920bd6768d0a533ca2c727e6ab9b67af29
=======
                        //APPOINTMENT MENU
                        case 1:
                            if (choice == 1) {
>>>>>>> 3ef4a9920bd6768d0a533ca2c727e6ab9b67af29
=======
                        //APPOINTMENT MENU
                        case 1:
                            if (choice == 1) {
>>>>>>> 3ef4a9920bd6768d0a533ca2c727e6ab9b67af29
=======
                        //APPOINTMENT MENU
                        case 1:
                            if (choice == 1) {
>>>>>>> 3ef4a9920bd6768d0a533ca2c727e6ab9b67af29
                                boolean newLoop = true;
                                input.nextLine();
                                while (newLoop) {
                                    System.out.println("\nEnter the month and year to view a monthly list (e.g. January " + currentYear + ")" +
                                            "\nEnter the year to view an annual list (e.g. " + currentYear + ")" +
                                            "\nor type BACK to return to the main menu.");
                                    String monthOrYear = input.nextLine();
                                    //If "BACK" is typed, return to main menu
                                    if (verifyInput.checkBack(monthOrYear)) {
                                        newLoop = false;
                                        break;
                                    }
                                    if (verifyInput.validMonth(monthOrYear)) {
                                        fileSearch.searchMonthlyAppointments(monthOrYear, user);
                                        newLoop = false;
                                    } else {
                                        try {
                                            int dateInt = Integer.parseInt(monthOrYear);
                                            fileSearch.searchAppointments(monthOrYear, user);
                                            newLoop = false;
                                        } catch (NumberFormatException a) {
                                            System.out.println("Invalid entry.");
                                        }
                                    }
                                }
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
                            }break;
=======
                            }
                            break;
>>>>>>> 3ef4a9920bd6768d0a533ca2c727e6ab9b67af29
=======
                            }
                            break;
>>>>>>> 3ef4a9920bd6768d0a533ca2c727e6ab9b67af29
=======
                            }
                            break;
>>>>>>> 3ef4a9920bd6768d0a533ca2c727e6ab9b67af29
=======
                            }
                            break;
>>>>>>> 3ef4a9920bd6768d0a533ca2c727e6ab9b67af29

                        //New appointment
                        case 2:
                            Appointment newAppointment = new Appointment();
                            boolean newLoop = true;
                            input.nextLine();
                            do {
                                System.out.println("\nEnter the date of the new appointment (e.g. " + (currentMonth) +
                                        "/" + currentDay + "/" + currentYear + ")");
                                String newDate = input.next();
                                //Continue if date is formatted correctly
                                if (verifyInput.checkDate(newDate)) {
                                    newAppointment.setDate(newDate);
                                    //Compare input date with current date
                                    if (newAppointment.getYearInt() <= currentYear &&
                                            newAppointment.getMonthInt() <= currentMonth &&
                                            newAppointment.getDayInt() < currentDay) {
                                        System.out.println("Enter a date that has not lapsed.");
                                    }
                                    //Ensure month or day are valid
                                    else if ((newAppointment.getMonthInt() > 12) ||
                                            (newAppointment.getDayInt() >
                                                    newAppointment.lastDay(newAppointment.getMonthInt(), newAppointment.getYearInt()))) {
                                        System.out.println("Invalid date.");
                                    }
                                    //If appointment is later than two years from now
                                    else if (newAppointment.getYearInt() - currentYear > 5 &&
                                            newAppointment.getMonthInt() >= currentMonth &&
                                            newAppointment.getDayInt() >= currentDay) {
                                        System.out.println("Enter a date within 5 years from today.");
                                    }
                                    //Continue with valid date
                                    else {
                                        boolean timeLoop = true;
                                        input.nextLine();
                                        do {
                                            System.out.println("\nEnter a time for the appointment. (e.g. 4:00PM)" +
                                                    "\nor type BACK to return to the main menu.");
                                            String newTime = input.nextLine();
                                            newTime = newTime.toUpperCase();
                                            //Remove whitespace
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
                                            newTime = newTime.replaceAll("\\s+","");
=======
                                            newTime = newTime.replaceAll("\\s+", "");
>>>>>>> 3ef4a9920bd6768d0a533ca2c727e6ab9b67af29
=======
                                            newTime = newTime.replaceAll("\\s+", "");
>>>>>>> 3ef4a9920bd6768d0a533ca2c727e6ab9b67af29
=======
                                            newTime = newTime.replaceAll("\\s+", "");
>>>>>>> 3ef4a9920bd6768d0a533ca2c727e6ab9b67af29
=======
                                            newTime = newTime.replaceAll("\\s+", "");
>>>>>>> 3ef4a9920bd6768d0a533ca2c727e6ab9b67af29
                                            //Check if BACK is entered
                                            if (verifyInput.checkBack(newTime)) {
                                                timeLoop = false;
                                                newLoop = false;
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
                                            }
                                            else if (verifyInput.checkTime(newTime)) {
=======
                                            } else if (verifyInput.checkTime(newTime)) {
>>>>>>> 3ef4a9920bd6768d0a533ca2c727e6ab9b67af29
=======
                                            } else if (verifyInput.checkTime(newTime)) {
>>>>>>> 3ef4a9920bd6768d0a533ca2c727e6ab9b67af29
=======
                                            } else if (verifyInput.checkTime(newTime)) {
>>>>>>> 3ef4a9920bd6768d0a533ca2c727e6ab9b67af29
=======
                                            } else if (verifyInput.checkTime(newTime)) {
>>>>>>> 3ef4a9920bd6768d0a533ca2c727e6ab9b67af29
                                                newAppointment.setTime(newTime);
                                                //Ensure time is valid
                                                if (newAppointment.getHourInt() > 12 ||
                                                        newAppointment.getMinuteInt() > 59) {
                                                    System.out.println("Invalid time.");
                                                } else {
                                                    newAppointment.setValid(true);
                                                    newAppointment.setMonthOverlap(false);
                                                    try {
                                                        BufferedReader readUser = new BufferedReader(new FileReader("C:\\PlanIt\\Users\\" +
                                                                user + "a.txt"));
                                                        String line;
                                                        readUser.readLine();
                                                        readUser.readLine();
                                                        readUser.readLine();
                                                        while ((line = readUser.readLine()) != null) {
                                                            if (newAppointment.hourOverlap(line)) {
                                                                System.out.println(name + (fileSearch.getUserName(user)).toUpperCase() +
                                                                        " already has a scheduled appointment within one hour of the new appointment time.");
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
                                                                newAppointment.setValid(false); break;
=======
                                                                newAppointment.setValid(false);
                                                                break;
>>>>>>> 3ef4a9920bd6768d0a533ca2c727e6ab9b67af29
=======
                                                                newAppointment.setValid(false);
                                                                break;
>>>>>>> 3ef4a9920bd6768d0a533ca2c727e6ab9b67af29
=======
                                                                newAppointment.setValid(false);
                                                                break;
>>>>>>> 3ef4a9920bd6768d0a533ca2c727e6ab9b67af29
=======
                                                                newAppointment.setValid(false);
                                                                break;
>>>>>>> 3ef4a9920bd6768d0a533ca2c727e6ab9b67af29
                                                            }
                                                        } //END OF FILE READER WHILE LOOP
                                                        if (newAppointment.getMonthOverlap()) {
                                                            System.out.println(name +
                                                                    " has an appointment scheduled within one week of the new appointment time." +
                                                                    "\nContinue anyway? (Y/N)");
                                                            String bypass = input.nextLine();
                                                            if (verifyInput.checkYN(bypass)) {
                                                                if (newAppointment.getValid()) {
                                                                    System.out.println("Type a note or leave field blank and press ENTER.");
                                                                    String note = input.nextLine();
                                                                    //Create appointment and display
                                                                    newAppointment.displayAppointment(note, user, currentUser.getUserID());
                                                                    timeLoop = false;
                                                                    newLoop = false;
                                                                }
                                                            } else {
                                                                timeLoop = false;
                                                            }
                                                        } else if (newAppointment.getValid()) {
                                                            System.out.println("Type a note or leave field blank and press ENTER.");
                                                            String note = input.nextLine();
                                                            //Create appointment and display
                                                            newAppointment.displayAppointment(note, user, currentUser.getUserID());
                                                            timeLoop = false;
                                                            newLoop = false;
                                                        }
                                                    } catch (FileNotFoundException b) {
                                                        System.out.println("Could not locate user file.");
                                                    } catch (IOException b) {
                                                        System.out.println("Error reading user file.");
                                                    }
                                                }
                                            }
                                            //If time format is not valid
                                            else {
                                                System.out.println("Invalid time format.");
                                            }
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
                                        }while (timeLoop);
=======
                                        } while (timeLoop);
>>>>>>> 3ef4a9920bd6768d0a533ca2c727e6ab9b67af29
=======
                                        } while (timeLoop);
>>>>>>> 3ef4a9920bd6768d0a533ca2c727e6ab9b67af29
=======
                                        } while (timeLoop);
>>>>>>> 3ef4a9920bd6768d0a533ca2c727e6ab9b67af29
=======
                                        } while (timeLoop);
>>>>>>> 3ef4a9920bd6768d0a533ca2c727e6ab9b67af29
                                    }
                                }
                                //If date format is not valid
                                else {
                                    System.out.println("Invalid date format.");
                                }
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
                            }while (newLoop); break;
=======
                            } while (newLoop);
                            break;
>>>>>>> 3ef4a9920bd6768d0a533ca2c727e6ab9b67af29
=======
                            } while (newLoop);
                            break;
>>>>>>> 3ef4a9920bd6768d0a533ca2c727e6ab9b67af29
=======
                            } while (newLoop);
                            break;
>>>>>>> 3ef4a9920bd6768d0a533ca2c727e6ab9b67af29
=======
                            } while (newLoop);
                            break;
>>>>>>> 3ef4a9920bd6768d0a533ca2c727e6ab9b67af29


                        //Delete existing appointment
                        case 3:
                            Appointment deleteAppointment = new Appointment();
                            boolean deleteLoop = true;
                            input.nextLine();
                            do {
                                System.out.println("\nEnter the date of the appointment to be deleted (e.g. " + (currentMonth) +
                                        "/" + currentDay + "/" + currentYear + ")" +
                                        "\nor type BACK to return to the main menu.");
                                String newDate = input.next();
                                //Check if BACK is entered
                                if (verifyInput.checkBack(newDate)) {
                                    deleteLoop = false;
                                    break;
                                }
                                //Continue if date is formatted correctly
                                else if (verifyInput.checkDate(newDate)) {
                                    deleteAppointment.setDate(newDate);
                                    //Compare input date with current date
                                    if (deleteAppointment.getYearInt() <= currentYear &&
                                            deleteAppointment.getMonthInt() <= currentMonth &&
                                            deleteAppointment.getDayInt() < currentDay) {
                                        System.out.println("Enter a date that has not lapsed.");
                                    }
                                    //Ensure month or day are valid
                                    else if ((deleteAppointment.getMonthInt() > 12) ||
                                            (deleteAppointment.getDayInt() >
                                                    deleteAppointment.lastDay(deleteAppointment.getMonthInt(), deleteAppointment.getYearInt()))) {
                                        System.out.println("Invalid date.");
                                    }
                                    //If appointment is later than two years from now
                                    else if (deleteAppointment.getYearInt() - currentYear > 5 &&
                                            deleteAppointment.getMonthInt() >= currentMonth &&
                                            deleteAppointment.getDayInt() >= currentDay) {
                                        System.out.println("Enter a date within 5 years from today.");
                                    }
                                    //Continue with valid date
                                    else {
                                        boolean timeLoop = true;
                                        input.nextLine();
                                        do {
                                            System.out.println("\nEnter the time of the appointment (e.g. 4:00PM)" +
                                                    "\nor type BACK to return to the main menu.");
                                            String newTime = input.nextLine();
                                            newTime = newTime.toUpperCase();
                                            //Remove whitespace
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
                                            newTime = newTime.replaceAll("\\s+","");
=======
                                            newTime = newTime.replaceAll("\\s+", "");
>>>>>>> 3ef4a9920bd6768d0a533ca2c727e6ab9b67af29
=======
                                            newTime = newTime.replaceAll("\\s+", "");
>>>>>>> 3ef4a9920bd6768d0a533ca2c727e6ab9b67af29
=======
                                            newTime = newTime.replaceAll("\\s+", "");
>>>>>>> 3ef4a9920bd6768d0a533ca2c727e6ab9b67af29
=======
                                            newTime = newTime.replaceAll("\\s+", "");
>>>>>>> 3ef4a9920bd6768d0a533ca2c727e6ab9b67af29
                                            //Check if BACK is entered
                                            if (verifyInput.checkBack(newTime)) {
                                                timeLoop = false;
                                                deleteLoop = false;
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
                                            }
                                            else if (verifyInput.checkTime(newTime)) {
=======
                                            } else if (verifyInput.checkTime(newTime)) {
>>>>>>> 3ef4a9920bd6768d0a533ca2c727e6ab9b67af29
=======
                                            } else if (verifyInput.checkTime(newTime)) {
>>>>>>> 3ef4a9920bd6768d0a533ca2c727e6ab9b67af29
=======
                                            } else if (verifyInput.checkTime(newTime)) {
>>>>>>> 3ef4a9920bd6768d0a533ca2c727e6ab9b67af29
=======
                                            } else if (verifyInput.checkTime(newTime)) {
>>>>>>> 3ef4a9920bd6768d0a533ca2c727e6ab9b67af29
                                                deleteAppointment.setTime(newTime);
                                                //Ensure time is valid
                                                if (deleteAppointment.getHourInt() > 12 ||
                                                        deleteAppointment.getMinuteInt() > 59) {
                                                    System.out.println("Invalid time.");
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
                                                }
                                                else {
=======
                                                } else {
>>>>>>> 3ef4a9920bd6768d0a533ca2c727e6ab9b67af29
=======
                                                } else {
>>>>>>> 3ef4a9920bd6768d0a533ca2c727e6ab9b67af29
=======
                                                } else {
>>>>>>> 3ef4a9920bd6768d0a533ca2c727e6ab9b67af29
=======
                                                } else {
>>>>>>> 3ef4a9920bd6768d0a533ca2c727e6ab9b67af29
                                                    deleteAppointment.setMonthOverlap(false);
                                                    try {
                                                        BufferedReader readUser = new BufferedReader(new FileReader("C:\\PlanIt\\Users\\" + user + "a.txt"));
                                                        String line;
                                                        while ((line = readUser.readLine()) != null) {
                                                            if (deleteAppointment.exactMatch(line)) {
                                                                deleteAppointment.setValid(true);
                                                            }
                                                        } //END OF FILE READER WHILE LOOP
                                                        //Create appointment and display
                                                        if (deleteAppointment.getValid() == true) {
                                                            write.deleteAppointment(deleteAppointment.getDateString(), user);
                                                            timeLoop = false;
                                                            deleteLoop = false;
                                                        } else {
                                                            System.out.println("Appointment not found.");
                                                            timeLoop = false;
                                                            deleteLoop = false;
                                                        }
                                                    } catch (FileNotFoundException b) {
                                                        System.out.println("Could not locate file.");
                                                    } catch (IOException b) {
                                                        System.out.println("Error reading file.");
                                                    }
                                                }
                                            }
                                            //If time format is not valid
                                            else {
                                                System.out.println("Invalid time format.");
                                            }
                                        } while (timeLoop);
                                    }
                                }
                                //If date format is not valid
                                else {
                                    System.out.println("Invalid date format.");
                                }
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
                            }while (deleteLoop);
=======
                            } while (deleteLoop);
>>>>>>> 3ef4a9920bd6768d0a533ca2c727e6ab9b67af29
=======
                            } while (deleteLoop);
>>>>>>> 3ef4a9920bd6768d0a533ca2c727e6ab9b67af29
=======
                            } while (deleteLoop);
>>>>>>> 3ef4a9920bd6768d0a533ca2c727e6ab9b67af29
=======
                            } while (deleteLoop);
>>>>>>> 3ef4a9920bd6768d0a533ca2c727e6ab9b67af29
                            break; //END OF CASE 3


                        case 4:
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
                            System.out.println("\nDo you wish to generate a new password? (Y/N):");
=======
                            System.out.println("\nDo you wish to generate a new password? (Y/N)");
>>>>>>> 3ef4a9920bd6768d0a533ca2c727e6ab9b67af29
=======
                            System.out.println("\nDo you wish to generate a new password? (Y/N)");
>>>>>>> 3ef4a9920bd6768d0a533ca2c727e6ab9b67af29
=======
                            System.out.println("\nDo you wish to generate a new password? (Y/N)");
>>>>>>> 3ef4a9920bd6768d0a533ca2c727e6ab9b67af29
=======
                            System.out.println("\nDo you wish to generate a new password? (Y/N)");
>>>>>>> 3ef4a9920bd6768d0a533ca2c727e6ab9b67af29
                            input.nextLine();
                            String yN = input.nextLine();
                            if (verifyInput.checkYN(yN)) {
                                //Generate a new password
                                String newPassword = write.generatePassword();
                                //Overwrite old password with new password
                                write.changePassword(newPassword, currentUser.getUserFile());
                                System.out.println("Your new password is " + newPassword);
                            } else {
                                System.out.println("Returning to main menu.");
                            }
                            break; //END OF CASE 4

                        //CREATE NEW USER FILE
                        case 5:
                            if (choice == 5) {
                                boolean userLoop = true;
                                while (userLoop) {
                                    System.out.println("\nEnter the desired username (e.g. John)" +
                                            "\nor type BACK to return to the main menu.");
                                    input.nextLine();
                                    String tempName = input.nextLine();
                                    //If "BACK" is typed, return to main menu
                                    if (verifyInput.checkBack(tempName)) {
                                        userLoop = false;
                                        break;
                                    }
                                    //Verify new user name
                                    else {

                                        System.out.println("\"" + tempName + "\" Is this correct? (Y/N)");
                                        yN = input.next();
                                        if (verifyInput.checkYN(yN)) {
                                            //Create a unique password
                                            String password = write.generatePassword();
                                            boolean valid = false;
                                            //Finds a valid ID and creates the file
                                            for (int i = 0; valid == false; i++) {
                                                valid = verifyInput.checkID(i, password, tempName);
                                            }
                                            userLoop = false;
                                        }
                                    }
                                }
                                break;
                            }
                            //END OF CASE 4
                            break;

                        case 6:
                            System.out.println("Logging off.");
                            mainMenu = false;
                            break; //END OF CASE 6

                        default:
                            System.out.println("Enter a valid number.");
                            break;
                    } //END OF MAIN SWITCH
                }//END OF MAIN MENU TRY STATEMENT
                catch (java.util.InputMismatchException a) {
                    System.out.println("Enter a valid number.");
                    input.nextLine();
                }//END OF MAIN MENU CATCH
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
            }while (mainMenu); //END OF MAIN MENU LOOP
        }while (true); //END OF LOGIN LOOP
=======
            } while (mainMenu); //END OF MAIN MENU LOOP
        } while (true); //END OF LOGIN LOOP
>>>>>>> 3ef4a9920bd6768d0a533ca2c727e6ab9b67af29
=======
            } while (mainMenu); //END OF MAIN MENU LOOP
        } while (true); //END OF LOGIN LOOP
>>>>>>> 3ef4a9920bd6768d0a533ca2c727e6ab9b67af29
=======
            } while (mainMenu); //END OF MAIN MENU LOOP
        } while (true); //END OF LOGIN LOOP
>>>>>>> 3ef4a9920bd6768d0a533ca2c727e6ab9b67af29
=======
            } while (mainMenu); //END OF MAIN MENU LOOP
        } while (true); //END OF LOGIN LOOP
>>>>>>> 3ef4a9920bd6768d0a533ca2c727e6ab9b67af29
    }
}
