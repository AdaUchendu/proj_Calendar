package com.company;

<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
/*Adaku Uchendu
  Buban Ndeta
  Steven Sommers
  Yeabi Demissie
  Tony Smith
  Akhil Naraparaju
  THIS CLASS CONTAINS METHODS THAT SEARCH CLIENT OR EMPLOYEE FILES
  INCLUDES VERIFYING THE EXISTENCE OF CLIENTS OR EMPLOYEES
  RETRIEVES EMPLOYEE ACCESS AND NAME, AS WELL AS LOCATES AND DISPLAYS APPOINTMENTS WITH NOTES
*/

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
import java.io.*;

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
abstract class SearchCalendar {
    void doesUserExist() {}
    String getUserName(String fileName) {
        return fileName;
    }
    void searchAppointments() {}
    void searchMonthlyAppointments() {}
}


<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
class Search extends SearchCalendar {
=======
public class Search extends SearchCalendar {
>>>>>>> 3ef4a9920bd6768d0a533ca2c727e6ab9b67af29
=======
public class Search extends SearchCalendar {
>>>>>>> 3ef4a9920bd6768d0a533ca2c727e6ab9b67af29
=======
public class Search extends SearchCalendar {
>>>>>>> 3ef4a9920bd6768d0a533ca2c727e6ab9b67af29
=======
public class Search extends SearchCalendar {
>>>>>>> 3ef4a9920bd6768d0a533ca2c727e6ab9b67af29
    //If .txt file exists, return true
    public boolean doesUserExist(String fileName) {
        //remove whitespace
        File searchUser = new File("C:\\PlanIt\\Users\\" + fileName + ".txt");
        if (searchUser.exists()) {
            return true;
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
        } else {
=======
        }
        else {
>>>>>>> 3ef4a9920bd6768d0a533ca2c727e6ab9b67af29
=======
        }
        else {
>>>>>>> 3ef4a9920bd6768d0a533ca2c727e6ab9b67af29
=======
        }
        else {
>>>>>>> 3ef4a9920bd6768d0a533ca2c727e6ab9b67af29
=======
        }
        else {
>>>>>>> 3ef4a9920bd6768d0a533ca2c727e6ab9b67af29
            return false;
        }
    }


    //Store user name from file
    public String getUserName(String fileName) {
        File checkName = new File("C:\\PlanIt\\Users\\" + fileName + ".txt");
        try {
            BufferedReader pullName = new BufferedReader(new FileReader(checkName));
            pullName.readLine();
            String name = pullName.readLine();
            pullName.close();
            return name;
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
        } catch (FileNotFoundException a) {
            System.out.println("Error obtaining user name.");
            return "Null";
        } catch (IOException a) {
=======
=======
>>>>>>> 3ef4a9920bd6768d0a533ca2c727e6ab9b67af29
=======
>>>>>>> 3ef4a9920bd6768d0a533ca2c727e6ab9b67af29
=======
>>>>>>> 3ef4a9920bd6768d0a533ca2c727e6ab9b67af29
        }
        catch (FileNotFoundException a) {
            System.out.println("Error obtaining user name.");
            return "Null";
        }
        catch (IOException a) {
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
            System.out.println("Error reading user file for a name.");
            return "Null";
        }
    }


