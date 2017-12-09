<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
package com.company;

/*Adaku Uchendu
  Buban Ndeta
  Steven Sommers
  Yeabi Demissie
  Tony Smith
  THIS CLASS STORES NEW APPOINTMENT VARIABLES BASED ON USER INPUT AND IS FUNDAMENTAL IN THE CREATION OF A NEW APPOINTMENT
*/

import java.util.Calendar;

public class Appointment {
    String day, month, year, time, ampm, hour, minute, dateString, appointmentString, user;
    int dayInt, monthInt, yearInt, hourInt, minuteInt, militaryTime;
    boolean valid, monthOverlap;


    //no-arg constructor
    public Appointment() {
        day = "1";
        month = "1";
        year = "2000";
        time = "01:00PM";
        ampm = "AM";
        hour = "01";
        minute = "01";
        dateString = "";
        appointmentString = "";
        dayInt = 1;
        monthInt = 1;
        yearInt = 2000;
        hourInt = 1;
        minuteInt = 1;
        militaryTime = 0;
        valid = false;
        monthOverlap = false;
    }


    //Setters
    public void setDay(String day) {
        this.day = day;
        dayInt = Integer.parseInt(day);
    }
    public void setMonth(String month) {
        this.month = month;
        monthInt = Integer.parseInt(month);
    }
    public void setYear(String year) {
        this.year = year;
        yearInt = Integer.parseInt(year);
    }
    public void setAMPM(String ampm) {
        this.ampm = ampm;
    }
    public void setHour(String hour) {
        this.hour = hour;
        hourInt = Integer.parseInt(hour);
    }
    public void setMinute(String minute) {
        this.minute = minute;
        minuteInt = Integer.parseInt(minute);
    }
    public void setClient(String newUser) {
        //Find where user name starts and ends
        int userStart = newUser.lastIndexOf("*") + 1;
        int userEnd = newUser.lastIndexOf("#");
        user = newUser.substring(userStart, userEnd);
    }
    //Use military time to save appointments
    public void setDateString() {
        if (militaryTime <= 9) {
            dateString = month + "/" + day + "/" + year +
                    ":" + "0" + militaryTime + ":" + minute;
        }
        else {
            dateString = month + "/" + day + "/" + year +
                    ":" + militaryTime + ":" + minute;
        }
    }
    public void setMilitaryTime() {
        if (ampm.equals("PM") && hourInt != 12) {
            militaryTime = hourInt + 12;
        }
        else if (ampm.equals("AM") && hourInt == 12) {
            militaryTime = hourInt - 12;
        }
        else {
            militaryTime = hourInt;
        }
        setDateString();
    }
    public void setValid(boolean newValid) {
        valid = newValid;
    }
    public void setMonthOverlap(boolean newMonthOverlap) {
        monthOverlap = newMonthOverlap;
    }



    //Getters
    public String getDay() {
        return day;
    }
    public int getDayInt() {
        return dayInt;
    }
    public String getMonth() {
        return month;
    }
    public int getMonthInt() {
        return monthInt;
    }
    public String getYear() {
        return year;
    }
    public int getYearInt() {
        return yearInt;
    }
    public String getAMPM() {
        return ampm;
    }
    public String getHour() {
        return hour;
    }
    public int getHourInt() {
        return hourInt;
    }
    public String getMinute() {
        return minute;
    }
    public int getMinuteInt() {
        return minuteInt;
    }
    public String getDateString() {
        return dateString;
    }
    public boolean getValid() {
        return valid;
    }
    public boolean getMonthOverlap() {
        return monthOverlap;
    }
    public String getUser() {
        return user;
    }

    //Establish date
    public void setDate(String newDate) {
        //Get first two characters, convert to integers for variable month
        if (newDate.charAt(1) == '/') {
            //if month is SINGLE digit
            setMonth("0" + Character.toString(newDate.charAt(0)));
        } else {
            //if month is DOUBLE digit
            setMonth(Character.toString(newDate.charAt(0)) + Character.toString(newDate.charAt(1)));
        }
        //Get determine where "/" is, establish day and year
        if (newDate.charAt(3) == '/') {
            //if month and day are SINGLE digit
            setDay("0" + Character.toString(newDate.charAt(2)));
            setYear(Character.toString(newDate.charAt(4)) + Character.toString(newDate.charAt(5)) +
                    Character.toString(newDate.charAt(6)) + Character.toString(newDate.charAt(7)));
        }
        //if month is SINGLE digit and day is DOUBLE digit
        else if (newDate.charAt(1) == '/' && newDate.charAt(4) == '/') {
            setDay(Character.toString(newDate.charAt(2)) + Character.toString(newDate.charAt(3)));
            setYear(Character.toString(newDate.charAt(5)) + Character.toString(newDate.charAt(6)) +
                    Character.toString(newDate.charAt(7)) + Character.toString(newDate.charAt(8)));
        }
        //if month is DOUBLE digit and day is SINGLE digit
        else if (newDate.charAt(2) == '/' && newDate.charAt(4) == '/') {
            setDay("0" + Character.toString(newDate.charAt(3)));
            setYear(Character.toString(newDate.charAt(5)) + Character.toString(newDate.charAt(6)) +
                    Character.toString(newDate.charAt(7)) + Character.toString(newDate.charAt(8)));
        }
        //if month is DOUBLE digit and day is DOUBLE digit
        else {
            setDay(Character.toString(newDate.charAt(3)) + Character.toString(newDate.charAt(4)));
            setYear(Character.toString(newDate.charAt(6)) + Character.toString(newDate.charAt(7)) +
                    Character.toString(newDate.charAt(8)) + Character.toString(newDate.charAt(9)));
        }
    }


    //Set the appointment time based on user input
    public void setTime(String newTime) {
        if (newTime.length() == 6) {
            setAMPM(Character.toString(newTime.charAt(4)) + Character.toString(newTime.charAt(5)));
            //Get integer value of hour
            setHour("0" + Character.toString(newTime.charAt(0)));
            //Get integer value of minute
            setMinute(Character.toString(newTime.charAt(2)) + Character.toString(newTime.charAt(3)));
        } else if (newTime.length() == 7) {
            setAMPM(Character.toString(newTime.charAt(5)) + Character.toString(newTime.charAt(6)));
            //Get integer value of hour
            setHour(Character.toString(newTime.charAt(0)) + Character.toString(newTime.charAt(1)));
            //Get integer value of minute
            setMinute(Character.toString(newTime.charAt(3)) + Character.toString(newTime.charAt(4)));
        }
        setMilitaryTime();
    }//END OF SET APPOINTMENT TIME



    //Get the length of the month based on numerical value
    public int lastDay(int monthInt, int yearInt) {
        switch (monthInt) {
            case 1: return 31;
            //Adjust for leap year
            case 2: if (((yearInt % 4 == 0) && yearInt % 100 != 0) || yearInt % 400 == 0) {
                return 29;
            } else {
                return 28;
            }
            case 3: return 31;
            case 4: return 30;
            case 5: return 31;
            case 6: return 30;
            case 7: return 31;
            case 8: return 31;
            case 9: return 30;
            case 10: return 31;
            case 11: return 30;
            case 12: return 31;
        }
        return 0;
    }//END OF LAST DAY OF MONTH METHOD



    //Look for an overlap within one hour
    public boolean hourOverlap(String line) {
        String newDate = line.substring(0, 10);
        String hourString = line.substring(11, 13);
        String minuteString = line.substring(14, 16);
        int lineHour = Integer.parseInt(hourString);
        int lineMinute = Integer.parseInt(minuteString);

        //Check for matching date
        if (newDate.equals(dateString.substring(0, 10)) &&
                //Check for matching hour
                (lineHour == militaryTime ||
                        //Check for match within one hour
                        ((lineHour == militaryTime - 1 && minuteInt - lineMinute <= 0) ||
                                (lineHour == militaryTime + 1 && minuteInt - lineMinute >= 0) ||
                                //Account for midnight
                                ((lineHour == 0 && militaryTime == 23) && minuteInt - lineMinute <= 0) ||
                                ((lineHour == 23 && militaryTime == 0) && minuteInt - lineMinute >= 0)))) {
            return true;
        } else {
            //Return false if no overlap exists
            //****THIS IS WHAT IS NEEDED TO CONTINUE CREATING AN APPOINTMENT
            return false;
        }
    }


    //Look for exact matching appointments
    public boolean exactMatch(String line) {
        String newDate = line.substring(0, 16);
        //Check for matching date
        if (newDate.equals(dateString)) {
            return true;
        } else {
            return false;
        }
    }//END OF EXACT MATCH METHOD