    public void searchAppointments(String year, String fileName) {
        //user schedule display
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
        File searchFile = new File("c:\\PlanIt\\Users\\" + fileName + "a" + ".txt");
=======
        File searchFile = new File("c:\\PlanIt\\Users\\" + fileName + ".txt");
>>>>>>> 3ef4a9920bd6768d0a533ca2c727e6ab9b67af29
=======
        File searchFile = new File("c:\\PlanIt\\Users\\" + fileName + ".txt");
>>>>>>> 3ef4a9920bd6768d0a533ca2c727e6ab9b67af29
=======
        File searchFile = new File("c:\\PlanIt\\Users\\" + fileName + ".txt");
>>>>>>> 3ef4a9920bd6768d0a533ca2c727e6ab9b67af29
=======
        File searchFile = new File("c:\\PlanIt\\Users\\" + fileName + ".txt");
>>>>>>> 3ef4a9920bd6768d0a533ca2c727e6ab9b67af29
        String line;
        String ampm;
        try {
            //Create a temporary file
            BufferedReader tempReader = new BufferedReader(new FileReader(searchFile));
            while ((line = tempReader.readLine()) != null) {
                String existingYear = line.substring(6, 10);
                if (existingYear.equals(year)) {
                    String minutes = line.substring(14, 16);
                    int foundMilitaryTime = Integer.parseInt(line.substring(11, 13));
                    int userEnd = line.lastIndexOf("*");
                    int userStart = line.lastIndexOf("@") + 1;
                    String user = line.substring(userStart);
                    if (foundMilitaryTime > 12) {
                        foundMilitaryTime = foundMilitaryTime - 12;
                        ampm = "PM";
                        System.out.println("Appointment found on " + line.substring(0, 10) + " at " + foundMilitaryTime +
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
                                ":" + minutes + ampm + ".");
                    } else if (foundMilitaryTime == 0) {
                        foundMilitaryTime = foundMilitaryTime + 12;
                        ampm = "PM";
                        System.out.println("Appointment found on " + line.substring(0, 10) + " at " + foundMilitaryTime +
                                ":" + minutes + ampm + ".");
                    } else {
                        ampm = "AM";
                        System.out.println("Appointment found on " + line.substring(0, 10) + " at " + foundMilitaryTime +
                                ":" + minutes + ampm + ".");
                    }
                    int searchEnd = line.lastIndexOf("*");
                    try {
                        String foundNote = line.substring(searchEnd + 1);
                        if (foundNote.equals("")) {
                        } else {
                            System.out.println("Note: " + line.substring(searchEnd + 1));
                        }
                    } catch (StringIndexOutOfBoundsException a) {
                        System.out.println("No note found.");
                    }
                }
            }
        } catch (IOException a) {
=======
=======
>>>>>>> 3ef4a9920bd6768d0a533ca2c727e6ab9b67af29
=======
>>>>>>> 3ef4a9920bd6768d0a533ca2c727e6ab9b67af29
=======
>>>>>>> 3ef4a9920bd6768d0a533ca2c727e6ab9b67af29
                                ":" + minutes + ampm + ". User attached: " + line.substring(17, userEnd) + ".");
                    }
                    else if (foundMilitaryTime == 0) {
                        foundMilitaryTime = foundMilitaryTime + 12;
                        ampm = "PM";
                        System.out.println("Appointment found on " + line.substring(0, 10) + " at " + foundMilitaryTime +
                                ":" + minutes + ampm + ". User attached: " + line.substring(17, userEnd) + ".");
                    }
                    else {
                        ampm = "AM";
                        System.out.println("Appointment found on " + line.substring(0, 10) + " at " + foundMilitaryTime +
                                ":" + minutes + ampm + ". User attached: " + line.substring(17, userEnd) + ".");
                    }
                    int searchEnd = line.lastIndexOf("#");
                    try {
                        String foundNote = line.substring(searchEnd + 1);
                        if (foundNote.equals("")) {
                            System.out.println("No note found." +
                                    "\nScheduled by " + user + ".");
                        }
                        else {
                            System.out.println("Note: " + line.substring(searchEnd + 1) +
                                    "\nScheduled by " + user + ".");
                        }
                    }
                    catch (StringIndexOutOfBoundsException a) {
                        System.out.println("No note found." +
                                "\nScheduled by " + user + ".");
                    }
                }
            }
        }
        catch (IOException a) {
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
            System.out.println("Error writing to temporary file.");
        }
    }