    //Look for overlapping appointments within one week
    public void overlapMonth(String line) {
        String lineMonth = line.substring(0, 2);
        int lineDay = Integer.parseInt(line.substring(3, 5));
        String lineYear = line.substring(6,10);

        //Check for matching month
        if ((lineMonth.equals(dateString.substring(0, 2))) &&
                //Check for matching year
                (lineYear.equals(dateString.substring(6, 10))) &&
                //Check for match within seven days
                ((dayInt - lineDay <= 7) || (lineDay - dayInt >= -7))) {
            setMonthOverlap(true);
        }
    }//END OF OVERLAP MONTH METHOD



    //Determine the name of the day of the week from numerical value
    Calendar appointmentDay = Calendar.getInstance();
    public String getDayName() {
        //Get day of week
        appointmentDay.set(yearInt, (monthInt - 1), dayInt);
        int dayOfWeek = appointmentDay.get(Calendar.DAY_OF_WEEK);
        String dayName;
        switch (dayOfWeek) {
            case 1: dayName = "Sunday"; return dayName;
            case 2: dayName = "Monday"; return dayName;
            case 3: dayName = "Tuesday"; return dayName;
            case 4: dayName = "Wednesday"; return dayName;
            case 5: dayName = "Thursday"; return dayName;
            case 6: dayName = "Friday"; return dayName;
            case 7: dayName = "Saturday"; return dayName;
        }
        return "Sunday";
    }//END OF DAY OF WEEK METHOD



    //Determine the name of a month from a numerical value
    public String getMonthName() {
        //Get name of month
        String monthName;
        switch (monthInt) {
            case 1: monthName = "January"; return monthName;
            case 2: monthName = "February"; return monthName;
            case 3: monthName = "March"; return monthName;
            case 4: monthName = "April"; return monthName;
            case 5: monthName = "May"; return monthName;
            case 6: monthName = "June"; return monthName;
            case 7: monthName = "July"; return monthName;
            case 8: monthName = "August"; return monthName;
            case 9: monthName = "September"; return monthName;
            case 10: monthName = "October"; return monthName;
            case 11: monthName = "November"; return monthName;
            case 12: monthName = "December"; return monthName;
        }
        return "January";
    }//END OF GET MONTH NAME METHOD



    Search fileSearch = new Search();
    //Display finalized appointment to user
    public void displayAppointment(String newNote, String userFile, String newUser) {
        String user = fileSearch.getUserName(userFile);
        user = user.toUpperCase();
        System.out.println("New appointment created for user " + user +
                " on:\n" + getDayName() + " " + getMonthName() +
                " " + day + ", " + year + " at " + hourInt + ":" + minute + ampm + ".");

        //If note was made, display it
        if (newNote.length() == 0) {
            System.out.println("No note attached.");
            //Attach date to user name, and scheduler ID
            appointmentString = dateString + ":" + user + "*";
            if (valid = true) {
                WriteToFile write = new WriteToFile();
                write.createAppointment(userFile, appointmentString);
            } else {
                System.out.println("Could not create appointment");
            }
        }
        //If no note found
        else {
            System.out.println("Note attached: " + newNote);
            //Attach date to user name and note
            appointmentString = dateString + ":" + user + "*" + newNote;
            if (valid = true) {
                WriteToFile write = new WriteToFile();
                write.createAppointment(userFile, appointmentString);
            } else {
                System.out.println("Could not create appointment");
            }
        }
    }
=======
=======
>>>>>>> 3ef4a9920bd6768d0a533ca2c727e6ab9b67af29
=======
>>>>>>> 3ef4a9920bd6768d0a533ca2c727e6ab9b67af29
//THIS IS THE MAIN CLASS THAT CONTAINS THE LOOPS, SWITCHES, AND INPUTS REQUIRES TO NAVIGATE THE PROGRAM



import java.util.*;
import java.io.*;

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
         System.out.print("\nEnter LoginID: " );
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
         }
         catch (FileNotFoundException a) {
         System.out.println("Invalid ID.");
         failed = true;
         }
      }while (failed); //END OF LOGIN ATTEMPT LOOP
      
      String user = currentUser.getUserID();
      String name = fileSearch.getUserName(user);
      
            boolean mainMenu = true;
      //Collect today's date for scheduling
      do {
         //Display main menu
    	  ArrayList<java.lang.String> myList = new ArrayList<String>();
    	
			myList.add("\n1. View appointments");
			myList.add("\n2. New appointment");
			myList.add(("\n3. Delete appointment"));
			myList.add(("\n4. Change password"));
			myList.add(("\n5. Add new user"));
			myList.add(("\n6. Log off:"));;
		    String result = myList.toString().replaceAll("[\\[\\]]", "").replaceAll(",", " ");

    
			System.out.println("\n"
					+ "\nChoose an option: " + result);
         try {
            int choice	 = input.nextInt();
            //MAIN SWITCH 
            
            switch (choice) {
            
            

            //APPOINTMENT MENU         
            case 1: 
            if (choice == 1){
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
                  }
                  else {
                     try {
                        int dateInt = Integer.parseInt(monthOrYear);
                        fileSearch.searchAppointments(monthOrYear, user);
                        newLoop = false;
                     }
                  
                     catch (NumberFormatException a) {
                         System.out.println("Invalid entry.");
                     }
                  } 
               }
            }break;
                  
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
                           newTime = newTime.replaceAll("\\s+","");
                           //Check if BACK is entered
                           if (verifyInput.checkBack(newTime)) {
                              timeLoop = false;
                              newLoop = false;
                           }
                           else if (verifyInput.checkTime(newTime)) {
                              newAppointment.setTime(newTime);
                              //Ensure time is valid
                              if (newAppointment.getHourInt() > 12 ||
                                 newAppointment.getMinuteInt() > 59) {
                                 System.out.println("Invalid time.");
                              }
                              else {
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
                                          newAppointment.setValid(false); break;                                                                
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
                                       }
                                       else {
                                          timeLoop = false;
                                       }
                                    }
                                    else if (newAppointment.getValid()) {
                                       System.out.println("Type a note or leave field blank and press ENTER.");
                                       String note = input.nextLine();
                                       //Create appointment and display
                                       newAppointment.displayAppointment(note, user, currentUser.getUserID());
                                       timeLoop = false;
                                       newLoop = false;
                                    }
                                 }
                                 catch (FileNotFoundException b) {
                                    System.out.println("Could not locate user file.");
                                 }
                                 catch (IOException b) {
                                    System.out.println("Error reading user file.");
                                 } 
                              }
                           }
                           //If time format is not valid
                           else {
                              System.out.println("Invalid time format.");
                           }
                        }while (timeLoop);                                   
                     } 
                  }
                  //If date format is not valid
                  else {
                     System.out.println("Invalid date format.");
                  }
               }while (newLoop); break;

                               
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
                           newTime = newTime.replaceAll("\\s+","");
                           //Check if BACK is entered
                           if (verifyInput.checkBack(newTime)) {
                              timeLoop = false;
                              deleteLoop = false;
                           }
                           else if (verifyInput.checkTime(newTime)) {
                              deleteAppointment.setTime(newTime);
                              //Ensure time is valid
                              if (deleteAppointment.getHourInt() > 12 ||
                                 deleteAppointment.getMinuteInt() > 59) {
                                 System.out.println("Invalid time.");
                              }
                              else {
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
                                    }
                                    else {
                                       System.out.println("Appointment not found.");
                                       timeLoop = false;
                                       deleteLoop = false;
                                    }
                                 }
                                 catch (FileNotFoundException b) {
                                    System.out.println("Could not locate file.");
                                 }
                                 catch (IOException b) {
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
               }while (deleteLoop);
            break; //END OF CASE 3
               
               
            case 4:
               System.out.println("\nDo you wish to generate a new password? (Y/N)");
               input.nextLine();
               String yN = input.nextLine();
               if (verifyInput.checkYN(yN)) {
                  //Generate a new password
                  String newPassword = write.generatePassword();
                  //Overwrite old password with new password
                  write.changePassword(newPassword, currentUser.getUserFile());
                  System.out.println("Your new password is " + newPassword);
               }
               else {
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
      }while (mainMenu); //END OF MAIN MENU LOOP  
   }while (true); //END OF LOGIN LOOP      
   }
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 3ef4a9920bd6768d0a533ca2c727e6ab9b67af29
=======
>>>>>>> 3ef4a9920bd6768d0a533ca2c727e6ab9b67af29
=======
>>>>>>> 3ef4a9920bd6768d0a533ca2c727e6ab9b67af29
}