    //Locates and displays monthly appointments with notes
    public void searchMonthlyAppointments(String monthYear, String fileName) {
        //Separate month from year
        InputChecker verifyInput = new InputChecker();
        String[] splitMonth = monthYear.split("\\s+");
        String month = splitMonth[0];
        month = month.toUpperCase();
        month = verifyInput.getMonthNumber(month);
        String year = splitMonth[1];
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
        File searchFile = new File("c:\\PlanIt\\Users\\" + fileName + "a.txt");
=======
        File searchFile = new File("c:\\PlanIt\\Users\\" + fileName + ".txt");
>>>>>>> 3ef4a9920bd6768d0a533ca2c727e6ab9b67af29
=======
        File searchFile = new File("c:\\PlanIt\\Users\\" + fileName + ".txt");
>>>>>>> 3ef4a9920bd6768d0a533ca2c727e6ab9b67af29
=======
        File searchFile = new File("c:\\PlanIt\\Users\\" + fileName + ".txt");
>>>>>>> 3ef4a9920bd6768d0a533ca2c727e6ab9b67af29
=======
        File searchFile = new File("c:\\PlanIt\\Users\\" + fileName + ".txt");
>>>>>>> 3ef4a9920bd6768d0a533ca2c727e6ab9b67af29
        String line;
        String ampm;
        try {
            //Create a temporary file
            BufferedReader tempReader = new BufferedReader(new FileReader(searchFile));
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
            line = tempReader.readLine();
            line = tempReader.readLine();
            line = tempReader.readLine();
>>>>>>> 3ef4a9920bd6768d0a533ca2c727e6ab9b67af29
=======
            line = tempReader.readLine();
            line = tempReader.readLine();
            line = tempReader.readLine();
>>>>>>> 3ef4a9920bd6768d0a533ca2c727e6ab9b67af29
=======
            line = tempReader.readLine();
            line = tempReader.readLine();
            line = tempReader.readLine();
>>>>>>> 3ef4a9920bd6768d0a533ca2c727e6ab9b67af29
=======
            line = tempReader.readLine();
            line = tempReader.readLine();
            line = tempReader.readLine();
>>>>>>> 3ef4a9920bd6768d0a533ca2c727e6ab9b67af29
            while ((line = tempReader.readLine()) != null) {
                String existingYear = line.substring(6, 10);
                String existingMonth = line.substring(0,2);
                if (existingYear.equals(year) && existingMonth.equals(month)) {
                    int foundMilitaryTime = Integer.parseInt(line.substring(11, 13));
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
                    int userEnd = line.lastIndexOf("*");
=======
                    int userEnd = line.lastIndexOf("#");
>>>>>>> 3ef4a9920bd6768d0a533ca2c727e6ab9b67af29
=======
                    int userEnd = line.lastIndexOf("#");
>>>>>>> 3ef4a9920bd6768d0a533ca2c727e6ab9b67af29
=======
                    int userEnd = line.lastIndexOf("#");
>>>>>>> 3ef4a9920bd6768d0a533ca2c727e6ab9b67af29
=======
                    int userEnd = line.lastIndexOf("#");
>>>>>>> 3ef4a9920bd6768d0a533ca2c727e6ab9b67af29
                    int userStart = line.lastIndexOf("*") + 1;
                    String user = line.substring(userStart);
                    String minutes = line.substring(14, 16);
                    if (foundMilitaryTime > 12) {
                        foundMilitaryTime = foundMilitaryTime - 12;
                        ampm = "PM";
                        System.out.println("Appointment found on " + line.substring(0, 10) + " at " + foundMilitaryTime +
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
                                ":" + minutes + ampm + ".");
                    } else if (foundMilitaryTime == 0) {
                        foundMilitaryTime = foundMilitaryTime + 12;
                        ampm = "PM";
                        System.out.println("Appointment found on " + line.substring(0, 10) + " at " + foundMilitaryTime +
                                ":" + minutes + ampm + ".");
                    } else {
                        ampm = "AM";
                        System.out.println("Appointment found on " + line.substring(0, 10) + " at " + foundMilitaryTime +
                                ":" + minutes + ampm + ".");
=======
=======
>>>>>>> 3ef4a9920bd6768d0a533ca2c727e6ab9b67af29
=======
>>>>>>> 3ef4a9920bd6768d0a533ca2c727e6ab9b67af29
=======
>>>>>>> 3ef4a9920bd6768d0a533ca2c727e6ab9b67af29
                                ":" + minutes + ampm + ". User attached: " + line.substring(userStart, userEnd) + ".");
                    }
                    else if (foundMilitaryTime == 0) {
                        foundMilitaryTime = foundMilitaryTime + 12;
                        ampm = "PM";
                        System.out.println("Appointment found on " + line.substring(0, 10) + " at " + foundMilitaryTime +
                                ":" + minutes + ampm + ". User attached: " + line.substring(userStart, userEnd) + ".");
                    }
                    else {
                        ampm = "AM";
                        System.out.println("Appointment found on " + line.substring(0, 10) + " at " + foundMilitaryTime +
                                ":" + minutes + ampm + ". USer attached: " + line.substring(userStart, userEnd) + ".");
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
                    }
                    try {
                        String foundNote = line.substring(userEnd + 1);
                        if (foundNote.equals("")) {
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
                        } else {
                            System.out.println("Note: " + line.substring(userEnd + 1));
                        }
                    } catch (StringIndexOutOfBoundsException a) {
                        System.out.println("No note found.");
                    }
                }
            }
        } catch (IOException a) {
=======
=======
>>>>>>> 3ef4a9920bd6768d0a533ca2c727e6ab9b67af29
=======
>>>>>>> 3ef4a9920bd6768d0a533ca2c727e6ab9b67af29
=======
>>>>>>> 3ef4a9920bd6768d0a533ca2c727e6ab9b67af29
                            System.out.println("No note found." +
                                    "\nScheduled by " + user + ".");
                        }
                        else {
                            System.out.println("Note: " + line.substring(userEnd + 1) +
                                    "\nScheduled by " + user + ".");
                        }
                    }
                    catch (StringIndexOutOfBoundsException a) {
                        System.out.println("No note found." +
                                "\nScheduled by " + user + ".");
                    }
                }
            }
        }
        catch (IOException a) {
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
            System.out.println("Error writing to temporary file.");
        }
    }
}
